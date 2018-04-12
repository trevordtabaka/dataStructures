package bubblesort;


import java.lang.reflect.Array;

public class CustomBubbleSort {


    public static void main(String[] args) {

        Integer[] array = {2,55,53,5,78,88675,32,2425,5367,876,890,32,34,5,667,6,42,867,8};

        bubbleSort(array);
        for(Number n: array){
            System.out.print(n + " ");
        }

    }



    public static <T extends Comparable> void bubbleSort(T[] array){

        for(int i = 0; i < array.length; i++){
            Object temp;
            for(int j=1; j < array.length-i; j++){

                if(array[j-1].compareTo(array[j]) > 0){

                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = (T) temp;

                }




            }


        }



    }




}
