import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferStrategy;

import static org.junit.Assert.*;

public class EnemyTest {

    @Test
    public void renderTest() {
        Enemy en = new Enemy(20, 20, "Enemy");
        assertEquals(20, en.getX());
        assertEquals(20, en.getY());
    }


    @Test
    public void moveTest() {
        Enemy en = new Enemy(20, 20, "Enemy");
        int test = 5;
        en.setY(test);
        en.move();
        assertEquals(8, en.getY());
        test = 405;
        en.setY(test);
        en.move();
        assertEquals(402, en.getY());
    }
}