import kotlin.test.Test
import kotlin.test.assertEquals

class `53_Maximum_Subarray` {

    @Test
    fun case_1() {
        val output = maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4))

        assertEquals(6, output)
    }

    @Test
    fun case_2() {
        val output = maxSubArray(intArrayOf(1))

        assertEquals(1, output)
    }

    @Test
    fun case_3() {
        val output = maxSubArray(intArrayOf(5, 4, -1, 7, 8))

        assertEquals(23, output)
    }
}
