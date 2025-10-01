import reverse_string.src.main.kotlin.ReverseString
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ReverseStringTest {
    @Test
    fun `empty string`() = assertEquals("", ReverseString.reverse(""))

    @Test
    fun `single word`() = assertEquals("tobor", ReverseString.reverse("robot"))

    @Test
    fun `capitalized word`() = assertEquals("nemaR", ReverseString.reverse("Ramen"))

    @Test
    fun `sentence with punctuation`() = assertEquals("!yrgnuh m'I", ReverseString.reverse("I'm hungry!"))

    @Test
    fun `palindrome word`() = assertEquals("racecar", ReverseString.reverse("racecar"))

    @Test
    fun `even-sized word`() = assertEquals("reward", ReverseString.reverse("drawer"))

    @Test
    fun `apply twice`() {
        val input = "input"
        assertEquals(input, ReverseString.reverse(ReverseString.reverse(input)))
    }
}
