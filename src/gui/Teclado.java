package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Teclado extends JPanel {
	int tecladoCorriendo;
	
	Teclado() {
	setSize(1640, 429);
	setBackground(Color.PINK);
		setLayout(null);
		
		JButton qButton = new JButton("Q");
		qButton.setFont(new Font("Consolas", Font.PLAIN, 28));
		qButton.setBounds(0, 0, 164, 107);
		add(qButton);
		
		JButton wBtn = new JButton("W");
		wBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		wBtn.setBounds(164, 0, 164, 107);
		add(wBtn);
		
		JButton eBtn = new JButton("E");
		eBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		eBtn.setBounds(328, 0, 164, 107);
		add(eBtn);
		
		JButton rButton = new JButton("R");
		rButton.setFont(new Font("Consolas", Font.PLAIN, 28));
		rButton.setBounds(492, 0, 164, 107);
		add(rButton);
		
		JButton tButton = new JButton("T");
		tButton.setFont(new Font("Consolas", Font.PLAIN, 28));
		tButton.setBounds(656, 0, 164, 107);
		add(tButton);
		
		JButton btnNewButton_5 = new JButton("Y");
		btnNewButton_5.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_5.setBounds(820, 0, 164, 107);
		add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("U");
		btnNewButton_6.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_6.setBounds(984, 0, 164, 107);
		add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("I");
		btnNewButton_7.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_7.setBounds(1148, 0, 164, 107);
		add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("O");
		btnNewButton_8.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8.setBounds(1312, 0, 164, 107);
		add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("P");
		btnNewButton_9.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_9.setBounds(1476, 0, 164, 107);
		add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("A");
		btnNewButton_10.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_10.setBounds(0, 107, 164, 107);
		add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("S");
		btnNewButton_11.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_11.setBounds(164, 107, 164, 107);
		add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("D");
		btnNewButton_12.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_12.setBounds(328, 107, 164, 107);
		add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("F");
		btnNewButton_13.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_13.setBounds(492, 107, 164, 107);
		add(btnNewButton_13);
		
		JButton btnNewButton_8_1 = new JButton("G");
		btnNewButton_8_1.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_1.setBounds(656, 107, 164, 107);
		add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("H");
		btnNewButton_8_2.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_2.setBounds(820, 107, 164, 107);
		add(btnNewButton_8_2);
		
		JButton jBtn = new JButton("J");
		jBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		jBtn.setBounds(984, 107, 164, 107);
		add(jBtn);
		
		JButton btnNewButton_8_4 = new JButton("K");
		btnNewButton_8_4.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_4.setBounds(1148, 107, 164, 107);
		add(btnNewButton_8_4);
		
		JButton btnNewButton_8_5 = new JButton("L");
		btnNewButton_8_5.setFont(new Font("Consolas", Font.PLAIN, 24));
		btnNewButton_8_5.setBounds(1312, 107, 164, 107);
		add(btnNewButton_8_5);
		
		JButton btnNewButton_8_6 = new JButton("Ñ");
		btnNewButton_8_6.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_6.setBounds(1476, 107, 164, 107);
		add(btnNewButton_8_6);
		
		JButton btnNewButton_8_7 = new JButton("Z");
		btnNewButton_8_7.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_7.setBounds(0, 214, 164, 107);
		add(btnNewButton_8_7);
		
		JButton xBtn = new JButton("X");
		xBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		xBtn.setBounds(164, 214, 164, 107);
		add(xBtn);
		
		JButton cBtn = new JButton("C");
		cBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		cBtn.setBounds(328, 214, 164, 107);
		add(cBtn);
		
		JButton vBtn = new JButton("V");
		vBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		vBtn.setBounds(492, 214, 164, 107);
		add(vBtn);
		
		JButton btnNewButton_8_7_1_3 = new JButton("B");
		btnNewButton_8_7_1_3.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_7_1_3.setBounds(656, 214, 164, 107);
		add(btnNewButton_8_7_1_3);
		
		JButton btnNewButton_8_7_1_4 = new JButton("N");
		btnNewButton_8_7_1_4.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_7_1_4.setBounds(820, 214, 164, 107);
		add(btnNewButton_8_7_1_4);
		
		JButton btnNewButton_8_7_1_5 = new JButton("M");
		btnNewButton_8_7_1_5.setFont(new Font("Consolas", Font.PLAIN, 28));
		btnNewButton_8_7_1_5.setBounds(984, 214, 164, 107);
		add(btnNewButton_8_7_1_5);
		
		JButton comaBtn = new JButton(",");
		comaBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		comaBtn.setBounds(1148, 214, 164, 107);
		comaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add(comaBtn);
		
		JButton puntoBtn = new JButton(".");
		puntoBtn.setFont(new Font("Consolas", Font.PLAIN, 45));
		puntoBtn.setBounds(1312, 214, 164, 107);
		add(puntoBtn);
		
		JButton ÇBtn = new JButton("Ç");
		ÇBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		ÇBtn.setBounds(1476, 214, 164, 107);
		add(ÇBtn);
		
		JButton spacioBtn = new JButton(" ");
		spacioBtn.setBounds(328, 321, 984, 108);
		add(spacioBtn);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img/tecladoEmbellecedores.png"));
		label.setBounds(1312, 321, 328, 107);
		add(label);
		
		JLabel label_1_2_1 = new JLabel("");
		label_1_2_1.setIcon(new ImageIcon("img/tecladoEmbellecedores.png"));
		label_1_2_1.setBounds(0, 321, 328, 107);
		add(label_1_2_1);
	}
}
