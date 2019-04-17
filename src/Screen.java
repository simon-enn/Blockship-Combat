import javax.swing.*;
import java.awt.*;

/**
 * Klasse die ein Fenster mit festgelegter Größe öffnet als Grundfenster des Spiels
 */
public class Screen extends Canvas {
    public Screen(int w, int h, String title, Game play) {
        // new JFrame Object with our given Name title
        JFrame frame = new JFrame(title);
        frame.setSize(new Dimension(w, h));
        frame.setPreferredSize(new Dimension(w, h));
        // Make the close Button work
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        // adding an Object of our game Class
        frame.add(play);
        // Make it visible and start
        frame.setVisible(true);
        play.start();

    }
}
