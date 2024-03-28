import kotlin.test.Test
import kotlin.test.assertEquals

private class LRUCache(private val capacity: Int) {
    private val internalMap = HashMap<Int, Int>(capacity)
    private val keyStack = ArrayDeque<Int>(capacity)

    fun get(key: Int): Int {
        val value = internalMap[key] ?: return -1
        keyStack.remove(key)
        keyStack.addLast(key)
        return value
    }

    fun put(key: Int, value: Int) {
        if (keyStack.remove(key)) {
            internalMap.remove(key)
        }
        if (keyStack.size == capacity) {
            internalMap.remove(keyStack.removeFirst())
        }
        internalMap[key] = value
        keyStack.addLast(key)
    }
}

class `146_LRU_Cache` {

    @Test
    fun case_1() {
        val lRUCache = LRUCache(2)
        lRUCache.put(1, 1)
        lRUCache.put(2, 2)
        assertEquals(1, lRUCache.get(1))
        lRUCache.put(3, 3)
        assertEquals(-1, lRUCache.get(2))
        lRUCache.put(4, 4)
        assertEquals(-1, lRUCache.get(1))
        assertEquals(3, lRUCache.get(3))
        assertEquals(4, lRUCache.get(4))
    }
}
