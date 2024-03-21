import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun twoSum(nums: IntArray, target: Int): IntArray {
    val cache = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, number ->
        val cached = cache[target - number]
        if (cached != null) {
            return intArrayOf(cached, index)
        } else {
            cache[number] = index
        }
    }

    return intArrayOf()
}

class `1_Two_Sum` {

    @Test
    fun case_1() {
        val output = twoSum(intArrayOf(2, 7, 11, 15), 9)
        assertContentEquals(intArrayOf(0, 1), output)
    }

    @Test
    fun case_2() {
        val output = twoSum(intArrayOf(3, 2, 4), 6)
        assertContentEquals(intArrayOf(1, 2), output)
    }

    @Test
    fun case_3() {
        val output = twoSum(intArrayOf(3, 3), 6)
        assertContentEquals(intArrayOf(0, 1), output)
    }
}
