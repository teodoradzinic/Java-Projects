import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    Queue() {
        this.queue = queue;
    }

    void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
    }

    public void push(int newElement) {
        queue.add(newElement);
    }

    public void enqueue(int newElement) {
        if (queue.size() == 0) {
            queue.add(newElement);
            return;
        }
        System.out.print("OLD: ");
        for (int i = 0; i < queue.size(); i++) {
            System.out.print(queue.get(i) + " ");
        }
        System.out.println();
        // queue.remove(0);
        queue.add(newElement);
        for (int i = 0; i < queue.size(); i++) {
        }

    }

    public int size() {
        return queue.size();
    }

    public int dequeue() throws QueueTooSmallException {
        if (queue.size() == 0) {
            throw new QueueTooSmallException("Queue is too small");
        }
        int deleted = queue.remove(0);
        System.out.println("Deleted: " + deleted);
        return deleted;
    }

    public int[] dequeue(int n) throws QueueTooSmallException {
        if (queue.size() < n) {
            throw new QueueTooSmallException("Queue is too small");
        }
        int[] arr = new int[n];
        System.out.print("DEL: ");
        for (int i = 0; i < n; i++) {
            arr[i] = queue.get(0);
            System.out.print(arr[i] + " ");
            queue.remove(0);
        }
        System.out.println();
        return arr;
    }
}
