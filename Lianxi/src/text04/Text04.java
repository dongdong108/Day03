package text04;

import java.util.ArrayList;
import java.util.List;
/*��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�*/
public class Text04 {
	
	 public static void main(String[] args)  
	    {  
	        int n;  
	        int count=0;  
	        List v = new ArrayList<>(); 
	        //���ư�λ�ϵ���
	        for(int i=1;i<=4;i++)  { 
	        	//����ʮλ�ϵ���
	            for(int j=1;j<=4;j++)  {  
	            	//�����λ�ϵ����͸�λ�ϵ�������ȣ��Ϳ���λ�ϵ���
	                if(i!=j)  {  
	                	//���Ƹ�λ�ϵ���
	                    for(int k=1;k<=4;k++)  {  
	                    	//�жϸ�λ�ϵ����Ƿ��ʮλ�ϵ������λ�ϵ���������ͬ����count++������Ϻõ����ӽ�����
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
