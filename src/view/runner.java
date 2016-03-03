package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class runner {

	public static void main(String[] args) {
		StartFrame hello = new StartFrame();
		hello.setLayout(new BorderLayout());
		hello.setBackground(Color.WHITE);
		hello.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hello.setVisible(true);
		
		LogInFrame log = new LogInFrame();
		log.setLayout(new BorderLayout());
		log.setBackground(Color.WHITE);
		log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		log.setVisible(true);
	}

}
