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
    val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val output = removeDuplicates(nums)
    println(nums.contentToString())
    println(output)
}
