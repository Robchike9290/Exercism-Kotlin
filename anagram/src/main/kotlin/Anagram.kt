class Anagram(val source: String) {
    var anagramList = mutableListOf<String>()

    fun match(anagrams: Collection<String>): Set<String> {
        val sortedSource = source.lowercase().toCharArray().sorted().joinToString()
        anagrams.forEach { anagram ->
            if (anagram.equals(source, ignoreCase = true)) return@forEach
            val sortedAnagram = anagram.lowercase().toCharArray().sorted().joinToString()
            if (sortedSource == sortedAnagram) anagramList.add(anagram)
        }
        return anagramList.toSet()
    }
}
