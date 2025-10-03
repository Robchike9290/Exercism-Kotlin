import org.junit.Test

import org.junit.Assert.assertEquals
import `perfect-numbers`.src.main.kotlin.Classification
import `perfect-numbers`.src.main.kotlin.NaturalNumber

class NaturalNumberTest {

    @Test
    fun smallPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, NaturalNumber.classify(6))
    }

    @Test
    fun mediumPerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, NaturalNumber.classify(28))
    }

    @Test
    fun largePerfectNumberIsClassifiedCorrectly() {
        assertEquals(Classification.PERFECT, NaturalNumber.classify(33550336))
    }

    @Test
    fun smallAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, NaturalNumber.classify(12))
    }

    @Test
    fun mediumAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, NaturalNumber.classify(30))
    }

    @Test
    fun largeAbundantNumberIsClassifiedCorrectly() {
        assertEquals(Classification.ABUNDANT, NaturalNumber.classify(33550335))
    }

    @Test
    fun smallestPrimeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, NaturalNumber.classify(2))
    }

    @Test
    fun smallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, NaturalNumber.classify(4))
    }

    @Test
    fun mediumNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, NaturalNumber.classify(32))
    }

    @Test
    fun largeDeficientNumberIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, NaturalNumber.classify(33550337))
    }

    @Test
    fun edgeCaseWithNoFactorsOtherThanItselfIsClassifiedCorrectly() {
        assertEquals(Classification.DEFICIENT, NaturalNumber.classify(1))
    }

    @Test(expected = RuntimeException::class)
    fun zeroIsNotANaturalNumber() {
        NaturalNumber.classify(0)
    }

    @Test(expected = RuntimeException::class)
    fun negativeNumberIsNotANaturalNumber() {
        NaturalNumber.classify(-1)
    }

}
