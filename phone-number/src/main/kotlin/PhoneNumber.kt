class PhoneNumber(input: String) {
    val number: String = input.filter {
        it.isDigit()
    }.validate()
        .removeCountryCode()

    private fun String.validate(): String {
        if (this.digitsAreVaild()) return this
        else {
            throw IllegalArgumentException("Invalid phone number")
        }
    }

    private fun String.removeCountryCode(): String {
        return if (this.length == 11) {
            this.substring(1)
        } else {
            this
        }
    }

    private fun String.digitsAreVaild(): Boolean {
        return (this.length == 10 && this[0] in '2'..'9' && this[3] in '2'..'9') ||
               (this.length == 11 && this[0] == '1' && this[1] in '2'..'9' && this[4] in '2'..'9')
    }
}
