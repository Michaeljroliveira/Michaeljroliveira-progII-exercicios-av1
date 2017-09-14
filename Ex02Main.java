package br.estacio.progII.ex02;

import javax.swing.JFrame;

public class Ex02Main {

	public static void main(String args[]) {
		
	
	Ex02Frame screen = new Ex02Frame();
	screen.setSize(500,250);
	screen.setLocationRelativeTo(null);
	screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	screen.setVisible(true);
	}
}