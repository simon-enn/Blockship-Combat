import org.junit.Test;

import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

public class InputTest {


    @Test
    public void keyReleasedTest() {
        Input i = new Input(null);
        Game g1 = new Game();
        g1.addKeyListener(i);
        g1.run();
        assertFalse(g1.running);
        ;

    }
}