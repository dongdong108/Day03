package text05;

/*Çó1+2!+3!+...+20!µÄºÍ*/
public class Text05 {
	public static void main(String[] args) {
	      int sum=0;
	      for (int i=1;i<=20;i++) {
	         int n=1;
	         for (int j=1;j<=i;j++) {
	            n*=j;
	         }
	         sum+=n;  
	      }
	      System.out.print("sum= "+sum+"\n");
	   }

}
