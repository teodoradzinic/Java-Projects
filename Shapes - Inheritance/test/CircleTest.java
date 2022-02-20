import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    public void circle(){
        Circle c = new Circle("red", true, 15);
        c.getArea();
        c.getPerimeter();
    }

}