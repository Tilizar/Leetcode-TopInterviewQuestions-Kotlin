import kotlin.test.Test
import kotlin.test.assertEquals

private fun majorityElement(nums: IntArray): Int {
    var majority = 0
    var counter = 0

    nums.forEach {
        when {
            majority == it -> counter++
            counter > 0 -> counter--
            else -> {
                majority = it
                counter = 1
            }
        }
    }

    return majority
}

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
