import kotlin.math.min
import kotlin.test.Test
import kotlin.test.assertEquals

private fun trap(height: IntArray): Int {
    var amount = 0

    var index = 0
    while (index < height.size) {
        val left = height[index]
        if (left == 0) {
            index++
            continue
        }
        var right = -1
        var rightIndex = -1
        for (j in index + 1..height.lastIndex) {
            if (left <= height[j] || right < height[j]) {
                right = height[j]
                rightIndex = j
                if (left <= right) break
            }
        }
        if (rightIndex == -1) {
            index++
        } else {
            for (i in index + 1..<rightIndex) {
                amount += min(left, right) - height[i]
            }
            index = rightIndex
        }
    }

    return amount
}

class `42_Trapping_Rain_Water` {

    @Test
    fun case_1() {
        val output = trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))

        assertEquals(6, output)
    }

    @Test
    fun case_2() {
        val output = trap(intArrayOf(4, 2, 0, 3, 2, 5))

        assertEquals(9, output)
    }
}
