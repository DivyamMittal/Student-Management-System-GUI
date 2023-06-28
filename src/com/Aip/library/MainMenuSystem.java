package com.Aip.library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;
import java.awt.event.WindowAdapter;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.UIManager;

public class MainMenuSystem {

	private JFrame frame;
	private JTextField nameInput;
	private JTextField dobInput;
	private JTextField genderInput;
	private JTextField fnameInput;
	private JTextField contactInput;
	private JTextField addressInput;
	private JTextField addmInput;
	private JTextField classInput;
	private JTextField mnameInput;
	private JTextField newAddmInput;
	private JTextField newNameInput;
	private JTextField newDobInput;
	private JTextField newFnameInput;
	private JTextField newContactInput;
	private JTextField newAddressInput;
	private JTextField newClassInput;
	private JTextField newGenderInput;
	private JTextField newMnameInput;
	private JTextField delAddmInput;
	private JTextField searchAddmInput;
	private JTable displaytable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuSystem window = new MainMenuSystem();
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
	public MainMenuSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
			}
		});
		frame.setBounds(100, 100, 1253, 681);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPaneMenu = new JLayeredPane();
		layeredPaneMenu.setBackground(new Color(255, 127, 80));
		layeredPaneMenu.setBounds(0, 0, 1239, 644);
		frame.getContentPane().add(layeredPaneMenu);
		
		JPanel panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
