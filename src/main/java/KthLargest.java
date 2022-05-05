public class KthLargest {


    public  int kthLargest (int [] array, int k){

        int max = 0;
        int [] newArray = {};
        if (k > 0 && array.length != 0){


        for(int i = 0; i < array.length; i++){

            for ( int j = i + 1; j < array.length;j++){

                int count;

                if (array[i] < array[j]){

                    count = array[i];
                    array[i] =array[j];
                    array[j] = count;

                }
            }
        }

           newArray = array;
        return newArray[k - 1];

            }

       return max;
    }
}
