package demonstrations;

import javax.swing.*;
import java.awt.*;

/**
 * 快速上手绘制图形的基本框架
 */
public class Show1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个空白的画板");

        //关键点4：使用add方法添加新创建子类（ExtendsPanel1）的实例
        frame.add(new ExtendsPanel1());

        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

/**
 * 关键点1：创建一个JPanel类的子类
 */
class ExtendsPanel1 extends JPanel {
    /**
     * 关键点2：重写paintComponent方法
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        //关键点3：Graphics类型的对象变量 g 转型为 Graphics2D类型
        Graphics2D graphics2D = (Graphics2D) g;

        //在下面编写绘制图形的代码
        //......


    }
}
