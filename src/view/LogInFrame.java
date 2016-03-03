package view;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LogInFrame extends JFrame {
	private JTextField userName;
	private JTextField pass;
	private JLabel userLabel;
	private JLabel passLabel;
	private JButton logButton;
	private JPanel upPanel;
	
	
	private Color upperBarColor;
	private Box upperBox;
	
	public LogInFrame() {
		super("Reel Log");
		userName = new JTextField("", 15);
		pass = new JTextField("", 15);
		userLabel = new JLabel("User Name:");
		passLabel = new JLabel("Password");
		logButton = new JButton("Log In");
		upperBarColor = new Color(164,194,244);
		
		
		
		buildFrame();
		
		
	
	}
	
	private void buildFrame(){
		buildUpper();
		buildCenter();
		
		this.setVisible(true);
	}
	
	private void buildUpper(){
		upperBox = Box.createHorizontalBox();
		upperBox.setBackground(upperBarColor);
		upPanel = new JPanel();
		upPanel.add(upperBox);
		upPanel.setBackground(upperBarColor);
	}
	
	private void buildCenter(){
		
	}
	
}
