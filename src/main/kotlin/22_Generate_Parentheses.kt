fun generateParenthesis(n: Int): List<String> {
    val acc = mutableListOf<String>()

    fun populate(opened: Int, closed: Int, current: String) {
        if (opened == n && closed == n) {
            acc.add(current)
            return
        }
        if (opened < n) {
            populate(opened + 1, closed, "$current(")
        }
        if (opened > closed && closed < n) {
            populate(opened, closed + 1, "$current)")
        }
    }

    populate(0, 0, "")

    return acc
}
