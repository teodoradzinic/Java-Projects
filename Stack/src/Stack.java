import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    Stack() {
        this.stack = stack;
    }

    public void push(int newElement) {
        stack.add(newElement);
    }
    public int size(){
       return stack.size();
    }

    public Integer peek() throws StackTooSmallException {
        if (stack.size() == 0){
            throw new StackTooSmallException("Stack is too small");
        }
        System.out.println(stack.get(stack.size() - 1));
        return stack.get(stack.size() - 1);
    }

    public int pop() throws StackTooSmallException {
        if (stack.size() == 0){
            throw new StackTooSmallException("Stack is too small");
        }
        System.out.println(stack.size());
        System.out.println(stack.get(stack.size() - 1));
        stack.remove(stack.get(stack.size() - 1));
        return stack.size();
    }

    public int[] pop(int n) throws StackTooSmallException {
        if (stack.size() < n){
            throw new StackTooSmallException("Stack is too small");
        }

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = stack.get(stack.size()-1);
                stack.remove(stack.get(stack.size()-1));
                System.out.println("Removed: " + arr[i]);
        }
       return arr;

    }
}

