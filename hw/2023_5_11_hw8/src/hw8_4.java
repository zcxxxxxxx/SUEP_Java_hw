import javax.swing.*;
import java.awt.*;

public class hw8_4 {
    public static void main(String[] args) {
        new Grid_Layout_color();
    }
}

class Grid_Layout_color {
    Grid_Layout_color() {
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个包含 3 行 2 列的网格布局
        GridLayout gridLayout = new GridLayout(3, 2);
        gridLayout.setHgap(5);
        gridLayout.setVgap(5);
        // 设置容器的布局管理器为 GridLayout

        JPanel[] panels = new JPanel[6];
        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);
        // 创建并添加组件到容器中
        for (int i = 0; i <= 5; i++) {
            panels[i] = new JPanel();
            // panels[i].setBackground(Color.YELLOW);
            panels[i].setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
            panels[i].setLayout(new FlowLayout(FlowLayout.LEFT));
            panel.add(panels[i]);
        }
        Color[] colors = { Color.BLACK, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.YELLOW };
        JLabel[] labels = { new JLabel("black"), new JLabel("blue"), new JLabel("green"), new JLabel("orange"),
                new JLabel("magenta"), new JLabel("yellow") };

        for (int i = 0; i <= 5; i++) {
            labels[i].setForeground(colors[i]);
            panels[i].add(labels[i]);
        }

        // frame.setSize(300, 300);// 设置垂直间隙为 10 像素
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
