import kotlin.test.Test
import kotlin.test.assertEquals

class `26_Remove_Duplicates_from_Sorted_Array` {

    @Test
    fun case_1() {
        val input = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

        val output = removeDuplicates(input)

        assertEquals(5, output)
    }
}
