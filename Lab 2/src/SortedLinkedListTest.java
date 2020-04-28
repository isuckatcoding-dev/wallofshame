import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListTest {
    @Test
    void addTestInOrder() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        assertEquals(list.getValue(0),10);
        assertEquals(list.getValue(1),20);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),40);
    }

    @Test
    void addTestBackOrder() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);
        assertEquals(list.getValue(0),10);
        assertEquals(list.getValue(1),20);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),40);
    }
    @Test
    void addTestRandomOrder() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);
        assertEquals(list.getValue(0),10);
        assertEquals(list.getValue(1),20);
        assertEquals(list.getValue(2),30);
        assertEquals(list.getValue(3),40);
    }

    @Test
    void searchFoundTest() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);
        assertTrue(list.search(10));
        assertTrue(list.search(20));
        assertTrue(list.search(30));
        assertTrue(list.search(40));
    }
    @Test
    void searchNotFoundTest() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);
        assertFalse(list.search(0));
        assertFalse(list.search(50));

    }

    @Test
    void printAllValuesTest() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(15);
        list.add(12);


        String j = list.printAllValues();

    assertEquals(j, "START,10,12,15,20,30");



    }

    @Test
    void printEmptyTest() {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        assertTrue(list.printAllValues().equals("Empty"));
    }
}