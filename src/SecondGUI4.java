import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SecondGUI4 extends JFrame {
	// ------------------------------------Member Variable
	JRadioButton rbDiposite;
	JRadioButton rbWithdraw;
	JRadioButton rbTransfer;
	ButtonGroup bg;
	JButton btnTran, btn0, btn1, btn2, btn3, btn4, btn5, btn6;
	JButton btn7, btn8, btn9, btnAC;;
	JTextField sndTxtW, sndTxtD, sndTxtT, sndTxtTId;
	JMenuBar mBar;
	JMenu mHelp, mAcc;
	JMenuItem miD, miW, miT, miLogout, miBal, miTraCount;
	String sndGained;

	MYWork3 mw;

	// ---------------------------------------Constructor
	public SecondGUI4() {
		this.setTitle("Successfull Login");
		this.setSize(330, 550);
		this.setLocation(90, 60);
		this.setAlwaysOnTop(true);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);

		sndinitiComp();
		myRadioButton();
		sndAddToFrame();
		mySndWork();
	}

	// -----------------------------------------Other Method--------------------
	private void mySndWork() {
		MySndWork5 w = new MySndWork5(this);
		this.btnTran.addActionListener(w);
		this.miBal.addActionListener(w);
		this.miTraCount.addActionListener(w);
		this.miLogout.addActionListener(w);
		this.miD.addActionListener(w);
		this.miW.addActionListener(w);
		this.miT.addActionListener(w);
		this.btn0.addActionListener(w);
		this.btn1.addActionListener(w);
		this.btn2.addActionListener(w);
		this.btn3.addActionListener(w);
		this.btn4.addActionListener(w);
		this.btn5.addActionListener(w);
		this.btn6.addActionListener(w);
		this.btn7.addActionListener(w);
		this.btn8.addActionListener(w);
		this.btn9.addActionListener(w);
		this.btnAC.addActionListener(w);

		sndTxtD.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				sndGained = "TxtD";

			}
		});

		sndTxtW.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				sndGained = "TxtW";

			}
		});

		sndTxtT.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				sndGained = "TxtT";

			}
		});

		sndTxtTId.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {

			}

			@Override
			public void focusGained(FocusEvent e) {
				sndGained = "TxtID";

			}
		});

	}

	private void sndinitiComp() {

		this.btnTran = new JButton("Do Transection");
		this.sndTxtD = new JTextField();
		this.sndTxtW = new JTextField();
		this.sndTxtT = new JTextField();
		this.sndTxtTId = new JTextField();
		this.mBar = new JMenuBar();
		this.mHelp = new JMenu("Help");
		this.mAcc = new JMenu("My Account");
		this.miD = new JMenuItem("What is Deposit?");
		this.miW = new JMenuItem("What is Withdraw?");
		this.miT = new JMenuItem("What is Transfer?");
		this.miBal = new JMenuItem("Account Balance");
		this.miTraCount = new JMenuItem("Total Transection");
		this.miLogout = new JMenuItem("Log Out");

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
	}

	private void sndAddToFrame() {

		this.mBar.setBounds(0, 0, 330, 35);
		mBar.add(mAcc);
		mBar.add(mHelp);

		mAcc.add(miBal);
		mAcc.add(miTraCount);
		mAcc.addSeparator();
		mAcc.add(miLogout);

		mHelp.add(miD);
		mHelp.add(miW);
		mHelp.add(miT);
		this.add(mBar);

		this.rbDiposite.setBounds(10, 60, 120, 30);
		this.add(rbDiposite);
		this.sndTxtD.setBounds(150, 60, 155, 30);
		this.add(sndTxtD);

		this.rbWithdraw.setBounds(10, 110, 120, 30);
		this.add(rbWithdraw);
		this.sndTxtW.setBounds(150, 110, 155, 30);
		this.add(sndTxtW);

		this.rbTransfer.setBounds(10, 160, 140, 30);
		this.add(rbTransfer);
		this.sndTxtT.setBounds(150, 160, 100, 30);
		this.add(sndTxtT);
		this.sndTxtTId.setBounds(260, 160, 50, 30);
		this.add(sndTxtTId);

		this.btnTran.setBounds(10, 210, 300, 40);
		this.add(btnTran);

		this.btn1.setBounds(30, 270, 60, 40);
		this.add(btn1);
		this.btn2.setBounds(120, 270, 60, 40);
		this.add(btn2);
		this.btn3.setBounds(210, 270, 60, 40);
		this.add(btn3);

		this.btn4.setBounds(30, 330, 60, 40);
		this.add(btn4);
		this.btn5.setBounds(120, 330, 60, 40);
		this.add(btn5);
		this.btn6.setBounds(210, 330, 60, 40);
		this.add(btn6);

		this.btn7.setBounds(30, 390, 60, 40);
		this.add(btn7);
		this.btn8.setBounds(120, 390, 60, 40);
		this.add(btn8);
		this.btn9.setBounds(210, 390, 60, 40);
		this.add(btn9);

		this.btn0.setBounds(30, 450, 105, 40);
		this.add(btn0);
		this.btnAC.setBounds(165, 450, 105, 40);
		this.add(btnAC);

	}

	private void myRadioButton() {
		rbDiposite = new JRadioButton("Deposite(TK)");
		rbDiposite.setActionCommand("D");
		rbWithdraw = new JRadioButton("Withdrew(TK)");
		rbWithdraw.setActionCommand("W");
		rbTransfer = new JRadioButton("Trsnsfer(TK-To)");
		rbTransfer.setActionCommand("T");

		bg = new ButtonGroup();
		bg.add(rbDiposite);
		bg.add(rbWithdraw);
		bg.add(rbTransfer);

	}

}
