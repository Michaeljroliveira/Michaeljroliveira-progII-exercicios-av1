package br.estacio.progII.ex01;
import javax.swing.*;
import java.awt.*;


public class Ex01Frame extends JFrame 
	{
	
	public Ex01Frame() {
		super("Tabuada Dinamica ");
		addEvent();
		addPanel();
		
	}
		
		private JPanel panelNorth = new JPanel();
		private JPanel panelCenter = new JPanel();
		
		private JLabel tableOf = new JLabel("Tabuada do numero : ");
		private JLabel from = new JLabel("Inicio Em : ");
		private JLabel to = new JLabel(" Final Em: ");
		
		private JTextField field1 = new JTextField(10);
		private JTextField field2 = new JTextField(10);
		private JTextField field3 = new JTextField(10);
		
		private JButton calculate = new JButton("Calcular");
		
		Ex01Class event = new Ex01Class(field1, field2, field3, panelCenter);
		
		protected void addEvent() {
			calculate.addActionListener(event);
		}
		
		protected void addPanel() {
		panelNorth.add(tableOf);
		panelNorth.add(field1);
		panelNorth.add(from);
		panelNorth.add(field2);
		panelNorth.add(to);
		panelNorth.add(field3);
		panelNorth.add(calculate);
		add(panelNorth, BorderLayout.NORTH);
		add(panelCenter, BorderLayout.CENTER);
		
		
		}
	}