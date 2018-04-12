package selectionsort;

public class CustomSelectionSort {


    public static void main(String[] args) {
        int[] intArray = new int[] {12,43,5,65,7,7,6,8,476,46,3,7,56,7545,642,65,7547,247,324,5,4,8789,34,43,23,2,2,23};

        selectionSort(intArray);

        for(int num: intArray){
            System.out.print(num + ", ");

        }
    }

    public static void selectionSort(int[] array){

        int min_index=0;

        for(int i = 0; i < array.length-1; i++){
            min_index = i;
            int temp;
            for(int j = i+1; j < array.length-1; j++){

                if(array[j+1] < array[min_index]){
                    min_index = j+1;
                }
            }
            temp = array[i];
            array[i]= array[min_index];
            array[min_index] = temp;

        }

    }

}
