import kotlin.test.Test
import kotlin.test.assertEquals

class `11_Container_With_Most_Water` {

    @Test
    fun case_1() {
        val output = maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))

        assertEquals(49, output)
    }

    @Test
    fun case_2() {
        val output = maxArea(intArrayOf(1, 1))

        assertEquals(1, output)
    }
}
