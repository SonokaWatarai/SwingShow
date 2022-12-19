package demonstrations;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static java.awt.Image.SCALE_SMOOTH;

public class Show12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("不可编辑信息显示组件示例");
        frame.setBounds(0, 0, 600, 270);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();

        //region 文本字段
        JLabel label = new JLabel("个人头像");
        label.setBounds(10, 200, 60, 26);
        label.setFont(new Font("", Font.ITALIC, 18));
        panel.add(label);

        JLabel imgLbl = new JLabel();
        imgLbl.setBounds(5, 360, 48, 48);
        Icon icon = new ImageIcon("src/demonstrations/gerentouxiang.png");
        imgLbl.setIcon(icon);
        panel.add(imgLbl);
        //endregion

        //region 提示信息
        Image imgSave;
        Image scaledImage;

        try {
            imgSave = ImageIO.read(new File("src/demonstrations/save.png"));
            scaledImage = imgSave.getScaledInstance(32, 32, SCALE_SMOOTH);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JButton button = new JButton(
                new ImageIcon(scaledImage)
        );
        button.setToolTipText("保存按钮");//给图片按钮添加提示信息
        button.setPreferredSize(new Dimension(48, 48));
        panel.add(button);
        //endregion

        //region 进度条

        //创建进度条，方向常量、最大值和最小值
        JProgressBar progBar = new JProgressBar(SwingConstants.HORIZONTAL, 0, 10);
        progBar.setValue(3); //设置进度条的当前值
        progBar.setStringPainted(true); //设置呈现进度字符串
        panel.add(progBar);

        //endregion

        frame.add(panel);
        frame.setVisible(true);
    }
}
