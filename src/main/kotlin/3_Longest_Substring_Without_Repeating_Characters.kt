import kotlin.math.max

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    var start = 0

    var output = 1

    (1..s.lastIndex).forEach {
        val current = s[it]
        val sub = s.substring(start, it)
        output = max(output, sub.length)
        start += sub.indexOf(current) + 1
    }

    output = max(output, s.substring(start).length)

    return output
}
