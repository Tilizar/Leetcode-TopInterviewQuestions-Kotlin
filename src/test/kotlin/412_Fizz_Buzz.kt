import kotlin.test.Test
import kotlin.test.assertEquals

private fun fizzBuzz(n: Int): List<String> {
    val output = ArrayList<String>(n)

    (1..n).forEach {
        val elem = when {
            it % 15 == 0 -> "FizzBuzz"
            it % 5 == 0 -> "Buzz"
            it % 3 == 0 -> "Fizz"
            else -> "$it"
        }
        output.add(elem)
    }

    return output
}

class `412_Fizz_Buzz` {

    @Test
    fun case_1() {
        val output = fizzBuzz(3)

        assertEquals(listOf("1", "2", "Fizz"), output)
    }

    @Test
    fun case_2() {
        val output = fizzBuzz(5)

        assertEquals(listOf("1", "2", "Fizz", "4", "Buzz"), output)
    }

    @Test
    fun case_3() {
        val output = fizzBuzz(15)
        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")

        assertEquals(expected, output)
    }
}
