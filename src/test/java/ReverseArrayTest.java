import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

    @Order(1)
    @Test
    public void reverseArrayTestHappyPath(){

        int [] array = {2, 7, 3, 10};
        int [] expectedResult = {10, 3, 7, 2};

        ReverseArray rat = new ReverseArray();
        int [] actulyResalt = rat.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actulyResalt);
    }

    @Order(2)
    @Test
    public void reverseArrayTestNegativPositivNumber(){

        int [] array = {2, -7, 3, -10};
        int [] expectedResult = {-10, 3, -7, 2};

        ReverseArray rat = new ReverseArray();
        int [] actulyResalt = rat.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actulyResalt);
    }

    @Order(3)
    @Test
    public void reverseArrayTestEmptyArray(){

        int [] array = {};
        int [] expectedResult = {};

        ReverseArray rat = new ReverseArray();
        int [] actulyResalt = rat.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actulyResalt);
    }

    @Order(4)
    @Test
    public void reverseArrayTestNotRightNumber(){

        int [] array = {2, -7, 3, -10};
        int [] expectedResult = {10, 3, -7, 2};

        ReverseArray rat = new ReverseArray();
        int [] actulyResalt = rat.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actulyResalt);
    }

    @Order(5)
    @Test
    public void reverseArrayTestZerroNumber(){

        int [] array = {0,0,0};
        int [] expectedResult = {0,0,0};

        ReverseArray rat = new ReverseArray();
        int [] actulyResalt = rat.reverseArray(array);

        Assertions.assertArrayEquals(expectedResult,actulyResalt);
    }
}
