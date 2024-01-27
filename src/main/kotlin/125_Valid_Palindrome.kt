fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.lastIndex

    while (left < right) {
        while (left < right && !s[left].isLetterOrDigit()) {
            left++
        }
        while (right > left && !s[right].isLetterOrDigit()) {
            right--
        }
        if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
            return false
        }
        left++
        right--
    }

    return true
}
