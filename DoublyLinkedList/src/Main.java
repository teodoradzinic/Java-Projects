public class Main {
    public static void main(String[] args) {


    DoublyLinkedList dll = new DoublyLinkedList();
    DoublyLinkedList doubly = new DoublyLinkedList();

    dll.addNode(10);
    dll.addNode(30);
    dll.addNode(50);
    dll.addNode(60);
    dll.addNode(30);

    dll.printNodes();
    dll.printNodesReverse();
    dll.listLength();
    System.out.println();

    doubly.addSort(70);
    doubly.addSort(20);
    doubly.addSort(10);
    doubly.printNodes();


    System.out.println();
    dll.seekList(30);
    dll.seekListReverse(30);

    dll.deleteNode(dll.head);
    dll.deleteNode(3);
    dll.printNodes();
    dll.listLength();

    dll.freeList();
    dll.printNodes();

    }
}
