import kotlin.test.Test
import kotlin.test.assertEquals

class `28_Find_the_Index_of_the_First_Occurrence_in_a_String` {

    @Test
    fun case_1() {
        val output = strStr("sadbutsad", "sad")

        assertEquals(0, output)
    }

    @Test
    fun case_2() {
        val output = strStr("leetcode", "leeto")

        assertEquals(-1, output)
    }
}
