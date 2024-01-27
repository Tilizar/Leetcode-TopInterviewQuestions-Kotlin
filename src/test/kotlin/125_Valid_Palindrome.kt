import kotlin.test.Test
import kotlin.test.assertEquals

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
