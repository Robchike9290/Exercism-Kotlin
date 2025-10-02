package acronym.src.main.kotlin

object Acronym {
    fun generate(phrase: String) : String {
        val chars = phrase.toCharArray()
        val punctuation = listOf('.', '?', '!', ',')
        var acronym = chars[0].toString().uppercase()
        for (i in 1 until chars.size) {
            if (chars[i] == '\'') {
                continue
            } else if (punctuation.contains(chars[i])) {
                continue
            } else if (!chars[i].isLetter() && chars[i + 1].isLetter()) {
                acronym += chars[i + 1].uppercase()
            }
        }
        return acronym
    }
}
