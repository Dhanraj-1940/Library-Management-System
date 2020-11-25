import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		//setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add student");
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new newStudent().setVisible(true);
			}
		});
		btnNewButton.setBounds(63, 232, 181, 44);
		contentPane.add(btnNewButton);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new newBook().setVisible(true);
			}
		});
		btnAddBook.setBackground(new Color(255, 255, 204));
		btnAddBook.setFont(new Font("Arial", Font.BOLD, 12));
		btnAddBook.setBounds(63, 362, 181, 44);
		contentPane.add(btnAddBook);
		
		JButton btnStatistics = new JButton("Statistics");
		btnStatistics.setBackground(new Color(255, 255, 204));
		btnStatistics.setFont(new Font("Arial", Font.BOLD, 12));
		btnStatistics.setBounds(63, 493, 181, 44);
		contentPane.add(btnStatistics);
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new issueBook().setVisible(true);
			}
		});
		btnIssueBook.setBackground(new Color(255, 255, 204));
		btnIssueBook.setFont(new Font("Arial", Font.BOLD, 12));
		btnIssueBook.setBounds(1074, 232, 181, 44);
		contentPane.add(btnIssueBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setBackground(new Color(255, 255, 204));
		btnReturnBook.setFont(new Font("Arial", Font.BOLD, 12));
		btnReturnBook.setBounds(1074, 362, 181, 44);
		contentPane.add(btnReturnBook);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(255, 255, 204));
		btnLogout.setFont(new Font("Arial", Font.BOLD, 12));
		btnLogout.setBounds(1074, 493, 181, 44);
		contentPane.add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("LIBRARY MANAGEMENT SYSTEM");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 25));
		lblNewLabel.setBounds(433, 76, 453, 83);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("C:\\Users\\dhanr\\eclipse-workspace\\Library Management System\\src\\login3.jpg"));
		lblNewLabel_1.setBackground(new Color(255, 255, 204));
		lblNewLabel_1.setBounds(0, 0, 1710, 768);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setSize(1426,768);
		
	}
}
