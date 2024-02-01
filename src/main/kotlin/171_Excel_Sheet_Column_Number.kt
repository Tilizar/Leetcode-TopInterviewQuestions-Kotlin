import kotlin.math.pow

fun titleToNumber(columnTitle: String): Int {
    var result = 0

    columnTitle.forEachIndexed { index, c ->
        val multiplier = columnTitle.lastIndex - index
        val numForChar = c - 'A' + 1
        result += 26.0.pow(multiplier).toInt() * numForChar
    }

    return result
}
