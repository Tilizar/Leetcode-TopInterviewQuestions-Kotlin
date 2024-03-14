import kotlin.test.Test
import kotlin.test.assertEquals

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
