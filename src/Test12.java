import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test12 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(750, 600);

		JPanel leftPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		leftPanel.setLayout(null);
		centerPanel.setLayout(null);
		leftPanel.setPreferredSize(new Dimension(250, 100));
		ImageIcon image = new ImageIcon("./src/open.gif");
		image.setImage(image.getImage().getScaledInstance(180, 240,
				Image.SCALE_AREA_AVERAGING));
		JLabel jimage = new JLabel();
		jimage.setIcon(image);
		frame.add(leftPanel, BorderLayout.WEST);
		jimage.setBounds(10, 10, 200, 250);

		leftPanel.add(jimage);
		frame.add(centerPanel);
		JLabel j1 = new JLabel("ѧ�ţ�");
		JLabel j2 = new JLabel("������");
		JLabel jj1 = new JLabel("�Ա�");
		JLabel j3 = new JLabel("���䣺");
		JLabel j4 = new JLabel("�ֻ���");
		JLabel j5 = new JLabel("סַ��");

		JRadioButton radio1 = new JRadioButton("��", true);

		JRadioButton radio2 = new JRadioButton("Ů", false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		JTextField jt1 = new JTextField(10);
		JTextField jt2 = new JTextField(10);
		JTextField jt3 = new JTextField(10);
		JTextField jt4 = new JTextField(10);
		JTextField jt5 = new JTextField(10);
		JButton jb1 = new JButton("���ͼƬ");
		JButton jb2 = new JButton("���Ӽ�¼");
		JButton jb3 = new JButton("�޸ļ�¼");
		JButton jb4 = new JButton("ɾ����¼");
		j1.setBounds(100, 50, 50, 50);
		j2.setBounds(100, 80, 50, 50);
		j3.setBounds(100, 145, 50, 50);
		j4.setBounds(100, 175, 50, 50);
		j5.setBounds(100, 205, 50, 50);
		jj1.setBounds(100, 115, 50, 50);
		jt1.setBounds(150, 65, 150, 20);
		jt2.setBounds(150, 95, 150, 20);
		jt3.setBounds(150, 160, 150, 20);
		jt4.setBounds(150, 190, 150, 20);
		jt5.setBounds(150, 220, 150, 20);
		jb1.setBounds(0, 300, 90, 30);
		jb2.setBounds(120, 300, 90, 30);
		jb3.setBounds(240, 300, 90, 30);
		jb4.setBounds(360, 300, 90, 30);
		radio1.setBounds(150, 130, 50, 20);
		radio2.setBounds(200, 130, 50, 20);
		centerPanel.add(j1);
		centerPanel.add(j2);
		centerPanel.add(j3);
		centerPanel.add(j4);
		centerPanel.add(j5);
		centerPanel.add(jj1);
		centerPanel.add(jt1);
		centerPanel.add(jt2);
		centerPanel.add(jt3);
		centerPanel.add(jt4);
		centerPanel.add(jt5);
		centerPanel.add(radio1);
		centerPanel.add(radio2);
		centerPanel.add(jb1);
		centerPanel.add(jb2);
		centerPanel.add(jb3);
		centerPanel.add(jb4);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu menu1 = new JMenu("�ļ�");
		JMenu menu2 = new JMenu("�༭");
		JMenu menu3 = new JMenu("��ͼ");
		JMenu menu4 = new JMenu("����");

		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);

		menu1.add(new JMenuItem("��"));
		menu1.add(new JMenuItem("����"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
