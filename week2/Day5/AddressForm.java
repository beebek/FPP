package week2.Day5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AddressForm extends JFrame {
	private String name, street, city, state, zip;
	
	public AddressForm() {
		setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		JLabel lblStreet = new JLabel("Street");
		JLabel lblCity = new JLabel("City");
		JLabel lblState = new JLabel("State");
		JLabel lblZip = new JLabel("Zip");
		
		JTextField txtName = new JTextField();
		JTextField txtStreet = new JTextField();
		JTextField txtCity = new JTextField();
		JTextField txtState = new JTextField();
		JTextField txtZip = new JTextField();
		
		JButton submit = new JButton("Submit");
		
		lblName.setBounds(30, 20, 200, 60);
		txtName.setBounds(30, 60, 200, 20);
		
		lblStreet.setBounds(250, 20, 200, 60);
		txtStreet.setBounds(250, 60, 200, 20);
		
		lblCity.setBounds(470, 20, 200, 60);
		txtCity.setBounds(470, 60, 200, 20);
		
		lblState.setBounds(140, 100, 200, 60);
		txtState.setBounds(140, 140, 200, 20);
		
		lblZip.setBounds(370, 100, 200, 60);
		txtZip.setBounds(370, 140, 200, 20);
		
		submit.setBounds(305, 200, 100, 30);
		
		add(lblName); add(txtName);
		add(lblStreet); add(txtStreet);
		add(lblCity); add(txtCity);
		add(lblState); add(txtState);
		add(lblZip); add(txtZip);
		add(submit);
		
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(txtName.getText());
				System.out.println(txtStreet.getText());
				System.out.println(txtCity.getText() + ", " + txtState.getText() + txtZip.getText());
				
			}
		});
	}

	public static void main(String[] args) {
		AddressForm window = new AddressForm();
		window.setTitle("Address Form");
		window.setVisible(true);
		window.setSize(710, 300);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
