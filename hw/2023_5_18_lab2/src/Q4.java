import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 {
    public static void main(String[] args) {
        new Menu();
    }
}

class Menu {
    Menu() {
        JFrame frame = new JFrame("Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu File = new JMenu("File");
        JMenu Edit = new JMenu("Edit");
        JMenu Help = new JMenu("Help");

        JMenuItem New = new JMenuItem("New");
        JMenuItem Open = new JMenuItem("Open");
        JMenuItem Save = new JMenuItem("Save");

        JMenuItem Cut = new JMenuItem("Cut");
        JMenuItem Copy = new JMenuItem("Copy");

        JMenuItem About = new JMenuItem("About");

        New.addActionListener(new itemlistener());
        Open.addActionListener(new itemlistener());
        Save.addActionListener(new itemlistener());
        Cut.addActionListener(new itemlistener());
        Copy.addActionListener(new itemlistener());
        About.addActionListener(new itemlistener());

        File.add(New);
        File.add(Open);
        File.add(Save);

        Edit.add(Cut);
        Edit.add(Copy);

        Help.add(About);

        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setVisible(true);

    }
}

class itemlistener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JMenuItem menuItem = (JMenuItem) e.getSource();
        String itemName = menuItem.getText();
        System.out.println(itemName + "正在被点击");
    }
}