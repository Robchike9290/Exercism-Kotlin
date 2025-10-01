package bob.src.main.kotlin

object Bob {
    fun hey(input: String): String {
        val isQuestion = input.isNotEmpty() && !input.trim().isEmpty() && input.trimEnd()[input.trimEnd().length - 1] == '?'
        val isAllCaps = input == input.uppercase() && input.any { it.isLetter() }
        val isSilence = input.trim().isEmpty()
        lateinit var response: String

        when {
            isSilence -> {
                response = "Fine. Be that way!"
            }
            isQuestion && isAllCaps -> {
                response = "Calm down, I know what I'm doing!"
            }
            isQuestion -> {
                response = "Sure."
            }
            isAllCaps -> {
                response = "Whoa, chill out!"
            }
            else -> {
                response = "Whatever."
            }
        }
        return response
    }
}
