import kotlin.test.Test
import kotlin.test.assertEquals

private fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    val map = HashMap<Int, MutableList<Int>>(prerequisites.size)
    prerequisites.forEach {
        map.getOrPut(it[0]) { mutableListOf() }.add(it[1])
    }
    val visited = mutableSetOf<Int>()
    val checked = HashSet<Int>(prerequisites.size)

    fun dfs(course: Int): Boolean {
        if (visited.contains(course)) return false
        if (checked.contains(course)) return true
        val preCourses = map[course] ?: return true

        visited.add(course)
        return preCourses.all { dfs(it) }
            .also {
                visited.remove(course)
                checked.add(course)
            }
    }

    return (0..<numCourses).all { dfs(it) }
}

class `207_Course_Schedule` {

    @Test
    fun case_1() {
        val output = canFinish(2, arrayOf(intArrayOf(1, 0)))

        assertEquals(true, output)
    }

    @Test
    fun case_2() {
        val output = canFinish(2, arrayOf(intArrayOf(1, 0), intArrayOf(0, 1)))

        assertEquals(false, output)
    }
}
