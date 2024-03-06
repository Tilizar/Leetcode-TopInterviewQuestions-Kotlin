import kotlin.math.max

fun maxSubArray(nums: IntArray): Int {
    var maximum = nums[0]
    var amount = 0

    for (num in nums) {
        amount = max(0, amount)
        amount += num
        maximum = max(maximum, amount)
    }

    return maximum
}
