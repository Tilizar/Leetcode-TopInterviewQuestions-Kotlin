fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val cache = HashMap<List<Char>, MutableList<String>>()

    strs.forEach {
        cache.getOrPut(it.toMutableList().apply { sort() }) { mutableListOf() }.add(it)
    }

    return cache.values.toList()
}
