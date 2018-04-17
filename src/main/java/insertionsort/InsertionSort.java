package insertionsort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] intArray = {32,453,545,46,46,23,24,367,68,787,32,2,3,454,6,8};

        insertionSort(intArray);

        for(int num: intArray){
            System.out.print(num+ " ");

        }

    }

    public static void insertionSort(int[] intArray){

        for(int i = 0;i<intArray.length-1; i++){

            for(int j = 1 + i; j > 0;j--){
                int temp;
                if(intArray[j] < intArray[j-1]){

                    temp = intArray[j-1];
                    intArray[j-1] = intArray[j];
                    intArray[j]= temp;

                }else{

                    break;
                }

            }

        }
    }


}
