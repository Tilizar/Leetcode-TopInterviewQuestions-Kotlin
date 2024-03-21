import kotlin.test.Test
import kotlin.test.assertEquals

private fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (row in board.indices) {
        val cache = HashSet<Int>(9)
        for (column in board[row].indices) {
            val value = board[row][column].digitToIntOrNull() ?: continue
            if (cache.contains(value)) {
                return false
            }
            cache.add(value)
        }
    }

    for (column in 0..board[0].lastIndex) {
        val cache = HashSet<Int>(9)
        for (row in board.indices) {
            val value = board[row][column].digitToIntOrNull() ?: continue
            if (cache.contains(value)) {
                return false
            }
            cache.add(value)
        }
    }

    for (columnMultiplier in 0..<3) {
        for (rowMultiplier in 0..<3) {
            val cache = HashSet<Int>(9)
            for (row in 0..<3) {
                for (column in 0..<3) {
                    val rowIndex = row + (3 * rowMultiplier)
                    val columnIndex = column + (3 * columnMultiplier)
                    val value = board[rowIndex][columnIndex].digitToIntOrNull() ?: continue
                    if (cache.contains(value)) {
                        return false
                    }
                    cache.add(value)
                }
            }
        }
    }

    return true
}

class `36_Valid_Sudoku` {

    @Test
    fun case_1() {
        val input = arrayOf(
            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
        )

        assertEquals(true, isValidSudoku(input))
    }

    @Test
    fun case_2() {
        val input = arrayOf(
            charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9'),
        )

        assertEquals(false, isValidSudoku(input))
    }
}
