import kotlin.test.Test
import kotlin.test.assertEquals

class `15_3Sum` {

    @Test
    fun case_1() {
        val output = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = threeSum(intArrayOf(0, 1, 1))

        val expected = emptyList<List<Int>>()
        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val output = threeSum(intArrayOf(0, 0, 0))

        val expected = listOf(listOf(0, 0, 0))
        assertEquals(expected, output)
    }
}
