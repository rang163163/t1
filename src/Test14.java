import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Test14 {
	private static final int MIN_PROGRESS = 0;
    private static final int MAX_PROGRESS = 100;

    private static int currentProgress = MIN_PROGRESS;

    public static void main(String[] args) throws InterruptedException {
    	JFrame jf = new JFrame("测试窗口");
        jf.setSize(300,170);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        JPanel panel = new JPanel();
       panel.setPreferredSize(new Dimension(0,300));
       

      
        panel.setLayout(null);
        ImageIcon image=new ImageIcon("./src/open.gif");
        image.setImage(image.getImage().getScaledInstance(300, 100, Image.SCALE_AREA_AVERAGING));
       
        JLabel jmage=new JLabel(image);
        JLabel jmage1=new JLabel("正在登陆..");
        jmage1.setBounds(40,90, 70, 50);

        jmage.setBounds(0, 0,300,100);
          panel.add(jmage);
          panel.add(jmage1);
          jf.setResizable(false);
          jf.setUndecorated(true);
        jf.add(panel,new BorderLayout().NORTH);
        jf.setVisible(true);
        // 创建一个进度条
        final JProgressBar progressBar = new JProgressBar();
       
		
        // 设置进度的 最小值 和 最大值
        progressBar.setMinimum(MIN_PROGRESS);
        progressBar.setMaximum(MAX_PROGRESS);
        progressBar.setBounds(0,100 , 300,40);
       progressBar.setBackground(Color.cyan);
       progressBar.setFont(new Font("宋体",Font.ITALIC,30));
        Thread t1=new Thread();
        int i=0;
    	while( i<=100){
    		currentProgress++;
         
         t1.sleep(10);
         { 
        	i+=1; 
        	if(i%2==0)
        	 {jmage1.setText("登陆中.."+"....");
        	// jmage1.setFont(new Font("黑体",Font.BOLD,12));
        	 }
        	else
        		jmage1.setText("登陆中..");
        	 jmage1.setBackground(Color.black);
        	   if(i==101){
              	 jmage1.setText("登陆成功");
              	t1.sleep(3000);{
              		jf.dispose();
              		break;
              	}
              	 
               }}
      
        // 设置当前进度值
        progressBar.setValue(currentProgress);

        // 绘制百分比文本（进度条中间显示的百分数）
        progressBar.setStringPainted(true);

        // 添加进度改变通知
        /*progressBar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("当前进度值: " + progressBar.getValue() + "; " +
                        "进度百分比: " + progressBar.getPercentComplete());
            }
        });*/

        // 添加到内容面板
        panel.add(progressBar);
       
        jf.setContentPane(panel);
        
       
     
        jf.setVisible(true);
        // 模拟延时操作进度, 每隔 0.5 秒更新进度
       /* new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentProgress++;
                if (currentProgress > MAX_PROGRESS) {
                    currentProgress = MIN_PROGRESS;
                }
                progressBar.setValue(currentProgress);
            }
        }).start();*/

    }

}
}