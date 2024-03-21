import kotlin.test.Test
import kotlin.test.assertEquals

private fun threeSum(nums: IntArray): List<List<Int>> {
    val output = mutableListOf<List<Int>>()

    nums.sort()

    for (i in 0..<nums.size - 2) {
        if (nums[i] > 0) break

        if (i > 0 && nums[i] == nums[i - 1]) continue

        var left = i + 1
        var right = nums.lastIndex

        while (left < right) {
            val sum = nums[i] + nums[left] + nums[right]
            when {
                sum > 0 -> right--
                sum < 0 -> left++
                else -> {
                    output.add(listOf(nums[i], nums[left], nums[right]))
                    left++
                    while (nums[left] == nums[left - 1] && left < right) {
                        left++
                    }
                }
            }
        }
    }

    return output
}

class `15_3Sum` {

    @Test
    fun case_1() {
        val output = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        val expected = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val output = threeSum(intArrayOf(0, 1, 1))

        val expected = emptyList<List<Int>>()
        assertEquals(expected, output)
    }

    @Test
    fun case_3() {
        val output = threeSum(intArrayOf(0, 0, 0))

        val expected = listOf(listOf(0, 0, 0))
        assertEquals(expected, output)
    }
}
