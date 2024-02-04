fun isHappy(n: Int): Boolean {
    var current = n
    val cache = mutableSetOf<Int>()

    while (true) {
        current = current.extractDigits().sumOf { it * it }
        if (cache.contains(current)) {
            return false
        }
        cache.add(current)
        if (current == 1) {
            return true
        }
    }
}

fun Int.extractDigits(): List<Int> {
    var n = this
    val output = mutableListOf<Int>()
    while (n != 0) {
        output.add(n % 10)
        n /= 10
    }
    return output
}
