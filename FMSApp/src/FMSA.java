import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class FMSA extends JFrame{
    private JTextField emailText;
    private JPasswordField passwordText;
    private JButton btnLogIn;
    private JLabel emailLabel;
    private JLabel passwordLabel;

    public FMSA() {
        super("Log In");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emailLabel = new JLabel("Enter your email:");
        emailLabel.setFont(new Font("Arial", Font.BOLD, 16));
        emailText = new JTextField(20);
        passwordLabel = new JLabel("Enter your password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        passwordText = new JPasswordField(20);
        btnLogIn = new JButton("LOG IN");
        setLayout(new GridLayout(3,2));
        add(emailLabel);
        add(emailText);
        add(passwordLabel);
        add(passwordText);
        add(btnLogIn);

        btnLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = emailText.getText();
                String password = passwordText.getText();

                //try {
                    //Class.forName("com.mysql.jdbc.Driver");
                   // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3360/fmsa", "root", "");

                    //Statement stmt = conn.createStatement();
                    //String sql = "SELECT * FROM fsuser WHERE fsEmail ='" + email + "'AND fsPassword='" + password + "'";
                    //PreparedStatement preparedStatement = conn.prepareStatement(sql);
                   // preparedStatement.setString(1, email);
                    //preparedStatement.setString(2, password);

                    //ResultSet resultSet = preparedStatement.executeQuery();

                    //if (resultSet.next()) {
                    //    Menu frameMen = new Menu();
                    //    setVisible(false);
                   //     frameMen.setVisible(true);

                  //  } else {
                   //     JOptionPane.showMessageDialog(FMSA.this, "The email and/or password is incorrect", "Try Again", JOptionPane.ERROR_MESSAGE);

                   // }

                   // resultSet.close();
                   // stmt.close();
                  //  conn.close();

               // } catch(SQLException se) {
                //    se.printStackTrace();
               // }
              //  catch (Exception ex) {
               //     ex.printStackTrace();
               // }

                JOptionPane.showMessageDialog(FMSA.this,"Log in Successful");
                Menu frameMen = new Menu();
                setVisible(false);
                frameMen.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        FMSA frame = new FMSA();
        frame.setVisible(true);

    }
}
