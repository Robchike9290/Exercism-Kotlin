object Bob {
    fun hey(input: String): String {
        val isQuestion = input.length != 0 && !input.trim().isEmpty() && input.trimEnd()[input.trimEnd().length - 1] == '?'
        val isAllCaps = input == input.uppercase() && input.any { it.isLetter() }
        val isSilence = input.trim().isEmpty()
        lateinit var response: String

        if (isSilence) {
            response = "Fine. Be that way!"
        } else if (isQuestion && isAllCaps) {
            response = "Calm down, I know what I'm doing!"
        } else if (isQuestion) {
            response = "Sure."
        } else if (isAllCaps) {
            response = "Whoa, chill out!"
        } else {
            response = "Whatever."
        }
        return response
    }
}
