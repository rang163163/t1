import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Test9 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("按钮1"));  
		frame.add(new JButton("按钮2"));
		frame.add(new JButton("按钮3"));
		frame.add(new JButton("按钮4"));
		frame.add(new JButton("按钮5"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
