import kotlin.test.Test
import kotlin.test.assertContentEquals

class `344_Reverse_String` {

    @Test
    fun case_1() {
        val array = charArrayOf('h', 'e', 'l', 'l', 'o')
        reverseString(array)

        assertContentEquals(charArrayOf('o', 'l', 'l', 'e', 'h'), array)
    }

    @Test
    fun case_2() {
        val array = charArrayOf('H','a','n','n','a','h')
        reverseString(array)

        assertContentEquals(charArrayOf('h','a','n','n','a','H'), array)
    }
}
