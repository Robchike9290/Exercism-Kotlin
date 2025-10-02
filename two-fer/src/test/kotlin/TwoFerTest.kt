import org.junit.Assert.assertEquals
import org.junit.Test
import two_fer.src.main.kotlin.TwoFer

class TwoFerTest {

    @Test
    fun noNameGiven() {
        assertEquals("One for you, one for me.", TwoFer.twofer())
    }

    @Test
    fun aNameGiven() {
        assertEquals("One for Alice, one for me.", TwoFer.twofer("Alice"))
    }

    @Test
    fun anotherNameGiven() {
        assertEquals("One for Bob, one for me.", TwoFer.twofer("Bob"))
    }

    @Test
    fun emptyStringGiven() {
        assertEquals("One for , one for me.", TwoFer.twofer(""))
    }

}
