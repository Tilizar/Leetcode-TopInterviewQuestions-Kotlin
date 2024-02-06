fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()

    (1..nums.lastIndex).forEach {
        if (nums[it] == nums[it - 1]) {
            return true
        }
    }

    return false
}
