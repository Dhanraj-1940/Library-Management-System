import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.Color;
public class newStudent extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newStudent frame = new newStudent();
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
	public newStudent() {
		setType(Type.NORMAL);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(366, 220, 620, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("StudentID");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 17));
		lblNewLabel.setBounds(179, 107, 95, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(255, 255, 204));
		lblName.setFont(new Font("Arial", Font.BOLD, 17));
		lblName.setBounds(179, 141, 95, 23);
		contentPane.add(lblName);
		
		JLabel lblFname = new JLabel("F_name");
		lblFname.setForeground(new Color(255, 255, 204));
		lblFname.setFont(new Font("Arial", Font.BOLD, 17));
		lblFname.setBounds(179, 175, 95, 23);
		contentPane.add(lblFname);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(new Color(255, 255, 204));
		lblCourse.setFont(new Font("Arial", Font.BOLD, 17));
		lblCourse.setBounds(179, 208, 95, 23);
		contentPane.add(lblCourse);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(new Color(255, 255, 204));
		lblBranch.setFont(new Font("Arial", Font.BOLD, 17));
		lblBranch.setBounds(179, 242, 95, 23);
		contentPane.add(lblBranch);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 204));
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(304, 110, 124, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 204));
		textField_1.setColumns(10);
		textField_1.setBounds(304, 144, 124, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 204));
		textField_2.setColumns(10);
		textField_2.setBounds(304, 178, 124, 20);
		contentPane.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 204));
		comboBox.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BTech"}));
		comboBox.setBounds(304, 211, 124, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 204));
		comboBox_1.setFont(new Font("Arial", Font.BOLD, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "MECHANICAL", "CIVIL"}));
		comboBox_1.setBounds(304, 245, 124, 20);
		contentPane.add(comboBox_1);
		
		
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String studentID = textField.getText();
				String studentName = textField_1.getText();
				String studentF_name = textField_2.getText();
				String studentCourse = (String)comboBox.getSelectedItem();
				String studentBranch = (String)comboBox_1.getSelectedItem();
				
				try {
					Connection con = ConnectionProvider.getCon();
					Statement st = con.createStatement();
					st.executeUpdate("insert into student1 values('"+studentID+"','"+studentName+"','"+studentF_name+"','"+studentCourse+"','"+studentBranch+"')");
					JOptionPane.showMessageDialog(null,"Successfully updated");
					setVisible(false);
					new newStudent().setVisible(true);
				}catch(Exception e){
					JOptionPane.showMessageDialog(null,"Student ID already exists");
					setVisible(false);
					new newStudent().setVisible(true);
					e.printStackTrace();
				} 
			}
		});
		btnNewButton.setBounds(198, 302, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Arial", Font.BOLD, 12));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(320, 302, 89, 23);
		contentPane.add(btnClose);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("C:\\Users\\dhanr\\eclipse-workspace\\Library Management System\\src\\oldpaper3.jpg"));
		lblNewLabel_2.setBounds(-54, 0, 735, 400);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setSize(735,400);
	}
}
