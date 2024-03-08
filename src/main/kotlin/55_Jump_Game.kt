fun canJump(nums: IntArray): Boolean {
    var targetPosition = nums.lastIndex

    for (i in nums.lastIndex - 1 downTo 0) {
        val current = nums[i]
        if (i + current >= targetPosition) {
            targetPosition = i
        }
    }

    return targetPosition == 0
}
