


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Test4 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(250, 250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // ������ѡ��
        JCheckBox checkBox01 = new JCheckBox("����");
        JCheckBox checkBox02 = new JCheckBox("�Ϻ�");
        JCheckBox checkBox03 = new JCheckBox("����");
        

        // ��ӵ�һ����ѡ���״̬���ı�ļ�����������ѡ�������Ҫ����״̬�ı䣬��ɰ��˷�����Ӽ�����
        
        checkBox01.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // ��ȡ�¼�Դ������ѡ����
                JCheckBox checkBox = (JCheckBox) e.getSource();
                System.out.println(checkBox.getText() + " �Ƿ�ѡ��: " + checkBox.isSelected());
            }
        });

        // ����Ĭ�ϵ�һ����ѡ��ѡ��
        checkBox01.setSelected(true);

        panel.add(checkBox01);
        panel.add(checkBox02);
        panel.add(checkBox03);
       

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}

