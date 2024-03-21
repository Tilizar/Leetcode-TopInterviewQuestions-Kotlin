import kotlin.test.Test
import kotlin.test.assertEquals

private fun countAndSay(n: Int): String {
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

class `38_Count_and_Say` {

    @Test
    fun case_1() {
        val output = countAndSay(1)

        assertEquals("1", output)
    }

    @Test
    fun case_2() {
        val output = countAndSay(4)

        assertEquals("1211", output)
    }
}
