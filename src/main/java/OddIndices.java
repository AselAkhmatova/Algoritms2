public class OddIndices {


    public int[] OddIndices(int[] array) {

        if (array.length != 0) {

            int[] array1 = new int[array.length / 2];

            int j = 0;

            for (int i = 1; i < array.length; i+=2) {

                array1[j] = array[i];

                    j++;

            }

            return array1;
        }

        return new int[]{};
    }
}
