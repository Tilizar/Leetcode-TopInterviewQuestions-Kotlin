import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun reverseString(s: CharArray) {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        val tmp = s[left]
        s[left] = s[right]
        s[right] = tmp

        left++
        right--
    }
}

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
