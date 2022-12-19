package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

public class Show6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个画板");
        frame.add(new ExtendsPanel6());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel6 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //绘制弧度图形，最后一个参数可以设置绘制开弧、弓形、饼图
        graphics2D.draw(new Arc2D.Float(10, 10, 500, 500, 0, 270, Arc2D.OPEN));

    }
}
