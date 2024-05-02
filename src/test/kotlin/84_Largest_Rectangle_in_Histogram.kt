import kotlin.math.max
import kotlin.test.Test
import kotlin.test.assertEquals

private fun largestRectangleArea(heights: IntArray): Int {
    val stack = ArrayDeque<Pair<Int, Int>>()
    var output = 0

    for (i in heights.indices) {
        val height = heights[i]
        var currentStartIndex = i
        while (stack.isNotEmpty()) {
            val lastHeight = stack.lastOrNull()?.second ?: break
            if (lastHeight <= height) break
            val (startIndex, maxHeight) = stack.removeLast()
            output = max(output, maxHeight * (i - startIndex))
            currentStartIndex = startIndex
        }
        stack.addLast(currentStartIndex to height)
    }

    stack.forEach {
        val (index, height) = it
        output = max(output, height * (heights.size - index))
    }

    return output
}

class `84_Largest_Rectangle_in_Histogram` {

    @Test
    fun case_1() {
        val output = largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3))

        assertEquals(10, output)
    }

    @Test
    fun case_2() {
        val output = largestRectangleArea(intArrayOf(2, 4))

        assertEquals(4, output)
    }
}
