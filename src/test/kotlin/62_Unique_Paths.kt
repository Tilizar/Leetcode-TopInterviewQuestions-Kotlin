import kotlin.test.Test
import kotlin.test.assertEquals

class `62_Unique_Paths` {

    @Test
    fun case_1() {
        val output = uniquePaths(3, 7)

        assertEquals(28, output)
    }

    @Test
    fun case_2() {
        val output = uniquePaths(3, 2)

        assertEquals(3, output)
    }
}
