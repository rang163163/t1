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
		leftPanel.setLayout(new GridLayout(4,1)); 
		JButton btnPrev=new JButton("ǰһ��");
		JButton btnNext=new JButton("��һ��");
		JButton btnTwo=new JButton("�ڶ���");
		JButton btnThree=new JButton("������");
		
		leftPanel.add(btnPrev);
		leftPanel.add(btnNext);
		leftPanel.add(btnTwo);	
		leftPanel.add(btnThree);		
		
		
		final CardLayout cl=new CardLayout(); //��Ƭ����
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
				if(e.getActionCommand().equals("ǰһ��")){
					cl.previous(centerPanel);
				}
				else if(e.getActionCommand().equals("��һ��")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("�ڶ���")){
					cl.show(centerPanel,"2"); //ָ����ʾ��һ��
				}
				else if(e.getActionCommand().equals("������")){
					cl.show(centerPanel,"3"); //ָ����ʾ��һ��
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
