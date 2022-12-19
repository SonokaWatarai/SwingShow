package demonstrations;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Show10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("按钮示例");
        frame.setBounds(0, 0, 300, 190);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        //region 示例按钮
        JPanel panelLine1 = new JPanel();

        JButton btn = new JButton("示例按钮");//按钮
        btn.setBounds(50, 100, 60, 26);

        btn.setActionCommand("点击了此按钮");//设置此按钮激发的动作事件的命令名称
        btn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //向控制台输出动作事件的命令名称
                System.out.println(btn.getActionCommand());
            }
        });//按钮点击事件
        panelLine1.add(btn);
        //endregion

        //region 复选框
        JCheckBox checkBoxSleep = new JCheckBox("睡觉");//默认是未选中状态
        checkBoxSleep.setBounds(80, 170, 60, 26);
        isSelectedAndPrint(checkBoxSleep);
        panelLine1.add(checkBoxSleep);

        JCheckBox checkBoxSport = new JCheckBox("运动", true);
        checkBoxSport.setBounds(150, 170, 60, 26);
        isSelectedAndPrint(checkBoxSport);
        panelLine1.add(checkBoxSport);

        JCheckBox checkBoxClimb = new JCheckBox("爬山");
        checkBoxClimb.setSelected(true);//设置组件选中状态
        checkBoxClimb.setBounds(220, 170, 60, 26);
        isSelectedAndPrint(checkBoxClimb);
        panelLine1.add(checkBoxClimb);
        //endregion

        //region 单选按钮
        JPanel panelLine2 = new JPanel();

        ButtonGroup group = new ButtonGroup();//按钮组

        JRadioButton fRdo = new JRadioButton("男", true); //创建一个单选按钮，默认为选中
        fRdo.setBounds(80, 110, 50, 26); //移动组件并调整其大小
        isSelectedAndPrint(fRdo);
        group.add(fRdo); //添加到按钮组

        JRadioButton mRdo = new JRadioButton("女", false);
        mRdo.setBounds(140, 110, 50, 26);
        isSelectedAndPrint(mRdo);
        group.add(mRdo);
        //endregion

        panelLine2.add(fRdo);
        panelLine2.add(mRdo);

        frame.add(panelLine1);
        frame.add(panelLine2);
        frame.setVisible(true);

    }

    /**
     * 用于判断JToggleButton系列组件的状态并输出至控制台
     * @param toggleButton 需要判断的JToggleButton系列组件
     */
    private static void isSelectedAndPrint(JToggleButton toggleButton) {
        toggleButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    System.out.println('"' + toggleButton.getText() + '"' + " 已经被选中");
                } else {
                    System.out.println('"' + toggleButton.getText() + '"'  + " 被取消选中");
                }
            }
        });
    }
}
