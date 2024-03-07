import kotlin.test.Test
import kotlin.test.assertEquals

class `54_Spiral_Matrix` {

    @Test
    fun case_1() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val output = spiralOrder(input)

        assertEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), output)
    }

    @Test
    fun case_2() {
        val input = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val output = spiralOrder(input)

        assertEquals(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), output)
    }
}
