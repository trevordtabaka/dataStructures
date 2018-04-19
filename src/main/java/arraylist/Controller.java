package arraylist;

public class Controller {

    public static void main(String[] args) {

        String string1 = "String1";
        String string2 = "String2";
        String string3 = "String3";
        String string4 = "String4";
        String string5 = "String5";

        CustomArrayList customArrayList = new CustomArrayList();
        System.out.println("new arraylist toString " + customArrayList.toString());
        System.out.println("size " + customArrayList.size());

        System.out.println("add 2 strings");
        customArrayList.add(string1);
        customArrayList.add(string2);

        System.out.println("arraylist toString " + customArrayList.toString());




    }
}
