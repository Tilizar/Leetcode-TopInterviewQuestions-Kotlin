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
