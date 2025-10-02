import armstrong_numbers.src.main.kotlin.ArmstrongNumber
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Ignore
import org.junit.Test

class ArmstrongNumberTest {

    @Test
    fun `zero is an armstrong number`() = assertTrue(ArmstrongNumber.check(0))

    @Test
    fun `single digit numbers are armstrong numbers`() = assertTrue(ArmstrongNumber.check(5))

    @Test
    fun `there are no 2 digit armstrong numbers`() = assertFalse(ArmstrongNumber.check(10))

    @Test
    fun `three digit number that is an armstrong number`() = assertTrue(ArmstrongNumber.check(153))

    @Test
    fun `three digit number that is not an armstrong number`() = assertFalse(ArmstrongNumber.check(100))

    @Test
    fun `four digit number that is an armstrong number`() = assertTrue(ArmstrongNumber.check(9474))

    @Test
    fun `four digit number that is not an armstrong number`() = assertFalse(ArmstrongNumber.check(9475))

    @Test
    fun `seven digit number that is an armstrong number`() = assertTrue(ArmstrongNumber.check(9926315))

    @Test
    fun `seven digit number that is not an armstrong number`() = assertFalse(ArmstrongNumber.check(9926314))
}
