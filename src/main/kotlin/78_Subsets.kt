fun subsets(nums: IntArray): List<List<Int>> {
    val output = mutableListOf<List<Int>>()
    output.add(emptyList())

    for (num in nums) {
        repeat(output.size) {
            val current = output.removeAt(0)
            output.add(current)
            output.add(current.toMutableList().apply { add(num) })
        }
    }

    return output
}
