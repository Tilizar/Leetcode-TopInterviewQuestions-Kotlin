import kotlin.test.Test
import kotlin.test.assertEquals

class `171_Excel_Sheet_Column_Number` {

    @Test
    fun case_1() {
        val output = titleToNumber("A")

        assertEquals(1, output)
    }

    @Test
    fun case_2() {
        val output = titleToNumber("AB")

        assertEquals(28, output)
    }

    @Test
    fun case_3() {
        val output = titleToNumber("ZY")

        assertEquals(701, output)
    }
}
