import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;


public class Login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setBounds(524, 302, 159, 58);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(new Color(255, 255, 204));
		lblPassword.setFont(new Font("Arial", Font.BOLD, 20));
		lblPassword.setBounds(524, 362, 159, 58);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setForeground(Color.BLACK);
		textField.setBounds(651, 321, 182, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(255, 255, 204));
		passwordField.setBounds(651, 381, 182, 26);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setEnabled(true);
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setBounds(548, 448, 106, 26);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close\r\n");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setForeground(Color.BLACK);
		btnClose.setFont(new Font("Arial", Font.BOLD, 12));
		btnClose.setEnabled(true);
		btnClose.setBackground(new Color(255, 255, 204));
		btnClose.setBounds(692, 448, 106, 26);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_3 = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel_3.setForeground(new Color(255, 255, 204));
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel_3.setBounds(456, 225, 471, 45);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("C:\\Users\\dhanr\\eclipse-workspace\\Library Management System\\src\\oldpaper3.jpg"));
		lblNewLabel_2.setBounds(337, 191, 735, 400);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setSize(700,400);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\dhanr\\eclipse-workspace\\Library Management System\\src\\login3.jpg"));
		lblNewLabel_1.setBounds(10, 0, 1710, 768);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setSize(1426,768);
				
		
		 btnNewButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(textField.getText().equals("admin")&&passwordField.getText().equals("password")) {
			setVisible(false);
			new Home().setVisible(true);;
		}
		//setVisible(false);	
	}
}
