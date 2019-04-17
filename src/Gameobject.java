import java.awt.*;

/**
 * Hier wird das Skelett alles Gameobjects erstellt. Alle Getter und Setter sind hier.
 */
public abstract class Gameobject {
    protected int x, y;
    protected String name;
    protected int movX;
    protected int movY;
    protected int ID;


    /**
     * Konstruktor dieser Klasse
     *
     * @param x    setzt die X-Koordinate
     * @param y    setzt die Y-Koordinate
     * @param name setzt den Namen
     */
    public Gameobject(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.movX = 0;
        this.movY = 0;
        int ID;
    }

    /**
     * @return Die ID dieses Objekts, wird benötigt zur Erkennung von bestimmten Objekten
     */
    int getID() {
        return this.ID;
    }

    /**
     * @param x Dieser Wert wird als MovX gespeichert, was die Veränderung in x-Richtung ist
     */
    void setMovX(int x) {
        this.movX = x;
    }

    /**
     * @param y Dieser Wert wird als MovY gespeichert, was die Veränderung in y-Richtung ist
     */
    void setMovY(int y) {
        this.movY = y;
    }

    /**
     * @return MovX wird zurückgegeben, dies ist die Veränderung in X-Richtung für diesen Cycle
     */
    int getMovX() {
        return this.movX;
    }

    /**
     * @return MovY wird zurückgegeben, dies ist die Veränderung in Y-Richtung für diesen Cycle
     */
    int getMovY() {
        return this.movY;
    }

    /**
     * @return X-Koordinate wird zurückgegeben
     */
    int getX() {
        return this.x;
    }

    /**
     * @return Y-Koordinate wird zurückgegeben
     */
    int getY() {
        return this.y;
    }

    /**
     * @return Name wird zurückgegeben
     */
    String getName() {
        return this.name;
    }

    /**
     * @param x X-Koordinate wird gesetzt
     */
    void setX(int x) {
        this.x = x;
    }

    /**
     * @param y Y-Koordinate wird gesetzt
     */
    void setY(int y) {
        this.y = y;
    }

    /**
     * @param name Name wird gesetzt
     */
    void setName(String name) {
        this.name = name;
    }

    /**
     * @param graph übergibt graph an Unterklassen zum überschreiben dieser Methode
     */
    public abstract void render(Graphics graph);

    /**
     * Move-Methode zum überschreiben in Unterklassen
     */
    public abstract void move();

}
