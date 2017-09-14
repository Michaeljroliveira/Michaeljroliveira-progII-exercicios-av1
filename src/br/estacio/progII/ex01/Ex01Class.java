package br.estacio.progII.ex01;

import javax.swing.*;
import java.awt.event.*;

public class Ex01Class implements ActionListener{
	
	
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JPanel panelCenter;
	
	
	public Ex01Class(JTextField field1, JTextField field2,JTextField field3, JPanel panelCenter) {
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
		this.panelCenter = panelCenter;
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		int number = Integer.parseInt(field1.getText());
		int from = Integer.parseInt(field2.getText());
		int to = Integer.parseInt(field3.getText());
		int calc;
		for(; from <= to; from++) {
			calc = number * from;
			panelCenter.add(new JLabel(String.valueOf(number + "x" + from + " = " + calc + " ")));
			panelCenter.revalidate();
			
		}

		
	}
	

		
	}