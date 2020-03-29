package drawInSwing;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(){
        this.setBackground(Color.BLACK);
        this.setFont(new Font("Courier", Font.BOLD, 20));
        this.setPreferredSize(new Dimension(400,300));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawString("Hi", 50, 80);
        g.setColor(Color.GREEN);
        g.drawString("Hello", 120, 70);
        g.setColor(Color.WHITE);
        g.drawString("Good morning", 10, 210);

    }

}
