object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        // Normalize to lowercase  split phrase into an array split by whitespace
        val words = phrase
            .lowercase()
            .split(Regex("[^a-zA-Z0-9']+"))
            .filter {it.isNotEmpty()}
            .map { it.trim('\'') }
        // Return the word count
        return words.groupingBy { it }.eachCount()
    }
}
