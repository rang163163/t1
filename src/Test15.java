import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Test15 {
	public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(200, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon image=new ImageIcon("./src/1.png");
        image.setImage(image.getImage().getScaledInstance(300, 100, Image.SCALE_AREA_AVERAGING));
       
        JLabel jmage=new JLabel(image);
        JPanel panel = new JPanel();
        JPanel pane2 = new JPanel();
        jmage.setBounds(0, 0,300,100);
        panel.setLayout(null);
        pane2.setLayout(null);
        panel.setPreferredSize(new Dimension(100,200));
        pane2.setPreferredSize(new Dimension(0,100));
         JButton j1=new JButton();
         j1.setBounds(0, 50, 30,15);
         panel.add(j1);
         panel.add(jmage);
        // ����һ�����飬��Сֵ�����ֵ����ʼֵ �ֱ�Ϊ 0��20��10
        final JSlider slider = new JSlider(0, 20, 0);
        slider.setBounds(0, 100, 200,90);
        // �������̶ȼ��
        slider.setMajorTickSpacing(5);
        
        // ���ôο̶ȼ��
        slider.setMinorTickSpacing(1);

        // ���� �̶� �� ��ǩ
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // ��ӿ̶ȸı������
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("��ǰֵ: " + slider.getValue());
                int x= slider.getValue();
                        j1.setBounds(9*x, 51, 25, 12);
            }
        });

        // ��ӻ��鵽�������
        panel.add(slider);
        //jf.add(pane2,new BorderLayout().SOUTH);
        jf.add(panel,new BorderLayout().NORTH);
       jf.setContentPane(panel);
        jf.setVisible(true);

    }


}
