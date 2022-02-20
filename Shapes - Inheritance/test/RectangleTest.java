import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void rectangle(){
        Rectangle r = new Rectangle("red", false, 5,  10 );
        assertEquals( 50, r.getArea());
        assertEquals( 30, r.getPerimeter());
        r.displayData();
    }

}