//				Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
				System.exit(0);
			}
		});
		panel_6.setBackground(SystemColor.windowBorder);
		panel_6.setBounds(30, 573, 263, 46);
		layeredPaneMenu.add(panel_6);
		panel_6.setLayout(null);
		
		JPanel createPanel = new JPanel();
		layeredPaneMenu.setLayer(createPanel, 0);
		createPanel.setBackground(SystemColor.activeCaptionBorder);
		createPanel.setBounds(328, 10, 901, 624);
		layeredPaneMenu.add(createPanel);
		createPanel.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Addmission Form");
		lblNewLabel_6.setForeground(SystemColor.desktop);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_6.setBounds(319, 28, 295, 37);
		createPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Name :");
		lblNewLabel_7.setForeground(SystemColor.desktop);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_7.setBounds(51, 132, 80, 37);
		createPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Addmission No. :");
		lblNewLabel_8.setForeground(SystemColor.desktop);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_8.setBounds(476, 132, 182, 36);
		createPanel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("D.O.B. :");
		lblNewLabel_9.setForeground(SystemColor.desktop);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9.setBounds(51, 190, 94, 37);
		createPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Gender : ");
		lblNewLabel_10.setForeground(SystemColor.desktop);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10.setBounds(51, 249, 94, 37);
		createPanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Class : ");
		lblNewLabel_11.setForeground(SystemColor.desktop);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11.setBounds(476, 190, 73, 37);
		createPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Father's Name :");
		lblNewLabel_12.setForeground(SystemColor.desktop);
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12.setBounds(51, 310, 161, 37);
		createPanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Mother's Name :");
		lblNewLabel_13.setForeground(SystemColor.desktop);
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(476, 307, 166, 43);
		createPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Contact No. :");
		lblNewLabel_14.setForeground(SystemColor.desktop);
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_14.setBounds(51, 367, 143, 37);
		createPanel.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Address : ");
		lblNewLabel_15.setForeground(SystemColor.desktop);
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(51, 425, 100, 43);
		createPanel.add(lblNewLabel_15);
		
		nameInput = new JTextField();
		nameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		nameInput.setBounds(222, 135, 204, 32);
		createPanel.add(nameInput);
		nameInput.setColumns(10);
		
		dobInput = new JTextField();
		dobInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		dobInput.setColumns(10);
		dobInput.setBounds(222, 193, 204, 32);
		createPanel.add(dobInput);
		
		genderInput = new JTextField();
		genderInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		genderInput.setColumns(10);
		genderInput.setBounds(222, 252, 204, 32);
		createPanel.add(genderInput);
		
		fnameInput = new JTextField();
		fnameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		fnameInput.setColumns(10);
		fnameInput.setBounds(222, 315, 204, 32);
		createPanel.add(fnameInput);
		
		contactInput = new JTextField();
		contactInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		contactInput.setColumns(10);
		contactInput.setBounds(222, 370, 204, 32);
		createPanel.add(contactInput);
		
		addressInput = new JTextField();
		addressInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		addressInput.setColumns(10);
		addressInput.setBounds(222, 431, 392, 32);
		createPanel.add(addressInput);
		
		addmInput = new JTextField();
		addmInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		addmInput.setColumns(10);
		addmInput.setBounds(668, 135, 182, 32);
		createPanel.add(addmInput);
		
		classInput = new JTextField();
		classInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		classInput.setColumns(10);
		classInput.setBounds(668, 195, 182, 32);
		createPanel.add(classInput);
		
		mnameInput = new JTextField();
		mnameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		mnameInput.setColumns(10);
		mnameInput.setBounds(668, 315, 182, 32);
		createPanel.add(mnameInput);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String addmnNo = addmInput.getText();
				String stname = nameInput.getText();
				String stdob = dobInput.getText();
				String stgender = genderInput.getText();
				String stclass = classInput.getText();
				String stfname = fnameInput.getText();
				String stmname = mnameInput.getText();
				String stcontact = contactInput.getText();
				String staddress = addressInput.getText();
				DBConnection.inserData(addmnNo, stname, stdob, stgender, stclass, stfname, stmname, stcontact, staddress);
				JOptionPane.showMessageDialog(null, "Data Inserted Successful!", "Insert", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(397, 561, 112, 37);
		createPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addmInput.setText("");
				nameInput.setText("");
				dobInput.setText("");
				genderInput.setText("");
				classInput.setText("");
				fnameInput.setText("");
				mnameInput.setText("");
				contactInput.setText("");
				addmInput.setText("");
				addressInput.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1.setBounds(756, 564, 94, 32);
		createPanel.add(btnNewButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(74, 83, 756, 2);
		createPanel.add(separator_1);
		
		JPanel searchPanel = new JPanel();
		layeredPaneMenu.setLayer(searchPanel, 0);
		searchPanel.setBackground(SystemColor.activeCaptionBorder);
		searchPanel.setBounds(329, 10, 901, 624);
		layeredPaneMenu.add(searchPanel);
		searchPanel.setLayout(null);
		
		JLabel lblNewLabel_6_2 = new JLabel("Search Student Record");
		lblNewLabel_6_2.setForeground(SystemColor.desktop);
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_6_2.setBounds(269, 10, 396, 47);
		searchPanel.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("Addmission No. :");
		lblNewLabel_8_2.setForeground(SystemColor.desktop);
		lblNewLabel_8_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_8_2.setBounds(66, 116, 182, 36);
		searchPanel.add(lblNewLabel_8_2);
		
		searchAddmInput = new JTextField();
		searchAddmInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		searchAddmInput.setColumns(10);
		searchAddmInput.setBounds(255, 119, 182, 32);
		searchPanel.add(searchAddmInput);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displaytable.setModel(new DefaultTableModel(null, new String[]{"ID","Name","D.O.B","Gender","Class","Father Name","Mother Name","Contact no.","Address"}));
				try {
					String searchAddmNoInput = searchAddmInput.getText();
					// Load the drivers
					Class.forName("oracle.jdbc.OracleDriver");
					// connection establish
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "shadow");
					String query = "select * from studentManagement where addmNo=?";
					PreparedStatement prst = con.prepareStatement(query);
					prst.setString(1, searchAddmNoInput);
					ResultSet rs = prst.executeQuery();
					while(rs.next())
					{
						String tbData[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
						DefaultTableModel tbModel = (DefaultTableModel)displaytable.getModel();
						tbModel.addRow(tbData);
					}
					con.close();
				} 
				catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
				}
			}
		});
		btnSearch.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnSearch.setBounds(698, 116, 112, 37);
		searchPanel.add(btnSearch);
		
		JButton btnDisplayAll = new JButton("Display All");
		btnDisplayAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				displaytable.setModel(new DefaultTableModel(null, new String[]{"ID","Name","D.O.B","Gender","Class","Father Name","Mother Name","Contact no.","Address"}));
				try {
					// Load the drivers
					Class.forName("oracle.jdbc.OracleDriver");
					// connection establish
					Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "shadow");
					String query = "select * from studentManagement order by addmNo";
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(query);
					while(rs.next())
					{
						String tbData[] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
						DefaultTableModel tbModel = (DefaultTableModel)displaytable.getModel();
						tbModel.addRow(tbData);
					}
					con.close();
				} 
				catch (Exception ex) {
					// TODO: handle exception
					ex.printStackTrace();
				}
			}
		});
		btnDisplayAll.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnDisplayAll.setBounds(374, 538, 152, 37);
		searchPanel.add(btnDisplayAll);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 195, 858, 269);
		searchPanel.add(scrollPane);
		
		displaytable = new JTable();
		displaytable.setBackground(SystemColor.control);
		displaytable.setForeground(SystemColor.desktop);
		displaytable.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		scrollPane.setViewportView(displaytable);
		displaytable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "D.O.B", "Gender", "Class", "Father Name", "Mother Name", "Contact No", "Address"
			}
		));
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(66, 67, 756, 2);
		searchPanel.add(separator_1_1);
		
		JPanel modifyPanel = new JPanel();
		layeredPaneMenu.setLayer(modifyPanel, 0);
		modifyPanel.setBackground(SystemColor.activeCaptionBorder);
		modifyPanel.setBounds(327, 10, 901, 624);
		layeredPaneMenu.add(modifyPanel);
		modifyPanel.setLayout(null);
		
		JLabel lblNewLabel_6_1 = new JLabel("Modify Student Record");
		lblNewLabel_6_1.setForeground(SystemColor.desktop);
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_6_1.setBounds(270, 18, 396, 47);
		modifyPanel.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Name :");
		lblNewLabel_7_1.setForeground(SystemColor.desktop);
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_7_1.setBounds(68, 210, 80, 37);
		modifyPanel.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Enter Addmission No. :");
		lblNewLabel_8_1.setForeground(SystemColor.desktop);
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_8_1.setBounds(68, 113, 252, 36);
		modifyPanel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("D.O.B. :");
		lblNewLabel_9_1.setForeground(SystemColor.desktop);
		lblNewLabel_9_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_9_1.setBounds(68, 266, 94, 37);
		modifyPanel.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Gender : ");
		lblNewLabel_10_1.setForeground(SystemColor.desktop);
		lblNewLabel_10_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_10_1.setBounds(484, 266, 94, 37);
		modifyPanel.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Class : ");
		lblNewLabel_11_1.setForeground(SystemColor.desktop);
		lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_11_1.setBounds(484, 210, 73, 37);
		modifyPanel.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Father's Name :");
		lblNewLabel_12_1.setForeground(SystemColor.desktop);
		lblNewLabel_12_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_12_1.setBounds(68, 321, 161, 37);
		modifyPanel.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_13_1 = new JLabel("Mother's Name :");
		lblNewLabel_13_1.setForeground(SystemColor.desktop);
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_13_1.setBounds(483, 318, 166, 43);
		modifyPanel.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("Contact No. :");
		lblNewLabel_14_1.setForeground(SystemColor.desktop);
		lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_14_1.setBounds(68, 374, 143, 37);
		modifyPanel.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("Address : ");
		lblNewLabel_15_1.setForeground(SystemColor.desktop);
		lblNewLabel_15_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_15_1.setBounds(68, 426, 100, 43);
		modifyPanel.add(lblNewLabel_15_1);
		
		newAddmInput = new JTextField();
		newAddmInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newAddmInput.setColumns(10);
		newAddmInput.setBounds(326, 116, 204, 32);
		modifyPanel.add(newAddmInput);
		
		newNameInput = new JTextField();
		newNameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newNameInput.setColumns(10);
		newNameInput.setBounds(242, 213, 204, 32);
		modifyPanel.add(newNameInput);
		
		newDobInput = new JTextField();
		newDobInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newDobInput.setColumns(10);
		newDobInput.setBounds(242, 269, 204, 32);
		modifyPanel.add(newDobInput);
		
		newFnameInput = new JTextField();
		newFnameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newFnameInput.setColumns(10);
		newFnameInput.setBounds(242, 324, 204, 32);
		modifyPanel.add(newFnameInput);
		
		newContactInput = new JTextField();
		newContactInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newContactInput.setColumns(10);
		newContactInput.setBounds(242, 377, 204, 32);
		modifyPanel.add(newContactInput);
		
		newAddressInput = new JTextField();
		newAddressInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newAddressInput.setColumns(10);
		newAddressInput.setBounds(242, 432, 424, 32);
		modifyPanel.add(newAddressInput);
		
		newClassInput = new JTextField();
		newClassInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newClassInput.setColumns(10);
		newClassInput.setBounds(666, 213, 182, 32);
		modifyPanel.add(newClassInput);
		
		newGenderInput = new JTextField();
		newGenderInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newGenderInput.setColumns(10);
		newGenderInput.setBounds(666, 269, 182, 32);
		modifyPanel.add(newGenderInput);
		
		newMnameInput = new JTextField();
		newMnameInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		newMnameInput.setColumns(10);
		newMnameInput.setBounds(666, 324, 182, 32);
		modifyPanel.add(newMnameInput);
		
		JButton btnModify = new JButton("Modify");
		btnModify.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String addmnNo = newAddmInput.getText();
				String stname = newNameInput.getText();
				String stdob = newDobInput.getText();
				String stgender = newGenderInput.getText();
				String stclass = newClassInput.getText();
				String stfname = newFnameInput.getText();
				String stmname = newMnameInput.getText();
				String stcontact = newContactInput.getText();
				String staddress = newAddressInput.getText();
				DBConnection.updateData(addmnNo, stname, stdob, stgender, stclass, stfname, stmname, stcontact, staddress);
				JOptionPane.showMessageDialog(null, "Data Updated Successful!", "Modify", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnModify.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnModify.setBounds(402, 555, 112, 37);
		modifyPanel.add(btnModify);
		
		JLabel lblNewLabel_16 = new JLabel("Enter Updated Record");
		lblNewLabel_16.setForeground(SystemColor.desktop);
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_16.setBounds(68, 168, 340, 32);
		modifyPanel.add(lblNewLabel_16);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newAddmInput.setText("");
				newNameInput.setText("");
				newDobInput.setText("");
				newGenderInput.setText("");
				newClassInput.setText("");
				newFnameInput.setText("");
				newMnameInput.setText("");
				newContactInput.setText("");
				newAddressInput.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnReset.setBounds(743, 555, 94, 37);
		modifyPanel.add(btnReset);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(92, 75, 756, 2);
		modifyPanel.add(separator_1_2);
		
		JPanel deletePanel = new JPanel();
		layeredPaneMenu.setLayer(deletePanel, 0);
		deletePanel.setBackground(SystemColor.activeCaptionBorder);
		deletePanel.setBounds(328, 10, 901, 624);
		layeredPaneMenu.add(deletePanel);
		deletePanel.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Delete Student Record");
		lblNewLabel_17.setForeground(SystemColor.desktop);
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel_17.setBounds(270, 20, 383, 47);
		deletePanel.add(lblNewLabel_17);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Enter Addmission No. :");
		lblNewLabel_8_1_1.setForeground(SystemColor.desktop);
		lblNewLabel_8_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_8_1_1.setBounds(171, 232, 252, 36);
		deletePanel.add(lblNewLabel_8_1_1);
		
		delAddmInput = new JTextField();
		delAddmInput.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		delAddmInput.setColumns(10);
		delAddmInput.setBounds(449, 235, 204, 32);
		deletePanel.add(delAddmInput);
		
		JButton btnNewButton_2_1 = new JButton("Delete");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String addMNum = delAddmInput.getText();
				DBConnection.deleteData(addMNum);
				JOptionPane.showMessageDialog(null, "Data Deletion Successful!", "Delete", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2_1.setBounds(392, 523, 112, 37);
		deletePanel.add(btnNewButton_2_1);
		
		JSeparator separator_1_3 = new JSeparator();
		separator_1_3.setBounds(74, 82, 756, 2);
		deletePanel.add(separator_1_3);

		JPanel welcomePanel = new JPanel();
		layeredPaneMenu.setLayer(welcomePanel, 1);
		welcomePanel.setLayout(null);
		welcomePanel.setBackground(SystemColor.windowBorder);
		welcomePanel.setBounds(328, 10, 901, 624);
		layeredPaneMenu.add(welcomePanel);
		
		JLabel lblNewLabel_2_3 = new JLabel("WELCOME");
		lblNewLabel_2_3.setForeground(SystemColor.textHighlightText);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2_3.setBounds(331, 147, 231, 58);
		welcomePanel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("TO");
		lblNewLabel_2_4.setForeground(SystemColor.textHighlightText);
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2_4.setBounds(331, 215, 231, 58);
		welcomePanel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("STUDENT MANAGEMENT SYSTEM");
		lblNewLabel_2_5.setForeground(SystemColor.textHighlightText);
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2_5.setBounds(71, 283, 749, 58);
		welcomePanel.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Developed by :- Divyam Mittal");
		lblNewLabel_2_5_1.setForeground(SystemColor.control);
		lblNewLabel_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_2_5_1.setBounds(242, 370, 417, 58);
		welcomePanel.add(lblNewLabel_2_5_1);
		
		createPanel.setVisible(false);
		searchPanel.setVisible(false);
		modifyPanel.setVisible(false);
		deletePanel.setVisible(false);
		welcomePanel.setVisible(true);
		
		JLabel lblNewLabel_5 = new JLabel("Exit");
		lblNewLabel_5.setForeground(SystemColor.textHighlightText);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(115, 10, 123, 26);
		panel_6.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createPanel.setVisible(false);
				searchPanel.setVisible(false);
				modifyPanel.setVisible(false);
				deletePanel.setVisible(true);
				welcomePanel.setVisible(false);
			}
		});
		panel_5.setLayout(null);
		panel_5.setBackground(SystemColor.windowBorder);
		panel_5.setBounds(30, 505, 263, 46);
		layeredPaneMenu.add(panel_5);
		
		JLabel lblNewLabel_4 = new JLabel("Delete Student Record");
		lblNewLabel_4.setForeground(SystemColor.textHighlightText);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_4.setBounds(33, 10, 220, 26);
		panel_5.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createPanel.setVisible(false);
				searchPanel.setVisible(false);
				modifyPanel.setVisible(true);
				deletePanel.setVisible(false);
				welcomePanel.setVisible(false);
			}
		});
		panel_4.setLayout(null);
		panel_4.setBackground(SystemColor.windowBorder);
		panel_4.setBounds(30, 436, 263, 46);
		layeredPaneMenu.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Modify Student Record");
		
		lblNewLabel_3.setForeground(SystemColor.textHighlightText);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_3.setBounds(31, 10, 222, 26);
		panel_4.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createPanel.setVisible(false);
				searchPanel.setVisible(true);
				modifyPanel.setVisible(false);
				deletePanel.setVisible(false);
				welcomePanel.setVisible(false);
			}
		});
		panel_2.setLayout(null);
		panel_2.setBackground(SystemColor.windowBorder);
		panel_2.setBounds(30, 366, 263, 46);
		layeredPaneMenu.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Display Student Record");
		lblNewLabel_1.setBackground(SystemColor.textHighlightText);
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(33, 10, 220, 26);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				createPanel.setVisible(true);
				searchPanel.setVisible(false);
				modifyPanel.setVisible(false);
				deletePanel.setVisible(false);
				welcomePanel.setVisible(false);
			}
		});
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.windowBorder);
		panel_1.setBounds(30, 293, 263, 46);
		layeredPaneMenu.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Create Student Record");
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setBounds(33, 10, 220, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT");
		lblNewLabel_2.setForeground(SystemColor.desktop);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(47, 21, 231, 58);
		layeredPaneMenu.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("MANAGEMENT");
		lblNewLabel_2_1.setForeground(SystemColor.desktop);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2_1.setBounds(10, 89, 308, 58);
		layeredPaneMenu.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("SYSTEM");
		lblNewLabel_2_2.setForeground(SystemColor.desktop);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel_2_2.setBounds(47, 156, 231, 58);
		layeredPaneMenu.add(lblNewLabel_2_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(75, 249, 175, 10);
		layeredPaneMenu.add(separator);
		
		
		
	}
}
