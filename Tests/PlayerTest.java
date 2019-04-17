import org.junit.Test;

import java.awt.*;
import java.awt.image.BufferStrategy;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void renderTest() {
        Game g = new Game();
        Player p1 = new Player(50, 50, "Player");
        BufferStrategy strat = g.getBufferStrategy();
        if (strat == null) {
            g.createBufferStrategy(3);
            return;
        }
        Graphics screen = strat.getDrawGraphics();
        p1.render(screen);
        assertEquals(Color.black, screen.getColor());
    }

    @Test
    public void moveTest() {
        Player p = new Player(50, 50, "Player");
        p.setMovX(5);
        p.setMovY(5);
        p.move();
        assertEquals(55, p.getX());
        assertEquals(55, p.getY());
    }


}