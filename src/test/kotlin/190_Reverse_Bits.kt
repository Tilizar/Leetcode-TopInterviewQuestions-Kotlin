import kotlin.test.Test
import kotlin.test.assertEquals

private fun reverseBits(n: Int): Int {
    var output = 0

    repeat(32) {
        val bit = (n shr it) and 1
        output = output or (bit shl (31 - it))
    }

    return output
}

class `190_Reverse_Bits` {

    @Test
    fun case_1() {
        val output = reverseBits(43261596) //00000010100101000001111010011100

        assertEquals(964176192 ,output) //00111001011110000010100101000000
    }

    @Test
    fun case_2() {
        val output = reverseBits(-3) //11111111111111111111111111111101

        assertEquals(-1073741825 ,output) //10111111111111111111111111111111
    }
}
