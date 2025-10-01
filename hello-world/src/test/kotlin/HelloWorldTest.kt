import hello_world.src.main.kotlin.HelloWorld
import org.junit.Test
import junit.framework.TestCase.assertEquals

class HelloWorldTest {

    @Test
    fun helloWorldTest() {
        assertEquals("Hello, World!", HelloWorld.hello())
    }

}
