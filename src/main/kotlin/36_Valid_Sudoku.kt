fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (row in board.indices) {
        val cache = HashSet<Int>(9)
        for (column in board[row].indices) {
            val value = board[row][column].digitToIntOrNull() ?: continue
            if (cache.contains(value)) {
                return false
            }
            cache.add(value)
        }
    }

    for (column in 0..board[0].lastIndex) {
        val cache = HashSet<Int>(9)
        for (row in board.indices) {
            val value = board[row][column].digitToIntOrNull() ?: continue
            if (cache.contains(value)) {
                return false
            }
            cache.add(value)
        }
    }

    for (columnMultiplier in 0..<3) {
        for (rowMultiplier in 0..<3) {
            val cache = HashSet<Int>(9)
            for (row in 0..<3) {
                for (column in 0..<3) {
                    val rowIndex = row + (3 * rowMultiplier)
                    val columnIndex = column + (3 * columnMultiplier)
                    val value = board[rowIndex][columnIndex].digitToIntOrNull() ?: continue
                    if (cache.contains(value)) {
                        return false
                    }
                    cache.add(value)
                }
            }
        }
    }

    return true
}
