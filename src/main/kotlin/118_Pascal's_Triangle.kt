fun generate(numRows: Int): List<List<Int>> {
    val output: MutableList<List<Int>> = mutableListOf()
    output.add(listOf(1))

    (1 until numRows).forEach { index ->
        val prev = output[index - 1]
        val newRow = mutableListOf<Int>()

        newRow.add(1)

        (1 until prev.size).forEach {
            val newValue = prev[it - 1] + prev[it]
            newRow.add(newValue)
        }

        newRow.add(1)

        output.add(newRow)
    }

    return output
}
