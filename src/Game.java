import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


/**
 * In dieser Klasse werden die meisten Objekte erzeugt und der Gamecycle und Threads sind hier auch enthalten
 */
public class Game extends Canvas implements Runnable {
    int points = 0;
    //Breite und höhe des Spielfelds
    public static final int WIDTH = 640, HEIGHT = 480;
    //running boolean für Thread und der Thread selbst
    public static boolean running = false;
    private Thread thread;
    //Liste wird erstellt in der all unsere Spielobjekte drin sind
    public ObjectList list = new ObjectList(points);
    public Player p1 = new Player(50, 50, "Spieler");
    public Enemy en1 = new Enemy(550, 100, "Enemy");


    /**
     * Konstruktor des Spiels. Erzeugt den Spieler und den ersten Gegner, fügt unsere Input-Klasse als KeyListener ein.
     * Screen wird erzeugt
     */
    public Game() {
        list.add(p1);
        list.add(en1);
        this.addKeyListener(new Input(list));
        new Screen(WIDTH, HEIGHT, "PStA Game", this);

    }

    /**
     * startet den Thread
     */
    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    /**
     * Stoppt den Thread
     */
    public synchronized void stop() {
        try {
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Render Methode, die die render-Methoden und Move-Methoden aller Gameobjects aufruft, eine Bufferstrategie
     * einbindet, den Hintergrund aufmalt und den Score aktuell hält
     */
    public void render() {
        BufferStrategy strat = this.getBufferStrategy();
        if (strat == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics screen = strat.getDrawGraphics();
        screen.setColor(Color.black);
        screen.fillRect(0, 0, WIDTH, HEIGHT);
        screen.setColor(Color.white);
        screen.drawString("Score: " + list.score, 500, 50);
        list.render(screen);
        list.move();
        strat.show();
    }

    /**
     * run-Methode des Threads. Ruft render in jedem Cycle auf und macht danach 33 Ms Pause damit die Frames nicht zu
     * oft erneuert werden
     */
    @Override
    public void run() {
        while (running) {
            render();
            try {
                Thread.sleep(33);
            } catch (InterruptedException bug) {
                System.out.println(bug);
            }
        }
        stop();
        System.exit(0);
    }
}