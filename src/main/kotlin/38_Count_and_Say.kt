fun countAndSay(n: Int): String {
    var step = 1
    var output = "1"

    while (step < n) {
        var count = 0
        var current = ' '
        val newOutput = StringBuilder()
        output.forEach {
            if (current != it) {
                if (count != 0) newOutput.append("$count$current")
                count = 1
                current = it
            } else {
                count++
            }
        }
        if (count != 0) newOutput.append("$count$current")
        output = newOutput.toString()
        step++
    }

    return output
}
