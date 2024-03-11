import kotlin.test.Test
import kotlin.test.assertContentEquals

class `73_Set_Matrix_Zeroes` {

    @Test
    fun case_1() {
        val matrix = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
        setZeroes(matrix)

        val expected = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, 0, 0), intArrayOf(1, 0, 1))
        repeat(matrix.size) {
            assertContentEquals(expected[it], matrix[it])
        }
    }

    @Test
    fun case_2() {
        val matrix = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
        setZeroes(matrix)

        val expected = arrayOf(intArrayOf(0, 0, 0, 0), intArrayOf(0, 4, 5, 0), intArrayOf(0, 3, 1, 0))
        repeat(matrix.size) {
            assertContentEquals(expected[it], matrix[it])
        }
    }
}
