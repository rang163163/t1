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
		jimage.setBounds(10, 10, 200, 250);

		leftPanel.add(jimage);
		frame.add(centerPanel);
		JLabel j1 = new JLabel("学号：");
		JLabel j2 = new JLabel("姓名：");
		JLabel jj1 = new JLabel("性别：");
		JLabel j3 = new JLabel("年龄：");
		JLabel j4 = new JLabel("手机：");
		JLabel j5 = new JLabel("住址：");

		JRadioButton radio1 = new JRadioButton("男", true);

		JRadioButton radio2 = new JRadioButton("女", false);
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		JTextField jt1 = new JTextField(10);
		JTextField jt2 = new JTextField(10);
		JTextField jt3 = new JTextField(10);
		JTextField jt4 = new JTextField(10);
		JTextField jt5 = new JTextField(10);
		JButton jb1 = new JButton("添加图片");
		JButton jb2 = new JButton("增加记录");
		JButton jb3 = new JButton("修改记录");
		JButton jb4 = new JButton("删除记录");
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

		JMenu menu1 = new JMenu("文件");
		JMenu menu1 = new JMenu("文件");
		JMenu menu2 = new JMenu("编辑");
		JMenu menu3 = new JMenu("视图");
		JMenu menu4 = new JMenu("帮助");

		menuBar.add(menu1);
		menuBar.add(menu2);
		menuBar.add(menu3);
		menuBar.add(menu4);

		menu1.add(new JMenuItem("打开"));
		menu1.add(new JMenuItem("保存"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
