import kotlin.test.Test
import kotlin.test.assertEquals

private fun numIslands(grid: Array<CharArray>): Int {
    val marked = mutableSetOf<Pair<Int, Int>>()

    fun bfs(row: Int, column: Int) {
        val queue = ArrayDeque<Pair<Int, Int>>()
        val root = Pair(row, column)
        marked.add(root)
        queue.addLast(root)
        val directions = arrayOf(intArrayOf(-1, 0), intArrayOf(0, -1), intArrayOf(0, 1), intArrayOf(1, 0))

        while (queue.isNotEmpty()) {
            val (currentRow, currentColumn) = queue.removeFirst()

            for (direction in directions) {
                val newRow = currentRow + direction[0]
                val newColumn = currentColumn + direction[1]
                val pair = Pair(newRow, newColumn)

                if (newRow !in 0..grid.lastIndex || newColumn !in 0..grid[newRow].lastIndex
                    || grid[newRow][newColumn] == '0' || marked.contains(pair)
                ) {
                    continue
                }

                queue.addLast(pair)
                marked.add(pair)
            }
        }
    }

    var output = 0

    grid.indices.forEach { row ->
        grid[row].indices.forEach { column ->
            val pair = Pair(row, column)
            if (grid[row][column] == '1' && !marked.contains(pair)) {
                bfs(row, column)
                output += 1
            }
        }
    }

    return output
}

class `200_Number_of_Islands` {

    @Test
    fun case_1() {
        val grid = arrayOf(
            charArrayOf('1', '1', '1', '1', '0'),
            charArrayOf('1', '1', '0', '1', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '0', '0', '0')
        )

        val output = numIslands(grid)

        assertEquals(1, output)
    }

    @Test
    fun case_2() {
        val grid = arrayOf(
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('1', '1', '0', '0', '0'),
            charArrayOf('0', '0', '1', '0', '0'),
            charArrayOf('0', '0', '0', '1', '1')
        )

        val output = numIslands(grid)

        assertEquals(3, output)
    }
}
