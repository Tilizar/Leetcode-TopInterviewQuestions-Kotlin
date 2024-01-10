fun twoSum(nums: IntArray, target: Int): IntArray {
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

fun main() {
    assert(intArrayOf(0, 1) contentEquals twoSum(intArrayOf(2, 7, 11, 15), 9))
    assert(intArrayOf(1, 2) contentEquals twoSum(intArrayOf(3, 2, 4), 6))
    assert(intArrayOf(0, 1) contentEquals twoSum(intArrayOf(3, 3), 6))
}
