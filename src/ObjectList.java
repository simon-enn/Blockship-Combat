import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

/**
 * Hier erstellen wir eine Klasse um eine Liste all unserer Spielobjekte zu erstellen
 */
public class ObjectList {
    int score;
    LinkedList<Gameobject> list = new LinkedList<Gameobject>();

    /**
     * Konstruktor der Objektliste
     *
     * @param score momentaner Punktestand
     */
    public ObjectList(int score) {
        this.score = score;
    }

    /**
     * @param g Graphics werden zum rendern aller Objekte in der Liste übergeben
     */

    public void render(Graphics g) {
        for (int i = 0; i < list.size(); i++) {
            Gameobject tmp = list.get(i);
            tmp.render(g);
        }
    }

    /**
     * Hier werden jeden Cycle alle Objekte der Liste bewegt und überprüft ob eine Kugel einen Gegner getroffen hat.
     * Das wurde gelöst indem ich schau ob der Abstand zwischen einer Kugel und einem Gegner ein Abstand von unter 15
     * in irgendeine Richtung vorhanden ist.
     * Falls ein Gegner getroffen wird, wird sein Objekt gelöscht, der Score um 100 erhöht und ein neuer Gegner erzeugt
     */
    public void move() {
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            Gameobject tmp1 = list.get(i);
            tmp1.move();
            tmp1.setMovY(0);
            tmp1.setMovX(0);
            if (tmp1.getID() == 3) {
                for (int j = 0; j < list.size(); j++) {
                    Gameobject tmp2 = list.get(j);
                    if (tmp2.getID() == 2) {
                        int x = tmp1.getX() - tmp2.getX();
                        int y = tmp1.getY() - tmp2.getY();
                        if (x < 15 && x > -15 && y < 15 && y > -15) {
                            System.out.println("Getroffen!");
                            this.score += 100;
                            int n = rand.nextInt(400) + 10;
                            list.remove(j);
                            list.add(new Enemy(550, n, "Enemy"));
                        }
                    }
                }
            }


        }
    }

    /**
     * @param o Das Gameobjekt o wird der Liste hinzugefügt
     */
    public void add(Gameobject o) {
        this.list.add(o);
    }

    /**
     * @param o Das Gameobjekt o wird aus der Liste entfernt
     */
    public void delete(Gameobject o) {
        this.list.remove(o);
    }
}
