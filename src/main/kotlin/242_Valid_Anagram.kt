fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val sChars = s.toCharArray().sorted()
    val tChars = t.toCharArray().sorted()

    return sChars == tChars
}
