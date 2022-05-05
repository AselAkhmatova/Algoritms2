import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
@Test
    public void testOddIndicesTestNegativPath(){

      int []  array = {-45, 590, 234, 985, 12, 68};
      int [] expectedResult = {590, 985, 68};

      OddIndices ai = new OddIndices();
      int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }


    @Order(3)
    @Test
    public void testOddIndicesEmpthyArray(){

        int []  array = {};
        int [] expectedResult = {};

        OddIndices ai = new OddIndices();

        int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    public void testOddIndicesNegativNumber(){

        int []  array = {-45, -590, -234, -985, -12, -68};
        int [] expectedResult = {-45,-985};

        OddIndices ai = new OddIndices();

        int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(5)
    @Test
    public void testOddIndicesPositivNumber(){

        int []  array = {45, 599, 234, 985, 12, 68,13};
        int [] expectedResult = {45,599,985,13};

        OddIndices ai = new OddIndices();

        int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(6)
    @Test
    public void testOddIndicesZerroNumber(){

        int []  array = {0,0,0,0,0,0};
        int [] expectedResult = {0,0,0};

        OddIndices ai = new OddIndices();

        int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }

    @Order(7)
    @Test
    public void testOddIndicesDiferArrayLinght(){

        int []  array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {-45};

        OddIndices ai = new OddIndices();

        int [] actualResult = ai.OddIndices(array);

        Assertions.assertArrayEquals(expectedResult,actualResult);

    }




























}
