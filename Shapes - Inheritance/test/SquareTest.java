import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void squareGetArea(){
        Square s = new Square("blue", false,  10);
        assertEquals(100, s.getArea());
        s.displayData();
    }
    @Test
    void squareGetPerimeter(){
        Square s = new Square("blue", false,  10);
        assertEquals(40, s.getPerimeter());
        s.displayData();
    }
    @Test
    void throwsException() throws IllegalArgumentException {

        try{
            Square s = new Square("blue", false,  0);
        }catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
    }

}