import java.awt.*;

public class Player extends Gameobject {
    /**
     * @param x    Legt den Punkt auf der X-Achse fest, an dem sich momentan der Spieler befindet
     * @param y    Legt den Punkt auf der Y-Achse fest, an dem sich momentan der Spieler befindet
     * @param name Gibt dem Spieler einen Namen
     *             Konstruktor der Spieler-Klasse
     */
    public Player(int x, int y, String name) {
        super(x, y, name);
        int movX, movY;
        ID = 1;
        setX(50);
        setY(50);
    }

    /**
     * @param graph Die Graphics werden übergeben um den Spieler rendern zu können
     *              Hier wird nur die Farbe des Spielers bestimmt und dann ein Ovales Objekt auf den Graph "gemalt"
     */
    @Override
    public void render(Graphics graph) {
        graph.setColor(Color.blue);
        graph.fillOval(this.getX(), this.getY(), 16, 16);

    }

    /**
     * Spieler wird um movX/movY in x und/oder y Richtung bewegt
     */
    @Override
    public void move() {
        x = x + this.movX;
        y = y + this.movY;
    }
}

