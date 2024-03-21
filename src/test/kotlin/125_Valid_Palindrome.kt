import kotlin.test.Test
import kotlin.test.assertEquals

private fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }
        while (right > left && !s[right].isLetterOrDigit()) {
            right--
        }
        if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
            return false
        }
        left++
        right--
    }

    return true
}

class `125_Valid_Palindrome` {

    @Test
    fun case_1() {
        val output = isPalindrome("A man, a plan, a canal: Panama")
        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isPalindrome("race a car")
        assertEquals(false, output)
    }

    @Test
    fun case_3() {
        val output = isPalindrome(" ")
        assertEquals(true, output)
    }
}
