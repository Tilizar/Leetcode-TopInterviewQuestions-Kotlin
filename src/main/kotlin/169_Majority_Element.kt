fun majorityElement(nums: IntArray): Int {
    var majority = 0
    var counter = 0

    nums.forEach {
        when {
            majority == it -> counter++
            counter > 0 -> counter--
            else -> {
                majority = it
                counter = 1
            }
        }
    }

    return majority
}
