import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
@Test
    void addToQueue(){
    Queue queue = new Queue();

    queue.push(15);
    queue.push(85);
    queue.push(99);
    queue.push(123);

    queue.enqueue(98);
    queue.display();
}
@Test
    void dequeue() throws QueueTooSmallException {
    Queue q = new Queue();
    q.push(15);
    q.push(85);
    q.push(99);
    q.push(123);

    assertEquals(15 , q.dequeue());

}@Test
    void dequeueArr() throws QueueTooSmallException {
        Queue q = new Queue();
        q.push(15);
        q.push(85);
        q.push(99);
        q.push(123);

        int[]expected = {15, 85};
        assertArrayEquals(expected, q.dequeue(2));

    }

}