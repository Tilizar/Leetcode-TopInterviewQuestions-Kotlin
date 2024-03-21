import kotlin.math.max
import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals

private fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.lastIndex

    var maxArea = 0

    while (left < right) {
        val currentArea = (right - left) * min(height[left], height[right])
        maxArea = max(maxArea, currentArea)

        if (height[left] < height[right]) {
            left++
        } else {
            right--
        }
    }

    return maxArea
}

class `11_Container_With_Most_Water` {

    @Test
    fun case_1() {
        val output = maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7))

        assertEquals(49, output)
    }

    @Test
    fun case_2() {
        val output = maxArea(intArrayOf(1, 1))

        assertEquals(1, output)
    }
}
