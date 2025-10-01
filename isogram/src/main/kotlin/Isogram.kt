object Isogram {

    fun isIsogram(input: String): Boolean {
        val lettersOnly = input.lowercase().filter { it.isLetter() }

        return lettersOnly.length == lettersOnly.toSet().size
    }
}
