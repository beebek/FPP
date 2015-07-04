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
		
		lblMile.setBounds(30, 10, 50, 20); mile.setBounds(110, 10, 100, 20); lblKm.setBounds(250, 10, 100, 20); km.setBounds(340, 10, 100, 20);
		lblPound.setBounds(30, 30, 50, 20); pound.setBounds(110, 30, 100, 20); lblKg.setBounds(250, 30, 100, 20); kg.setBounds(340, 30, 100, 20);
		lblGallon.setBounds(30, 50, 50, 20); gallon.setBounds(110, 50, 100, 20); lblLtr.setBounds(250, 50, 100, 20); ltr.setBounds(340, 50, 100, 20);
		lblFar.setBounds(30, 70, 70, 20); farhnt.setBounds(110, 70, 100, 20); lblCenti.setBounds(250, 70, 100, 20); centi.setBounds(340, 70, 100, 20);
		
		add(lblMile); add(mile); add(lblKm); add(km);
		add(lblPound); add(pound); add(lblKg); add(kg);
		add(lblGallon); add(gallon); add(lblLtr); add(ltr);
		add(lblFar); add(farhnt); add(lblCenti); add(centi);
		
	}

	public static void main(String[] args) {
		UnitConverter window = new UnitConverter();
		window.setTitle("Metric Conversion Assistant");
		window.setTitle("Address Form");
		window.setVisible(true);
		window.setSize(480, 160);
		window.setLocation(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
