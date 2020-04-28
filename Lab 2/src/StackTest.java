import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void pushAndTopTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(stack.top(), 30);
    }

    @Test
    void popTest() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        node top = stack.pop();
        assertEquals(stack.top(), 20);
        assertEquals(top, 30);

        top = stack.pop();
        assertEquals(stack.top(), 10);
        assertEquals(top, 20);

        top = stack.pop();
        assertNull(stack.top());
        assertEquals(top, 10);

        top = stack.pop();
        assertNull(top);
    }
}