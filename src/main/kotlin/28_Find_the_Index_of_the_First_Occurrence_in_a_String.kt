fun strStr(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}

fun main() {
    assert(0 == strStr("sadbutsad", "sad"))
    assert(-1 == strStr("leetcode", "leeto"))
}
