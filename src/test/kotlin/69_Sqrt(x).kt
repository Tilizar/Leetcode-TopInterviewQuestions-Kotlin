import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class `69_Sqrt(x)` {

    @Test
    fun case_1() {
        val output = mySqrt(4)

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = mySqrt(8)

        assertEquals(2, output)
    }
}
