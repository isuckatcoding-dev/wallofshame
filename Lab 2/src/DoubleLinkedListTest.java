import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {
    @Test
    void addTestInOrder() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(10,0);
        list.add(20,1);
        list.add(30,2);
        list.add(40,3);
        assertEquals(list.get(0),10);
        assertEquals(list.get(1),20);
        assertEquals(list.get(2),30);
        assertEquals(list.get(3),40);
    }
    @Test
    void sizeTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
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
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(10,0);
        list.add(20,0);
        assertEquals(list.get(0),20);
        assertEquals(list.get(1),10);
        list.add(30,1);
        assertEquals(list.get(0),20);
        assertEquals(list.get(1),30);
        assertEquals(list.get(2),20);
    }

    @Test
    void AtEndTestOrder() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(10,0);
        list.add(20,1);
        list.add(30,2);
        list.add(40,50);
        assertEquals(list.get(0),20);
        assertEquals(list.get(1),30);
        assertEquals(list.get(2),20);
        assertEquals(list.get(3),40);
    }

    @Test
    void addTestBackOrder() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(40,0);
        list.add(30,1);
        list.add(20,2);
        list.add(10,3);
        assertEquals(list.get(0),40);
        assertEquals(list.get(1),30);
        assertEquals(list.get(2),20);
        assertEquals(list.get(3),10);
    }
    @Test
    void addTestRandomOrder() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertEquals(list.get(0),20);
        assertEquals(list.get(1),40);
        assertEquals(list.get(2),30);
        assertEquals(list.get(3),10);
    }

    @Test
    void getInBoundsTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertEquals(list.get(0),20);
        assertEquals(list.get(1),40);
        assertEquals(list.get(2),30);
        assertEquals(list.get(3),10);
    }
    @Test
    void getOutOfBoundsTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertNull(list.get(0));
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertNull(list.get(-1));
        assertNull(list.get(4));
    }

    @Test
    void printAllValuesTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(20,0);
        list.add(40,1);
        list.add(30,2);
        list.add(10,3);
        assertTrue(list.printAllValues().equals("20,40,30,10"));
    }

    @Test
    void printEmptyTest() {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.printAllValues().equals("Empty"));
    }
}