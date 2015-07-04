package week2.Day5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.ArrayList;
import java.util.List;

public class StringUtility extends JFrame {
	
	public StringUtility() {
		setLayout(null);
		
		JButton cntLts = new JButton("Count Letters");
		JButton rvsLts = new JButton("Reverse Letters");
		JButton rmvDup = new JButton("Remove Duplicates");
		JLabel lblInput = new JLabel("Input");
		JLabel lblOutput = new JLabel("Output");
		
		JTextField inputTxt = new JTextField();
		JTextField outputTxt = new JTextField();
		
		cntLts.setBounds(50,  30, 150, 30);
		rvsLts.setBounds(50, 80, 150, 30);
		rmvDup.setBounds(50, 130, 150, 30);
		
		lblInput.setBounds(230, 40, 50, 30);
		inputTxt.setBounds(230, 70, 150, 20);
		
		lblOutput.setBounds(230, 90, 50, 30);
		outputTxt.setBounds(230, 120, 150, 20);
		
		add(cntLts); add(rvsLts); add(rmvDup);
		add(lblInput); add(inputTxt);
		add(lblOutput); add(outputTxt);
		
		cntLts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String len = Integer.toString(inputTxt.getText().length());
				outputTxt.setText(len);
			}
		});
		
		rvsLts.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String reversedTxt = new StringBuffer(inputTxt.getText()).reverse().toString();
				outputTxt.setText(reversedTxt);
			}
		});
		
		rmvDup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<String> nonDuplicate = new ArrayList<String>();
				String inputText = inputTxt.getText();
				for(int i=0; i<inputText.length(); i++) {
					if(!nonDuplicate.contains(inputText.substring(i, i+1)))
						nonDuplicate.add(inputText.substring(i, i+1));
				}
				
				String txt = String.join("", nonDuplicate);
				System.out.println(nonDuplicate);
				System.out.println(txt);
				outputTxt.setText(txt);
			}
		});
		
	}

	public static void main(String[] args) {
		StringUtility window = new StringUtility();
		window.setTitle("String Utility");
		window.setSize(500,  230);
		window.setResizable(false);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
