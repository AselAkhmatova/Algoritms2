import org.junit.jupiter.api.*;

import java.awt.desktop.AppReopenedListener;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ArreNumbersEqualTest {

//    Test Data:89, 89
//    Expected result: 0-89, 89
//    Expected result: -1 89, -89
//    Expected result: 1

    @Order(1)
    @Test
    public void testArreNumbersEqualsPositivNumberHappyPath(){

        int i = 89;
        int j = 89;
        int expectedResult = 0;

        ArreNumbersEqual ane = new ArreNumbersEqual();
        int actualResalt = ane.arreNumbersEqual( i,j);

        Assertions.assertEquals(expectedResult,actualResalt);
    }

    @Order(2)
    @Test
    public void testArreNumberEqualsNegativPositivNumber(){

        int i = -89;
        int j = 89;
        int expectedResult = -1;

        ArreNumbersEqual ane = new ArreNumbersEqual();
        int actualResult = ane.arreNumbersEqual(i,j);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void testArreNumberEqualsPositivNegativNumberHappyPath(){

        int i = 89;
        int j = - 89;
        int expectedResult = 1;

        ArreNumbersEqual ane = new ArreNumbersEqual();
        int actualResult = ane.arreNumbersEqual(i,j);

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(4)
    @Test

    public void testArreNumberEqualsPositivNumber(){

        int i = -89;
        int j = -89;
        int expectedResult = 1;

        ArreNumbersEqual ane = new ArreNumbersEqual();
        int actualResult = ane.arreNumbersEqual(i,j);

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
