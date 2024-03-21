import kotlin.test.Test
import kotlin.test.assertEquals

private fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (char in s) {
        when (char) {
            '(', '[', '{' -> stack.addLast(char)
            ')' -> if (stack.removeLastOrNull() != '(') return false
            ']' -> if (stack.removeLastOrNull() != '[') return false
            '}' -> if (stack.removeLastOrNull() != '{') return false
        }
    }

    return stack.isEmpty()
}

class `20_Valid_Parentheses` {

    @Test
    fun case_1() {
        val output = isValid("()")
        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isValid("()[]{}")
        assertEquals(true, output)
    }

    @Test
    fun case_3() {
        val output = isValid("(]")
        assertEquals(false, output)
    }
}
