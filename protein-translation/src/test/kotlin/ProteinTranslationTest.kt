import junit.framework.TestCase.assertEquals
import kotlin.test.assertFailsWith
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.collections.emptyList
import protein_translation.src.main.kotlin.ProteinTranslation

class ProteinTranslationTest {
    @Test
    fun emptyRNAHasNoProteins() {
        assertEquals(emptyList<String>(), ProteinTranslation.translate(null))
    }

    @Test
    fun `Sequence of two protein codons translates into proteins`() {
        assertEquals(listOf("Phenylalanine", "Phenylalanine"), ProteinTranslation.translate("UUUUUU"))
    }

    @Test
    fun `Sequence of two different protein codons translates into proteins`() {
        assertEquals(listOf("Leucine", "Leucine"), ProteinTranslation.translate("UUAUUG"))
    }

    @Test
    fun `Translate RNA strand into correct protein list`() {
        assertEquals(listOf("Methionine", "Phenylalanine", "Tryptophan"), ProteinTranslation.translate("AUGUUUUGG"))
    }

    @Test
    fun `Translation stops if STOP codon at beginning of sequence`() {
        assertEquals(emptyList<String>(), ProteinTranslation.translate("UAGUGG"))
    }

    @Test
    fun `Translation stops if STOP codon at end of three-codon sequence`() {
        assertEquals(listOf("Methionine", "Phenylalanine"), ProteinTranslation.translate("AUGUUUUAA"))
    }

    @Test
    fun `Translation stops if STOP codon in middle of three-codon sequence`() {
        assertEquals(listOf("Tryptophan"), ProteinTranslation.translate("UGGUAGUGG"))
    }

    @Test
    fun `Translation stops if STOP codon in middle of six-codon sequence`() {
        assertEquals(listOf("Tryptophan", "Cysteine", "Tyrosine"), ProteinTranslation.translate("UGGUGUUAUUAAUGGUUU"))
    }

    @Test
    fun `Non-existing codon can't translate`() {
        assertFailsWith<IllegalArgumentException>("Invalid codon") {
            ProteinTranslation.translate("AAA")
        }
    }

    @Test
    fun `Unknown amino acids, not part of a codon, can't translate`() {
        assertFailsWith<IllegalArgumentException>("Invalid codon") {
            ProteinTranslation.translate("XYZ")
        }
    }

    @Test
    fun `Incomplete RNA sequence can't translate`() {
        assertFailsWith<IllegalArgumentException>("Invalid codon") {
            ProteinTranslation.translate("AUGU")
        }
    }

    @Test
    fun `Incomplete RNA sequence can translate if valid until a STOP codon`() {
        assertEquals(listOf("Phenylalanine", "Phenylalanine"), ProteinTranslation.translate("UUCUUCUAAUGGU"))
    }
}

@RunWith(Parameterized::class)
class ParameterizedProteinTranslationTest(private val protein: String, private val codons: List<String>) {
    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> {
            return listOf(
                    arrayOf("Methionine", listOf("AUG")),
                    arrayOf("Phenylalanine", listOf("UUU", "UUC")),
                    arrayOf("Leucine", listOf("UUA", "UUG")),
                    arrayOf("Serine", listOf("UCU", "UCC", "UCA", "UCG")),
                    arrayOf("Tyrosine", listOf("UAU", "UAC")),
                    arrayOf("Cysteine", listOf("UGU", "UGC")),
                    arrayOf("Tryptophan", listOf("UGG"))
            )
        }
    }

    @Test
    fun `Protein codon translates into protein`() {
        codons.forEachIndexed { index, codon ->
            val seq = index + 1
            assertEquals("${protein} RNA sequence ${seq} translates into ${protein}", listOf(protein), ProteinTranslation.translate(codon))
        }
    }
}
