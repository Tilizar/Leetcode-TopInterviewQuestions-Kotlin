import kotlin.test.Test
import kotlin.test.assertEquals

private class MinStack() {

    private val cache: MutableList<Int> = ArrayList()
    private val min: MutableList<Int> = ArrayList()

    fun push(`val`: Int) {
        cache.add(`val`)
        min.add(if (min.isEmpty() || `val` < min.last()) `val` else min.last())
    }

    fun pop() {
        cache.removeLast()
        min.removeLast()
    }

    fun top(): Int {
        return cache.last()
    }

    fun getMin(): Int {
        return min.last()
    }

}

class `155_Min_Stack` {

    @Test
    fun case_1() {
        val minStack = MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assertEquals(-3, minStack.getMin())
        minStack.pop()
        assertEquals(0, minStack.top())
        assertEquals(-2, minStack.getMin())
    }
}
