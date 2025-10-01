package protein_translation.src.main.kotlin

object ProteinTranslation{
    val proteins = mapOf(
        "AUG" to "Methionine",
        "UUU" to "Phenylalanine", "UUC" to "Phenylalanine",
        "UUA" to "Leucine", "UUG" to "Leucine",
        "UCU" to "Serine", "UCC" to "Serine", "UCA" to "Serine", "UCG" to "Serine",
        "UAU" to "Tyrosine", "UAC" to "Tyrosine",
        "UGU" to "Cysteine", "UGC" to "Cysteine",
        "UGG" to "Tryptophan",
        "UAA" to "STOP", "UAG" to "STOP", "UGA" to "STOP"
    )
    fun translate(rna: String?): List<String> {
        if (rna.isNullOrEmpty()) return emptyList()

        val codons = rna.chunked(3)
        val aminoAcids = mutableListOf<String>()

        for (codon in codons) {
            require(codon.length % 3 == 0) { "Invalid codon" }
            require(proteins.any { it.key == codon }) { "Invalid codon" }
            if (proteins[codon] == "STOP") break
            aminoAcids.add(proteins[codon]!!)
        }

        return aminoAcids
    }
}
