import kotlin.test.Test
import kotlin.test.assertContentEquals

class `34_Find_First_and_Last_Position_of_Element_in_Sorted_Array` {

    @Test
    fun case_1() {
        val output = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 8)

        assertContentEquals(intArrayOf(3, 4), output)
    }

    @Test
    fun case_2() {
        val output = searchRange(intArrayOf(5, 7, 7, 8, 8, 10), 6)

        assertContentEquals(intArrayOf(-1, -1), output)
    }

    @Test
    fun case_3() {
        val output = searchRange(intArrayOf(), 0)

        assertContentEquals(intArrayOf(-1, -1), output)
    }
}
