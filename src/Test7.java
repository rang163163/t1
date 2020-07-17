import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Test7 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        // ����һ�� JList ʵ��
        final JList<String> list = new JList<String>();

        // ����һ����ѡ��С
        list.setPreferredSize(new Dimension(200, 100));

        // ����ɼ�ϵĶ�ѡ
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // ����ѡ�����ݣ��ڲ����Զ���װ�� ListModel ��
        list.setListData(new String[]{"�㶫", "����", "�Ϻ�", "֣�� n"});

        // ���ѡ��ѡ��״̬���ı�ļ�����
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // ��ȡ���б�ѡ�е�ѡ������
                int[] indices = list.getSelectedIndices();
                // ��ȡѡ�����ݵ� ListModel
                ListModel<String> listModel = list.getModel();
                // ���ѡ�е�ѡ��
                for (int index : indices) {
                    System.out.println("ѡ��: " + index + " = " + listModel.getElementAt(index));
                }
                System.out.println();
            }
        });
        
        // ����Ĭ��ѡ����
        list.setSelectedIndex(1);

        // ��ӵ������������
        panel.add(list);

        jf.setContentPane(panel);
        jf.setVisible(true);
    }

}
