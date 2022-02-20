import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
@Test
    void addNode() throws StackTooSmallException {
    Stack s = new Stack();
    s.push(25);
    s.peek();
    assertEquals(25, s.peek());
}
@Test
    void popElement() throws StackTooSmallException {
    Stack s = new Stack();
    s.push(25);
    s.push(55);
    assertEquals(55, s.peek());

    s.pop();
    assertEquals(25, s.peek());
}
@Test
    void size(){
    Stack s = new Stack();
    s.push(25);
    s.push(55);
    s.push(8000);
    s.printNodes();

    assertEquals(3, s.size());
}
@Test
    void popArray() throws StackTooSmallException {
    Stack s = new Stack();
    s.push(25);
    s.push(55);
    s.push(8000);
    s.printNodes();

    s.pop(2);
    s.printNodes();

    assertEquals(25,s.peek());
}
}