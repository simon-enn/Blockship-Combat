import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class GameobjectTest {
    Enemy en = new Enemy(15, 15, "Enemy");

    @Test
    public void getIDTest() {
        assertEquals(2, en.getID());
    }

    @Test
    public void setMovXTest() {
        en.setMovX(40);
        assertEquals(40, en.getMovX());
    }

    @Test
    public void setMovYTest() {
        en.setMovY(35);
        assertEquals(35, en.getMovY());
    }

    @Test
    public void getMovXTest() {
        en.setMovX(30);
        assertEquals(30, en.getMovX());
    }

    @Test
    public void getMovYTest() {
        en.setMovY(25);
        assertEquals(25, en.getMovY());
    }

    @Test
    public void getXTest() {
        en.setX(20);
        assertEquals(20, en.getX());
    }

    @Test
    public void getYTest() {
        en.setY(15);
        assertEquals(15, en.getY());
    }

    @Test
    public void getNameTest() {
        assertEquals("Enemy", en.getName());
    }

    @Test
    public void setXTest() {
        en.setX(10);
        assertEquals(10, en.getX());
    }

    @Test
    public void setYTest() {
        en.setY(50);
        assertEquals(50, en.getY());
    }

    @Test
    public void setNameTest() {
        en.setName("Test");
        assertEquals("Test", en.getName());
    }

}