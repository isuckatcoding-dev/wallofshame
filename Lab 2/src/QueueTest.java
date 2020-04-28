import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void pushAndTopTest() {
        Queue<Integer> queue = new Queue<>(3, 0, 0);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        assertEquals(queue.top(), 10);
    }

    @Test
    void popTest() {
        Queue<Integer> queue = new Queue<>(4, 0, 0);
        queue.push(10);
        queue.push(20);
        queue.push(30);
        Integer top = queue.pop();
        assertEquals(queue.top(), 20);
        assertEquals(top, 10);

        top = queue.pop();
        assertEquals(queue.top(), 30);
        assertEquals(top, 20);

        top = queue.pop();
        assertNull(queue.top());
        assertEquals(top, 30);

        top = queue.pop();
        assertNull(top);
    }
}