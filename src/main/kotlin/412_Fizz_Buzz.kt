fun fizzBuzz(n: Int): List<String> {
    val output = ArrayList<String>(n)

    (1..n).forEach {
        val elem = when {
            it % 15 == 0 -> "FizzBuzz"
            it % 5 == 0 -> "Buzz"
            it % 3 == 0 -> "Fizz"
            else -> "$it"
        }
        output.add(elem)
    }

    return output
}
