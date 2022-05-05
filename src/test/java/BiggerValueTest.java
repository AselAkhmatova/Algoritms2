import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValuePasitivNumberHappyPath(){

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }

    @Order(2)
    @Test
    public void testBiggerValueNegativNumberHappyPath(){

        int a = -3333;
        int b = -9999;
        int expectedResult = -3333;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }

    @Order(3)
    @Test
    public void testBiggerValuePasitivNegativNumberHappyPath(){

        int a = 3333;
        int b = -9999;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }

    @Order(4)
    @Test
    public void testBiggerSameNumber(){

        int a = 3333;
        int b = 3333;
        int expectedResult = 3333;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }

    @Order(5)
    @Test
    public void testBiggerNotRithNumber(){

        int a = 3333;
        int b = 9999;
        int expectedResult = -9999;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }


    @Order(6)
    @Test
    public void testBigger(){

        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int expectedResult = Integer.MAX_VALUE - 1;

        BiggerValue bv = new BiggerValue();
        int actualResalt = bv.biggerValue(a,b);

        Assertions.assertEquals(expectedResult,actualResalt);
    }


}
