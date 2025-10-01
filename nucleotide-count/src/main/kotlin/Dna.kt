class Dna(sequence: String) {
    init {
        require(sequence.all { it in "ACGT" }) { "Input cannot contain any characters other than A, C, G, or T." }
    }
    val nucleotideCounts: Map<Char, Int>
        get() {
            var sequenceCharArray = this.sequence.uppercase().toCharArray()
            var charCountMap = mutableMapOf<Char, Int>(
                'A' to 0,
                'C' to 0,
                'G' to 0,
                'T' to 0
            )
            for (char in sequenceCharArray) {
                charCountMap[char] = charCountMap.get(char)!! + 1
            }
            return charCountMap
        }
}
