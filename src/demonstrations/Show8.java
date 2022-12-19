package demonstrations;

import javax.swing.*;
import java.awt.*;

public class Show8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("这是一个写字板");
        frame.add(new ExtendsPanel8());
        frame.setBounds(470, 150, 1000, 760);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ExtendsPanel8 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        //绘制文本
        graphics2D.drawString("绘制了一行文本", 10, 20);

        //Font.BOLD（粗体）、Font.ITALIC（斜体）
        new Font("隶书", Font.BOLD + Font.ITALIC, 32);
        //graphics2D.setFont();
        //graphics2D.drawString("设置字体后，绘制了一行文本", 10, 60);

    }
}
