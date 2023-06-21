import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton S1;
    private JButton S2;
    private JButton EnF;
    private JButton H;
    private JButton G;
    private JButton X;


    public Menu() {
        super("Menu");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        S1 = new JButton("S1");
        add(S1);
        S2 = new JButton("S2");
        add(S2);
        EnF = new JButton("E & F");
        add(EnF);
        G = new JButton("G");
        add(G);
        H = new JButton("H");
        add(H);
        X = new JButton("X");
        add(X);

        S1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                S1 frameS1 = new S1();
                setVisible(false);
                frameS1.setVisible(true);
            }
        });

        S2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                S2 frameS2 = new S2();
                setVisible(false);
                frameS2.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        Menu frame = new Menu();
        frame.setVisible(true);
    }
}
