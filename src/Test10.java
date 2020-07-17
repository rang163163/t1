import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class Test10 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		JPanel leftPanel = new JPanel();
		final JPanel centerPanel = new JPanel();
		
		frame.add(leftPanel,BorderLayout.WEST);
		frame.add(centerPanel);
		System.out.println("123");
		System.out.println("1234");
		System.out.println("12311111");
		leftPanel.setLayout(new GridLayout(4,1)); 
		JButton btnPrev=new JButton("前一个");
		JButton btnNext=new JButton("后一个");
		JButton btnTwo=new JButton("第二个");
		JButton btnThree=new JButton("第三个");
		
		leftPanel.add(btnPrev);
		leftPanel.add(btnNext);
		leftPanel.add(btnTwo);	
		leftPanel.add(btnThree);		
		
		
		final CardLayout cl=new CardLayout(); //卡片布局
		centerPanel.setLayout(cl);   
		ImageIcon image=new ImageIcon("./src/open.gif");
		centerPanel.add(new JLabel(image),"1");
		centerPanel.add(new JLabel("bbbb",10),"2");
		centerPanel.add(new JLabel("cccc",10),"3");
		centerPanel.add(new JLabel("dddd",10),"4");
			
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		class MyListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("前一个")){
					cl.previous(centerPanel);
				}
				else if(e.getActionCommand().equals("后一个")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("第二个")){
					cl.show(centerPanel,"2"); //指定显示哪一个
				}
				else if(e.getActionCommand().equals("第三个")){
					cl.show(centerPanel,"3"); //指定显示哪一个
				}
			}
		}
		
		MyListener listener = new MyListener();
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnTwo.addActionListener(listener);
		btnThree.addActionListener(listener);
}
}
