import kotlin.test.Test
import kotlin.test.assertEquals

private fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val canReachEndFrom = mutableSetOf<Int>()

    for (i in s.lastIndex downTo 0) {
        for (word in wordDict) {
            if (i + word.length > s.length) continue
            if (s.substring(i, i + word.length) == word) {
                if (canReachEndFrom.contains(i + word.length) || i + word.length == s.length) {
                    canReachEndFrom.add(i)
                    break
                }
            }
        }
    }

    return canReachEndFrom.contains(0)
}

class `139_Word_Break` {

    @Test
    fun case_1() {
        val output = wordBreak("leetcode", listOf("leet", "code"))

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = wordBreak("applepenapple", listOf("apple", "pen"))

        assertEquals(true, output)
    }

    @Test
    fun case_3() {
        val output = wordBreak("catsandog", listOf("cats", "dog", "sand", "and", "cat"))

        assertEquals(false, output)
    }
}
