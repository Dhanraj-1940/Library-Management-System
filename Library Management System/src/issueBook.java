import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class issueBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					issueBook frame = new issueBook();
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
	public issueBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(366, 220, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book ID");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(166, 94, 121, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 204));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_1.setBounds(166, 134, 121, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Issue Date");
		lblNewLabel_2.setForeground(new Color(255, 255, 204));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_2.setBounds(166, 179, 121, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Due Date");
		lblNewLabel_3.setForeground(new Color(255, 255, 204));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel_3.setBounds(166, 217, 121, 23);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setBounds(297, 97, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setBounds(297, 137, 124, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(297, 179, 124, 20);
		contentPane.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(297, 220, 124, 20);
		contentPane.add(dateChooser_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat dFormat = new SimpleDateFormat();
				String bookid = textField.getText();
				String studentid = textField_1.getText();
				String issueDate = dFormat.format(dateChooser.getDate());
				String dueDate = dFormat.format(dateChooser_1.getDate());
				String returnBook = "no";
				try {
					//JOptionPane.showMessageDialog(null,issueDate);
					//JOptionPane.showMessageDialog(null,dueDate);
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select *from book where bookid ='"+bookid+"'");
					if(rs.next()) {
						ResultSet rs1 = st.executeQuery("select *from student1 where studentid ='"+studentid+"'");
						if(rs1.next()) {
							st.executeUpdate("insert into issue values('"+bookid+"','"+studentid+"','"+issueDate+"','"+dueDate+"','"+returnBook+"')");
							JOptionPane.showMessageDialog(null,"Book successfully issued");
							setVisible(false);
							new issueBook().setVisible(true);
						}
						else {
							JOptionPane.showMessageDialog(null,"This Student does not exist");
							setVisible(false);
							new issueBook().setVisible(true);
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"This Book does not exist");
					}
				}catch(Exception e) {
					
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(189, 275, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton_1.setBounds(317, 275, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		JLabel lblNewLabel_8 = new JLabel(new ImageIcon("C:\\Users\\dhanr\\eclipse-workspace\\Library Management System\\src\\oldpaper3.jpg"));
		lblNewLabel_8.setBounds(-54, 0, 735, 400);
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setSize(735,400);
	}
}
