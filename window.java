import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class window extends JFrame {

    private JPanel contentPane;
    private JTextField txtApplicantsName;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    window frame = new window();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public window() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 606, 469);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtApplicantsName = new JTextField();
        txtApplicantsName.setText("APPLICANT'S NAME:");
        txtApplicantsName.setFont(new Font("Tahoma", Font.BOLD, 19));
        txtApplicantsName.setBounds(25, 26, 541, 70);
        contentPane.add(txtApplicantsName);
        txtApplicantsName.setColumns(10);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(25, 167, 541, 176);
        contentPane.add(textArea);
        textArea.setText(selectedPerson());

        JButton btnHireButton = new JButton("HIRE");
        btnHireButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnHireButton.setBackground(Color.GREEN);
        btnHireButton.setFont(new Font("Tahoma", Font.BOLD, 19));
        btnHireButton.setBounds(128, 370, 128, 49);
        contentPane.add(btnHireButton);

        JButton btnSkipButton = new JButton("SKIP");
        btnSkipButton.setBackground(Color.RED);
        btnSkipButton.setFont(new Font("Tahoma", Font.BOLD, 19));
        btnSkipButton.setBounds(313, 370, 128, 49);
        contentPane.add(btnSkipButton);

        textField = new JTextField();
        textField.setBounds(25, 115, 541, 41);
        contentPane.add(textField);
        textField.setText(gui.rdYesActionPerformed());
        textField.setColumns(10);
    }

    public String selectedPerson() {
        switch (score()) {
            case 60:
                return "Beg�m �niversite mezunu\n "
                        + "Staj deneyimine sahip\n"
                        + "Java biliyor\n"
                        + "React native ve Flutterda deneyim sahibi\n"
                        + "Python biliyor\n"
                        + "Project management alan�nda deneyim sahibi.";

            case 70:
                return "Ecem �niversite mezunu\n"
                        + "Staj deneyimine sahip\n"
                        + "Java biliyor\n"
                        + "Javascript biliyor\n"
                        + "HTML, CSS konusunda tecr�beli\n"
                        + "React native Flutter deneyimine sahip\n"
                        + "Python biliyor";

            case 50:
                return "Alper �niversite mezunu\n "
                        + "Staj deneyimine sahip\n"
                        + "React native ve Flutterda deneyim sahibi\n"
                        + "Python biliyor\n"
                        + "Project management alan�nda deneyim sahibi.";
        }
        return "Selected person's qualities are: ";

    }

    public static int score() {
        int totalscore = 0;
        switch (totalscore) {

            case 1:
                totalscore = totalscore + 10;
                break;

            case 2:
                totalscore = totalscore + 10;
                break;

            case 3:
                totalscore = totalscore + 10;
                break;

            case 4:
                totalscore = totalscore + 10;
                break;

            case 5:
                totalscore = totalscore + 10;
                break;

            case 6:
                totalscore = totalscore + 10;
                break;

            case 7:
                totalscore = totalscore + 10;
                break;

            case 8:
                totalscore = totalscore + 10;
                break;

            case 9:
                totalscore = totalscore + 10;
                break;

            case 10:
                totalscore = totalscore + 10;
                break;
        }

        return totalscore;

    }

}
