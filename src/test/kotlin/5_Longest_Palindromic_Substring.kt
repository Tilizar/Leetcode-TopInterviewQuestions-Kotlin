import kotlin.test.Test
import kotlin.test.assertEquals

class `5_Longest_Palindromic_Substring` {

    @Test
    fun case_1() {
        val output = longestPalindrome("babad")

        assertEquals("bab", output)
    }

    @Test
    fun case_2() {
        val output = longestPalindrome("cbbd")

        assertEquals("bb", output)
    }
}
