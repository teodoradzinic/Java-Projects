import java.util.ArrayList;

public class Queue extends Stack {
    private ArrayList<Integer> queue = new ArrayList<Integer>();

    Queue() {
        this.queue = queue;
    }

    public void enqueue(int newElement) {

        if (queue.size() == 0) {
            queue.add(newElement);
            return;
        }

        for (int i = 0; i < queue.size(); i++) {
            System.out.println(queue.get(i));
        }

    }
}

