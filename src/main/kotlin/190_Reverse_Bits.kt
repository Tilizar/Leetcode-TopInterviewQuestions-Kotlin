fun reverseBits(n: Int): Int {
    var output = 0

    repeat(32) {
        val bit = (n shr it) and 1
        output = output or (bit shl (31 - it))
    }

    return output
}
