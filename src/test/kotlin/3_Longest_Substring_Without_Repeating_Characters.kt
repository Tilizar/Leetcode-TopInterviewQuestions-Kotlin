import kotlin.test.Test
import kotlin.test.assertEquals

class `3_Longest_Substring_Without_Repeating_Characters` {

    @Test
    fun case_1() {
        val output = lengthOfLongestSubstring("abcabcbb")

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = lengthOfLongestSubstring("bbbbb")

        assertEquals(1, output)
    }

    @Test
    fun case_3() {
        val output = lengthOfLongestSubstring("pwwkew")

        assertEquals(3, output)
    }
}
