import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void addToQueue(){
        Queue queue = new Queue();
        queue.push(15);
        queue.push(70);
        queue.push(96);

        queue.enqueue(62);

    }

}