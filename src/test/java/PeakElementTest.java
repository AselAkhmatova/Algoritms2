import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PeakElementTest {

    @Test
    public void testPeakElementHappyTest(){

        int [] array = {3, 2, 7, 5, 1, 9, 23, 1};
        int [] expectedResalt = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int [] actualyResalt = pe.peakElement(array);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }

    @Test
    public void testPeakElementNegativNumberWhole(){

        int [] array = {-3, -2, -7, -5, -1, -9, -23, -1};
        int [] expectedResalt = {3, 7, 23};

        PeakElement pe = new PeakElement();
        int [] actualyResalt = pe.peakElement(array);

        Assertions.assertArrayEquals(expectedResalt,actualyResalt);
    }
}
