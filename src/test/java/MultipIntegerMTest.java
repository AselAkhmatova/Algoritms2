import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MultipIntegerMTest {

    @Order(1)
    @Test
    public void multipIntegerMTestGoodNumberHappyPath(){

        int m = 15;
        String expectedResult = "Good Number";

        MultipIntegerMTest mit = new MultipIntegerMTest();
        String actualResult = "Good Number";

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(2)
    @Test
    public void multipIntegerMTestBedNumber(){

       int m = 9;
       String expectedResult = "Bad Number";

       MultipIntegerMTest mit = new MultipIntegerMTest();
       String actualResult = "Bad Number";

       Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test
    public void multipIntegerMPoorNumber(){

        int m = 10;
        String expectedResult = "Poor Number";

        MultipIntegerM mit = new MultipIntegerM();
        String actualResult = "Poor Number";

        Assertions.assertEquals(expectedResult,actualResult);
    }
    @Order(4)
    @Test
    public void multipIntegerMRetutnNumbr(){

        int m = 7;
        String expectedResult = "-1";

        MultipIntegerM mit = new MultipIntegerM();
        String actualResult = "-1";

        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Order(5)
    @Test
    public void multipIntegerNotRitghNumber(){

        int m = 67;
        String expectedResult = "-1";

        MultipIntegerM mit = new MultipIntegerM();
        String actualResult = "Bad Number";

        Assertions.assertEquals(expectedResult,actualResult);
    }

}
