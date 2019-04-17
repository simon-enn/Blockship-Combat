import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectListTest {


    @Test
    public void addTest() {
        ObjectList ob = new ObjectList(1);
        Enemy en = new Enemy(5, 5, "Enemy");
        ob.add(en);
        assertTrue(ob.list.contains(en));
    }

    @Test
    public void deleteTest() {
        ObjectList ob = new ObjectList(1);
        Enemy en = new Enemy(5, 5, "Enemy");
        ob.add(en);
        ob.delete(en);
        assertFalse(ob.list.contains(en));
    }
}