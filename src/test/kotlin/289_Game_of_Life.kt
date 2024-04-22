import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun gameOfLife(board: Array<IntArray>) {
    val newLife = mutableSetOf<Pair<Int, Int>>()

    fun willHaveLife(row: Int, column: Int): Boolean {
        val current = board[row][column]

        val top = if (row > 0) board[row - 1][column] else 0
        val topRight = if (row > 0 && column < board[row].lastIndex) board[row - 1][column + 1] else 0
        val right = if (column < board[row].lastIndex) board[row][column + 1] else 0
        val bottomRight = if (row < board.lastIndex && column < board[row].lastIndex) board[row + 1][column + 1] else 0
        val bottom = if (row < board.lastIndex) board[row + 1][column] else 0
        val bottomLeft = if (row < board.lastIndex && column > 0) board[row + 1][column - 1] else 0
        val left = if (column > 0) board[row][column - 1] else 0
        val topLeft = if (row > 0 && column > 0) board[row - 1][column - 1] else 0

        val sum = top + topRight + right + bottomRight + bottom + bottomLeft + left + topLeft

        return if (current == 1) sum == 2 || sum == 3 else sum == 3
    }

    for (row in board.indices) {
        for (column in board[row].indices) {
            if (willHaveLife(row, column)) {
                println("add ($row, $column)")
                newLife.add(row to column)
            }
        }
    }

    for (row in board.indices) {
        for (column in board[row].indices) {
            val hasLife = newLife.contains(row to column)
            board[row][column] = if (hasLife) 1 else 0
        }
    }
}

class `289_Game_of_Life` {

    @Test
    fun case_1() {
        val input = arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1),
            intArrayOf(0, 0, 0)
        )

        gameOfLife(input)

        val expected = arrayOf(
            intArrayOf(0, 0, 0),
            intArrayOf(1, 0, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(0, 1, 0)
        )

        repeat(input.size) {
            assertContentEquals(expected[it], input[it])
        }
    }

    @Test
    fun case_2() {
        val input = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 0)
        )

        gameOfLife(input)

        val expected = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1)
        )

        repeat(input.size) {
            assertContentEquals(expected[it], input[it])
        }
    }
}
