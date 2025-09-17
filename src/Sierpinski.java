import java.awt.event.InputEvent;
import javax.swing.*;

public class Sierpinski extends JFrame {

    // To eliminate a warning shown in Eclipse, add this constant
    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 800;

    private MyPanel panel;

    public static void main(String[] args) throws InterruptedException {
        Sierpinski theGUI = new Sierpinski();

        // Starts the UI Thread and creates the the UI in that thread.
        // Uses a Lambda Expression to call the createFrame method.
        // Use theGUI as the semaphore object
        SwingUtilities.invokeLater(() -> theGUI.createFrame());
    }

    /**
     * Create the main JFrame and all animation JPanels.
     */
    public void createFrame() {
        // Sets the title found in the Title Bar of the JFrame
        this.setTitle("Sierpinski Triangles");
        // Sets the size of the main Window
        this.setSize(Sierpinski.WIDTH, Sierpinski.HEIGHT);
        // Allows the application to properly close when the
        // user clicks on the Red-X.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMenuBar();

        // subtract some space because of JFrame border/menu space.
        // The Panel will still fill the whole space
        this.panel = new MyPanel(Sierpinski.WIDTH - 25, Sierpinski.HEIGHT - 60);

        add(panel);
        panel.setVisible(true);

        // Set this JFrame to be visible
        this.setVisible(true);
        this.panel.startPainting();
    }

    /**
     * Add some menu options to control the experience.
     */
    private void addMenuBar() {

        JMenuBar bar = new JMenuBar();
        // Add the menu bar to the JFrame
        this.setJMenuBar(bar);

        // Create Animation menu
        JMenu menu = new JMenu("Action");
        menu.setMnemonic('A');
        JMenuItem item = new JMenuItem("Slower", 'S');
        item.addActionListener(e -> {
            if (MyPanel.pointsPerTick > 1)
                MyPanel.pointsPerTick--;
        });
        item.setAccelerator(KeyStroke.getKeyStroke('-', InputEvent.CTRL_DOWN_MASK));
        menu.add(item);
        item = new JMenuItem("Faster", 'F');
        item.addActionListener(e -> {
            if (MyPanel.pointsPerTick < 25)
                MyPanel.pointsPerTick++;
        });
        item.setAccelerator(KeyStroke.getKeyStroke('=', InputEvent.CTRL_DOWN_MASK));
        menu.add(item);

        bar.add(menu);
    }
}

