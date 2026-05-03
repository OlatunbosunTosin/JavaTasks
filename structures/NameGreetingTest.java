import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NameGreetingTest{

    @Test
    public void testThatCorrectGreetingFormatIsReturned(){

        String expectedGreeting = NameGreeting.greet("Alice");
        String actualGreeting = "Hello, Alice!";
        assertEquals(expectedGreeting, actualGreeting);

        String expectedGreeting1 = NameGreeting.greet("World");
        String actualGreeting1 = "Hello, World!";
        assertEquals(expectedGreeting1, actualGreeting1);

        String expectedGreeting2 = NameGreeting.greet("");
        String actualGreeting2 = "Hello, !";
        assertEquals(expectedGreeting2, actualGreeting2);

    }   

}
