import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JButton jb = new JButton("Potvrdi");
        JLabel jl = new JLabel();

        jf.setSize(500, 120);
        jf.setTitle("Z2");

        jtf1.setBounds(10, 10, 100, 30);
        jtf2.setBounds(120, 10, 100, 30);
        jb.setBounds(240, 10, 100, 30);
        jl.setBounds(10, 50, 480, 30);

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(jtf1.getText());
                int num2 = Integer.parseInt(jtf2.getText());
                int nump;
                StringBuilder sb = new StringBuilder();
                if (num1 > num2) {
                    nump = num1;
                    num1 = num2;
                    num2 = nump;
                }

                    sb.append("Prosti brojevi između " + num1 + " i " + num2 + " su ");
                    for (int i = num1 + 1; i < num2; i++) {
                        if (prost(i)) {
                            sb.append(i + ", ");
                        }
                    }
                    sb.delete(sb.length() - 2, sb.length());

                sb.append(".");
                jl.setText(sb.toString());
            }
        });

        jf.add(jtf1);
        jf.add(jtf2);
        jf.add(jb);
        jf.add(jl);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static boolean prost(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}