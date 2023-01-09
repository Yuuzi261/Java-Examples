import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class App extends Frame implements ActionListener, MouseMotionListener, MouseListener {

    App(String title) { super(title); }

    private final int DRAW_STRAIGHT_LINE = 1;
    private final int DRAW_OVAL = 2;
    private final int DRAW_RECTANGLE = 3;
    private final int SELECT = 4;
    private final int RESIZE = 5;
    private final String STRAIGHT_LINE = "STRAIGHT LINE";
    private final String OVAL = "OVAL";
    private final String RECTANGLE = "RECTANGLE";

    static App frm = new App("Drawing Applet");

    static MenuBar mb = new MenuBar();
    static Menu drawMenu = new Menu("Draw");
    static Menu operatorsMenu = new Menu("Operators");
    static MenuItem straightLineMi = new MenuItem("straight line");
    static MenuItem ovalMi = new MenuItem("oval");
    static MenuItem rectangleMi = new MenuItem("rectangle");
    static MenuItem selectMi = new MenuItem("select");
    static MenuItem resizeMi = new MenuItem("resize");

    private int mode = 0;
    private String nowGraphic = "";

    private int posX, posY, startX, startY, endX, endY, width, height;
    private int newX, newY, newEndX, newEndY, newStartX, newStartY;
    private int  dx, dy, end_dx, end_dy, start_dx, start_dy;

    public static void main(String[] args) {

        frm.setSize(300, 400);

        straightLineMi.addActionListener(frm);
        ovalMi.addActionListener(frm);
        rectangleMi.addActionListener(frm);
        selectMi.addActionListener(frm);
        resizeMi.addActionListener(frm);

        drawMenu.add(straightLineMi);
        drawMenu.add(ovalMi);
        drawMenu.add(rectangleMi);
        operatorsMenu.add(selectMi);
        operatorsMenu.add(resizeMi);

        mb.add(drawMenu); mb.add(operatorsMenu);

        frm.addMouseListener(frm);
        frm.addMouseMotionListener(frm);

        frm.setMenuBar(mb);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frm.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        MenuItem mi = (MenuItem) e.getSource();
        if(mi == straightLineMi) mode = DRAW_STRAIGHT_LINE;
        else if(mi == ovalMi) mode = DRAW_OVAL;
        else if(mi == rectangleMi) mode = DRAW_RECTANGLE;
        else if(mi == selectMi) mode = SELECT;
        else if(mi == resizeMi) mode = RESIZE;
        else mode = 0;

    }

    public void mousePressed(MouseEvent e) {

        if(isDrawMode(mode)) {
            startX = e.getX();
            startY = e.getY();
            if(mode == DRAW_STRAIGHT_LINE) nowGraphic = STRAIGHT_LINE;
            else if(mode == DRAW_OVAL) nowGraphic = OVAL;
            else if(mode == DRAW_RECTANGLE) nowGraphic = RECTANGLE;
            repaint();
        }
        else if(mode == SELECT) {
            dx = e.getX() - posX;
            dy = e.getY() - posY;
            end_dx = e.getX() - endX;
            end_dy = e.getY() - endY;
            start_dx = e.getX() - startX;
            start_dy = e.getY() - startY;
        }

    }

    public void mouseDragged(MouseEvent e) {

        if(isDrawMode(mode) || mode == RESIZE) {
            endX = e.getX(); endY = e.getY();
            if(startX < endX) posX = startX;
            else posX = endX;
            if(startY < endY) posY = startY;
            else posY = endY;
            width = Math.abs(startX - endX);
            height = Math.abs(startY - endY);
            repaint();
        }
        else if(mode == SELECT) {
            newX = e.getX() - dx;
            newY = e.getY() - dy;
            newEndX = e.getX() - end_dx;
            newEndY = e.getY() - end_dy;
            newStartX = e.getX() - start_dx;
            newStartY = e.getY() - start_dy;
            if(dx > 0 && dx < width && dy > 0 && dy < height) repaint();
        }

    }

    public void paint(Graphics g) {

        if(isDrawMode(mode) || mode == RESIZE) {
            if(nowGraphic == STRAIGHT_LINE) g.drawLine(startX, startY, endX, endY);
            else if(nowGraphic == OVAL) { g.setColor(Color.RED); g.fillOval(posX, posY, width, height); }
            else if(nowGraphic == RECTANGLE) { g.setColor(Color.YELLOW); g.fillRect(posX, posY, width, height); }
        }
        else if(mode == SELECT){

            posX = newX; posY = newY;
            endX = newEndX; endY = newEndY;
            startX = newStartX; startY = newStartY;

            if(nowGraphic == STRAIGHT_LINE) g.drawLine(startX, startY, endX, endY);
            else if(nowGraphic == OVAL) { g.setColor(Color.RED); g.fillOval(posX, posY, width, height); }
            else if(nowGraphic == RECTANGLE) { g.setColor(Color.YELLOW); g.fillRect(posX, posY, width, height); }

        }

        if(mode == SELECT || mode == RESIZE) {

            g.setColor(Color.BLACK);
            Graphics2D g2d = (Graphics2D) g.create();
            Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
            g2d.setStroke(dashed);
            g2d.drawRect(posX, posY, width, height);
            g2d.dispose();

        }
        
    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}

    private boolean isDrawMode(int mode) { if(mode == DRAW_STRAIGHT_LINE || mode == DRAW_OVAL || mode == DRAW_RECTANGLE) return true; return false; }

}