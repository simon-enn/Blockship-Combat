import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Unser eigener Keylistener. Hier wird die Bewegung des Spielers geregelt über Tastatur-Eingabem.
 * Leertaste = Schießen
 * Pfeiltaste hoch = Hoch bewegen
 * Pfeiltaste runter = runter bewegen
 */
public class Input implements KeyListener {
    ObjectList objects;

    /**
     * @param list Liste mit Gameobjects wird übergeben, weil wir unsere Objekte benötigen für das bewegen des Spielers
     */
    public Input(ObjectList list) {
        this.objects = list;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    /**
     * In dieser Methode wird das Movement und das Schießen geregelt
     *
     * @param e KeyEvent e ist das Ereignis, dass durch das loslassen einer Taste ausgelöst wird
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        // Falls Numpad-Enter gedrückt wird, wird das Spiel geschlossen
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            Game.running = false;
        }
        // Wir gehen alle Gameobjects durch
        for (int i = 0; i < objects.list.size(); i++) {
            Gameobject tmp = objects.list.get(i);
            //Wenn Name Spieler ist betrachten wir den Input und schauen ob wir uns nach unten oder oben bewegen
            if (tmp.getName() == "Spieler") {
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (tmp.getY() + 10 >= 420) {

                    } else {
                        tmp.setMovY(10);
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    if (tmp.getY() - 10 <= 0) {

                    } else {
                        tmp.setMovY(-10);
                    }
                }
                //bei Space drücken wird eine neue Kugel gespawned die dann abgeschossen wird
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    objects.add(new Bullet(tmp.getX(), tmp.getY() + 5, "Bullet"));
                }
            }
        }

    }
}
