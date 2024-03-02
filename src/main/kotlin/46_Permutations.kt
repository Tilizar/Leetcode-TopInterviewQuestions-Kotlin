fun permute(nums: IntArray): List<List<Int>> {
    val output = mutableListOf<List<Int>>()

    fun permute(acc: List<Int>, remaining: Set<Int>) {
        if (remaining.isEmpty()) {
            output.add(acc)
        } else {
            remaining.forEach { permute(acc + it, remaining - it) }
        }
    }

    permute(listOf(), nums.toSet())

    return output
}
