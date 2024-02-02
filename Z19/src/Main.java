import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private static JTextField tf;
    private static int op1;
    private static int op2;
    private static char operation;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        tf = new JTextField();

        jf.setSize(500, 250);
        jf.setTitle("Z1");

        tf.setBounds(10, 10, 480, 30);

        JButton[] dugmici = new JButton[16];
        String[] l = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "C", "/", "="};
        for (int i = 0; i < 16; i++) {
            dugmici[i] = new JButton(l[i]);
            try {
                dugmici[i].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String label = ((JButton) e.getSource()).getText();
                        if (label.matches("[0-9]")) {
                            tf.setText(tf.getText() + label);
                        } else if (label.equals("C")) {
                            tf.setText("");
                            op1 = 0;
                            op2 = 0;
                            operation = '\0';
                        } else if (label.equals("=")) {
                            op2 = Integer.parseInt(tf.getText());
                            switch (operation) {
                                case '+':
                                    tf.setText(String.valueOf(op1 + op2));
                                    break;
                                case '-':
                                    tf.setText(String.valueOf(op1 - op2));
                                    break;
                                case '*':
                                    tf.setText(String.valueOf(op1 * op2));
                                    break;
                                case '/':
                                    tf.setText(String.valueOf(op1 / (double) op2));
                                    break;
                            }
                            op1 = 0;
                            op2 = 0;
                            operation = '\0';
                        } else {
                            op1 = Integer.parseInt(tf.getText());
                            tf.setText("");
                            operation = label.charAt(0);
                        }
                    }
                });
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        jf.add(tf);
        for (int i = 0; i < 16; i++) {
            jf.add(dugmici[i]);
            dugmici[i].setBounds(i % 4 * 100 + 10, i / 4 * 40 + 50, 80, 30);
        }

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}