fun sortColors(nums: IntArray) {
    var zeros = 0
    var ones = 0
    var twos = 0

    nums.forEach {
        when (it) {
            0 -> zeros++
            1 -> ones++
            2 -> twos++
        }
    }

    for (i in 0..<zeros) {
        nums[i] = 0
    }

    for (i in zeros..<(zeros + ones)) {
        nums[i] = 1
    }

    for (i in zeros + ones..<(zeros + ones + twos)) {
        nums[i] = 2
    }
}
