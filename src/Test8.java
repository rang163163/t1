import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Test8 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout());
		frame.add(new JButton("��ť1"),BorderLayout.SOUTH);
		frame.add(new JButton("��ť2"),BorderLayout.NORTH);
		frame.add(new JButton("��ť3"),BorderLayout.EAST);
		frame.add(new JButton("��ť4"),"West");
		frame.add(new JButton("��ť5"),BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
