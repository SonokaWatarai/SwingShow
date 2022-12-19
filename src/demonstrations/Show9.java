package demonstrations;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static java.awt.Image.SCALE_SMOOTH;

public class Show9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("绘图示例");
        frame.setBounds(0, 0, 1000, 760);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        JPanel panel = new ImageShowPanel();
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class ImageShowPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        Image image = null;
        Image scaledImage = null;

        try {
            image = ImageIO.read(new File("src/demonstrations/img.jpg"));
            scaledImage = image.getScaledInstance(518, 580, SCALE_SMOOTH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //图片居中绘制的坐标
        int x = (getWidth() - scaledImage.getWidth(this)) / 2;
        int y = (getHeight() - scaledImage.getHeight(this)) / 2;

        g.drawImage(scaledImage, x, y, this);
    }
}
