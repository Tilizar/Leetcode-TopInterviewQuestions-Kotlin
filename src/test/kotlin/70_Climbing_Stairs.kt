import kotlin.test.Test
import kotlin.test.assertEquals

class `70_Climbing_Stairs` {

    @Test
    fun case_1() {
        val output = climbStairs(2)

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = climbStairs(3)

        assertEquals(3, output)
    }
}
