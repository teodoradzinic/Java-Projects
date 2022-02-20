public class Stack {

    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public Node push(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
            head.previous = tail.previous = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        return newNode;
    }

    public int size() {
        Node current = head;
        if (head == null) {
            System.out.println("DLL is empty");
            return 0;
        }
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        System.out.println("Length od DLL : " + len);
        return len;
    }

    public int pop() throws StackTooSmallException {
        if (tail == null) {
            throw new StackTooSmallException("Stack is too small");
        }
        Node current = tail;
        System.out.println("Del -> " + current.item);
        // delete the node pointed to 'current'
        if (head.next == null) {
            head = null;
        }
        if (current.previous != null) {
            current.previous.next = null; //null
        }
        tail = tail.previous;
        return current.item;
    }

    public int peek() throws StackTooSmallException {
        Node current = tail;
        if (tail == null) {
            throw new StackTooSmallException("Stack is too small");
        } else {
            System.out.println("Last element: " + current.item);
            return current.item;
        }
    }

    public int[] pop(int n) throws StackTooSmallException {
        if (tail == null || size() < n) {
            throw new StackTooSmallException("Stack too small");
        }
        Node current = tail;
        int count = 0;
        int[] arr = new int[n];
        while (count < n) {
            arr[count] = current.item;
            count++;
            current = current.previous;
            pop();
        }
        return arr;
    }
    public void printNodes() {
        Node current = head;
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        System.out.print("Nodes of DLL: ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }
}
