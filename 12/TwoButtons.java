
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoButtons {
	JFrame frame;
	JLabel label;
	
	public static void main(String[] args) {
		TwoButtons gui = new TwoButtons();
		gui.go();
	
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton labelButton = new JButton("Change Label");
		labelButton.addActionListener(new LabelListener());
		
		JButton colorButton = new JButton("Change Circle");
		colorButton.addActionListener(new ColorListener());
		
		label = new JLabel("I'm a label");
		MyDrawPanel panel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);


		frame.setSize(300,300);
		frame.setVisible(true);
		
	}
	
	class LabelListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch!");
		}
	}
	
	class ColorListener implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}
}

  class MyDrawPanel extends JPanel {
	public void paintComponent(Graphics g) {
	
	Graphics2D g2d = (Graphics2D) g;
	
	int red = (int)(Math.random() * 255);
	int green = (int)(Math.random() * 255);
	int blue = (int)(Math.random() * 255);

	Color startColor = new Color(red, green, blue);
	
	red = (int)(Math.random() * 255);
	green = (int)(Math.random() * 255);
	blue = (int)(Math.random() * 255);

	Color endColor = new Color(red, green, blue);
	
	GradientPaint gradient =new GradientPaint(40,40,startColor,100,100,endColor);
	
	g2d.setPaint(gradient);
	g2d.fillOval(40,40,60,60);
	
	}
 
 }