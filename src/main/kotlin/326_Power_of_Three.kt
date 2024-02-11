fun isPowerOfThree(n: Int): Boolean {
    var current: Double = n.toDouble()

    while (true) {
        if (current <= 0) return false
        if (current == 1.0 || current == 3.0) return true
        current /= 3
    }
}
