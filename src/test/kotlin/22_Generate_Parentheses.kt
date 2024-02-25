import kotlin.test.Test
import kotlin.test.assertEquals

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
