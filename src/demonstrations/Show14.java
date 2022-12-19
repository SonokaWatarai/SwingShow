package demonstrations;

import javax.swing.*;

public class Show14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList 使用示例");
        frame.setBounds(200, 200, 300, 230);
        frame.setLayout(null);
        String[] pets = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
        //根据指定数组中的元素创建一个列表框
        JList list = new JList(pets);
        //把列表框添加到滚动面板中
        JScrollPane panel = new JScrollPane(list,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.setBounds(10, 10, 100, 100);
        frame.add(panel);
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
