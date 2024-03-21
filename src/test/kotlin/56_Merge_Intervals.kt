import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val output = mutableListOf<IntArray>()
    output.add(intervals[0])

    for (i in 1..intervals.lastIndex) {
        if (intervals[i][0] <= output.last()[1]) {
            output.last()[1] = max(output.last()[1], intervals[i][1])
        } else {
            output.add(intervals[i])
        }
    }

    return output.toTypedArray()
}

class `56_Merge_Intervals` {

    @Test
    fun case_1() {
        val output = merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        val expected = arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))

        repeat(output.size) {
            assertContentEquals(expected[it], output[it])
        }
    }

    @Test
    fun case_2() {
        val output = merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))
        val expected = arrayOf(intArrayOf(1, 5))

        repeat(output.size) {
            assertContentEquals(expected[it], output[it])
        }
    }
}
