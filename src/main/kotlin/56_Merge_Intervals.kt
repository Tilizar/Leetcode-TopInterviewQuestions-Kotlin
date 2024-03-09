import kotlin.math.max

fun merge(intervals: Array<IntArray>): Array<IntArray> {
    val output = mutableListOf<IntArray>()
    output.add(intervals[0])

    for (i in 1..intervals.lastIndex) {
        if (intervals[i][0] <= output.last()[1]) {
            output.last()[1] = max(output.last()[1], intervals[i][1])
        } else {
            output.add(intervals[i])
        }
    }

    return output.toTypedArray()
}
