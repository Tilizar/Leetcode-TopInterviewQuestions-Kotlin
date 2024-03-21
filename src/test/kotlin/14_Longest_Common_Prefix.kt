import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals

private fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]

    fun commonPrefix(first: String, second: String): String {
        val shortestLength = min(first.length, second.length)

        for (i in 0 until shortestLength) {
            if (first[i] != second[i]) {
                return first.substring(0, i)
            }
        }

        return first.substring(0, shortestLength)
    }

    for (i in 1..strs.lastIndex) {
        prefix = commonPrefix(prefix, strs[i])
        if (prefix.isEmpty()) break
    }

    return prefix
}

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
