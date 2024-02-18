fun longestPalindrome(s: String): String {

    fun isPalindrome(input: String): Boolean {
        var left = 0
        var right = input.lastIndex

        while (left < right) {
            if (input[left] != input[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }

    var size = s.length

    while (size > 1) {
        for (i in 0 .. (s.length - size)) {
            val sub = s.substring(i, i + size)
            if (isPalindrome(sub)) {
                return sub
            }
        }
        size--
    }

    return s.substring(0, 1)
}
