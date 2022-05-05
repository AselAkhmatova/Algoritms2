import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {


    @Order(1)
    @Test
    public void sumArrayPositivNumberHappyPath(){

        int [] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(2)
    @Test
    public void sumArrayNegativNumberHappyPath(){

        int [] array =  {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(3)
    @Test
    public void sumArrayNegativPositivNumberHappyPath(){

        int [] array =  {-7, -3,5,8};
        int expectedResult = 3;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    public void sumArrayZerroNumber(){

        int [] array =  {0, 0,0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(5)
    @Test
    public void sumArrayNotRightNumber(){

        int [] array =  {-7, -3,7,9};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(6)
    @Test
    public void sumArrayEmptyArray(){

        int [] array =  {};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult,actualResult);

    }

}
