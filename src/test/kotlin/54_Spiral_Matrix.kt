import kotlin.test.Test
import kotlin.test.assertEquals

private fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    var left = 0
    var right = matrix[0].lastIndex
    var top = 0
    var bottom = matrix.lastIndex

    val output = mutableListOf<Int>()

    while (left <= right && top <= bottom) {
        for (i in left..right) output.add(matrix[top][i])
        for (i in top + 1..bottom) output.add(matrix[i][right])
        if (top != bottom) for (i in right - 1 downTo left) output.add(matrix[bottom][i])
        if (left != right) for (i in bottom - 1 downTo top + 1) output.add(matrix[i][left])

        left++
        right--
        top++
        bottom--
    }

    return output
}

class `54_Spiral_Matrix` {

    @Test
    fun case_1() {
        val input = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val output = spiralOrder(input)

        assertEquals(listOf(1, 2, 3, 6, 9, 8, 7, 4, 5), output)
    }

    @Test
    fun case_2() {
        val input = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))
        val output = spiralOrder(input)

        assertEquals(listOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), output)
    }
}
