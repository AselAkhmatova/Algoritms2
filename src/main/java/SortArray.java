public class SortArray {


    public int[] sortArray(int[] array6) {
        if (array6.length == 0) {

            return new int[]{};
        }

        for (int i = 0; i < array6.length; i++) {
            for (int j = i + 1; j < array6.length; j++) {
                int count;

                if (array6[i] > array6[j]) {

                    count = array6[i];
                    array6[i] = array6[j];
                    array6[j] = count;
                   }
                }

            }
            return array6;
        }
    }
