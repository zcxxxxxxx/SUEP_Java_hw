import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 {
    public static void main(String[] args) {
        new key();
    }
}

class key {
    key() {
        JFrame frame = new JFrame("登录");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel[] panels = new JPanel[3];
        JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout(BoxLayout.Y_AXIS));
        panel.setLayout(new FlowLayout(BoxLayout.Y_AXIS));

        for (int i = 0; i < 3; i++) {
            panels[i] = new JPanel();
            panels[i].setLayout(new FlowLayout(FlowLayout.CENTER));
        }

        JTextField username_Field = new JTextField(10);
        JLabel username_Label = new JLabel("用户名：");
        panels[0].add(username_Label);
        panels[0].add(username_Field);

        // JPasswordField passwordField = new JPasswordField(
        JPasswordField password_Field = new JPasswordField(10);
        password_Field.setEchoChar('*');

        JLabel password_Label = new JLabel("密   码：");
        panels[1].add(password_Label);
        panels[1].add(password_Field);

        JButton login_Button = new JButton("登录");
        login_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = username_Field.getText();
                // String password = password_Field.getText();
                char[] password_char = password_Field.getPassword();
                String password = new String(password_char);
                if (username.length() > 8 || username.length() < 6) {
                    System.out.println("用户名长度不符合要求！");
                } else if (!isLetter(username)) {
                    System.out.println("用户名不全为字母！");
                } else if (password.length() > 8 || password.length() < 6) {
                    System.out.println("密码长度不符合要求！");
                } else if (!isNumeric(password)) {
                    System.out.println("密码不全为数字！");
                } else {
                    System.out.println("登录成功！");
                }
            }
        });

        JButton cancel_Button = new JButton("取消");
        panels[2].add(login_Button);
        panels[2].add(cancel_Button);

        panel.add(panels[0]);
        panel.add(panels[1]);
        panel.add(panels[2]);

        frame.add(panel);

        frame.setSize(200, 150);
        frame.setVisible(true);

    }

    public static boolean isNumeric(String str) {
        return str.matches("\\d+"); // 使用正则表达式匹配数字
    }

    public static boolean isLetter(String str) {
        return str.matches("[a-zA-Z]+"); // 使用正则表达式匹配字母
    }
}