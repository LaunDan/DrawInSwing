package drawInSwing;

import javax.swing.*;

public class WindowJFrame extends JFrame {

    public WindowJFrame(){
        this.setTitle("Main window of program");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();
        this.add(panel);
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        WindowJFrame window = new WindowJFrame();
        window.setVisible(true);
    }
}
