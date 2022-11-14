package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Teclado extends JPanel {
	
	Teclado() {
	setBackground(Color.PINK);
	setLayout(null);
		
		JButton qButton = new JButton("Q");
		qButton.setBounds(10, 11, 50, 50);
		add(qButton);
		
		JButton wBtn = new JButton("W");
		wBtn.setBounds(70, 11, 50, 50);
		add(wBtn);
		
		JButton eBtn = new JButton("E");
		eBtn.setBounds(130, 11, 50, 50);
		add(eBtn);
		
		JButton rButton = new JButton("R");
		rButton.setBounds(190, 11, 50, 50);
		add(rButton);
		
		JButton tButton = new JButton("T");
		tButton.setBounds(250, 11, 50, 50);
		add(tButton);
		
		JButton btnNewButton_5 = new JButton("Y");
		btnNewButton_5.setBounds(310, 11, 50, 50);
		add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("U");
		btnNewButton_6.setBounds(370, 11, 50, 50);
		add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("I");
		btnNewButton_7.setBounds(10, 67, 50, 50);
		add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("O");
		btnNewButton_8.setBounds(70, 67, 50, 50);
		add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("P");
		btnNewButton_9.setBounds(130, 67, 50, 50);
		add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("A");
		btnNewButton_10.setBounds(190, 67, 50, 50);
		add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("S");
		btnNewButton_11.setBounds(250, 67, 50, 50);
		add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("D");
		btnNewButton_12.setBounds(310, 67, 50, 50);
		add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("F");
		btnNewButton_13.setBounds(370, 67, 50, 50);
		add(btnNewButton_13);
		
		JButton btnNewButton_8_1 = new JButton("G");
		btnNewButton_8_1.setBounds(10, 124, 50, 50);
		add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("H");
		btnNewButton_8_2.setBounds(70, 124, 50, 50);
		add(btnNewButton_8_2);
		
		JButton  = new JButton("J");
		btnNewButton_8_3.setBounds(130, 124, 50, 50);
		add(btnNewButton_8_3);
		
		JButton btnNewButton_8_4 = new JButton("K");
		btnNewButton_8_4.setBounds(190, 124, 50, 50);
		add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("L");
		btnNewButton_8_5.setBounds(250, 124, 50, 50);
		add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("Ñ");
		btnNewButton_8_6.setBounds(310, 124, 50, 50);
		add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("Z");
		btnNewButton_8_7.setBounds(370, 124, 50, 50);
		add(btnNewButton_8_7);
	}
}
