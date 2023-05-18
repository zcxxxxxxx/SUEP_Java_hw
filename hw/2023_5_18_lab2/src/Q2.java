import javax.swing.*;
import java.awt.*;

public class Q2 {
    public static void main(String[] args) {
        new BorderLayout_demo();
    }
}

class BorderLayout_demo {
    BorderLayout_demo() {
        JFrame frame = new JFrame("网格布局案例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JButton[] buttons = new JButton[6];
        JPanel[] panels = new JPanel[2];

        panels[0] = new JPanel();
        panels[0].setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panels[1] = new JPanel();
        panels[1].setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        panels[0].add(new JButton("西瓜"));
        panels[0].add(new JButton("苹果"));
        panels[1].add(new JButton("荔枝"));
        panels[1].add(new JButton("葡萄"));
        panels[1].add(new JButton("桔子"));

        frame.add(panels[0], BorderLayout.NORTH);
        frame.add(panels[1], BorderLayout.SOUTH);
        frame.add(new JButton("香蕉"), BorderLayout.CENTER);

        // frame.add(panel);
        frame.setSize(350, 450);
        frame.setVisible(true);
    }
}