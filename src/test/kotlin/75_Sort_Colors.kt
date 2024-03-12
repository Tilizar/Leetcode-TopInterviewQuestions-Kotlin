import kotlin.test.Test
import kotlin.test.assertContentEquals

class `75_Sort_Colors` {

    @Test
    fun case_1() {
        val array = intArrayOf(2, 0, 2, 1, 1, 0)

        sortColors(array)

        assertContentEquals(intArrayOf(0, 0, 1, 1, 2, 2), array)
    }

    @Test
    fun case_2() {
        val array = intArrayOf(2, 0, 1)

        sortColors(array)

        assertContentEquals(intArrayOf(0, 1, 2), array)
    }
}
