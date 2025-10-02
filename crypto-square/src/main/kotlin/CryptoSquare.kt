import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

object CryptoSquare {

    fun ciphertext(plaintext: String): String {
        if (plaintext.isEmpty()) return ""
        val cleanedText = plaintext.filter { it.isLetterOrDigit() }.lowercase()

        val length = cleanedText.length
        var shortSide = floor(sqrt(length.toDouble())).toInt()
        val longSide = ceil(sqrt(length.toDouble())).toInt()
        if (shortSide * longSide < length) shortSide += 1

        val paddedText = cleanedText.padEnd(shortSide * longSide, ' ')
        val rows = paddedText.chunked(longSide)

        var ciphertext = ""
        for (i in 0 until longSide) {
            for (row in rows) {
                ciphertext += row[i]
            }
            ciphertext += " "
        }

        return ciphertext.dropLast(1)
    }

}
