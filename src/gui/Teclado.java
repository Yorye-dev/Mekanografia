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
		add(botones[0]);
		
		botones[1].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[1].setBounds(164, 0, 164, 107);
		add(botones[1]);
		
		botones[2].setFont(new Font("Consolas", Font.PLAIN, 28));
		botones[2].setBounds(328, 0, 164, 107);
		add(botones[2]);
		/*
		rBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		rBtn.setBounds(492, 0, 164, 107);
		add(rBtn);
		
		tBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		tBtn.setBounds(656, 0, 164, 107);
		add(tBtn);
		
		yBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		yBtn.setBounds(820, 0, 164, 107);
		add(yBtn);
		
		
		uBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		uBtn.setBounds(984, 0, 164, 107);
		add(uBtn);
		
		iBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		iBtn.setBounds(1148, 0, 164, 107);
		add(iBtn);
		
		
		oBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		oBtn.setBounds(1312, 0, 164, 107);
		add(oBtn);
		
		
		pBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		pBtn.setBounds(1476, 0, 164, 107);
		add(pBtn);
		
		
		aBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		aBtn.setBounds(0, 107, 164, 107);
		add(aBtn);
		
		sBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		sBtn.setBounds(164, 107, 164, 107);
		add(sBtn);
		
		
		dBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		dBtn.setBounds(328, 107, 164, 107);
		add(dBtn);
		
		
		fBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		fBtn.setBounds(492, 107, 164, 107);
		add(fBtn);
		
		
		gBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		gBtn.setBounds(656, 107, 164, 107);
		add(gBtn);
		
		
		hBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		hBtn.setBounds(820, 107, 164, 107);
		add(hBtn);
		
		jBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		jBtn.setBounds(984, 107, 164, 107);
		add(jBtn);
		
		
		kBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		kBtn.setBounds(1148, 107, 164, 107);
		add(kBtn);
		
		
		lBtn.setFont(new Font("Consolas", Font.PLAIN, 24));
		lBtn.setBounds(1312, 107, 164, 107);
		add(lBtn);
		
		
		ñBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		ñBtn.setBounds(1476, 107, 164, 107);
		add(ñBtn);
		
		
		zBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		zBtn.setBounds(0, 214, 164, 107);
		add(zBtn);
		
		
		xBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		xBtn.setBounds(164, 214, 164, 107);
		add(xBtn);
		
		
		cBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		cBtn.setBounds(328, 214, 164, 107);
		add(cBtn);
		
		
		vBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		vBtn.setBounds(492, 214, 164, 107);
		add(vBtn);
		
		
		bBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		bBtn.setBounds(656, 214, 164, 107);
		add(bBtn);
		
		
		nBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		nBtn.setBounds(820, 214, 164, 107);
		add(nBtn);
		
		
		mBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		mBtn.setBounds(984, 214, 164, 107);
		add(mBtn);
		
		
		comaBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		comaBtn.setBounds(1148, 214, 164, 107);
		add(comaBtn);
		
		
		puntoBtn.setFont(new Font("Consolas", Font.PLAIN, 45));
		puntoBtn.setBounds(1312, 214, 164, 107);
		add(puntoBtn);
		
		
		ÇBtn.setFont(new Font("Consolas", Font.PLAIN, 28));
		ÇBtn.setBounds(1476, 214, 164, 107);
		add(ÇBtn);
		
				spacioBtn.setBounds(328, 321, 984, 108);
		add(spacioBtn);
		*/
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
