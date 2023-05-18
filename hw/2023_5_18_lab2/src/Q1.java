import javax.swing.*;
import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        new Grid_Layout_color();
    }
}

class Grid_Layout_color {
    Grid_Layout_color() {
        JFrame frame = new JFrame("网格布局案例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个包含 3 行 2 列的网格布局
        GridLayout gridLayout = new GridLayout(3, 3);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);
        // 设置容器的布局管理器为 GridLayout

        // 创建九个按钮
        JButton[] buttons = new JButton[9];
        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("" + i);
            buttons[i].setPreferredSize(new Dimension(100, 150));
            panel.add(buttons[i]);
        }

        // 创建并添加组件到容器中

        frame.setVisible(true);
    }
}
