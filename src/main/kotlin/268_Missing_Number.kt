fun missingNumber(nums: IntArray): Int {
    var result = nums.size

    (0..nums.lastIndex).forEach {
        result += (it - nums[it])
    }

    return result
}
