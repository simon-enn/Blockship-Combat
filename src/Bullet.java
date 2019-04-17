import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Die Klasse Bullet erbt von Gameobject und beschreibt die geschossenen Projektile im Spiel
 */
public class Bullet extends Gameobject {

    boolean alive = true;

    /**
     * @param x    Legt den Punkt auf der X-Achse fest, an dem sich momentan die Bullet befindet
     * @param y    Legt den Punkt auf der Y-Achse fest, an dem sich momentan die Bullet befindet
     * @param name Der Name des Projektils
     *             Konstruktor der Bullet
     */
    public Bullet(int x, int y, String name) {
        super(x, y, name);
        this.movX = 10;
        ID = 3;
    }


    /**
     * @param graph Die Graphics werden übergeben um die Bullets auf ihr "spawnen zu können"
     */
    public void render(Graphics graph) {
        if (this.alive == false) {

        } else {
            graph.setColor(Color.green);
            graph.fillOval(this.getX(), this.getY(), 3, 3);
        }

    }

    /**
     * Diese überschriebene Methode bewegt die Kugel um 5 Pixel pro Cyclus nach rechts
     */
    @Override
    public void move() {
        if (x < 640) {
            x += 5;
        } else {
            this.alive = false;
        }
    }
}
