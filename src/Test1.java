import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Test1 {

	public static void main(String[] args) {
		System.out.println("222223");
		System.out.println("2asdasd22223");
		
		
		JFrame frame =new JFrame();
		frame.setLocation(200,200);
		frame.setSize(1000, 800);
		frame.setBackground(Color.blue);
		frame.setLayout(new FlowLayout());
		Container conn=frame.getContentPane();
		//conn.setBackground(Color.blue);
		
		
		JLabel lab1=new JLabel("�û�����");
		conn.add(lab1);
		
		JLabel jab2=new JLabel(new ImageIcon("./src/open.gif"));
		conn.add(jab2);
		JTextField userName = new JTextField(5);    
		//JTextField userName = new JTextField("YTS");   
		//JTextField userName = new JTextField();
		userName.setText("yts");
		System.out.println(userName.getText());    
		conn.add(userName);
		JTextArea textArea1 = new JTextArea(8,8); 
		textArea1.setText("ssss");
		textArea1.append("tttt"); 
		conn.add(textArea1);
		JButton button = new JButton("��ť");
		JButton button2= new JButton("��ť");
		System.out.println("123");
		JButton image = new JButton(new ImageIcon("./src/open.gif"));
		conn.add(button);
		//conn.add(image);
		JCheckBox checkbox1 = new JCheckBox("����",true);
		JCheckBox checkbox2 = new JCheckBox("�ֻ�");
		System.out.println(checkbox1.getText());
		conn.add(checkbox1);
		conn.add(checkbox2);
		JRadioButton radio1 = new JRadioButton("��",true);
		conn.add(radio1);
		JRadioButton radio2 = new JRadioButton("Ů",false);
		conn.add(radio2);
		String [] items ={"����","�Ϻ�","�㶫"};
		JComboBox<String> sel = new JComboBox<String>(items);
		sel.setPreferredSize(new Dimension(200, 20));
		sel.addItem("֣��");
		sel.setSelectedIndex(3);  
		System.out.println(sel.getSelectedItem());
		conn.add(sel);
		/*String [] colName1= {"����","�Ա�","��ѧ���","��ҵ���"}; 
		String [][]  rowData = {{"Ԭ��ʥ","��","2018","2022"},{"Ԭ��ʥ","��","2018","2022"},{"Ԭ��ʥ","��","2018","2022"}};  
		JTable table = new JTable(rowData,colName1);
		conn.add(table);*/
		String [] colName1= {"����","�Ա�","��ѧ���","��ҵ���"}; 
		DefaultTableModel dt = new DefaultTableModel(colName1,0);
		dt.addRow(new String[]{"Ԭ��ʥ","��","2018","2022"});
		dt.addRow(new String[]{"Ԭ��ʥ","��","2018","2022"});
		dt.addRow(new String[]{"Ԭ��ʥ","��","2018","2022"});
		dt.addRow(new String[]{"Ԭ��ʥ","��","2018","2022"});
		JTable table = new JTable(dt);
		table.setRowHeight(50);
		JScrollPane jp = new JScrollPane(table);   
		jp.setPreferredSize(new Dimension(400, 200)); 
		frame.add(jp);  
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu1 = new JMenu("�ļ�"); 
		JMenu menu2 = new JMenu("�˳�");
		
		menuBar.add(menu1);
		menuBar.add(menu2);
		
		menu1.add(new JMenuItem("��")); 
		menu1.add(new JMenuItem("����")); 
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
