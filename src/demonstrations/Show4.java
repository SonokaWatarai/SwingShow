package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Show4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个画板");
        frame.add(new ExtendsPanel4());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel4 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //绘制圆角矩形
        graphics2D.draw(new RoundRectangle2D.Float(10, 10, 500, 400, 100, 100));

    }
}
