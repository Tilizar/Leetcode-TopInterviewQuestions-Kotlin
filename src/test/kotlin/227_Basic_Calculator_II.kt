import java.util.Stack
import kotlin.test.Test
import kotlin.test.assertEquals

private fun calculate(s: String): Int {
    val stack = Stack<Int>()
    var pointer = 0
    var currentDigit = 0
    var currentSign = '+'
    val signs = setOf('+', '-', '*', '/')

    while (pointer < s.length) {
        if (s[pointer].isDigit()) {
            currentDigit = currentDigit * 10 + s[pointer].digitToInt()
        }
        if (signs.contains(s[pointer]) || pointer == s.lastIndex) {
            when (currentSign) {
                '+' -> stack.push(currentDigit)
                '-' -> stack.push(-currentDigit)
                '*' -> stack.push(stack.pop() * currentDigit)
                '/' -> stack.push(stack.pop() / currentDigit)
            }
            currentSign = s[pointer]
            currentDigit = 0
        }
        pointer++
    }

    return stack.sum()
}

class `227_Basic_Calculator_II` {

    @Test
    fun case_1() {
        val output = calculate("3+2*2")

        assertEquals(7, output)
    }

    @Test
    fun case_2() {
        val output = calculate(" 3/2 ")

        assertEquals(1, output)
    }

    @Test
    fun case_3() {
        val output = calculate(" 3+5 / 2 ")

        assertEquals(5, output)
    }
}
