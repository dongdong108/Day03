package text08;

public class Text08 {
	
	public static void main(String[] args) {
		String str = "abcdefabhjlecababcab";
		String str1 = "ab";
		int count = 0;
		int start = 0;
		while (str.indexOf(str1, start) >= 0 && start < str.length()) {
			count++;
			start = str.indexOf(str1, start) + str1.length();
		}
		System.out.println(str1 + "在" + str + "出现的次数为" + count);
	}

}
