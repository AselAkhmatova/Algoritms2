import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {

    @Order(1)
    @Test
    public void minMaxAveTest(){

        int array [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int j = 6;
        double expectedResult[] =  {3.0, 7.0, 5.0};

        MinMaxAve mav = new MinMaxAve();
        double actualyResalt [] = mav.minMaxAve(array,x,j);

        Assertions.assertArrayEquals(expectedResult,actualyResalt);
    }

    @Order(1)
    @Test
    public void minMaxAveTestEmtyArray(){

        int array [] = {2};
        int x = 0;
        int j = 0;
        double expectedResult[] =  {2,2,2};

        MinMaxAve mav = new MinMaxAve();
        double [] actualyResalt = mav.minMaxAve(array,x,j);

        Assertions.assertArrayEquals(expectedResult,actualyResalt);
    }

    @Order(1)
    @Test
    public void minMaxAveTestShortArrayLinght(){

        int array [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int x = 2;
        int j = 6;
        double expectedResult[] =  {3.0, 7.0};

        MinMaxAve mav = new MinMaxAve();
        double actualyResalt [] = {3.0, 7.0, 5.0};

        Assertions.assertArrayEquals(expectedResult,actualyResalt);
    }
}
