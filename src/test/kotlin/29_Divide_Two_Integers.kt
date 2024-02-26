import kotlin.test.Test
import kotlin.test.assertEquals

class `29_Divide_Two_Integers` {

    @Test
    fun case_1() {
        val output = divide(10, 3)

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = divide(7, -3)

        assertEquals(-2, output)
    }
}
