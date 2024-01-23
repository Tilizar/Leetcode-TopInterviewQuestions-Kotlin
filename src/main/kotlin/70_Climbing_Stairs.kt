fun climbStairs(n: Int): Int {
    var a = 1
    var b = 1

    for (i in 0 until n - 1) {
        val sum = a + b
        a = b
        b = sum
    }

    return b
}
