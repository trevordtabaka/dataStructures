package arraylist;


import java.util.Arrays;

public class CustomArrayList <E> {

    private static final int DEFAULT_SIZE = 5;
    private E[] DATA;
    private int size;
    private int currentIndex =0;

    CustomArrayList(){

        DATA = (E[]) new Object[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
    }

    CustomArrayList(int size){

         this.size = size;
         DATA = (E[]) new Object[this.size];
    }

    public int size(){

        return this.size;
    }

    public E get(int index){
        if(index<currentIndex){
            return DATA[index];
        }else{
            throw new NullPointerException();
        }
    }
    public boolean add(E obj){
        if(currentIndex > size/2) {
            DATA = resize(size*2);
        }
        DATA[currentIndex] = obj;
        currentIndex++;
        return true;
    }
    public void add(int index, E obj){
        if(index <= size) {
            DATA[index] = obj;
            currentIndex++;

        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    private E[] resize(int size) {
        this.size = size;
        E[] tempDATA = DATA;
        DATA = (E[]) new Object[this.size];
        for(int i = 0; i < currentIndex ;i++){
            if(tempDATA[i] != null){
                DATA[i] = tempDATA[i];
            }
        }

        return DATA;
    }

    public boolean remove(int index){
        if(index < size){
            Object temp = DATA[index];
            DATA[index] = null;
            while(index<currentIndex){
                DATA[index] = DATA[index+1];
                index++;
            }
            currentIndex--;
        }else{
            throw new IndexOutOfBoundsException();
        }
        return true;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "DATA=" + Arrays.toString(DATA) +
                ", size=" + size +
                ", currentIndex=" + currentIndex +
                '}';
    }
}
