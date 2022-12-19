package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Show5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个画板");
        frame.add(new ExtendsPanel5());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel5 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //绘制椭圆，也可以通过此类绘制圆
        graphics2D.draw(new Ellipse2D.Float(10, 10, 500, 250));

    }
}
