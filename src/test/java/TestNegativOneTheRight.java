import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestNegativOneTheRight {

    @Order(1)
    @Test
    public void testNegativOneTheRightHapyPath(){

        int [] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResalt = {4, 7, 5, 9, 4, 12, -2, -12, -3};

        NegativeOnTheRight notr = new NegativeOnTheRight();
        int [] actualyResalt = notr.negativOneTheRight(array);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }

    @Order(1)
    @Test
    public void testNegativOneTheRightDiferLinghtArray(){

        int [] array = {4, -3, 7, -12, 5, -2, 9, 4, 12};
        int [] expectedResalt = {4, 7, 5, 9, 4, 12, -2, -12};

        NegativeOnTheRight notr = new NegativeOnTheRight();
        int [] actualyResalt = notr.negativOneTheRight(array);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }
}
