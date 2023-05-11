import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public static void main(String[] args) {
        new Login1();

    }
}

class Login1 {
    private JFrame frame = new JFrame("用户注册界面");

    Login1() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭按钮
        frame.setLayout(new FlowLayout(BoxLayout.Y_AXIS));// 设置布局方式

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel panel_first = new JPanel();
        panel_first.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 将复选框添加到容器中
        panel_first.add(new JLabel("运动"));
        panel_first.add(new JCheckBox("足球"));
        panel_first.add(new JCheckBox("网球"));

        JPanel panel_second = new JPanel();
        panel_second.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 将复选框添加到容器中
        JRadioButton sex_Button_man = new JRadioButton("男");
        JRadioButton sex_Button_woman = new JRadioButton("女");
        ButtonGroup sex = new ButtonGroup();
        sex.add(sex_Button_man);
        sex.add(sex_Button_woman);

        panel_second.add(new JLabel("你的性别"));
        panel_second.add(sex_Button_man);
        panel_second.add(sex_Button_woman);

        JPanel panel_third = new JPanel();
        panel_third.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button = new JButton("注册用户");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource(); // 获取触发事件的按钮对象
                String buttonText = clickedButton.getText(); // 获取按钮的文本
                frame.setTitle(buttonText); // 将按钮的文本设置为 JFrame 的新标题
            }
        });

        panel_third.add(button);

        panel.add(panel_first);
        panel.add(panel_second);
        panel.add(panel_third);
        frame.add(panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }

    private void change_title_name(String name) {
        frame.setTitle(name);
    }
}
