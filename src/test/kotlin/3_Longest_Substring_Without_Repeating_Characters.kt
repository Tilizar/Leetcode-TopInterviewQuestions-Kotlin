import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    var start = 0

    var output = 1

    (1..s.lastIndex).forEach {
        val current = s[it]
        val sub = s.substring(start, it)
        output = max(output, sub.length)
        start += sub.indexOf(current) + 1
    }

    output = max(output, s.substring(start).length)

    return output
}

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
