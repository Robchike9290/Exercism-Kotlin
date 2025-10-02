package armstrong_numbers.src.main.kotlin

import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val digits = input.toString().map { it.toString().toInt() }
        var sumSquaredDigits = 0
        digits.forEach { digit ->
            sumSquaredDigits += digit.toDouble().pow(digits.size).toInt()
        }
        return sumSquaredDigits == input
    }

}
