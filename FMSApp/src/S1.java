import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S1 extends JFrame{
    private JButton btnMenu;

    public S1() {
        super("S1");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnMenu = new JButton("Menu");
        add(btnMenu);

        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu frameMen = new Menu();
                setVisible(false);
                frameMen.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

    }
}
