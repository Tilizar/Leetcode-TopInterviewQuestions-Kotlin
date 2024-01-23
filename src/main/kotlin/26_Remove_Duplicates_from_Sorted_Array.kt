fun removeDuplicates(nums: IntArray): Int {
    var slow = 1
    var fast = 1

    while (fast < nums.size) {
        if (nums[fast] != nums[fast - 1]) {
            nums[slow] = nums[fast]
            slow++
        }
        fast++
    }

    return slow
}
