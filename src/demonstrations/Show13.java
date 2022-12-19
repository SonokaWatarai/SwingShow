package demonstrations;

import javax.swing.*;

public class Show13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox 使用示例");
        frame.setBounds(200, 200, 300, 230);
        frame.setLayout(null);
        String[] pets = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};//根据指定数组中的元素创建一个组合框
        JComboBox comboBox = new JComboBox(pets);
        comboBox.setBounds(10, 10, 100, 26);
        comboBox.setEditable(true); //设置为可编辑
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(comboBox);
        frame.setVisible(true);
    }
}
