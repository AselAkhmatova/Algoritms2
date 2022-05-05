public class SumOfTwo {


    public int[][] sumOfTwo (int [] array, int n){

        if (array.length != 0){
            int [] array1 = new int [array.length];

            for (int i = 0; i < array.length;i++) {
                array[i] = array1[i];
            }
            int count = 0;
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array.length; j++){

                    if (n == (array[i] + array[j])){

                        count ++;
                        array[i] = Integer.MIN_VALUE;
                    }
                }
            }

            int [][] result = new int [count] [2];

            count = 0;

            for (int i = 0; i < array1.length; i++){
                for (int j = 0; j < array1.length; j++){

                    if (n == (array[i] + array1[j])){

                        result[count][0] = array1[i];
                        result[count][1] = array1[j];

                        count++;
                        array1[i] = Integer.MAX_VALUE;

                    }
                }
            }

            return result;
        }

        return new int[0][];
    }

}
