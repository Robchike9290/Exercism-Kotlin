package nucleotide_count.src.main.kotlin

class Dna(sequence: String) {
    val sequenceCharArray = sequence.uppercase().toCharArray()
    init {
        require(sequence.all { it in "ACGT" }) { "Input cannot contain any characters other than A, C, G, or T." }
    }
    val nucleotideCounts: Map<Char, Int>
        get() {
            val charCountMap = mutableMapOf<Char, Int>(
                'A' to 0,
                'C' to 0,
                'G' to 0,
                'T' to 0
            )
            for (char in sequenceCharArray) charCountMap[char] = charCountMap.get(char)!! + 1
            return charCountMap
        }
}
