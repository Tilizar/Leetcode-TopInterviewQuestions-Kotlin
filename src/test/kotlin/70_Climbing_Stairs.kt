import kotlin.test.Test
import kotlin.test.assertEquals

private fun climbStairs(n: Int): Int {
    var a = 1
    var b = 1

    for (i in 0 until n - 1) {
        val sum = a + b
        a = b
        b = sum
    }

    return b
}

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
