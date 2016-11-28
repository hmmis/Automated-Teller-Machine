import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MySndWork5 implements ActionListener {
	// ------------------------------------Member Variable
	SecondGUI4 mySnd;
	String strD = "";
	String strW = "";
	String strT = "";
	String strID = "";
	static int counter = 0;

	// ---------------------------------------Constructor
	public MySndWork5() {

	}

	public MySndWork5(SecondGUI4 myS) {
		this.mySnd = myS;
	}

	// --------------------------------------ActionPerformed Method
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mySnd.btn0) {
			showTextFromButton("0");
		} else if (e.getSource() == mySnd.btn1) {
			showTextFromButton("1");
		} else if (e.getSource() == mySnd.btn2) {
			showTextFromButton("2");
		} else if (e.getSource() == mySnd.btn3) {
			showTextFromButton("3");
		} else if (e.getSource() == mySnd.btn4) {
			showTextFromButton("4");
		} else if (e.getSource() == mySnd.btn5) {
			showTextFromButton("5");
		} else if (e.getSource() == mySnd.btn6) {
			showTextFromButton("6");
		} else if (e.getSource() == mySnd.btn7) {
			showTextFromButton("7");
		} else if (e.getSource() == mySnd.btn8) {
			showTextFromButton("8");
		} else if (e.getSource() == mySnd.btn9) {
			showTextFromButton("9");
		} else if (e.getSource() == mySnd.btnAC) {
			if (mySnd.sndGained == "TxtD") {
				strD = "";
				mySnd.sndTxtD.setText(strD);
			} else if (mySnd.sndGained == "TxtW") {
				strW = "";
				mySnd.sndTxtW.setText(strW);
			} else if (mySnd.sndGained == "TxtT") {
				strT = "";
				mySnd.sndTxtT.setText(strT);
			} else if (mySnd.sndGained == "TxtID") {
				strID = "";
				mySnd.sndTxtTId.setText(strID);
			}
		}

		else if (e.getSource() == mySnd.miD) {
			showMsgForDepositHelp();
		} else if (e.getSource() == mySnd.miW) {
			showMsgForWithdrawHelp();
		} else if (e.getSource() == mySnd.miT) {
			showMsgForTransHelp();
		} else if (e.getSource() == mySnd.miBal) {
			showBalance();
		} else if (e.getSource() == mySnd.miTraCount) {
			showTransectionCount();

		} else if (e.getSource() == mySnd.miLogout) {

			doLogOut();

		} else if (e.getSource() == mySnd.btnTran) {

			try {
				String givenSlctn;
				givenSlctn = this.mySnd.bg.getSelection().getActionCommand();
				if (givenSlctn.equals("D")) {
					try {

						doForDepositeSelection();

					} catch (Exception e2) {
						String msg = "Please Input Transection Amount";
						JOptionPane.showMessageDialog(null, msg);

					}

				} else if (givenSlctn.equals("W")) {
					try {

						doForWithdrawSelection();

					} catch (Exception e2) {
						String msg = "Please Input Transection Amount";
						JOptionPane.showMessageDialog(null, msg);
					}

				} else if (givenSlctn.equals("T")) {
					try {

						doForTransSelection();

					} catch (Exception e2) {
						String msg = "Please Input Valied Transection";
						JOptionPane.showMessageDialog(null, msg);
					}

				}

			} catch (Exception e2) {
				String msg = "Please Select A Transection";

				JOptionPane.showMessageDialog(null, msg);

			}
		}
	}

	// -----------------------------------------Other Method--------------------

	private void showTransectionCount() {
		JOptionPane.showMessageDialog(null, "Your Total Transection Now is  "
				+ counter);

	}

	private void doLogOut() {

		int x = JOptionPane.showConfirmDialog(null, "Sure To LogOut???",
				"Confirmation", JOptionPane.YES_NO_OPTION);
		if (x == 0) {
			System.exit(0);
		} else {

		}

	}

	private void showTextFromButton(String s) {
		if (mySnd.sndGained == "TxtD") {
			strD += s;
			mySnd.sndTxtD.setText(strD);

		} else if (mySnd.sndGained == "TxtW") {
			strW += s;
			mySnd.sndTxtW.setText(strW);

		} else if (mySnd.sndGained == "TxtT") {
			strT += s;
			mySnd.sndTxtT.setText(strT);

		} else if (mySnd.sndGained == "TxtID") {
			strID += s;
			mySnd.sndTxtTId.setText(strID);

		}

	}

	private void doForWithdrawSelection() {
		String givenWithdrawValue = this.mySnd.sndTxtW.getText();
		int amount = 0;
		amount = Integer.valueOf(givenWithdrawValue);

		withdraw(amount);

	}

	private void doForTransSelection() {
		String givenTransferValue = this.mySnd.sndTxtT.getText();
		String givenTransferID = this.mySnd.sndTxtTId.getText();
		int removeError = Integer.valueOf(givenTransferID);
		givenTransferID = String.valueOf(removeError);

		int amount = 0;
		amount = Integer.valueOf(givenTransferValue);
		balancetransfer(amount, givenTransferID);

	}

	private void doForDepositeSelection() {
		String givenDipositeValue = this.mySnd.sndTxtD.getText();
		int amount = 0;
		amount = Integer.valueOf(givenDipositeValue);

		deposite(amount);

	}

	private void showBalance() {
		JOptionPane.showMessageDialog(null, "Your Balance is "
				+ mySnd.mw.accBalance + " Tk");

	}

	private void showMsgForDepositHelp() {
		String msg = "Deposit Ammount is used to Add Balance in Your Account";
		JOptionPane.showMessageDialog(null, msg);

	}

	private void showMsgForWithdrawHelp() {
		String msg = "Withdraw Ammount is used to Deduct Balance in Your Account";
		JOptionPane.showMessageDialog(null, msg);

	}

	private void showMsgForTransHelp() {
		String msg = "Transfer Ammount is used to Give Balance to Other Account";
		JOptionPane.showMessageDialog(null, msg);

	}

	private void deposite(int amount) {

		counter++;
		mySnd.mw.accBalance += amount;
		JOptionPane.showMessageDialog(null, "Your New Balance is "
				+ mySnd.mw.accBalance);
	}

	private void withdraw(int amount) {
		if (amount <= mySnd.mw.accBalance && amount != 0) {
			counter++;
			mySnd.mw.accBalance -= amount;
			JOptionPane.showMessageDialog(null, "Your New Balance is "
					+ mySnd.mw.accBalance);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry! Give Valied Input");
		}

	}

	private void balancetransfer(int amount, String givenTransferID) {
		if (amount <= mySnd.mw.accBalance && amount != 0) {
			counter++;
			mySnd.mw.accBalance -= amount;
			JOptionPane.showMessageDialog(null, "Your New Balance is "
					+ mySnd.mw.accBalance);
		} else {
			JOptionPane.showMessageDialog(null, "Sorry! Give Valied Input");
		}

	}

}
