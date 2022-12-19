import java.awt.*;
import java.awt.event.*;

public class App extends Frame{
    public static void main(String[] args) {
        App frm = new App();
        Label lab =  new Label("Hello java!");
        frm.setTitle("my first AWT program");
        frm.setSize(220, 150);
        frm.setBackground(Color.yellow);
        frm.setLocation(250, 250);
        frm.add(lab);
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frm.setVisible(true);
    }
}