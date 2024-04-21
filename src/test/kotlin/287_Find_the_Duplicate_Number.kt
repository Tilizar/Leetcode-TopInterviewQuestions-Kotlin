import kotlin.test.Test
import kotlin.test.assertEquals

private fun findDuplicate(nums: IntArray): Int {
    var slow = 0
    var fast = 0

    do {
        slow = nums[slow]
        fast = nums[fast]
        fast = nums[fast]
    } while (slow != fast)

    var pointer = 0

    do {
        slow = nums[slow]
        pointer = nums[pointer]
    } while (slow != pointer)

    return pointer
}

class `287_Find_the_Duplicate_Number` {

    @Test
    fun case_1() {
        val output = findDuplicate(intArrayOf(1, 3, 4, 2, 2))

        assertEquals(2, output)
    }

    @Test
    fun case_2() {
        val output = findDuplicate(intArrayOf(3, 1, 3, 4, 2))

        assertEquals(3, output)
    }

    @Test
    fun case_3() {
        val output = findDuplicate(intArrayOf(3, 3, 3, 3, 3))

        assertEquals(3, output)
    }
}
