package drawInSwing;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel(){
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(400,300));
    }
    private int[] xx = {
            50, 50, 70, 70, 90, 90, 110, 110,
            130, 130, 150, 150, 250, 250, 270,
            270, 290, 290, 310, 310, 330, 330,
            350, 350, 330, 330, 300, 270, 270};
    private int[] yy = {
            300, 120, 120, 140, 140, 120, 120,
            140, 140, 120, 120, 200, 200, 50,
            50, 70, 70, 50, 50, 70, 70, 50, 50,
            300, 300, 240, 210, 240, 300};

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.darkGray);
        g.fillPolygon(xx, yy, xx.length);
        g.drawPolygon(xx, yy, xx.length);

    }

}
