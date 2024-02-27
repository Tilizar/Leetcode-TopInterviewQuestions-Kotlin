fun search(nums: IntArray, target: Int): Int {
    if (nums[0] == target) return 0

    val searchInShiftedHalf = target < nums[0]

    var start = 0
    var end = nums.lastIndex

    while (start <= end) {
        val index = start + (end - start) / 2
        val value = nums[index]

        if (value == target) return index

        if (searchInShiftedHalf && value >= nums[0]) {
            start = index + 1
            continue
        }

        if (!searchInShiftedHalf && value < nums[0]) {
            end = index - 1
            continue
        }

        if (target > value) {
            start = index + 1
        } else {
            end = index - 1
        }
    }

    return -1
}
