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
    	JFrame jf = new JFrame("���Դ���");
        jf.setSize(300,170);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
        JPanel panel = new JPanel();
       panel.setPreferredSize(new Dimension(0,300));
       

      
        panel.setLayout(null);
        ImageIcon image=new ImageIcon("./src/open.gif");
        image.setImage(image.getImage().getScaledInstance(300, 100, Image.SCALE_AREA_AVERAGING));
       
        JLabel jmage=new JLabel(image);
        JLabel jmage1=new JLabel("���ڵ�½..");
        jmage1.setBounds(40,90, 70, 50);

        jmage.setBounds(0, 0,300,100);
          panel.add(jmage);
          panel.add(jmage1);
          jf.setResizable(false);
          jf.setUndecorated(true);
        jf.add(panel,new BorderLayout().NORTH);
        jf.setVisible(true);
        // ����һ��������
        final JProgressBar progressBar = new JProgressBar();
       
		
        // ���ý��ȵ� ��Сֵ �� ���ֵ
        progressBar.setMinimum(MIN_PROGRESS);
        progressBar.setMaximum(MAX_PROGRESS);
        progressBar.setBounds(0,100 , 300,40);
       progressBar.setBackground(Color.cyan);
       progressBar.setFont(new Font("����",Font.ITALIC,30));
        Thread t1=new Thread();
        int i=0;
    	while( i<=100){
    		currentProgress++;
         
         t1.sleep(10);
         { 
        	i+=1; 
        	if(i%2==0)
        	 {jmage1.setText("��½��.."+"....");
        	// jmage1.setFont(new Font("����",Font.BOLD,12));
        	 }
        	else
        		jmage1.setText("��½��..");
        	 jmage1.setBackground(Color.black);
        	   if(i==101){
              	 jmage1.setText("��½�ɹ�");
              	t1.sleep(3000);{
              		jf.dispose();
              		break;
              	}
              	 
               }}
      
        // ���õ�ǰ����ֵ
        progressBar.setValue(currentProgress);

        // ���ưٷֱ��ı����������м���ʾ�İٷ�����
        progressBar.setStringPainted(true);

        // ��ӽ��ȸı�֪ͨ
        /*progressBar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("��ǰ����ֵ: " + progressBar.getValue() + "; " +
                        "���Ȱٷֱ�: " + progressBar.getPercentComplete());
            }
        });*/

        // ��ӵ��������
        panel.add(progressBar);
       
        jf.setContentPane(panel);
        
       
     
        jf.setVisible(true);
        // ģ����ʱ��������, ÿ�� 0.5 ����½���
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