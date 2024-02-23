import kotlin.test.Test
import kotlin.test.assertEquals

class `17_Letter_Combinations_of_a_Phone_Number` {

    @Test
    fun case_1() {
        val output = letterCombinations("23")

        val expected = listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = letterCombinations("")

        assertEquals(emptyList(), output)
    }

    @Test
    fun case_3() {
        val output = letterCombinations("2")

        val expected = listOf("a", "b", "c")
        assertEquals(expected, output)
    }
}
