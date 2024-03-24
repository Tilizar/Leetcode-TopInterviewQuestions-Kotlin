import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun solve(board: Array<CharArray>) {
    val shouldNotBeCaptured = mutableSetOf<Pair<Int, Int>>()

    fun dfs(row: Int, column: Int) {
        val pair = Pair(row, column)
        if (
            row !in 0..board.lastIndex || column !in 0..board[row].lastIndex ||
            board[row][column] == 'X' || shouldNotBeCaptured.contains(pair)
        ) {
            return
        }

        shouldNotBeCaptured.add(pair)
        dfs(row - 1, column)
        dfs(row, column - 1)
        dfs(row, column + 1)
        dfs(row + 1, column)
    }

    board.indices.forEach { row ->
        board[row].indices.forEach { column ->
            if (
                board[row][column] == 'O' &&
                (row == 0 || column == 0 || row == board.lastIndex || column == board[row].lastIndex)
            ) {
                dfs(row, column)
            }
        }
    }

    board.indices.forEach { row ->
        board[row].indices.forEach { column ->
            if (!shouldNotBeCaptured.contains(Pair(row, column))) {
                board[row][column] = 'X'
            }
        }
    }
}

class `130_Surrounded_Regions` {

    @Test
    fun case_1() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )

        solve(board)

        val expected = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'X', 'X')
        )

        repeat(board.size) {
            assertContentEquals(expected[it], board[it])
        }
    }

    @Test
    fun case_2() {
        val board = arrayOf(charArrayOf('X'))

        solve(board)

        val expected = arrayOf(charArrayOf('X'))

        repeat(board.size) {
            assertContentEquals(expected[it], board[it])
        }
    }
}
