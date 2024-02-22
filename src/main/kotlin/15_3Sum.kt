fun threeSum(nums: IntArray): List<List<Int>> {
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
