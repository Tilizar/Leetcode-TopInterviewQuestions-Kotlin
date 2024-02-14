fun firstUniqChar(s: String): Int {
    val cache = mutableMapOf<Char, Int>()

    for (i in s.lastIndex downTo 0) {
        val char = s[i]
        cache[char] = if (cache.contains(char)) -1 else i
    }

    return s.indexOfFirst { cache[it] != -1 }
}
