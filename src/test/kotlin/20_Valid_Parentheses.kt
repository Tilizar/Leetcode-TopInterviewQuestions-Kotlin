import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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
