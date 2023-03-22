package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

public class ATM_Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATM_Interface window = new ATM_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATM_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 10, 95, 200);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_16 = new JButton(">>");
		btnNewButton_16.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_16.setBounds(10, 10, 70, 40);
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_4_1 = new JButton(">>");
		btnNewButton_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_4_1.setBounds(10, 75, 70, 40);
		panel.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_2 = new JButton(">>");
		btnNewButton_4_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_4_1_2.setBounds(10, 135, 70, 40);
		panel.add(btnNewButton_4_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 127));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBounds(130, 10, 310, 250);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Deposit");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 13, 90, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblAttribute = new JLabel("  New PIN");
		lblAttribute.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAttribute.setBounds(210, 13, 90, 30);
		panel_1.add(lblAttribute);
		
		JLabel lblAttribute_1 = new JLabel("Withdraw");
		lblAttribute_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAttribute_1.setBounds(10, 75, 90, 30);
		panel_1.add(lblAttribute_1);
		
		JLabel lblAttribute_2 = new JLabel("Attribute 04");
		lblAttribute_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblAttribute_2.setBounds(210, 76, 90, 30);
		panel_1.add(lblAttribute_2);
		
		JLabel lblAttribute_1_1 = new JLabel("Balance");
		lblAttribute_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAttribute_1_1.setBounds(10, 135, 90, 30);
		panel_1.add(lblAttribute_1_1);
		
		JLabel lblAttribute_1_2 = new JLabel("      Back");
		lblAttribute_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAttribute_1_2.setBounds(210, 135, 90, 30);
		panel_1.add(lblAttribute_1_2);
		
		JLabel lblAttribute_1_2_1 = new JLabel("  _ _ _ _");
		lblAttribute_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		lblAttribute_1_2_1.setBounds(104, 210, 90, 30);
		panel_1.add(lblAttribute_1_2_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setBounds(465, 10, 95, 200);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton_16_1 = new JButton("<<");
		btnNewButton_16_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_16_1.setBounds(10, 10, 70, 40);
		panel_2.add(btnNewButton_16_1);
		
		JButton btnNewButton_4_1_1 = new JButton("<<");
		btnNewButton_4_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_4_1_1.setBounds(10, 75, 70, 40);
		panel_2.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_1_2_1 = new JButton("<<");
		btnNewButton_4_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		btnNewButton_4_1_2_1.setBounds(10, 135, 70, 40);
		panel_2.add(btnNewButton_4_1_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(10, 353, 550, 300);
		frame.getContentPane().add(panel_3);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton.setBounds(15, 10, 110, 50);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_1.setBounds(150, 10, 110, 50);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_2.setBounds(285, 10, 110, 50);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CANCEL");
		btnNewButton_3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.setBounds(420, 10, 110, 50);
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_4.setBounds(15, 85, 110, 50);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_5.setBounds(150, 85, 110, 50);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_6.setBounds(285, 85, 110, 50);
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("CLEAR");
		btnNewButton_7.setForeground(new Color(0, 0, 0));
		btnNewButton_7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_7.setBackground(new Color(255, 255, 0));
		btnNewButton_7.setBounds(420, 85, 110, 50);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_8.setBounds(15, 160, 110, 50);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_9.setBounds(150, 160, 110, 50);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_10.setBounds(285, 160, 110, 50);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("ENTER");
		btnNewButton_11.setForeground(new Color(0, 0, 0));
		btnNewButton_11.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_11.setBackground(new Color(0, 128, 0));
		btnNewButton_11.setBounds(420, 160, 110, 50);
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_12.setBounds(15, 235, 110, 50);
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_13.setBounds(150, 235, 110, 50);
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnNewButton_14.setBounds(285, 235, 110, 50);
		panel_3.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("");
		btnNewButton_15.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		btnNewButton_15.setBounds(420, 235, 110, 50);
		panel_3.add(btnNewButton_15);
	}
}
