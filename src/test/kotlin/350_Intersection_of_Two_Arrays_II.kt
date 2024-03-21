import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val short: IntArray
    val long: IntArray

    if (nums1.size > nums2.size) {
        short = nums2
        long = nums1
    } else {
        short = nums1
        long = nums2
    }

    val cache = HashMap<Int, Int>(short.size)

    short.forEach {
        cache.merge(it, 1) { old, _ -> old + 1 }
    }

    val output = IntArray(short.size)
    var pointer = 0

    long.forEach {
        cache.compute(it) { _, old ->
            if (old != null && old > 0) {
                output[pointer] = it
                pointer++
                old - 1
            } else {
                null
            }
        }
    }

    return output.copyOf(pointer)
}

class `350_Intersection_of_Two_Arrays_II` {

    @Test
    fun case_1() {
        val output = intersect(intArrayOf(2, 2), intArrayOf(1, 2, 2, 1))

        assertContentEquals(intArrayOf(2, 2), output)
    }

    @Test
    fun case_2() {
        val output = intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))

        assertContentEquals(intArrayOf(9, 4), output)
    }
}
