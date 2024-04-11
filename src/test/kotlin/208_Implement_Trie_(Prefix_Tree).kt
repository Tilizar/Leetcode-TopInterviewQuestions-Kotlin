import kotlin.test.Test
import kotlin.test.assertEquals

private class Trie() {

    class Node {
        val nodes = mutableMapOf<Char, Node>()
        var isEnd = false
    }

    val root = Node()

    fun insert(word: String) {
        var current = root
        word.forEach {
            if (!current.nodes.containsKey(it)) current.nodes[it] = Node()
            current = current.nodes[it]!!
        }
        current.isEnd = true
    }

    fun search(word: String): Boolean {
        var current = root
        word.forEach {
            if (!current.nodes.containsKey(it)) return false
            current = current.nodes[it]!!
        }
        return current.isEnd
    }

    fun startsWith(prefix: String): Boolean {
        var current = root
        prefix.forEach {
            if (!current.nodes.containsKey(it)) return false
            current = current.nodes[it]!!
        }
        return true
    }
}

class `208_Implement_Trie_(Prefix_Tree)` {

    @Test
    fun case_1() {
        val trie = Trie()
        trie.insert("apple")
        assertEquals(true, trie.search("apple"))
        assertEquals(false, trie.search("app"))
        assertEquals(true, trie.startsWith("app"))
        trie.insert("app")
        assertEquals(true, trie.search("app"))
    }
}
