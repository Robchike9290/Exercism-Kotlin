object RunLengthEncoding {

    fun encode(input: String): String {
        if (input.isEmpty()) return ""
        var encoding = ""
        var currentRepetitionCount = 0
        var previousChar: Char? = input[0]
        input.forEach { char ->
            if (char == previousChar) {
                currentRepetitionCount++
            } else {
                encoding += if (currentRepetitionCount > 1) {
                    (currentRepetitionCount.toString() + previousChar)
                } else {
                    previousChar
                }
                currentRepetitionCount = 1
                previousChar = char
            }
        }
        encoding += if (currentRepetitionCount > 1) {
            (currentRepetitionCount.toString() + input.last())
        } else {
            input.last()
        }
        return encoding
    }

    fun decode(input: String): String {
        var decoding = ""
        var currentRepetitionCount = ""
        input.forEach { char ->
            if (char.isDigit()) {
                currentRepetitionCount += char
            } else {
                decoding += if (currentRepetitionCount.isNotEmpty()) {
                    char.toString().repeat(currentRepetitionCount.toInt())
                } else {
                    char
                }
                currentRepetitionCount = ""
            }
        }
        return decoding
    }
}
