fun rotate(matrix: Array<IntArray>) {
    var left = 0
    var right = matrix.lastIndex
    var top = 0
    var bottom = matrix.lastIndex

    while (top < bottom) {
        var offset = 0
        while (offset < right - left) {

            val topLeft = matrix[top][left + offset]
            val topRight = matrix[top + offset][right]
            val bottomRight = matrix[bottom][right - offset]
            val bottomLeft = matrix[bottom - offset][left]

            matrix[top][left + offset] = bottomLeft
            matrix[top + offset][right] = topLeft
            matrix[bottom][right - offset] = topRight
            matrix[bottom - offset][left] = bottomRight

            offset++
        }
        top++
        bottom--
        left++
        right--
    }
}
