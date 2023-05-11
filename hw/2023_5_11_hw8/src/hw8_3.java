
import javax.swing.*;
import java.awt.*;

public class hw8_3 {
    public static void main(String[] args) {
        new Grid_Layout();
    }
}

class Grid_Layout {
    Grid_Layout() {
        JFrame frame = new JFrame("网格布局DEMO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建一个包含 4 行 5 列的网格布局
        GridLayout gridLayout = new GridLayout(4, 5);

        // 设置容器的布局管理器为 GridLayout
        frame.setLayout(gridLayout);

        // 创建并添加组件到容器中
        for (int i = 0; i <= 19; i++) {
            frame.add(new JButton("" + i));
        }

        // frame.setSize(300, 300);
        frame.pack();
        frame.setVisible(true);
    }
}
