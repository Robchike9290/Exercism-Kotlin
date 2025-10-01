import org.junit.Assert.assertEquals
import org.junit.Test
import rna_transcription.src.main.kotlin.RnaTranscription

class RnaTranscriptionTest {
    @Test
    fun `empty RNA` ()= assertEquals("", RnaTranscription.transcribeToRna(""))

    @Test
    fun `RNA complement of cytosine is guanine`() = assertEquals("G", RnaTranscription.transcribeToRna("C"))

    @Test
    fun `RNA complement of guanine is cytosine`() = assertEquals("C", RnaTranscription.transcribeToRna("G"))

    @Test
    fun `RNA complement of thymine is adenine`() = assertEquals("A", RnaTranscription.transcribeToRna("T"))

    @Test
    fun `RNA complement of adenine is uracil`() = assertEquals("U", RnaTranscription.transcribeToRna("A"))

    @Test
    fun `compound RNA`() = assertEquals("UGCACCAGAAUU", RnaTranscription.transcribeToRna("ACGTGGTCTTAA"))
}
