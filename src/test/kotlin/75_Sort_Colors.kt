import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun sortColors(nums: IntArray) {
    var zeros = 0
    var ones = 0
    var twos = 0

    nums.forEach {
        when (it) {
            0 -> zeros++
            1 -> ones++
            2 -> twos++
        }
    }

    for (i in 0..<zeros) {
        nums[i] = 0
    }

    for (i in zeros..<(zeros + ones)) {
        nums[i] = 1
    }

    for (i in zeros + ones..<(zeros + ones + twos)) {
        nums[i] = 2
    }
}

class `75_Sort_Colors` {

    @Test
    fun case_1() {
        val array = intArrayOf(2, 0, 2, 1, 1, 0)

        sortColors(array)

        assertContentEquals(intArrayOf(0, 0, 1, 1, 2, 2), array)
    }

    @Test
    fun case_2() {
        val array = intArrayOf(2, 0, 1)

        sortColors(array)

        assertContentEquals(intArrayOf(0, 1, 2), array)
    }
}
