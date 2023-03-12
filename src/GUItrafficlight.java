import javax.swing.*;
import java.awt.*;
import static java.lang.Math.*;

public class GUItrafficlight extends JFrame {
    public GUItrafficlight() {
        super("Traffic light");
        this.setBounds(30, 30, 600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        int[] axes_x = new int[]{205, 205, 345, 345};
        int[] axes_y = new int[]{80, 500, 500, 80};
        RoundedFigure figure = new RoundedFigure(Color.black, 300, 100, axes_x, axes_y, 40);
        axes_x = new int[]{80, 160, 160};
        axes_y = new int[]{110, 110, 190};
        RoundedFigure figure1 = new RoundedFigure(Color.black, 130, 130, axes_x, axes_y, 20);
        axes_x = new int[]{80, 160, 160};
        axes_y = new int[]{250, 250, 330};
        RoundedFigure figure2 = new RoundedFigure(Color.black, 130, 270, axes_x, axes_y, 20);
        axes_x = new int[]{80, 160, 160};
        axes_y = new int[]{390, 390, 470};
        RoundedFigure figure3 = new RoundedFigure(Color.black, 130, 410, axes_x, axes_y, 20);
        axes_x = new int[]{390, 390, 470};
        axes_y = new int[]{190, 110, 110};
        RoundedFigure figure4 = new RoundedFigure(Color.black, 410, 130, axes_x, axes_y, 20);
        axes_x = new int[]{390, 390, 470};
        axes_y = new int[]{330, 250, 250};
        RoundedFigure figure5 = new RoundedFigure(Color.black, 410, 270, axes_x, axes_y, 20);
        axes_x = new int[]{390, 390, 470};
        axes_y = new int[]{470, 390, 390};
        RoundedFigure figure6 = new RoundedFigure(Color.black, 410, 410, axes_x, axes_y, 20);
        axes_x = new int[]{245, 245, 305, 305};
        axes_y = new int[]{540, 620, 620, 540};
        RoundedFigure figure7 = new RoundedFigure(Color.black, 275, 560, axes_x, axes_y, 20);
        Circle figure8 = new Circle(Color.red, 275, 150, 110);
        Circle figure9 = new Circle(Color.yellow, 275, 295, 110);
        Circle figure10 = new Circle(Color.green, 275, 440, 110);

        Arc figure11 = new Arc(Color.white, 275, 138, 138);
        Arc figure12 = new Arc(Color.black, 275, 158, 144);
        Arc figure13 = new Arc(Color.white, 275, 283, 138);
        Arc figure14 = new Arc(Color.black, 275, 303, 144);
        Arc figure15 = new Arc(Color.white, 275, 428, 138);
        Arc figure16 = new Arc(Color.black, 275, 448, 144);

        RoundedArc figure17 = new RoundedArc(Color.black, 275, 152, 260);
        Rect figure18 = new Rect(new Color(238, 238, 238), 215, 51, 120, 50);

        figure.setBounds(30, 30, 600, 700);
        figure1.setBounds(30, 30, 600, 700);
        figure2.setBounds(30, 30, 600, 700);
        figure3.setBounds(30, 30, 600, 700);
        figure4.setBounds(30, 30, 600, 700);
        figure5.setBounds(30, 30, 600, 700);
        figure6.setBounds(30, 30, 600, 700);
        figure7.setBounds(30, 30, 600, 700);
        figure8.setBounds(30, 30, 600, 700);
        figure9.setBounds(30, 30, 600, 700);
        figure10.setBounds(30, 30, 600, 700);
        figure11.setBounds(30, 30, 600, 700);
        figure12.setBounds(30, 30, 600, 700);
        figure13.setBounds(30, 30, 600, 700);
        figure14.setBounds(30, 30, 600, 700);
        figure15.setBounds(30, 30, 600, 700);
        figure16.setBounds(30, 30, 600, 700);
        figure17.setBounds(30, 30, 600, 700);
        figure18.setBounds(30, 30, 600, 700);
        lp.add(figure, JLayeredPane.PALETTE_LAYER);
        lp.add(figure1, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure2, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure3, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure4, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure5, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure6, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure7, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure8, JLayeredPane.DRAG_LAYER);
        lp.add(figure9, JLayeredPane.DRAG_LAYER);
        lp.add(figure10, JLayeredPane.DRAG_LAYER);
        lp.add(figure11, JLayeredPane.MODAL_LAYER);
        lp.add(figure12, JLayeredPane.POPUP_LAYER);
        lp.add(figure13, JLayeredPane.MODAL_LAYER);
        lp.add(figure14, JLayeredPane.POPUP_LAYER);
        lp.add(figure15, JLayeredPane.MODAL_LAYER);
        lp.add(figure16, JLayeredPane.POPUP_LAYER);
        lp.add(figure17, JLayeredPane.DEFAULT_LAYER);
        lp.add(figure18, JLayeredPane.PALETTE_LAYER);
        setVisible(true);
    }
}

class RoundedFigure extends JComponent {
    private Color color;
    private int[] axes_x;
    private int[] axes_y;
    private int diam;
    private int initial_x;
    private int initial_y;
    RoundedFigure(Color color, int initial_x, int initial_y, int[] axes_x, int[] axes_y, int diam) {
        this.color = color;
        this.initial_x = initial_x;
        this.initial_y = initial_y;
        this.axes_x = axes_x;
        this.axes_y = axes_y;
        this.diam = diam;
        setOpaque(false);
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        int x = initial_x;
        int y = initial_y;
        for (int i=0; i<axes_x.length; i++) {
            g.fillOval(axes_x[i]-diam/2, axes_y[i]-diam/2, diam, diam);
        }
        Corner_connectors corner_connector = new Corner_connectors(x, y, axes_x, axes_y, diam);
        int[] x_points = corner_connector.getX();
        int[] y_points = corner_connector.getY();
        g.fillPolygon(x_points, y_points, x_points.length);
    }
}
class Corner_connectors {
    private int initial_x;
    private int initial_y;
    private int x_centre;
    private int y_centre;
    private int n_corners;
    private int[] axes_x;
    private int[] axes_y;
    private int diam;
    public int[] x;
    public int[] y;
    public int[] getX() {
        return x;
    }
    public int[] getY() {
        return y;
    }
    Corner_connectors(int initial_x, int initial_y, int[] axes_x, int[] axes_y, int diam) {
        this.initial_x = 0; //initial_x;
        this.initial_y = 0; //initial_y;
        //this.x_centre = Arrays.stream(axes_x).min().getAsInt() + (Arrays.stream(axes_x).max().getAsInt() - Arrays.stream(axes_x).min().getAsInt()) / 2;
        //this.y_centre = Arrays.stream(axes_y).min().getAsInt() + (Arrays.stream(axes_y).max().getAsInt() - Arrays.stream(axes_y).min().getAsInt()) / 2;
        this.x_centre = initial_x;
        this.y_centre = initial_y;
        this.n_corners = axes_x.length;
        this.axes_x = axes_x;
        this.axes_y = axes_y;
        this.diam = diam;
        x = new int[n_corners*2];
        y = new int[n_corners*2];
        DefineCoordinates();
    }
    void DefineCoordinates() {
        int j = 0;
        for (int i = 0; i < n_corners; i++) {
            int x1;
            int y1;
            int x2;
            int y2;
            if (i == n_corners - 1) {
                x1 = axes_x[i];
                y1 = axes_y[i];
                x2 = axes_x[0];
                y2 = axes_y[0];
            } else {
                x1 = axes_x[i];
                y1 = axes_y[i];
                x2 = axes_x[i + 1];
                y2 = axes_y[i + 1];
            }
            double ratio = (diam*0.5) / pow(abs(pow(x2 - x1, 2)) + abs(pow(y2 - y1, 2)), 0.5);
            int xr1 = (int) (ratio * ((x1 - (y1 - y2) + initial_x) - (x1 + initial_x)) + (x1 + initial_x));
            int yr1 = (int) (ratio * ((y1 - (x2 - x1) + initial_y) - (y1 + initial_y)) + (y1 + initial_y));
            int xr2 = (int) (ratio * ((x1 + (y1 - y2) + initial_x) - (x1 + initial_x)) + (x1 + initial_x));
            int yr2 = (int) (ratio * ((y1 + (x2 - x1) + initial_y) - (y1 + initial_y)) + (y1 + initial_y));
            double A = pow(abs(pow(xr1 - (x_centre + initial_x), 2)) + abs(pow(yr1 - (y_centre + initial_y), 2)), 0.5);
            double B = pow(abs(pow(xr2 - (x_centre + initial_x), 2)) + abs(pow(yr2 - (y_centre + initial_y), 2)), 0.5);
            if (A > B) {
                x[j] = xr1;
                y[j] = yr1;
                j++;
                //System.out.println("Corner_connectors: "+x[i]+" "+y[i]);
            } else {
                x[j] = xr2;
                y[j] = yr2;
                j++;
                //System.out.println("Corner_connectors: "+x[i]+" "+y[i]);
            }
            if (i == n_corners - 1) {
                x1 = axes_x[0];
                y1 = axes_y[0];
                x2 = axes_x[i];
                y2 = axes_y[i];
            } else {
                x1 = axes_x[i + 1];
                y1 = axes_y[i + 1];
                x2 = axes_x[i];
                y2 = axes_y[i];
            }
            xr1 = (int) (ratio * ((x1 - (y1 - y2) + initial_x) - (x1 + initial_x)) + (x1 + initial_x));
            yr1 = (int) (ratio * ((y1 - (x2 - x1) + initial_y) - (y1 + initial_y)) + (y1 + initial_y));
            xr2 = (int) (ratio * ((x1 + (y1 - y2) + initial_x) - (x1 + initial_x)) + (x1 + initial_x));
            yr2 = (int) (ratio * ((y1 + (x2 - x1) + initial_y) - (y1 + initial_y)) + (y1 + initial_y));
            A = pow(abs(pow(xr1 - (x_centre + initial_x), 2)) + abs(pow(yr1 - (y_centre + initial_y), 2)), 0.5);
            B = pow(abs(pow(xr2 - (x_centre + initial_x), 2)) + abs(pow(yr2 - (y_centre + initial_y), 2)), 0.5);
            if (A > B) {
                x[j] = xr1;
                y[j] = yr1;
                j++;
                //System.out.println("Corner_connectors: "+x[i]+" "+y[i]);
            } else {
                x[j] = xr2;
                y[j] = yr2;
                j++;
                //System.out.println("Corner_connectors: "+x[i]+" "+y[i]);
            }
        }
    }
}
class Circle extends JComponent {
    private Color color;
    private int x;
    private int y;
    private int diam;
    Circle(Color color, int x, int y, int diam) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.diam = diam;
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillOval(x-diam/2, y-diam/2, diam, diam);
    }
}
class Arc extends JComponent {
    private Color color;
    private int x;
    private int y;
    private int diam;
    Arc(Color color, int x, int y, int diam) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.diam = diam;
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillArc(x-diam/2, y-diam/2, diam, diam, -10, 200);
    }
}
class RoundedArc extends JComponent {
    private Color color;
    private int x;
    private int y;
    private int diam;
    RoundedArc(Color color, int x, int y, int diam) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.diam = diam;
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillArc(x-diam/2, y-diam/2, diam, diam, 60, 60);
        int x_arc = diam/4;
        int y_arc = (int) pow((int)(diam/2 * diam/2 - diam/4 * diam/4), 0.5);
        int roundedDiam = 12;
        g.fillArc(x+x_arc-roundedDiam/2-roundedDiam/4, y-y_arc-roundedDiam/2+(int) pow((int)(roundedDiam/2 * roundedDiam/2 - roundedDiam/4 * roundedDiam/4), 0.5), roundedDiam, roundedDiam, -90, 150);
        g.fillArc(x-x_arc-roundedDiam/2+roundedDiam/4, y-y_arc-roundedDiam/2+(int) pow((int)(roundedDiam/2 * roundedDiam/2 - roundedDiam/4 * roundedDiam/4), 0.5), roundedDiam, roundedDiam, 120, 150);
        int x1 = x+x_arc;
        int y1 = y-y_arc;
        int x2 = x-x_arc;
        int y2 = y1;
        int x3 = x-x_arc+roundedDiam/2-roundedDiam/4;
        int y3 = y-y_arc+roundedDiam/2+(int) pow((int)(roundedDiam/2 * roundedDiam/2 - roundedDiam/4 * roundedDiam/4), 0.5);
        int x4 = x+x_arc-roundedDiam/2+roundedDiam/4;
        int y4 = y3;
        int[] axes_x = new int[]{x1, x2, x3, x4};
        int[] axes_y = new int[]{y1, y2, y3, y4};
        g.fillPolygon(axes_x, axes_y, axes_x.length);
    }
}
class Rect extends JComponent {
    private Color color;
    private int x;
    private int y;
    private int width;
    private int height;
    Rect(Color color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}