import kotlin.test.Test
import kotlin.test.assertEquals

class `242_Valid_Anagram` {

    @Test
    fun case_1() {
        val output = isAnagram(s = "anagram", t = "nagaram")

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isAnagram(s = "rat", t = "car")

        assertEquals(false, output)
    }
}
