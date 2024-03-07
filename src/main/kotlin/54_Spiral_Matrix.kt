fun spiralOrder(matrix: Array<IntArray>): List<Int> {
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
