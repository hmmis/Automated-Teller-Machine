import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MYWork3 implements ActionListener {
	// ------------------------------------Member Variable
	LogInGUI2 mylog;
	String strUN = "";
	String strPW = "";
	static int accBalance;

	// ---------------------------------------Constructor
	public MYWork3() {

	}

	public MYWork3(LogInGUI2 l) {
		this.mylog = l;
	}

	// --------------------------------------ActionPerformed Method
	@Override
	public void actionPerformed(ActionEvent e) {

		String givenUN;
		String givenPW;
		if (e.getSource() == mylog.btnSubmit) {
			givenUN = this.mylog.txtUN.getText();
			givenPW = new String(this.mylog.pwf.getPassword());

			matchUNandPW(givenUN, givenPW);
		} else if (e.getSource() == mylog.btn0) {
			showTextFromButton("0");
		} else if (e.getSource() == mylog.btn1) {
			showTextFromButton("1");
		} else if (e.getSource() == mylog.btn2) {
			showTextFromButton("2");
		} else if (e.getSource() == mylog.btn3) {
			showTextFromButton("3");
		} else if (e.getSource() == mylog.btn4) {
			showTextFromButton("4");
		} else if (e.getSource() == mylog.btn5) {
			showTextFromButton("5");
		} else if (e.getSource() == mylog.btn6) {
			showTextFromButton("6");
		} else if (e.getSource() == mylog.btn7) {
			showTextFromButton("7");
		} else if (e.getSource() == mylog.btn8) {
			showTextFromButton("8");
		} else if (e.getSource() == mylog.btn9) {
			showTextFromButton("9");
		} else if (e.getSource() == mylog.btnAC) {
			if (mylog.gained == "gainedUN") {
				strUN = "";
				mylog.txtUN.setText(strUN);
			} else if (mylog.gained == "gainedPW") {
				strPW = "";
				mylog.pwf.setText(strPW);
			}

		}

	}

	// -----------------------------------------Other Method--------------------

	private void showTextFromButton(String s) {

		if (mylog.gained == "gainedUN") {
			strUN += s;
			mylog.txtUN.setText(strUN);
		} else if (mylog.gained == "gainedPW") {
			strPW += s;
			mylog.pwf.setText(strPW);
		}

	}

	private void matchUNandPW(String givenUN, String givenPW) {

		AccountInfo6 a1 = new AccountInfo6("1111", "1234", 10000);
		AccountInfo6 a2 = new AccountInfo6("2222", "2345", 20000);
		AccountInfo6 a3 = new AccountInfo6("3333", "3456", 30000);

		if (givenUN.equals(a1.username) && givenPW.equals(a1.password)) {

			accBalance = a1.balance;
			mylog.setVisible(false);

			SecondGUI4 s2 = new SecondGUI4();

		} else if (givenUN.equals(a2.username) && givenPW.equals(a2.password)) {

			accBalance = a2.balance;
			mylog.setVisible(false);
			SecondGUI4 s2 = new SecondGUI4();

		} else if (givenUN.equals(a3.username) && givenPW.equals(a3.password)) {

			accBalance = a3.balance;
			mylog.setVisible(false);
			SecondGUI4 s2 = new SecondGUI4();

		} else {

			JOptionPane p = new JOptionPane();
			p.showMessageDialog(null, "Invalied Login");

		}

	}

}
