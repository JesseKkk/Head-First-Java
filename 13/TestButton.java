

import javax.swing.*;
import java.awt.*;

public class TestButton {
	
	public static void main(String[] args) {
		TestButton gui = new TestButton();
		gui.go();
	
	}
	
	public void go() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click This!");
		Font bigFont = new Font("serif", Font.BOLD, 28);
		button.setFont(bigFont);
		
		
		frame.getContentPane().add(BorderLayout.NORTH, button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		frame.setVisible(true);
		
	}
}