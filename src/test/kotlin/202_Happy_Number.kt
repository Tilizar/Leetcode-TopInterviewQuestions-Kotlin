import kotlin.test.Test
import kotlin.test.assertEquals

class `202_Happy_Number` {

    @Test
    fun case_1() {
        val output = isHappy(19)

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = isHappy(2)

        assertEquals(false, output)
    }
}
