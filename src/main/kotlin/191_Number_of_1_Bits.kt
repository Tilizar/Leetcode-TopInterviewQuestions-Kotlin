fun hammingWeight(n: Int): Int {
    var output = 0

    repeat(32) {
        val bit = (n shr it) and 1
        if (bit == 1) {
            output++
        }
    }

    return output
}
