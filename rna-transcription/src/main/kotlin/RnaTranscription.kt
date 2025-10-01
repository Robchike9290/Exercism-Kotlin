package rna_transcription.src.main.kotlin

object RnaTranscription {
    fun transcribeToRna(dna: String): String {
        var rna = ""

        dna.forEach { nucleotide ->
            when (nucleotide) {
                'G' -> rna += 'C'
                'C' -> rna += 'G'
                'T' -> rna += 'A'
                'A' -> rna += 'U'
                else -> throw IllegalArgumentException("Invalid nucleotide")
            }

        }

        return rna
    }

}