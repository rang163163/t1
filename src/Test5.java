
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Test5 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(250, 250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // �������ذ�ť
        JToggleButton toggleBtn = new JToggleButton("����");

        // ��� toggleBtn ��״̬���ı�ļ���
        toggleBtn.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // ��ȡ�¼�Դ�������ذ�ť����
                JToggleButton toggleBtn = (JToggleButton) e.getSource();
                System.out.println(toggleBtn.getText() + " �Ƿ�ѡ��: " + toggleBtn.isSelected());
            }
        });

        panel.add(toggleBtn);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}


