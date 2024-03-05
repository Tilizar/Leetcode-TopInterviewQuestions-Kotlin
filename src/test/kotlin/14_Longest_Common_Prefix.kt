import kotlin.test.Test
import kotlin.test.assertEquals

class `14_Longest_Common_Prefix` {

    @Test
    fun case_1() {
        val output = longestCommonPrefix(arrayOf("flower", "flow", "flight"))
        assertEquals("fl", output)
    }

    @Test
    fun case_2() {
        val output = longestCommonPrefix(arrayOf("dog", "racecar", "car"))
        assertEquals("", output)
    }
}
