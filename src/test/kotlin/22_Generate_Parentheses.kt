import kotlin.test.Test
import kotlin.test.assertEquals

private fun generateParenthesis(n: Int): List<String> {
    val acc = mutableListOf<String>()

    fun populate(opened: Int, closed: Int, current: String) {
        if (opened == n && closed == n) {
            acc.add(current)
            return
        }
        if (opened < n) {
            populate(opened + 1, closed, "$current(")
        }
        if (opened > closed && closed < n) {
            populate(opened, closed + 1, "$current)")
        }
    }

    populate(0, 0, "")

    return acc
}

class `22_Generate_Parentheses` {

    @Test
    fun case_1() {
        val output = generateParenthesis(3)

        assertEquals(listOf("((()))", "(()())", "(())()", "()(())", "()()()"), output)
    }

    @Test
    fun case_2() {
        val output = generateParenthesis(1)

        assertEquals(listOf("()"), output)
    }
}
