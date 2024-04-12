import kotlin.test.Test
import kotlin.test.assertContentEquals

private fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
    val map = HashMap<Int, MutableList<Int>>(prerequisites.size)
    prerequisites.forEach {
        map.getOrPut(it[0]) { mutableListOf() }.add(it[1])
    }
    val inProgress = mutableSetOf<Int>()
    val checked = HashSet<Int>(prerequisites.size)
    val output = IntArray(numCourses)
    var outputPointer = 0

    fun dfs(course: Int): Boolean {
        if (inProgress.contains(course)) return false
        if (checked.contains(course)) return true
        val preCourses = map[course] ?: emptyList()

        inProgress.add(course)
        preCourses.forEach {
            if (!dfs(it)) return false
        }

        inProgress.remove(course)
        checked.add(course)
        output[outputPointer] = course
        outputPointer++
        return true
    }

    return if ((0..<numCourses).all { dfs(it) }) output else intArrayOf()
}

class `210_Course_Schedule_II` {

    @Test
    fun case_1() {
        val output = findOrder(2, arrayOf(intArrayOf(1, 0)))

        assertContentEquals(intArrayOf(0, 1), output)
    }

    @Test
    fun case_2() {
        val prerequisites = arrayOf(intArrayOf(1, 0), intArrayOf(2, 0), intArrayOf(3, 1), intArrayOf(3, 2))
        val output = findOrder(4, prerequisites)

        assertContentEquals(intArrayOf(0, 1, 2, 3), output)
    }
}
