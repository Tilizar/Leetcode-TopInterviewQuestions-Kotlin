fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
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
