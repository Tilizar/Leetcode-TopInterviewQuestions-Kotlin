import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class `88_Merge_Sorted_Array` {

    @Test
    fun case_1() {
        val array = intArrayOf(1, 2, 3, 0, 0, 0)
        merge(array, 3, intArrayOf(2, 5, 6), 3)

        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        assertContentEquals(expected, array)
    }
}
