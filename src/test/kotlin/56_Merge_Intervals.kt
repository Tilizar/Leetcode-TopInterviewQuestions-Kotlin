import kotlin.test.Test
import kotlin.test.assertContentEquals

class `56_Merge_Intervals` {

    @Test
    fun case_1() {
        val output = merge(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
        val expected = arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))

        repeat(output.size) {
            assertContentEquals(expected[it], output[it])
        }
    }

    @Test
    fun case_2() {
        val output = merge(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)))
        val expected = arrayOf(intArrayOf(1, 5))

        repeat(output.size) {
            assertContentEquals(expected[it], output[it])
        }
    }
}
