package text02;

import java.util.Scanner;
/*
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数*/
public class Text02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 0;// 字母
		int a2 = 0;// 数字
		int a3 = 0;// 空格
		int a4 = 0;// 其他

		// 请输入字符串
		Scanner scanner = new Scanner(System.in);
		// 得到输入的字符串
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
		System.out.println("该字符串中字母个数为" + a1 + "个,数字个数为:" + a2 + "个,空格为:" + a3
				+ "个,其他字符为:" + a4 + "个!");		

	}

}
