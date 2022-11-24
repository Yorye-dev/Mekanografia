package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Teclado extends JPanel{
	/*
}
	int tecladoCorriendo;
	
	JButton qBtn = new JButton("Q");
	JButton wBtn = new JButton("W");
	JButton eBtn = new JButton("E");
	JButton rBtn = new JButton("R");
	JButton tBtn = new JButton("T");
	JButton yBtn = new JButton("Y");
	JButton uBtn = new JButton("U");
	JButton iBtn = new JButton("I");
	JButton oBtn = new JButton("O");
	JButton pBtn = new JButton("P");
	JButton aBtn = new JButton("A");
	JButton sBtn = new JButton("S");
	JButton dBtn = new JButton("D");
	JButton fBtn = new JButton("F");
	JButton gBtn = new JButton("G");
	JButton hBtn = new JButton("H");
	JButton jBtn = new JButton("J");
	JButton kBtn = new JButton("K");
	JButton lBtn = new JButton("L");
	JButton ñBtn = new JButton("Ñ");
	JButton zBtn = new JButton("Z");
	JButton xBtn = new JButton("X");
	JButton cBtn = new JButton("C");
	JButton vBtn = new JButton("V");
	JButton bBtn = new JButton("B");
	JButton nBtn = new JButton("N");
	JButton mBtn = new JButton("M");
	JButton comaBtn = new JButton(",");
	JButton puntoBtn = new JButton(".");	
	JButton ÇBtn = new JButton("Ç");
	JButton spacioBtn = new JButton(" ");

	
	
	JButton botones[] = {qBtn, wBtn, eBtn, rBtn, tBtn, yBtn, uBtn, iBtn, pBtn, aBtn, sBtn, dBtn, fBtn, gBtn, hBtn, jBtn, lBtn, ñBtn, zBtn, xBtn ,cBtn, vBtn, bBtn, nBtn, mBtn, ÇBtn, comaBtn, puntoBtn, spacioBtn};
	
	public JButton[] getBotones() {
		return botones;
	}

	public void setBotones(JButton[] botones) {
		this.botones = botones;
	}*/

	Teclado(JButton botones[]) {
	setSize(1640, 429);
	setBackground(Color.PINK);
		setLayout(null);
		
		botones[0].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[0].setBounds(0, 0, 164, 107);
		botones[0].setBackground(Color.white);
		add(botones[0]);
		
		botones[1].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[1].setBounds(164, 0, 164, 107);
		botones[1].setBackground(Color.white);
		add(botones[1]);
		
		botones[2].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[2].setBounds(328, 0, 164, 107);
		botones[2].setBackground(Color.white);
		add(botones[2]);
		
		botones[3].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[3].setBounds(492, 0, 164, 107);
		botones[3].setBackground(Color.white);
		add(botones[3]);
		
		botones[4].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[4].setBounds(656, 0, 164, 107);
		botones[4].setBackground(Color.white);
		add(botones[4]);
		
		botones[5].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[5].setBounds(820, 0, 164, 107);
		botones[5].setBackground(Color.white);
		add(botones[5]);
		
		
		botones[6].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[6].setBounds(984, 0, 164, 107);
		botones[6].setBackground(Color.white);
		add(botones[6]);
		
		botones[7].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[7].setBounds(1148, 0, 164, 107);
		botones[7].setBackground(Color.white);
		add(botones[7]);
		
		
		botones[8].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[8].setBounds(1312, 0, 164, 107);
		botones[8].setBackground(Color.white);
		add(botones[8]);
		
		
		botones[9].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[9].setBounds(1476, 0, 164, 107);
		add(botones[9]);
		
		
		botones[10].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[10].setBounds(0, 107, 164, 107);
		add(botones[10]);
		
		botones[11].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[11].setBounds(164, 107, 164, 107);
		add(botones[11]);
		
		
		botones[12].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[12].setBounds(328, 107, 164, 107);
		add(botones[12]);
		
		
		botones[13].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[13].setBounds(492, 107, 164, 107);
		add(botones[13]);
		
		
		botones[14].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[14].setBounds(656, 107, 164, 107);
		add(botones[14]);
		
		
		botones[15].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[15].setBounds(820, 107, 164, 107);
		add(botones[15]);
		
		botones[16].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[16].setBounds(984, 107, 164, 107);
		add(botones[16]);
		
		
		botones[17].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[17].setBounds(1148, 107, 164, 107);
		add(botones[17]);
		
		
		botones[18].setFont(new Font("Consolas", Font.PLAIN, 24));
		botones[18].setBounds(1312, 107, 164, 107);
		add(botones[18]);
		
		
		botones[19].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[19].setBounds(1476, 107, 164, 107);
		add(botones[19]);
		
		
		botones[20].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[20].setBounds(0, 214, 164, 107);
		add(botones[20]);
		
		
		botones[21].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[21].setBounds(164, 214, 164, 107);
		add(botones[21]);
		
		
		botones[22].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[22].setBounds(328, 214, 164, 107);
		add(botones[22]);
		
		
		botones[23].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[23].setBounds(492, 214, 164, 107);
		add(botones[23]);
		
		
		botones[24].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[24].setBounds(656, 214, 164, 107);
		add(botones[24]);
		
		
		botones[25].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[25].setBounds(820, 214, 164, 107);
		add(botones[25]);
		
		
		botones[26].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[26].setBounds(984, 214, 164, 107);
		add(botones[26]);
		
		
		botones[27].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[27].setBounds(1148, 214, 164, 107);
		add(botones[27]);
		
		
		botones[28].setFont(new Font("Consolas", Font.PLAIN, 45));
		botones[28].setBounds(1312, 214, 164, 107);
		add(botones[28]);
		
		botones[29].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[29].setBounds(1476, 214, 164, 107);
		add(botones[29]);
		
		botones[30].setBounds(328, 321, 984, 108);
		add(botones[30]);
		
		JLabel imgLabel = new JLabel("");
		imgLabel.setIcon(new ImageIcon("img/tecladoEmbellecedores.png"));
		imgLabel.setBounds(1312, 321, 328, 107);
		add(imgLabel);
		
		JLabel imgLabel02 = new JLabel("");
		imgLabel02.setIcon(new ImageIcon("img/tecladoEmbellecedores.png"));
		imgLabel02.setBounds(0, 321, 328, 107);
		add(imgLabel02);
		
		//this.botones = botones;
	}

}
