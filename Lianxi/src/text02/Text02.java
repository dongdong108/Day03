package text02;

import java.util.Scanner;
/*
 * ����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ���*/
public class Text02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0;// ��ĸ
		int a2 = 0;// ����
		int a3 = 0;// �ո�
		int a4 = 0;// ����

		// �������ַ���
		Scanner scanner = new Scanner(System.in);
		// �õ�������ַ���
		String str = scanner.nextLine();
		char[] cs = str.toCharArray();
		for (char c : cs) {
			if (c >= 65 && c <= 90||c>=97&&c<=122) {
				a1++;
			} else if (c >= 48 && c <= 57) {
				a2++;
			} else if (c == 32) {
				a3++;
			} else {
				a4++;
			}
		}
		System.out.println("���ַ�������ĸ����Ϊ" + a1 + "��,���ָ���Ϊ:" + a2 + "��,�ո�Ϊ:" + a3
				+ "��,�����ַ�Ϊ:" + a4 + "��!");		

	}

}
