package text03;

import java.util.ArrayList;
import java.util.List;

/*�ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ���������Ϊ���٣�*/
public class Text03 {
	
	public static void main(String[] args) {
		//װ���ӵĶ�����
        List<LittleRabbit> list = new ArrayList<>();
        list.add(new LittleRabbit());
        for (int k = 1; k <= 6; k++) {
            for (int j = 0; j < list.size(); j++) {
            	LittleRabbit rabbit = (LittleRabbit) list.get(j);
                int age = rabbit.getAge();
                System.out.println("��"+(j+1)+"�����ӵ�����"+age);
                if (age >= 3) {
                    list.add(new LittleRabbit());
                }
                age++;
                
                rabbit.setAge(age);
            }
            System.out.println("��" + k + "������" + list.size() + "�����ӣ�һ��"+list.size()*2+"ֻ��");
            System.out.println("----------------------------------------");
        }
    }

}
