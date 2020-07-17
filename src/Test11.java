import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Test11 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(null);  //取消默认布局
		JLabel jl=new JLabel("用户名");
		JTextField jt=new JTextField("123");
		jt.setBounds(200, 60, 100, 20);
		jl.setBounds(150, 60, 100, 20);
		JButton btn = new JButton("按钮");
		btn.setBounds(150, 30, 100, 20); //（x,y,width,height）
		frame.add(btn);
		frame.add(jt);
		frame.add(jl);
		frame.setVisible(true);
		System.out.println("123");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
}
