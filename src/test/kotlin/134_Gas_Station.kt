import kotlin.test.Test
import kotlin.test.assertEquals

private fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
    if (gas.sum() < cost.sum()) return -1

    var cursor = 0
    var found = 0
    var tank = 0

    while (cursor < gas.size) {
        tank += gas[cursor] - cost[cursor]

        if (tank < 0) {
            tank = 0
            found = cursor + 1
        }

        cursor++
    }

    return found
}

class `134_Gas_Station` {

    @Test
    fun case_1() {
        val output = canCompleteCircuit(intArrayOf(1, 2, 3, 4, 5), intArrayOf(3, 4, 5, 1, 2))

        assertEquals(3, output)
    }

    @Test
    fun case_2() {
        val output = canCompleteCircuit(intArrayOf(2, 3, 4), intArrayOf(3, 4, 3))

        assertEquals(-1, output)
    }
}
