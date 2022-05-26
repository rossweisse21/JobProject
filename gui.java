import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gui extends JFrame {

    private ButtonGroup grb;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    gui frame = new gui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public gui() {
        setTitle("Jobber");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 619, 456);
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUni = new JLabel("Do you have bachelor's degree?");
        lblUni.setBounds(10, 17, 252, 14);
        contentPane.add(lblUni);

        JRadioButton rdYesJava = new JRadioButton("Yes");
        rdYesJava.setBounds(336, 62, 48, 16);
        contentPane.add(rdYesJava);
        if (rdYesJava.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoJava = new JRadioButton("No");
        rdNoJava.setBounds(401, 63, 54, 14);
        contentPane.add(rdNoJava);

        JLabel lblInt = new JLabel("Do you have intenship experience?");
        lblInt.setBounds(10, 40, 252, 14);
        contentPane.add(lblInt);

        JRadioButton rdYesWeb = new JRadioButton("Yes");
        rdYesWeb.setBounds(336, 84, 63, 16);
        contentPane.add(rdYesWeb);
        if (rdYesWeb.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoWeb = new JRadioButton("No");
        rdNoWeb.setBounds(401, 83, 54, 18);
        contentPane.add(rdNoWeb);

        JLabel lblJava = new JLabel("Do you have experience on Java?");
        lblJava.setBounds(10, 63, 252, 14);
        contentPane.add(lblJava);

        JRadioButton rdbYesUni = new JRadioButton("Yes");
        rdbYesUni.setBounds(336, 13, 54, 23);
        contentPane.add(rdbYesUni);
        if (rdbYesUni.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoUni = new JRadioButton("No");
        rdNoUni.setBounds(401, 15, 54, 18);
        contentPane.add(rdNoUni);

        JLabel lblWeb = new JLabel("Do you have experience on HTML and CSS?");
        lblWeb.setBounds(10, 88, 273, 14);
        contentPane.add(lblWeb);

        JRadioButton rdYesInt = new JRadioButton("Yes");
        rdYesInt.setBounds(336, 39, 54, 17);
        contentPane.add(rdYesInt);
        if (rdYesInt.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoInt = new JRadioButton("No");
        rdNoInt.setBounds(401, 38, 54, 18);
        contentPane.add(rdNoInt);

        JButton btnOK = new JButton("OK");
        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new window().setVisible(true);
            }
        });
        btnOK.setBounds(116, 337, 137, 58);
        contentPane.add(btnOK);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnCancel.setBounds(365, 337, 142, 58);
        contentPane.add(btnCancel);

        JLabel lblJs = new JLabel("Do you have experience on Vanilla JS?");
        lblJs.setBounds(10, 113, 252, 14);
        contentPane.add(lblJs);

        JRadioButton rdYesJs = new JRadioButton("Yes");
        rdYesJs.setBounds(336, 112, 48, 17);
        contentPane.add(rdYesJs);
        if (rdYesJs.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoJs = new JRadioButton("No");
        rdNoJs.setBounds(401, 113, 65, 14);
        contentPane.add(rdNoJs);

        JLabel lblReact = new JLabel("Do you have experience on React?");
        lblReact.setBounds(10, 138, 252, 14);
        contentPane.add(lblReact);

        JRadioButton rdYesRe = new JRadioButton("Yes");
        rdYesRe.setBounds(336, 136, 54, 18);
        contentPane.add(rdYesRe);
        if (rdYesRe.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoRe = new JRadioButton("No");
        rdNoRe.setBounds(401, 138, 54, 14);
        contentPane.add(rdNoRe);

        JLabel lblFlutter = new JLabel("Do you have experience on React native or flutter?");
        lblFlutter.setBounds(10, 163, 287, 14);
        contentPane.add(lblFlutter);

        JRadioButton rdYesFl = new JRadioButton("Yes");
        rdYesFl.setBounds(336, 161, 63, 18);
        contentPane.add(rdYesFl);
        if (rdYesFl.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoFl = new JRadioButton("No");
        rdNoFl.setBounds(401, 163, 48, 14);
        contentPane.add(rdNoFl);

        JLabel lblPyt = new JLabel("Do you have experience on Python?");
        lblPyt.setBounds(10, 188, 287, 14);
        contentPane.add(lblPyt);

        JRadioButton rdYesPyt = new JRadioButton("Yes");
        rdYesPyt.setBounds(336, 186, 48, 19);
        contentPane.add(rdYesPyt);
        if (rdYesPyt.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoPyt = new JRadioButton("No");
        rdNoPyt.setBounds(401, 187, 59, 16);
        contentPane.add(rdNoPyt);

        JLabel lblProMan = new JLabel("Do you have experience on Agile Project Management?");
        lblProMan.setBounds(10, 213, 320, 14);
        contentPane.add(lblProMan);

        JRadioButton rdYesPM = new JRadioButton("Yes");
        rdYesPM.setBounds(336, 209, 48, 23);
        contentPane.add(rdYesPM);
        if (rdYesPM.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoPM = new JRadioButton("No");
        rdNoPM.setBounds(401, 209, 48, 23);
        contentPane.add(rdNoPM);

        JLabel lblVsCode = new JLabel("Do you have experience on Jira and VSCode?");
        lblVsCode.setBounds(10, 238, 320, 14);
        contentPane.add(lblVsCode);

        JRadioButton rdYesVs = new JRadioButton("Yes");
        rdYesVs.setBounds(336, 234, 48, 23);
        contentPane.add(rdYesVs);
        if (rdYesVs.isSelected()) {
            rdYesActionPerformed();
        }

        JRadioButton rdNoVs = new JRadioButton("No");
        rdNoVs.setBounds(401, 238, 54, 14);
        contentPane.add(rdNoVs);

        ButtonGroup grb = new ButtonGroup();
        grb.add(rdYesJava);
        grb.add(rdNoJava);
        ButtonGroup grbF = new ButtonGroup();
        grbF.add(rdYesWeb);
        grbF.add(rdNoWeb);
        ButtonGroup grbS = new ButtonGroup();
        grbS.add(rdbYesUni);
        grbS.add(rdNoUni);
        ButtonGroup grbT = new ButtonGroup();
        grbT.add(rdYesInt);
        grbT.add(rdNoInt);
        ButtonGroup grbFourth = new ButtonGroup();
        grbFourth.add(rdYesJs);
        grbFourth.add(rdNoJs);
        ButtonGroup grbFifth = new ButtonGroup();
        grbFifth.add(rdYesRe);
        grbFifth.add(rdNoRe);
        ButtonGroup grbSixth = new ButtonGroup();
        grbSixth.add(rdYesFl);
        grbSixth.add(rdNoFl);
        ButtonGroup grbSeventh = new ButtonGroup();
        grbSeventh.add(rdYesPyt);
        grbSeventh.add(rdNoPyt);
        ButtonGroup grbEighth = new ButtonGroup();
        grbEighth.add(rdYesPM);
        grbEighth.add(rdNoPM);
        ButtonGroup grbNinth = new ButtonGroup();
        grbNinth.add(rdYesVs);
        grbNinth.add(rdNoVs);
    }

//		public static int score() {
//			int totalscore=0;
//			switch(totalscore) {
//			case 1:
//				totalscore=totalscore+10;
//			break;
//			
//			case 2:
//				totalscore=totalscore+10;
//			break;
//			
//			case 3:
//				totalscore=totalscore+10;
//			break;
//			
//			case 4:
//				totalscore=totalscore+10;
//			break;
//			
//			case 5:
//				totalscore=totalscore+10;
//			break;
//			
//			case 6:
//				totalscore=totalscore+10;
//			break;
//			
//			case 7:
//				totalscore=totalscore+10;
//			break;
//			
//			case 8:
//				totalscore=totalscore+10;
//			break;
//			
//			case 9:
//				totalscore=totalscore+10;
//			break;
//			
//			case 10:
//				totalscore=totalscore+10;
//			break;
//			}totalscore = 0;

//			
//			return totalscore;
//		
//	} 

    public static String rdYesActionPerformed() {
        int totalscore = 0;
        for (int i = 0; i < 1; i++) {
            totalscore = totalscore + 10;
        }
        return "Total score: " + totalscore;

    }
}