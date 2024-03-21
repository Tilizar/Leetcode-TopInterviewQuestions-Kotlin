import kotlin.test.Test
import kotlin.test.assertEquals

private fun exist(board: Array<CharArray>, word: String): Boolean {
    val visited = mutableSetOf<Pair<Int, Int>>()

    fun dfs(row: Int, column: Int, letterPos: Int): Boolean {
        if (letterPos == word.length) return true
        if (row !in board.indices || column !in board[0].indices ||
            board[row][column] != word[letterPos] || visited.contains(Pair(row, column))
        ) {
            return false
        }

        visited.add(Pair(row, column))

        val output = dfs(row - 1, column, letterPos + 1) ||
                dfs(row, column - 1, letterPos + 1) ||
                dfs(row, column + 1, letterPos + 1) ||
                dfs(row + 1, column, letterPos + 1)

        visited.remove(Pair(row, column))

        return output
    }

    board.forEachIndexed { rowIndex, row ->
        row.forEachIndexed { columnIndex, letter ->
            if (letter == word[0] && dfs(rowIndex, columnIndex, 0)) {
                return true
            }
        }
    }

    return false
}

class `79_Word_Search` {

    @Test
    fun case_1() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )

        val output = exist(board, "ABCCED")

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )

        val output = exist(board, "SEE")

        assertEquals(true, output)
    }

    @Test
    fun case_3() {
        val board = arrayOf(
            charArrayOf('A', 'B', 'C', 'E'),
            charArrayOf('S', 'F', 'C', 'S'),
            charArrayOf('A', 'D', 'E', 'E')
        )

        val output = exist(board, "ABCB")

        assertEquals(false, output)
    }
}
