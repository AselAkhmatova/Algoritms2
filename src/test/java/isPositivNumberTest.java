import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class isPositivNumberTest {

    @Order(1)
    @Test
    public void testisPositivPositivNumberHappyPath() {

        int x = 555;
        boolean expectedResult = true;

        IsPositivNumber ips = new IsPositivNumber();
        boolean actuallyResalt = ips.isPositivNumber(x);


        Assertions.assertEquals(actuallyResalt, expectedResult);
    }

    @Order(2)
    @Test
    public void testisPositivNegagivNumberHappyPath() {

        int x = -555;
        boolean expectedResult = false;

        IsPositivNumber ips = new IsPositivNumber();
        boolean actuallyResalt = ips.isPositivNumber(x);


        Assertions.assertEquals(actuallyResalt, expectedResult);

    }

    @Order(3)
    @Test
    public void testisPositivZerroNumberHappyPath() {

        int x = 0;
        boolean expectedResult = true;

        IsPositivNumber ips = new IsPositivNumber();
        boolean actuallyResalt = ips.isPositivNumber(x);


        Assertions.assertEquals(actuallyResalt, expectedResult);

    }

    @Order(4)
    @Test
    public void testisPositivPositivNotRigthNumber(){

        int x = 555;
        boolean expectedResult = false;

        IsPositivNumber ips = new IsPositivNumber();
        boolean actuallyResalt = ips.isPositivNumber(x);


        Assertions.assertEquals(actuallyResalt,expectedResult);
}

    @Order(5)
    @Test
    public void testisPositivNegativNotRightNumber() {

        int x = -555;
        boolean expectedResult = true;

        IsPositivNumber ips = new IsPositivNumber();
        boolean actuallyResalt = ips.isPositivNumber(x);


        Assertions.assertEquals(actuallyResalt, expectedResult);

    }



}