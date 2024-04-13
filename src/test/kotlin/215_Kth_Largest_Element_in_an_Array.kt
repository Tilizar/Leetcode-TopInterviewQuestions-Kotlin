import java.util.PriorityQueue
import kotlin.test.Test
import kotlin.test.assertEquals

private fun findKthLargest(nums: IntArray, k: Int): Int {
    val queue = PriorityQueue<Int>(k + 1)
    nums.forEach {
        queue.add(it)
        if (queue.size > k) queue.poll()
    }
    return queue.poll()
}

class `215_Kth_Largest_Element_in_an_Array` {

    @Test
    fun case_1() {
        val output = findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2)

        assertEquals(5, output)
    }

    @Test
    fun case_2() {
        val output = findKthLargest(intArrayOf(3, 2, 3, 1, 2, 4, 5, 5, 6), 4)

        assertEquals(4, output)
    }
}
