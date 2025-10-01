import java.math.BigInteger
import java.math.BigDecimal
import java.lang.Math.pow

object Board {

    fun getGrainCountForSquare(number: Int): BigInteger {
        require(number in 1..64) { "number must be greater than 1 and less than 64, but was $number" }
        return 2.toBigInteger().pow(number - 1)
    }

    fun getTotalGrainCount(): BigInteger {
        var totalGrainCount: BigInteger = BigInteger.valueOf(0)
        for (i in 1..64) {
            totalGrainCount = totalGrainCount + getGrainCountForSquare(i)
        }
        return totalGrainCount
    }
}
