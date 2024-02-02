import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JButton jb = new JButton("Click me.exe!");
        JTextArea jta = new JTextArea("");

        jf.setSize(500, 250);
        jf.setTitle("Z1");

        jta.setBounds(10, 10, 480, 150);
        jb.setBounds(50, 180, 150, 30);
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = jta.getText();
                text = convertCase(text);
                jta.append(text + "\n");
            }
        });

        jf.add(jb);
        jf.add(jta);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static String convertCase(String text) {
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}