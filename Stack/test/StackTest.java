import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void addToStack(){
        Stack stack = new Stack();

        stack.push(12);
        assertEquals(1, stack.size());
    }
    @Test
    void seeLastElement() throws Exception {
        Stack stack = new Stack();

        stack.push(12);
        stack.push(19);
        stack.push(85);

        assertEquals(85, stack.peek());
    }
    @Test
    void throwsExceptionPeek() throws StackTooSmallException {
        Stack stack = new Stack();
        try{
            stack.peek();
        }catch (StackTooSmallException ex){
            System.out.println(ex);
        }
    }
    @Test
    void throwsExceptionPop() throws StackTooSmallException {
        Stack stack = new Stack();
        try{
            stack.pop();
        }catch (StackTooSmallException ex){
            System.out.println(ex);
        }
    }

    @Test
    void removeLastElement() throws StackTooSmallException {
        Stack stack = new Stack();

        stack.push(12);
        stack.push(19);
        stack.push(85);

        assertEquals(2, stack.pop());
    }
    @Test
    void removeArrayOfElement() throws StackTooSmallException {
        Stack stack = new Stack();

        stack.push(12);
        stack.push(19);
        stack.push(85);
        stack.push(56);

        int[] expected = {56, 85};

        assertArrayEquals(expected, stack.pop(2));
    }

}