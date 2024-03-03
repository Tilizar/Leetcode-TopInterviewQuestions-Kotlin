import kotlin.test.Test
import kotlin.test.assertContentEquals

class `48_Rotate_Image` {

    @Test
    fun case_1() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        rotate(matrix)

        val expected = arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3))

        repeat(matrix.size) {
            assertContentEquals(expected[it], matrix[it])
        }
    }

    @Test
    fun case_2() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16)
        )
        rotate(matrix)

        val expected = arrayOf(
            intArrayOf(15, 13, 2, 5),
            intArrayOf(14, 3, 4, 1),
            intArrayOf(12, 6, 8, 9),
            intArrayOf(16, 7, 10, 11)
        )

        repeat(matrix.size) {
            assertContentEquals(expected[it], matrix[it])
        }
    }
}
