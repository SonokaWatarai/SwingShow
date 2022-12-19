package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Show11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("按钮示例");
        frame.setBounds(0, 0, 300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        //region 文本字段
        JTextField textField = new JTextField(16);
        textField.setEditable(true);//设置此文本组件是否可编辑
        textField.setText("示例文本框");
        panel.add(textField);
        System.out.println(" " + textField.getText());
        //endregion

        //region 密码框
        JPasswordField pwd = new JPasswordField(16);
        pwd.setEchoChar('*');//设置回显字符
        pwd.setEditable(true);
        panel.add(pwd);
        //endregion

        //region 纯文本区域
        //在Swing中，文本域默认是不带滚动条的，必须放置在JScrollPane中，才会有滚动条
        JTextArea intrArea = new JTextArea(10,10);
        JScrollPane scrollPane = new JScrollPane(intrArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);
        //endregion

        frame.add(panel);
        frame.setVisible(true);

    }
}
