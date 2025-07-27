package Day5;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class encap extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtsnum;
	private JTextField txtfullname;
	private JTextField txtsection;
	String username = "root";
	String password = "12312004";
	String database = "jdbc:mysql://localhost:3306/vacationlearnings";	
	private JButton btnUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					encap frame = new encap();
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
	public encap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtsnum = new JTextField();
		txtsnum.setBounds(214, 50, 190, 56);
		contentPane.add(txtsnum);
		txtsnum.setColumns(10);
		
		txtfullname = new JTextField();
		txtfullname.setColumns(10);
		txtfullname.setBounds(214, 164, 190, 56);
		contentPane.add(txtfullname);
		
		txtsection = new JTextField();
		txtsection.setColumns(10);
		txtsection.setBounds(214, 278, 190, 56);
		contentPane.add(txtsection);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullname = txtfullname.getText();
				int userID = Integer.parseInt(txtsnum.getText());	
				String section = txtsection.getText();
				User u = new User(userID,fullname,section);
				try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(database,username,password);
				
				PreparedStatement pst = con.prepareStatement("Insert into encap (SNUM,Fullname,Section) Values (?,?,?)");
				
				pst.setInt(1, u.getuserID());
				pst.setString(2, u.getfullname());
				pst.setString(3, u.getsection());
				
				pst.executeUpdate();
				
				
				} catch (Exception e2) {
					System.out.print(e2);
				}
				
			}
		});
		btnNewButton.setBounds(214, 372, 190, 56);
		contentPane.add(btnNewButton);
		
	}
}
