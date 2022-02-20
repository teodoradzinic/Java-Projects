public class Queue {

    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    public Node enqueue(int item) {
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
        int len = 0;
        if (head == null) {
            System.out.println("DLL is empty");
            return len;
        }
        Node current = head;
        while (current != null) {
            len++;
            current = current.next;
        }
        System.out.println("Length od DLL : " + len);
        return len;
    }
    public int dequeue() throws QueueTooSmallException {
        if (head == null) {
            throw new QueueTooSmallException("Queue is too small");
        }
        Node current = head;
        System.out.println("Del -> " + current.item);
        // delete the node pointed to 'current'
        if (current.next == null) {
            head = null;
        }
        if (current.next != null) {
            current.next.previous = null; //null
        }
        head = head.next;
        return current.item;
    }

    public int[] dequeue(int n) throws QueueTooSmallException {
        if (head == null || size() < n) {
            throw new QueueTooSmallException("Queue too small");
        }
        Node current = head;
        int count = 0;
        int[] arr = new int[n];
        while (count < n) {
            arr[count] = current.item;
            count++;
            current = current.next;
            dequeue();
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
