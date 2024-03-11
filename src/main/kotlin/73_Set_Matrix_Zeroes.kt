fun setZeroes(matrix: Array<IntArray>) {
    val rows = mutableSetOf<Int>()
    val columns = mutableSetOf<Int>()

    for (row in matrix.indices) {
        for (column in matrix[row].indices) {
            if (matrix[row][column] == 0) {
                rows.add(row)
                columns.add(column)
            }
        }
    }

    for (row in rows) {
        for (column in matrix[row].indices) {
            matrix[row][column] = 0
        }
    }

    for (column in columns) {
        repeat(matrix.size) { row ->
            matrix[row][column] = 0
        }
    }
}
