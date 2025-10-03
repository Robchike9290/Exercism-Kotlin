object ResistorColorTrio {

    fun text(vararg input: Color): String {
        val baseNumber = input.take(2).joinToString(separator="") { it.ordinal.toString() }
        val addedZeroes = 0.toString().repeat(input[2].ordinal)
        val longNumber = (baseNumber.plus(addedZeroes)).toLong()
        val trailingZeroes = countTrailingZeros(longNumber)

        val shortNumber = when (trailingZeroes) {
            in (18..20) -> "${longNumber / 1_000_000_000_000_000_000} ${Unit.EXAOHMS}"
            in (15..17) -> "${longNumber / 1_000_000_000_000_000} ${Unit.PETAOHMS}"
            in (12..14) -> "${longNumber / 1_000_000_000_000} ${Unit.TERAOHMS}"
            in (9..11) -> "${longNumber / 1_000_000} ${Unit.GIGAOHMS}"
            in (6..8) -> "${longNumber / 1_000_000} ${Unit.MEGAOHMS}"
            in (3..5) -> "${longNumber / 1_000} ${Unit.KILOOHMS}"
            else -> "$longNumber ${Unit.OHMS}"
        }

        return shortNumber.lowercase()
    }

    fun countTrailingZeros(number: Long): Int {
        if (number == 0L) {
            return 1
        }
        val numberString = number.toString()
        var count = 0
        for (i in numberString.length - 1 downTo 0) {
            if (numberString[i] == '0') {
                count++
            } else {
                break
            }
        }
        return count
    }
}
