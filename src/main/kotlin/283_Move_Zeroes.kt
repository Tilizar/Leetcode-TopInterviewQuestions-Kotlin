fun moveZeroes(nums: IntArray) {
    var lastNonZeroIndex = 0

    nums.forEach {
        if (it != 0) {
            nums[lastNonZeroIndex] = it
            lastNonZeroIndex++
        }
    }

    for (i in lastNonZeroIndex..nums.lastIndex) {
        nums[i] = 0
    }
}
