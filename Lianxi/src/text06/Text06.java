package text06;

public class Text06 {
	 public static void main(String[] args){
	        for (int i = 10000; i < 99999; i++){
	            if (String.valueOf(i).equalsIgnoreCase(String.valueOf(palindrome(i)))){
	                System.out.println(i + "是回文数.");
	            }
	        }
	 }
	 /**
	 * 得到一个数的倒序
	 */
	 static int palindrome(int number){
	     String numberString = String.valueOf(number);
	     StringBuffer stringBuffer = new StringBuffer(numberString);
	     return Integer.valueOf(stringBuffer.reverse().toString());
	 }    

}
