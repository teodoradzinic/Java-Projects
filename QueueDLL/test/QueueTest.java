import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void enqueue(){
        Queue q = new Queue();
        q.enqueue(15);
        q.enqueue(56);

        assertEquals(2, q.size());
    }
    @Test
    void dequeue() throws QueueTooSmallException {
        Queue q = new Queue();
        q.enqueue(15);
        q.enqueue(56);

        assertEquals(15, q.dequeue());
    }
    @Test
    void dequeueArray() throws QueueTooSmallException {
        Queue q = new Queue();
        q.enqueue(15);
        q.enqueue(56);
        q.enqueue(96);
        q.enqueue(1000);

        q.printNodes();

        q.dequeue(2);
        q.printNodes();

        q.enqueue(999);
        q.printNodes();

    }

}