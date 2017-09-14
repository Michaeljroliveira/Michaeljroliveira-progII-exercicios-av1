package br.estacio.progII.ex02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex02Frame extends JFrame{

		Ex02Frame(){
			super ("Salary Calculator");
			addPanelNorth();
			addPanelCenter();
			addPanelSouth();
			addPanelWest();
			addPanelEast();
			addEvent();
		}
	
		JPanel panelNorth = new JPanel();
		JPanel panelCenter = new JPanel();
		JPanel panelSouth = new JPanel();
		
		JLabel grossSalary = new JLabel("Salário Bruto : ");
		JLabel netSalary = new JLabel("Salário Liquido : ");
		JLabel inssBase = new JLabel("Base Inss : ");
		JLabel inssDiscount = new JLabel("Disconto Inss: ");
		JLabel irpfBase = new JLabel("Base Irpf: ");
		JLabel irpfDiscount = new JLabel(" Disconto Irpf : ");
		JLabel formatL = new JLabel(" Formatar ");
		
		JTextField grossSalaryCamp = new JTextField(7);
		JTextField inssBaseCamp = new JTextField();
		JTextField inssDiscountCamp = new JTextField();
		JTextField irpfBaseCamp = new JTextField();
		JTextField irpfDiscountCamp = new JTextField();
		JTextField netSalaryCamp = new JTextField(7);
		
		JButton calculate = new JButton("Calculate");
		
		JCheckBox format = new JCheckBox();
		
		protected void addPanelNorth() {
			
			
			panelNorth.add(grossSalary);
			panelNorth.add(grossSalaryCamp);
			panelNorth.add(calculate);
			panelNorth.add(format);
			panelNorth.add(formatL);
			add(panelNorth, BorderLayout.NORTH);
			
		}
		
		protected void addPanelCenter() {
			GridLayout gLayout = new GridLayout(4, 2, -280, 5);
			panelCenter.setLayout(gLayout);
			panelCenter.add(inssBase);
			panelCenter.add(inssBaseCamp);
			panelCenter.add(inssDiscount);
			panelCenter.add(inssDiscountCamp);
			panelCenter.add(irpfBase);
			panelCenter.add(irpfBaseCamp);
			panelCenter.add(irpfDiscount);
			panelCenter.add(irpfDiscountCamp);
			add(panelCenter);
			
		}
		
		protected void addPanelSouth() {
			FlowLayout fLayout = new FlowLayout();
			panelSouth.setLayout(fLayout);
			panelSouth.add(netSalary);
			panelSouth.add(netSalaryCamp);
			add(panelSouth, BorderLayout.SOUTH);
		}
		
		
		protected void addPanelWest() {
			JPanel panelWest = new JPanel();
			add(panelWest, BorderLayout.WEST);
		}
		protected void addPanelEast() {
			JPanel panelEast = new JPanel();
			add(panelEast, BorderLayout.EAST);
		}
		
		Ex02Class event = new Ex02Class(calculate,  grossSalaryCamp,  inssBaseCamp, 
				 inssDiscountCamp,  irpfBaseCamp,  irpfDiscountCamp, 
				 netSalaryCamp);
		
		protected void addEvent() {
			calculate.addActionListener(event);
		}
	
		
}
