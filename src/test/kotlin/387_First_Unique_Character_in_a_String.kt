import kotlin.test.Test
import kotlin.test.assertEquals

class `387_First_Unique_Character_in_a_String` {

    @Test
    fun case_1() {
        val output = firstUniqChar("leetcode")

        assertEquals(0, output)
    }

    @Test
    fun case_2() {
        val output = firstUniqChar("loveleetcode")

        assertEquals(2, output)
    }

    @Test
    fun case_3() {
        val output = firstUniqChar("aabb")

        assertEquals(-1, output)
    }
}
