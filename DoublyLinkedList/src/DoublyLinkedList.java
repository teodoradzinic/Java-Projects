public class DoublyLinkedList {

    class Node {
        int item;
        Node previous;
        Node next;
        public Node(int item) {
            this.item = item;
        }
    }
    Node head = null;
    Node tail = null;

    public Node addNode(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
        return newNode;
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

    public void printNodesReverse() {
        Node current = tail;
        if (tail == null) {
            System.out.println("DLL is empty");
            return;
        }
        System.out.print("Nodes of DLL REVERSED: ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.previous;
        }
        System.out.println();
    }

    public void listLength() {
        Node current = head;
        if (head == null) {
            System.out.println("DLL is empty");
            return;
        }
        int len = 0;
        while (current != null) {
            len++;
            current = current.next;
        }
        System.out.println("Length od DLL : " + len);
    }


    public Node deleteNode(Node del) {
        if (head == null || del == null)
            return null;

        if (head == del)
            head = del.next;

        if (del.next != null)
            del.next.previous = del.previous;

        if (del.previous != null)
            del.previous.next = del.next;

        del = null;
        return head;
    }

    public void deleteNode(int n) {
        Node current = head;

        if (head == null || n < 1) {
            return;
        }
        for (int i = 1; current != null && i < n; i++) {
            current = current.next;
        }
        if (current == null)
            return;

        // delete the node pointed to by 'current'
        deleteNode(current);
    }

    public Node seekList(int data) {
        Node current = head;
        if (head == null)
            return null;
        while (current != null) {
            if (current.item == data) {
                System.out.println("Data " + data + " found in the DLL!");
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public Node seekListReverse(int data) {
        Node current = tail;
        if (head == null)
            return null;
        while (current != null) {
            if (current.item == data) {
                System.out.println("Data " + data + " found in the DLL starting from the back!");
                return current;
            }
            current = current.previous;
        }
        return null;
    }

    public void freeNode(Node current) {
        current.next = null;
        current.previous = null;
    }

    public void freeList() {
        Node current = head;

        if (current == null)
            return;

        while (current != null) {
            freeNode(current);
            current = current.next;
        }
    }

    public void addFirst(int item) {

    }
}

