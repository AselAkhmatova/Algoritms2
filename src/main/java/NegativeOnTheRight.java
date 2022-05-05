public class NegativeOnTheRight {


    public int [] negativOneTheRight (int [] array){

        if (array.length != 0 ){
            int [] newArray = new int [array.length];
            int count = newArray.length - 1;
            int count2 = 0;

            for (int i = 0; i < array.length;i++){

                if (array[i] < 0){
                    newArray[count] = array[i];
                    count--;
                }else if (array[i] > 0){
                    newArray[count2] = array[i];
                    count2++;

                }
            }
            return newArray;
        }

        return new int []{};
    }



}
