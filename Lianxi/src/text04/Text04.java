package text04;

import java.util.ArrayList;
import java.util.List;
/*有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？*/
public class Text04 {
	
	 public static void main(String[] args)  
	    {  
	        int n;  
	        int count=0;  
	        List v = new ArrayList<>(); 
	        //控制百位上的数
	        for(int i=1;i<=4;i++)  { 
	        	//控制十位上的数
	            for(int j=1;j<=4;j++)  {  
	            	//如果百位上的数和个位上的数不相等，就看个位上的数
	                if(i!=j)  {  
	                	//控制个位上的数
	                    for(int k=1;k<=4;k++)  {  
	                    	//判断个位上的数是否和十位上得数或百位上的数都不相同，就count++，并组合好的数加进集合
	                        if(i!=k&&j!=k)  {  
	                            n=i*100+j*10+k;  
	                            v.add(n);  
	                            count++;  
	                        }  
	                    }  
	                }  
	            }  
	        }  
	        System.out.println(count);  
	        System.out.println(v);  
	    }  

}
