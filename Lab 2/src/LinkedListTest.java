import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void addTestInOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10,0);
        list.add(20,1);
        list.add(30,2);
        list.add(40,3);
        assertEquals(list.getValue(0),10);
        assertEquals(list.getValue(1),20);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),40);
    }

    @Test
    void sizeTest() {
        LinkedList<Integer> list = new LinkedList<>();
        assertEquals(list.size(),0);
        list.add(10,0);
        assertEquals(list.size(),1);
        list.add(20,1);
        assertEquals(list.size(),2);
        list.add(30,2);
        assertEquals(list.size(),3);
        list.add(40,3);
        assertEquals(list.size(),4);
    }

    @Test
    void addTestOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10,0);
        list.add(20,0);
        assertEquals(list.getValue(0),20);
        assertEquals(list.getValue(1),10);
        list.add(30,1);
        assertEquals(list.getValue(0),20);
        assertEquals(list.getValue(1),30);
        assertEquals(list.getValue(2),20);
    }

    @Test
    void AtEndTestOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10,0);
        list.add(20,1);
        list.add(30,2);
        list.add(40,50);
        assertEquals(list.getValue(0),20);
        assertEquals(list.getValue(1),30);
        assertEquals(list.getValue(2),20);
        assertEquals(list.getValue(3),40);
    }

    @Test
    void addTestBackOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(40,0);
        list.add(30,1);
        list.add(20,2);
        list.add(10,3);
        assertEquals(list.getValue(0),40);
        assertEquals(list.getValue(1),30);
        assertEquals(list.getValue(2),20);
        assertEquals(list.getValue(3),10);
    }
    @Test
    void addTestRandomOrder() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertEquals(list.getValue(0),20);
        assertEquals(list.getValue(1),40);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),10);
    }

    @Test
    void getInBoundsTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertEquals(list.getValue(0),20);
        assertEquals(list.getValue(1),40);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),10);
    }
    @Test
    void getOutOfBoundsTest() {
        LinkedList<Integer> list = new LinkedList<>();
        assertNull(list.getValue(0));
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertNull(list.getValue(-1));
        assertNull(list.getValue(4));
    }

    @Test
    void printAllValuesTest() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertTrue(list.printAll().equals("20,40,30,10"));
    }

    @Test
    void printEmptyTest() {
        LinkedList<Integer> list = new LinkedList<>();
        assertTrue(list.printAll().equals("Empty"));
    }
}