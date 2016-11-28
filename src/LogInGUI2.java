import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInGUI2 extends JFrame {
	// ------------------------------------Member Variable
	JLabel lblUN, lblPW, lblTime;
	JTextField txtUN;
	JPasswordField pwf;
	JButton btnSubmit, btn0, btn1, btn2, btn3, btn4;
	JButton btn5, btn6, btn7, btn8, btn9, btnAC;

	String gained;
	Date d = new Date();
	String myDate = d.toString();

	// ---------------------------------------Constructor
	public LogInGUI2() {
		this.setTitle("Log In");
		this.getContentPane().setBackground(Color.LIGHT_GRAY);

		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setSize(320, 500);
		this.setLocation(90, 60);
		this.setLayout(null);

		initiComponent();
		addToFrame();
		buttonWork();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	// -----------------------------------------Other Method--------------------

	private void buttonWork() {
		MYWork3 m = new MYWork3(this);
		this.btnSubmit.addActionListener(m);
		this.btn0.addActionListener(m);
		this.btn1.addActionListener(m);
		this.btn2.addActionListener(m);
		this.btn3.addActionListener(m);
		this.btn4.addActionListener(m);
		this.btn5.addActionListener(m);
		this.btn6.addActionListener(m);
		this.btn7.addActionListener(m);
		this.btn8.addActionListener(m);
		this.btn9.addActionListener(m);
		this.btnAC.addActionListener(m);

		txtUN.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				gained = "gainedUN";

			}
		});

		pwf.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				gained = "gainedPW";

			}
		});

	}

	private void addToFrame() {

		this.lblUN.setBounds(10, 10, 90, 30);
		this.add(lblUN);
		this.txtUN.setBounds(100, 10, 200, 30);
		this.add(txtUN);
		this.lblPW.setBounds(10, 60, 90, 30);
		this.add(lblPW);
		this.pwf.setBounds(100, 60, 200, 30);
		this.add(pwf);
		this.btnSubmit.setBounds(30, 110, 240, 40);
		this.add(btnSubmit);

		this.btn1.setBounds(30, 170, 60, 40);
		this.add(btn1);
		this.btn2.setBounds(120, 170, 60, 40);
		this.add(btn2);
		this.btn3.setBounds(210, 170, 60, 40);
		this.add(btn3);

		this.btn4.setBounds(30, 230, 60, 40);
		this.add(btn4);
		this.btn5.setBounds(120, 230, 60, 40);
		this.add(btn5);
		this.btn6.setBounds(210, 230, 60, 40);
		this.add(btn6);

		this.btn7.setBounds(30, 290, 60, 40);
		this.add(btn7);
		this.btn8.setBounds(120, 290, 60, 40);
		this.add(btn8);
		this.btn9.setBounds(210, 290, 60, 40);
		this.add(btn9);

		this.btn0.setBounds(30, 350, 105, 40);
		this.add(btn0);
		this.btnAC.setBounds(165, 350, 105, 40);
		this.add(btnAC);

		this.lblTime.setBounds(60, 410, 310, 40);
		this.add(lblTime);

	}

	private void initiComponent() {
		this.lblUN = new JLabel("Username ::");
		this.txtUN = new JTextField();

		this.lblPW = new JLabel("Password ::");
		this.pwf = new JPasswordField();

		this.btnSubmit = new JButton("Submit");
		this.btn0 = new JButton("0");
		this.btn1 = new JButton("1");
		this.btn2 = new JButton("2");
		this.btn3 = new JButton("3");
		this.btn4 = new JButton("4");
		this.btn5 = new JButton("5");
		this.btn6 = new JButton("6");
		this.btn7 = new JButton("7");
		this.btn8 = new JButton("8");
		this.btn9 = new JButton("9");
		this.btnAC = new JButton("AC");

		this.lblTime = new JLabel(myDate);

	}

}
