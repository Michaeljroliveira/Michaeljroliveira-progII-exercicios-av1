package br.estacio.progII.ex02;


import java.awt.event.*;
import javax.swing.*;


import java.text.NumberFormat;



public class Ex02Class implements ActionListener {
	
	
	

	private JButton calculate;
	private JTextField grossSalaryCamp;
	private JTextField inssBaseCamp;
	private JTextField inssDiscountCamp;
	private JTextField irpfBaseCamp;
	private JTextField irpfDiscountCamp;
	private JTextField netSalaryCamp;
	
	public Ex02Class (JButton calculate, JTextField grossSalaryCamp, JTextField inssBaseCamp, 
			JTextField inssDiscountCamp, JTextField irpfBaseCamp, JTextField irpfDiscountCamp, 
			JTextField netSalaryCamp){
	
		this.calculate = calculate;
		this.grossSalaryCamp = grossSalaryCamp;
		this.inssBaseCamp = inssBaseCamp;
		this.inssDiscountCamp = inssDiscountCamp;
		this.irpfBaseCamp = irpfBaseCamp;
		this.irpfDiscountCamp = irpfDiscountCamp;
		this.netSalaryCamp = netSalaryCamp;
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		double a = Integer.parseInt(grossSalaryCamp.getText());
		
		if (a <= 1659.38) {
			inssBaseCamp.setText(String.valueOf(String.format("%.2f", a)));
			double b, c;
			b = (a * 8 / 100);
			inssDiscountCamp.setText(String.valueOf(String.format("%.2f",b)));
			a = a - b;
			irpfBaseCamp.setText("-");	
			irpfDiscountCamp.setText("-");
			netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
			
		} else if (a >= 1659.39 && a <= 2765.66) {
			inssBaseCamp.setText(String.valueOf(String.format("%.2f", a)));
			double b;
			b = (a * 9 / 100);
			inssDiscountCamp.setText(String.valueOf(String.format("%.2f",b)));
			a = a - b;
			irpfBaseCamp.setText("-");
			irpfDiscountCamp.setText("-");
			netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				if (a >= 1903.99 && a <= 2826.65) {
					double c;
					irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));
					irpfBaseCamp.revalidate();
					c = (a * 7.5 / 100) - 142.80;

					a = a - c;
					netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				}
			
		}else if (a >= 2765.66 && a <= 5531.31) {
			inssBaseCamp.setText(String.valueOf(String.format("%.2f", a)));
			double b;
			b = (a * 11 / 100);
			inssDiscountCamp.setText(String.valueOf(String.format("%.2f",b)));
			a = a - b;
			irpfBaseCamp.setText("-");
			irpfDiscountCamp.setText("-");
			netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				if (a >= 1903.99 && a <= 2826.65) {
					double c;
					irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));
					irpfBaseCamp.revalidate();
					c = (a * 7.5 / 100) - 142.80;
					irpfDiscountCamp.setText(String.valueOf(String.format("%.2f", c)));
					irpfDiscountCamp.revalidate();
					a = a - c;
					netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				}
				if (a >= 2826.66 && a <= 3751.05) {
					double c;
					irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));	
					irpfBaseCamp.revalidate();
					c = (a * 15 / 100) - 354.80;
					irpfDiscountCamp.setText(String.valueOf(String.format("%.2f", c)));
					irpfDiscountCamp.revalidate();
					a = a - c;
					netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				}
				if (a >= 3751.05 && a <= 4664.68) {
					double c;
					irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));
					irpfBaseCamp.revalidate();
					c = (a * 22.5 / 100) - 636.13;
					irpfDiscountCamp.setText(String.valueOf(String.format("%.2f", c)));
					irpfDiscountCamp.revalidate();
					a = a - c;
					netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				}if (a >= 4664.69) {
					double c;
					irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));
					irpfBaseCamp.revalidate();
					c = (a * 27.5 / 100) - 636.13;
					irpfDiscountCamp.setText(String.valueOf(String.format("%.2f", c)));
					irpfDiscountCamp.revalidate();
					a = a - c;
					netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
				
	}
		
	
	
}else if (a >= 5531.31) {
	float b;
	inssBaseCamp.setText(String.valueOf(String.format("%.2f", a)));
	inssDiscountCamp.setText(String.valueOf(String.format("%.2f", 608.45)));
	a = a - 608.45;
	irpfBaseCamp.setText(String.valueOf(String.format("%.2f",a)));
	b = (float) (a * 27.50f / 100f) - 869.36f;
	irpfDiscountCamp.setText(String.valueOf(String.format("%.2f", b)));
	irpfDiscountCamp.revalidate();
	a = a - b;
	netSalaryCamp.setText(String.valueOf(String.format("%.2f", a)));
}
	
}
}