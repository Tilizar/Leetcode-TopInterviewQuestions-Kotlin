import kotlin.test.Test
import kotlin.test.assertEquals

private fun generate(numRows: Int): List<List<Int>> {
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

class `118_Pascal's_Triangle` {

    @Test
    fun case_1() {
        val expected = listOf(
            listOf(1),
            listOf(1, 1),
            listOf(1, 2, 1),
            listOf(1, 3, 3, 1),
            listOf(1, 4, 6, 4, 1)
        )

        val output = generate(5)

        assertEquals(expected, output)
    }

    @Test
    fun case_2() {
        val expected = listOf(listOf(1))

        val output = generate(1)

        assertEquals(expected, output)
    }
}
