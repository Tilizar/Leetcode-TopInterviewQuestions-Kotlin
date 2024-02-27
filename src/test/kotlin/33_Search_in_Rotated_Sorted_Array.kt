import kotlin.test.Test
import kotlin.test.assertEquals

class `33_Search_in_Rotated_Sorted_Array` {

    @Test
    fun case_1() {
        val output = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0)

        assertEquals(4, output)
    }

    @Test
    fun case_2() {
        val output = search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3)

        assertEquals(-1, output)
    }

    @Test
    fun case_3() {
        val output = search(intArrayOf(1), 0)

        assertEquals(-1, output)
    }
}
