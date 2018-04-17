package arraylist;

public class CustomArrayList <E> {

    private static final int DEFAULT_SIZE = 5;
    private Object[] DATA;
    private int size;
    private int currentIndex =0;

    CustomArrayList(){

        this(DEFAULT_SIZE);
    }

    CustomArrayList(int size){

         this.size = size;
    }

    public boolean add(Object obj){
        DATA[currentIndex]= obj;
        currentIndex++;
        return true;
    }




}
