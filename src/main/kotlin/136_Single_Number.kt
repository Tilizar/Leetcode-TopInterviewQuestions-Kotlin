fun singleNumber(nums: IntArray): Int {
    nums.sort()

    var pointer = 0

    while (pointer < nums.size) {
        if (pointer == nums.lastIndex || nums[pointer] != nums[pointer + 1]) {
            return nums[pointer]
        }
        pointer += 2
    }

    throw IllegalStateException()
}
