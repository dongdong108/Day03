package text09;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Text09 {
	
	public static void main(String[] args) {
        final int n = 10;
        final int flag = 3;
 
        List<Integer> mans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            mans.add(i + 1);
        }
        System.out.println("��ʼ�����Ϊ" + mans + "��" + mans.size() + "����Χ��һȦ");
 
        ListIterator<Integer> iter = null;
        int k = 1;
        do {
            iter = mans.listIterator();
            while (iter.hasNext()) {
                int i = iter.next();
                if (k++ % flag == 0) {
                    System.out.println("���" + i + "�����˳�Ȧ��");
                    iter.remove();
                    k = 1;
                }
            }
        } while (mans.size() > 1);
 
        System.out.println("ʣ�±��Ϊ" + mans + "��" + mans.size() + "����");
    }

}
