import kotlin.test.Test
import kotlin.test.assertEquals

class `169_Majority_Element` {

    @Test
    fun case_1() {
        val output = majorityElement(intArrayOf(3, 2, 3))

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))

        assertEquals(2, output)
    }
}
