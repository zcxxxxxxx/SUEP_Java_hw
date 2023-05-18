import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {
        new key();
    }
}

class key {
    key() {
        JFrame frame = new JFrame("键盘事件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] panels = new JPanel[3];
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(BoxLayout.Y_AXIS));

        for (int i = 0; i < 3; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new FlowLayout(FlowLayout.CENTER));
        }

        JTextField username_Field = new JTextField(10);
        JLabel username_Label = new JLabel("用户名：");
        panels[0].add(username_Label);
        panels[0].add(username_Field);

        JTextField password_Field = new JTextField(10);
        JLabel password_Label = new JLabel("密   码：");
        panels[1].add(password_Label);
        panels[1].add(password_Field);

        JButton login_Button = new JButton("登录");
        JButton cancel_Button = new JButton("取消");
        panels[2].add(login_Button);
        panels[2].add(cancel_Button);

        panel.add(panels[0]);
        panel.add(panels[1]);
        panel.add(panels[2]);

        frame.add(panel);

        frame.setSize(200, 200);
        frame.setVisible(true);

    }
}