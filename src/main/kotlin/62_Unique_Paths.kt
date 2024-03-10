fun uniquePaths(m: Int, n: Int): Int {
    val cache = mutableMapOf<Pair<Int, Int>, Int>()

    fun calculate(down: Int, right: Int): Int {
        if (down == m && right == n) {
            return 1
        }

        val key = Pair(down, right)

        if (cache.containsKey(key)) {
            return cache[key]!!
        }

        val downValue = if (down < m) calculate(down + 1, right) else 0
        val rightValue = if (right < n) calculate(down, right + 1) else 0

        cache[key] = downValue + rightValue

        return cache[key]!!
    }

    return calculate(1, 1)
}
