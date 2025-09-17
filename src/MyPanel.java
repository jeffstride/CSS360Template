import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.*;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MyPanel extends JPanel {
    private Timer paintTimer;
    private int myWidth, myHeight;
    final static Random rand = new Random();
    private BufferedImage canvas;
    private Graphics2D canvasGraphics;

    private MyPoint[] triangle;
    private MyPoint current;

    private int dragVertex = -1;

    public static int pointsPerTick = 5;

    public MyPanel(int width, int height) {
        this.myWidth = width;
        this.myHeight = height;

        int x = rand.nextInt(width / 4, 3 * width / 4);
        int y = rand.nextInt(height / 4, 3 * height / 4);
        current = new MyPoint(x, y);

        generateTriangle();

        generateBuffer();

        MouseAdapter mouseHandler = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                for (int i = 0; i < triangle.length; i++) {
                    int dx = (triangle[i].x - e.getX());
                    int dy = (triangle[i].y - e.getY());
                    int dist2 = dx * dx + dy * dy;
                    if (dist2 < 50) {
                        dragVertex = i;
                        generateBuffer();
                        break;
                    }
                } 
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (dragVertex != -1) {
                    triangle[dragVertex].x = e.getX();
                    triangle[dragVertex].y = e.getY();
                    generateBuffer();
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                dragVertex = -1;
            }
        };

        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }

    private void generateBuffer() {
        if (myWidth < getWidth()) {
            myWidth = getWidth();
        };
        if (myHeight < getHeight()) {
            myHeight = getHeight();
        }
        canvas = new BufferedImage(myWidth, myHeight, BufferedImage.TYPE_INT_RGB);
        canvasGraphics = canvas.createGraphics();
        canvasGraphics.setColor(Color.WHITE);
        canvasGraphics.fillRect(0, 0, myWidth, myHeight); // Clear to white
        canvasGraphics.setColor(Color.BLACK);

        drawTriangle(canvasGraphics);
    }

    private void generateTriangle() {
        triangle = new MyPoint[3];

        // make triangle fixed position for now
        triangle[0] = new MyPoint(myWidth / 2, 20);
        triangle[1] = new MyPoint(20, myHeight - 20);
        triangle[2] = new MyPoint(myWidth - 20, myHeight - 20);
    }

    private void drawTriangle(Graphics g) {
        triangle[0].drawLineTo(triangle[1], g);
        triangle[1].drawLineTo(triangle[2], g);
        triangle[2].drawLineTo(triangle[0], g);
    }

    public void addPoints(int n) {
        for (int i = 0; i < n; i++) {
            // pick a random vertex
            MyPoint vertex = triangle[rand.nextInt(3)];

            // Consider the line from the current point to that vertex
            // get mid-point on that line segment.
            int x = (vertex.x + current.x) / 2;
            int y = (vertex.y + current.y) / 2;

            // add the mid-point. That point becomes the new current point.
            current = new MyPoint(x, y);

            // Draw to BufferedImage
            canvasGraphics.fillRect(x, y, 1, 1);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // the superclass paintComponent will clear the drawing canvas for us
        super.paintComponent(g);

        // no need to clear everything
        // g.clearRect(0, 0, this.getWidth(), this.getHeight());

        // Just copy the BufferedImage
        g.drawImage(canvas, 0, 0, null);
    }

    public void startPainting() {
        // create and schedule a painting timer for every 10 ms
        // on slow machines, or with lots of objects, this could be too fast
        final int REPAINT_DELAY = 10;

        paintTimer = new Timer();
        paintTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                addPoints(MyPanel.pointsPerTick);

                // we don't actually paint now, we trigger a notification
                // that we want to be repainted
                repaint();
            }
        }, 0, REPAINT_DELAY);
    }

}
