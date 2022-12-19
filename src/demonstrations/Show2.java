package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Show2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个画板");
        frame.add(new ExtendsPanel2());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel2 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        new Line2D.Float(10, 10, 500, 400);

        //draw方法是用来勾画Shape的轮廓的
        //graphics2D.draw();

    }
}
