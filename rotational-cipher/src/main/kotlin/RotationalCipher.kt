class RotationalCipher(val charShift: Int) {
    init {
        require(charShift in (0..26)) { "Shift must be between 0 and 26" }
    }
    fun encode(text: String): String {
        var encodedText = ""

        text.forEach {
            char -> if (!char.isLetter()) {
                encodedText += char
            } else {
                val newAscii = char.code + charShift
                if (char.isUpperCase()) {
                    if (newAscii > 90) {
                        encodedText += (newAscii - 26).toChar()
                    } else {
                        encodedText += newAscii.toChar()
                    }
                } else {
                    if (newAscii > 122) {
                        encodedText += (newAscii - 26).toChar()
                    } else {
                        encodedText += newAscii.toChar()
                    }
                }
            }
        }
        return encodedText
    }
}
