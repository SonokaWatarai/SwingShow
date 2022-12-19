package demonstrations;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Show7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("用Java 2D库绘制2D图形的示例");
        frame.add(new ExtendsPanel7());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel7 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        int w = 200; //形状的宽度
        int h = 160; //形状的高度
        int R = 200; //圆的直径

        //默认是黑色
        //graphics2D.setPaint(Color.RED);

        graphics2D.translate(20, 20); //坐标平移
        graphics2D.draw(new Line2D.Float(0, 0, w, h)); //画直线

        graphics2D.translate(240, 0);
        graphics2D.draw(new Rectangle2D.Double(0, 0, w, h)); //画矩形

        graphics2D.translate(240, 0);
        graphics2D.draw(new RoundRectangle2D.Float(0, 0, w, h, 20, 20)); //画圆角矩形

        graphics2D.translate(240, 0);
        graphics2D.draw(new Ellipse2D.Float(0, 0, R, R)); //画圆

        graphics2D.translate(-720, 240);
        graphics2D.draw(new Ellipse2D.Float(0, 0, w, h)); //画椭圆

        graphics2D.translate(240, 0);
        graphics2D.draw(new Arc2D.Float(0, 0, w, h, 45, 225, Arc2D.OPEN)); //画开弧

        graphics2D.translate(240, 0);
        graphics2D.draw(new Arc2D.Float(0, 0, w, h, 45, 225, Arc2D.CHORD)); //画弓形

        graphics2D.translate(240, 0);
        graphics2D.draw(new Arc2D.Float(0, 0, w, h, 45, 225, Arc2D.PIE));//画饼形

        graphics2D.translate(-720, 240);
        graphics2D.draw(new QuadCurve2D.Double(0, 0, w, h / 6.0, w, h)); //画二次曲线

        graphics2D.translate(240, 0);
        graphics2D.draw(new CubicCurve2D.Double(0, 0, w / 2.0, h, w, h / 2.0, w, h));//画三次曲线

    }
}
