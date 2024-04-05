import kotlin.test.Test
import kotlin.test.assertEquals

private fun compare(first: Int, second: Int): Int {
    val firstThenSecond = "$first$second"
    val secondThenFirst = "$second$first"

    return firstThenSecond.compareTo(secondThenFirst) * -1
}

private fun largestNumber(nums: IntArray): String {
    val comparator = Comparator<Int>(::compare)
    val sorted = nums.sortedWith(comparator)
    if (sorted.first() == 0) return "0"
    return sorted.joinToString(separator = "")
}

class `179_Largest_Number` {

    @Test
    fun case_1() {
        val output = largestNumber(intArrayOf(10, 2))

        assertEquals("210", output)
    }

    @Test
    fun case_2() {
        val output = largestNumber(intArrayOf(3, 30, 34, 5, 9))

        assertEquals("9534330", output)
    }
}
