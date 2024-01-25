import kotlin.test.Test
import kotlin.test.assertEquals

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
