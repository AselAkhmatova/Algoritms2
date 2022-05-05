public class ReverseArray {

    public int [] reverseArray(int [] array) {

          if (array.length != 0) {
              int indexReverse = 0;
              int[] array1 = new int[array.length];

              for (int i = array.length - 1; i >= 0; i--) {

                  array1[indexReverse] = array[i];

                  indexReverse++;

              }

              for (int i = 0; i < array.length; i++) {

                  int i1 = array1[i];
              }

              return array1;
          }

          return new int[]{};

      }

}
