package drawInSwing;

import javax.swing.*;

public class WindowJFrame extends JFrame {

    public WindowJFrame(){
        this.setTitle("My castle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        WindowJFrame window = new WindowJFrame();
        window.setVisible(true);
    }
}
