package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class runner {

	public static void main(String[] args) {
		JFrame hello = new StartFrame();
		hello.setLayout(new BorderLayout());
		hello.setBackground(Color.BLACK);
		hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hello.setVisible(true);
		
	}

}
