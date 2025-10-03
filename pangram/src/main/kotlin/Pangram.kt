object Pangram {

    fun isPangram(input: String): Boolean {
        // turn into lowercase and filter only letters
        val filtered = input.lowercase().filter { it in 'a'..'z' }.toSet()
        // return true if we have all the letters
        return filtered.size == 26
    }
}
