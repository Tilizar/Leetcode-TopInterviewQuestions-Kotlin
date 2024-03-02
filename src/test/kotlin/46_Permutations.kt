import kotlin.test.Test
import kotlin.test.assertEquals

class `46_Permutations` {

    @Test
    fun case_1() {
        val expected =
            listOf(listOf(1, 2, 3), listOf(1, 3, 2), listOf(2, 1, 3), listOf(2, 3, 1), listOf(3, 1, 2), listOf(3, 2, 1))

        val output = permute(intArrayOf(1, 2, 3))

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val expected = listOf(listOf(0, 1), listOf(1, 0))

        val output = permute(intArrayOf(0, 1))

        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val expected = listOf(listOf(1))

        val output = permute(intArrayOf(1))

        assertEquals(expected, output)
    }
}
