import kotlin.math.abs

fun myPow(x: Double, n: Int): Double {
    var power = n
    var base = x
    var output = 1.0

    if (power < 0) {
        power = if (power == Int.MIN_VALUE) Int.MAX_VALUE else abs(power)
        val baseIsNegative = base < 0
        base = 1 / base
        if (baseIsNegative) {
            base *= -1
        }
    }

    while (power > 0) {
        if (power % 2 != 0) {
            output *= base
        }
        base *= base
        power /= 2
    }

    return output
}