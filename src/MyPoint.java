import java.awt.Graphics;

public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void drawLineTo(MyPoint pt2, Graphics g) {
        g.drawLine(this.x, this.y, pt2.x, pt2.y);
    }
}