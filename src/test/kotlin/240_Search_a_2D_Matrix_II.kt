import kotlin.test.Test
import kotlin.test.assertEquals

private fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    var row = 0
    var column = matrix.first().lastIndex

    while (column >= 0 && row <= matrix.lastIndex) {
        when {
            target < matrix[row][column] -> column--
            target > matrix[row][column] -> row++
            else -> return true
        }
    }

    return false
}

class `240_Search_a_2D_Matrix_II` {

    @Test
    fun case_1() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15),
            intArrayOf(2, 5, 8, 12, 19),
            intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )

        val output = searchMatrix(matrix, 5)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15),
            intArrayOf(2, 5, 8, 12, 19),
            intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )

        val output = searchMatrix(matrix, 20)

        assertEquals(false, output)
    }
}
