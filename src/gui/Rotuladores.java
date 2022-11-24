package gui;

import java.awt.Color;

import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class Rotuladores extends DefaultHighlighter.DefaultHighlightPainter{
public Rotuladores(Color color){
		super(color);
	}

	public static Highlighter.HighlightPainter rotuRojo = new Rotuladores(Color.red);
	public static Highlighter.HighlightPainter rotuVerde = new Rotuladores(Color.green);
}
