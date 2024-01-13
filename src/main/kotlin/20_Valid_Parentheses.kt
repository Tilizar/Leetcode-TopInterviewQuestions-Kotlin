fun isValid(s: String): Boolean {
    val stack = ArrayDeque<Char>()

    for (char in s) {
        when (char) {
            '(', '[', '{' -> stack.addLast(char)
            ')' -> if (stack.removeLastOrNull() != '(') return false
            ']' -> if (stack.removeLastOrNull() != '[') return false
            '}' -> if (stack.removeLastOrNull() != '{') return false
        }
    }

    return stack.isEmpty()
}

fun main() {
    assert(isValid("()"))
    assert(isValid("()[]{}"))
    assert(!isValid("(]"))
}
