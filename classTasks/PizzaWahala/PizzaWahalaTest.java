import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaWahalaTest{

    @Test
    public void testThatCorrectPizzaBoxQuantityWasGot(){

    int expectedQuantity = PizzaWahala.PizzaBoxQuantity(45, "Sapa size");
    int actualQuantity = 12;
    assertEquals(actualQuantity, expectedQuantity);
    }

    @Test
    public void testThatCorrectLeftOverWasGotten(){

    int expectedQuantity = PizzaWahala.PizzaSliceLeftOver(45, "Sapa size");
    int actualQuantity = 3;
    assertEquals(actualQuantity, expectedQuantity);
    }

    @Test
    public void testForCorrectPrice(){

    int expectedQuantity = PizzaWahala.PizzaPrice(45, "Sapa size");
    int actualQuantity = 30000;
    assertEquals(actualQuantity, expectedQuantity);
    }

}
