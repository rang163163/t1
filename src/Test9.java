import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Test9 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("��ť1"));  
		frame.add(new JButton("��ť2"));
		frame.add(new JButton("��ť3"));
		frame.add(new JButton("��ť4"));
		frame.add(new JButton("��ť5"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
