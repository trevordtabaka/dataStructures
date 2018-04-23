package arraylist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomArrayListTest {
    CustomArrayList<String> arrayList = new CustomArrayList();
    CustomArrayList<String> arrayList2 = new CustomArrayList(8);

    @Before
    public void loadArray(){
        arrayList.add("test 0");
        arrayList.add("test 1");
        arrayList.add("test 2");

        arrayList2.add("test 0");
        arrayList2.add("test 1");
        arrayList2.add("test 2");
        arrayList2.add("test 3");

    }

    @Test
    public void size() {

        assertFalse(arrayList.size()==0);
        assertEquals(arrayList.size(), 5);

        assertEquals(arrayList2.size(), 8);

    }

    @Test
    public void get() {
        assertEquals("test 0", arrayList.get(0));

    }


    @Test
    public void remove() {

        // Test the removing of an object succesfully happens and that the data correctly gets shifted back accordingly.
        // i.e. object that was at index 3 is now at index 2
        assertTrue(arrayList2.get(2) == "test 2");
        arrayList2.remove(2);
        assertEquals(arrayList2.get(2), "test 3");

        // Test that when the currentIndex(true size) of the arrayList is smaller than one-fourth the size value, that it
        // resizes to half the size.
        arrayList2.remove(2);
        arrayList2.remove(1);
        assertEquals(arrayList2.size(), 4);


    }
    @Test
    public void resize(){

        assertEquals(arrayList.size(), 5);
        arrayList.add("resize");
        assertEquals(arrayList.size(),10);

    }
}