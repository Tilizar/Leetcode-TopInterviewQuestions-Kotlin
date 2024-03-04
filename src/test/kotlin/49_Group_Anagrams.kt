import kotlin.test.Test
import kotlin.test.assertEquals

class `49_Group_Anagrams` {

    @Test
    fun case_1() {
        val output = groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        val expected = listOf(listOf("bat"), listOf("tan", "nat"), listOf("eat", "tea", "ate"))

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = groupAnagrams(arrayOf(""))

        assertEquals(listOf(listOf("")), output)
    }

    @Test
    fun case_3() {
        val output = groupAnagrams(arrayOf("a"))

        assertEquals(listOf(listOf("a")), output)
    }
}
