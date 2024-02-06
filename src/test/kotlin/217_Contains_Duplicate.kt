import kotlin.test.Test
import kotlin.test.assertEquals

class `217_Contains_Duplicate` {

    @Test
    fun case_1() {
        val output = containsDuplicate(intArrayOf(1, 2, 3, 1))

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = containsDuplicate(intArrayOf(1, 2, 3, 4))

        assertEquals(false, output)
    }

    @Test
    fun case_3() {
        val output = containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2))

        assertEquals(true, output)
    }
}
