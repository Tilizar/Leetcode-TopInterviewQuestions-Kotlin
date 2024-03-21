import kotlin.test.Test
import kotlin.test.assertEquals

private fun numDecodings(s: String): Int {
    val cache = IntArray(s.length)

    fun dfs(index: Int): Int {
        if (index == s.length) return 1
        if (cache[index] != 0) return cache[index]

        val current = s[index].digitToInt()
        if (current == 0) return 0
        var output = dfs(index + 1)
        if (index < s.lastIndex && (current == 1 || current == 2 && s[index + 1].digitToInt() in 0..6)) {
            output += dfs(index + 2)
        }
        cache[index] = output
        return output
    }
    return dfs(0)
}

class `91_Decode_Ways` {

    @Test
    fun case_1() {
        val output = numDecodings("12")

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = numDecodings("226")

        assertEquals(3, output)
    }

    @Test
    fun case_3() {
        val output = numDecodings("06")

        assertEquals(0, output)
    }
}
