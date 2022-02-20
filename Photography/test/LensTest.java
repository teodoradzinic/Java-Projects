import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LensTest {
    @Test
    void addLensCheckMinMaxFL(){
        Lens l1 = new Lens(120, 50);

        assertTrue(l1.isRight(120, 50));
        assertFalse(l1.isRight(100, 120));
    }
    @Test
    void lensCounter(){
        Lens l1 = new Lens(50,30);
        Lens l2 = new Lens(71, 56);
        Lens l3 = new Lens(78, 44);

        assertEquals(l3.lensCount(), 3);
    }
    @Test
    void setMaxLensValue(){
        Lens l1 = new Lens(80, 40);
        l1.setMaxFocalLength(100);

        assertEquals(100, l1.getMaxFocalLength());
    }
    @Test
    void setMinLensValue(){
        Lens l1 = new Lens(80, 40);
        l1.setMinFocalLength(60);

        assertEquals(60, l1.getMinFocalLength());
    }

}