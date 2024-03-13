import kotlin.test.Test
import kotlin.test.assertEquals

class `78_Subsets` {

    @Test
    fun case_1() {
        val output = subsets(intArrayOf(1, 2, 3))

        val expected =
            listOf(listOf(), listOf(3), listOf(2), listOf(2, 3), listOf(1), listOf(1, 3), listOf(1, 2), listOf(1, 2, 3))
        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = subsets(intArrayOf(0))

        val expected = listOf(listOf(), listOf(0))
        assertEquals(expected, output)
    }
}
