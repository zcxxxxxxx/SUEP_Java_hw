import javax.swing.*;
import java.awt.FlowLayout;

public class login {
    public static void main(String[] args) {
        new Login();

    }
}

class Login {
    Login() {
        JFrame frame = new JFrame("用户注册界面");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(BoxLayout.Y_AXIS));

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
        panel_second.add(new JLabel("你的性别"));
        panel_second.add(new JCheckBox("男"));
        panel_second.add(new JCheckBox("女"));

        JPanel panel_third = new JPanel();
        panel_third.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel_third.add(new JButton("注册用户"));

        panel.add(panel_first);
        panel.add(panel_second);
        panel.add(panel_third);
        frame.add(panel);
        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
