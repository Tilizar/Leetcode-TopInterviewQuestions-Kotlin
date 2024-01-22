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

fun main() {
    assert(5 == removeDuplicates(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)))
}
