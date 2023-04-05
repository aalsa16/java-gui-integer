import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame implements ActionListener {
    JTextField tf;
    JLabel l;
    JButton b1;
    JButton b2;

    App() {
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b1 = new JButton("Verify");
        b1.setBounds(50, 150, 95, 30);
        b2 = new JButton("Quit");
        b2.setBounds(150, 150, 95, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);

        add(b1);
        add(b2);
        add(tf);
        add(l);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == b1) {
                String str = tf.getText();

                try {
                    int num = Integer.parseInt(str);
        
                    JOptionPane.showMessageDialog(this, String.format("%s is an integer!", num));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, String.format("%s is not an integer!", str));
                };
            } else if (e.getSource() == b2) {
                System.exit(0);
            };
        } catch (Exception ex) {
            System.out.println(ex);
        };
    };

    public static void main(String[] args) {
        new App();
    };
};