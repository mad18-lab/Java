import javax.swing.*;

public class Frame {
    ButtonExample() {
        JFrame fr = new JFrame("Swing");
        Jbutton but = new JButton("CLICK");
        fr.add(but);
        but.setBounds(60, 70, 120, 45);
        but.setLayout(null);
        fr.setSize(400, 600);
        fr.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ButtonExample();
    }
}