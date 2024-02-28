fun searchRange(nums: IntArray, target: Int): IntArray {
    var leftStart = 0
    var leftEnd = nums.lastIndex

    var rightStart = 0
    var rightEnd = nums.lastIndex

    var leftIndex = -1
    var rightIndex = -1

    while (leftStart <= leftEnd) {
        val midIndex = leftStart + (leftEnd - leftStart) / 2
        val mid = nums[midIndex]
        if (target > mid) {
            leftStart = midIndex + 1
        } else {
            if (mid == target) {
                leftIndex = midIndex
            }
            leftEnd = midIndex - 1
        }
    }

    while (rightStart <= rightEnd) {
        val midIndex = rightStart + (rightEnd - rightStart) / 2
        val mid = nums[midIndex]
        if (target >= mid) {
            if (mid == target) {
                rightIndex = midIndex
            }
            rightStart = midIndex + 1
        } else {
            rightEnd = midIndex - 1
        }
    }

    return intArrayOf(leftIndex, rightIndex)
}
