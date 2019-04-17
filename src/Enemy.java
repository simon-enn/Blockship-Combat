import java.awt.*;

/**
 *
 */
public class Enemy extends Gameobject {
    int ai = 3;

    /**
     * @param x    Legt den Punkt auf der X-Achse fest, an dem sich momentan der Enemy befindet
     * @param y    Legt den Punkt auf der Y-Achse fest, an dem sich momentan der Enemy befindet
     * @param name Gibt dem Objekt einen Namen
     */
    public Enemy(int x, int y, String name) {
        super(x, y, name);
        ID = 2;
    }

    /**
     * @param graph Die Graphics werden übergeben um die Gegner rendern zu können
     */
    @Override
    public void render(Graphics graph) {
        graph.setColor(Color.red);
        graph.fillRect(this.getX(), this.getY(), 20, 20);
    }

    /**
     * Enemies bewegen sich auf und ab auf der rechten Seite des Spielfelds
     */
    @Override
    public void move() {
        if (y <= 10) {
            ai = 3;
        }
        if (y >= 400) {
            ai = -3;
        }

        y = y + ai;
    }
}
