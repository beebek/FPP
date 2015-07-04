package week2.Day5;

import javax.swing.*;

public class UnitConverter extends JFrame {
	JLabel lblMile = new JLabel("Mile :");
	JLabel lblPound = new JLabel("Pound :");
	JLabel lblGallon = new JLabel("Gallon :");
	JLabel lblFar = new JLabel("Fahrenheit :");
	JLabel lblKm = new JLabel("Kilometer :");
	JLabel lblKg = new JLabel("Kilogram :");
	JLabel lblLtr = new JLabel("Liter :");
	JLabel lblCenti = new JLabel("Centigrade :");
	JButton btnConvert = new JButton("Convert");
	
	public UnitConverter() {
		setLayout(null);
		
		JTextField mile = new JTextField();
		JTextField pound = new JTextField();
		JTextField gallon = new JTextField();
		JTextField farhnt = new JTextField();
		JTextField km = new JTextField();
		JTextField kg = new JTextField();
		JTextField ltr = new JTextField();
		JTextField centi = new JTextField();
		
		lblMile.setBounds(50, 50, 50, 20);
		
		
		add(lblMile);
		
	}

	public static void main(String[] args) {
		UnitConverter window = new UnitConverter();
		window.setTitle("Metric Conversion Assistant");
		window.setTitle("Address Form");
		window.setVisible(true);
		window.setSize(710, 300);
		window.setLocation(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
