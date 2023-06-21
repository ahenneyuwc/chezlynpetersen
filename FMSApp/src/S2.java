import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class S2 extends JFrame{
    private JList listA;
    private JList listB;
    private JList listC;
    private JTextField edtA;
    private JTextField edtB;
    private JTextField edtC;
    private JLabel lblA;
    private JLabel lblB;
    private JLabel lblC;
    private JButton btnMenu;
    private JButton btnSave;
    private JButton btnUndo;
    private JComboBox cbA;
    private JComboBox cbB;
    private JComboBox cbC;


    public S2() {
        super("S2");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblA = new JLabel("A: MEALS FOR ");
        lblA.setFont(new Font("Arial", Font.BOLD, 16));
        String mealsFor[] = {"Personnel","Creche","Breastfeeding","Kangaroo","Outpatients","Travelling Patients","Other Meals"};
        cbA = new JComboBox(mealsFor);
        cbA.setBounds(50, 50,90,20);
        edtA = new JTextField(10);
        lblB = new JLabel("B: IN-PATIENTS ");
        lblB.setFont(new Font("Arial", Font.BOLD, 16));
        String bInP[] = {"Full Meals","Therapeutic","Private Patients","Infants/Toddlers"};
        cbB = new JComboBox(bInP);
        cbB.setBounds(50, 50,90,20);
        edtB = new JTextField(10);
        lblC = new JLabel("C: IN-PATIENTS ");
        lblC.setFont(new Font("Arial", Font.BOLD, 16));
        String cInP[] = {"Tube Feeds","Infants - Milk Feedings"};
        cbC = new JComboBox(cInP);
        cbC.setBounds(50, 50,90,20);
        edtC = new JTextField(10);

        btnSave = new JButton("Save");
        btnUndo = new JButton("Undo");
        btnMenu = new JButton("Menu");

        setLayout(new GridLayout(4,2));

        add(lblA);
        add(cbA);
        add(edtA);
        add(lblB);
        add(cbB);
        add(edtB);
        add(lblC);
        add(cbC);
        add(edtC);
        add(btnMenu);
        add(btnSave);
        add(btnUndo);

        btnMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu frameMen = new Menu();
                setVisible(false);
                frameMen.setVisible(true);
            }
        });

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(S2.this, "Information saved to database.");


            }
        });

        btnUndo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(S2.this, "Information deleted from database.");


            }
        });
    }

    public static void main(String[] args) {
        S2 frame = new S2();
        frame.setVisible(true);
    }
}


