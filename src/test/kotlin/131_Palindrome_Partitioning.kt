import kotlin.test.Test
import kotlin.test.assertEquals

private fun partition(s: String): List<List<String>> {
    val output = mutableListOf<List<String>>()
    val currentPart = mutableListOf<String>()

    fun isPalindrome(start: Int, end: Int): Boolean {
        var left = start
        var right = end
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }

        return true
    }

    fun dfs(startIndex: Int) {
        if (startIndex == s.length) {
            output.add(currentPart.toList())
            return
        }

        for (i in startIndex..s.lastIndex) {
            if (isPalindrome(startIndex, i)) {
                currentPart.add(s.substring(startIndex, i + 1))
                dfs(i + 1)
                currentPart.removeLast()
            }
        }
    }

    dfs(0)
    return output
}

class `131_Palindrome_Partitioning` {

    @Test
    fun case_1() {
        val output = partition("aab")

        assertEquals(listOf(listOf("a", "a", "b"), listOf("aa", "b")), output)
    }

    @Test
    fun case_2() {
        val output = partition("a")

        assertEquals(listOf(listOf("a")), output)
    }
}
