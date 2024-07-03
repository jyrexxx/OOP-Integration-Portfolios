package Integrate;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Portfolio.D1_Front;
import jyreport.Main;

public class runAll extends JFrame {

	private JButton jyre, unix;

	public runAll() {
		setTitle("Swing Program");
		setSize(316, 119);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(1000, 150);
		setLayout(null);
		setResizable(false);

		// JButtons
		jyre = new JButton();
		unix = new JButton();

		jyre.setBounds(78, 32, 150, 14);
		jyre.setBorderPainted(false);
		jyre.setContentAreaFilled(false);
		jyre.setOpaque(false);
		jyre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		unix.setBounds(78, 54, 150, 14);
		unix.setBorderPainted(false);
		unix.setContentAreaFilled(false);
		unix.setOpaque(false);
		unix.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// adds the buttons
		add(jyre);
		add(unix);

		jyre.addActionListener(e -> {
			Main.myInterface();

		});
		unix.addActionListener(e -> {
			D1_Front.main(null);

		});

		// import background
		JLabel lblBG = new JLabel();
		lblBG.setIcon(new ImageIcon("runAllBG.png"));
		lblBG.setBounds(0, 0, 300, 80);
		add(lblBG);
	}

	public static void main(String[] args) {
		runAll swingProgram = new runAll();
		swingProgram.setVisible(true);
	}
}