import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Thread thread;
    boolean running = false;

    @Test
    public void startTest() {
        running = true;
        Game g1 = new Game();
        thread = new Thread(g1);
        thread.start();
        assertTrue(running);
    }

    @Test
    public void stopTest() {
        Game g1 = new Game();
        thread = new Thread(g1);
        try {
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertFalse(running);
    }

    @Test
    public void renderTest() {
        Game g1 = new Game();
        g1.render();
        assertNotNull(g1.getBufferStrategy());
    }

    @Test
    public void runTest() {
        Game g1 = new Game();
        g1.run();
        assertFalse(running);
    }
}