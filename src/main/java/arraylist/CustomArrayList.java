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

    public int size(){

        return DATA.length;
    }
    public Object get(int index){
        if(index<size){
            return DATA[index];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }
    public boolean add(Object obj){
        if(currentIndex < size/2) {
            DATA[currentIndex] = obj;
        }else{
            DATA = resize(size*2);
            DATA[currentIndex] = obj;

        }
        currentIndex++;
        return true;
    }
    public boolean add(int index, Object obj){
        if(index <= size) {
            DATA[index] = obj;
            currentIndex++;
            return true;
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    private Object[] resize(int size) {
        this.size = size *2;
        Object[] tempDATA = DATA;
        DATA = new Object[this.size];
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
            while(index<size){
                DATA[index] = DATA[index+1];
                index++;
            }
            currentIndex--;
        }else{
            throw new IndexOutOfBoundsException();
        }
        return true;
    }



}
