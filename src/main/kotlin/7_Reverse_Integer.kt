fun reverse(x: Int): Int {
    var input = x
    var output = 0

    val min = Int.MIN_VALUE / 10
    val max = Int.MAX_VALUE / 10

    while (input != 0) {
        if (output !in (min..max)) return 0

        val digit = input % 10
        output = output * 10 + digit
        input /= 10
    }

    return output
}
