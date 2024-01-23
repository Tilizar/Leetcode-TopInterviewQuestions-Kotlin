import kotlin.math.min

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""
    var prefix = strs[0]

    for (i in 1..strs.lastIndex) {
        prefix = commonPrefix(prefix, strs[i])
        if (prefix.isEmpty()) break
    }

    return prefix
}

private fun commonPrefix(first: String, second: String): String {
    val shortestLength = min(first.length, second.length)

    for (i in 0 until shortestLength) {
        if (first[i] != second[i]) {
            return first.substring(0, i)
        }
    }

    return first.substring(0, shortestLength)
}
