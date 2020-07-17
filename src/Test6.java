
import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Test6 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(250, 250);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // ���һ����ǩ
        JLabel label = new JLabel("ˮ����");
        panel.add(label);

        // ��Ҫѡ�����Ŀ
        String[] listData = new String[]{"�㽶", "ѩ��", "ƻ��", "��֦"};

        // ����һ�������б��
        final JComboBox<String> comboBox = new JComboBox<String>(listData);

        // �����Ŀѡ��״̬�ı�ļ�����
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // ֻ����ѡ�е�״̬
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("ѡ��: " + comboBox.getSelectedIndex() + " = " + comboBox.getSelectedItem());
                }
            }
        });

        // ����Ĭ��ѡ�е���Ŀ
        comboBox.setSelectedIndex(2);

        // ��ӵ��������
        panel.add(comboBox);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}
