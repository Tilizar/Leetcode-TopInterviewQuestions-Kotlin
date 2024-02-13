import kotlin.test.Test
import kotlin.test.assertContentEquals

class `350_Intersection_of_Two_Arrays_II` {

    @Test
    fun case_1() {
        val output = intersect(intArrayOf(2, 2), intArrayOf(1, 2, 2, 1))

        assertContentEquals(intArrayOf(2, 2), output)
    }

    @Test
    fun case_2() {
        val output = intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4))

        assertContentEquals(intArrayOf(9, 4), output)
    }
}
