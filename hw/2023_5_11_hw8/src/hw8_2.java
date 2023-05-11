import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hw8_2 {
    public static void main(String[] args) {
        new city_viewpoint();
    }
}

class city_viewpoint {
    private JFrame frame = new JFrame("下拉框练习");
    private JPanel panel = new JPanel();
    private JPanel panel_up = new JPanel();
    private JPanel panel_down = new JPanel();
    private JComboBox<String> comboBox_area = new JComboBox<>();
    private JComboBox<String> comboBox_point = new JComboBox<>();

    city_viewpoint() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置关闭按钮
        frame.setLayout(new FlowLayout(BoxLayout.Y_AXIS));// 设置布局方式

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel_up.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel_up.setLayout(new FlowLayout(FlowLayout.LEFT));

        String[] city = { "", "北京", "上海", "天津", "重庆", "江苏" };

        for (int i = 0; i < city.length; i++) {
            comboBox_area.addItem(city[i]);
        }
        comboBox_area.setSelectedIndex(0);

        String[] point = { "", "故宫", "长城", "九寨沟", "天安门", "火星" };

        panel_up.add(new JLabel("您的籍贯是"));
        panel_up.add(comboBox_area);

        for (int i = 0; i < point.length; i++) {
            comboBox_point.addItem(point[i]);
        }
        comboBox_point.setSelectedIndex(0);

        panel_down.add(new JLabel("您喜欢旅游的地区"));
        panel_down.add(comboBox_point);

        add_listen();
        Component gap = Box.createRigidArea(new Dimension(20, 150));

        panel.add(panel_up);
        panel.add(gap);
        panel.add(panel_down);

        frame.add(panel);

        frame.setSize(250, 500);
        frame.setVisible(true);
    }

    private void add_listen() {
        comboBox_area.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 在事件处理方法中判断两个下拉框的选择情况
                if (comboBox_area.getSelectedItem() != null && comboBox_point.getSelectedItem() != null
                        && comboBox_area.getSelectedItem().toString() != ""
                        && comboBox_point.getSelectedItem().toString() != "") {
                    // 两个下拉框都被选择
                    frame.setTitle(
                            comboBox_area.getSelectedItem().toString() + comboBox_point.getSelectedItem().toString());
                }
            }
        });

        comboBox_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 在事件处理方法中判断两个下拉框的选择情况
                if (comboBox_area.getSelectedItem() != null && comboBox_point.getSelectedItem() != null) {
                    // 两个下拉框都被选择
                    frame.setTitle(
                            comboBox_area.getSelectedItem().toString() + comboBox_point.getSelectedItem().toString());
                }
            }
        });
    }
}