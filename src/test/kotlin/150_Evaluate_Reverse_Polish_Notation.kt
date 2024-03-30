import kotlin.test.Test
import kotlin.test.assertEquals

private fun evalRPN(tokens: Array<String>): Int {
    val stack = ArrayDeque<Int>()

    for (token in tokens) {
        val tokenAsInt = token.toIntOrNull()
        if (tokenAsInt != null) {
            stack.addLast(tokenAsInt)
            continue
        }

        val second = stack.removeLast()
        val first = stack.removeLast()

        val result = when (token) {
            "+" -> first + second
            "-" -> first - second
            "/" -> first / second
            "*" -> first * second
            else -> throw IllegalStateException()
        }
        stack.addLast(result)
    }

    return stack.removeLast()
}

class `150_Evaluate_Reverse_Polish_Notation` {

    @Test
    fun case_1() {
        val output = evalRPN(arrayOf("2", "1", "+", "3", "*"))

        assertEquals(9, output)
    }

    @Test
    fun case_2() {
        val output = evalRPN(arrayOf("4", "13", "5", "/", "+"))

        assertEquals(6, output)
    }

    @Test
    fun case_3() {
        val output = evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"))

        assertEquals(22, output)
    }
}
