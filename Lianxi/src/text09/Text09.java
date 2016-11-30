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
        System.out.println("初始化编号为" + mans + "的" + mans.size() + "个人围成一圈");
 
        ListIterator<Integer> iter = null;
        int k = 1;
        do {
            iter = mans.listIterator();
            while (iter.hasNext()) {
                int i = iter.next();
                if (k++ % flag == 0) {
                    System.out.println("编号" + i + "的人退出圈子");
                    iter.remove();
                    k = 1;
                }
            }
        } while (mans.size() > 1);
 
        System.out.println("剩下编号为" + mans + "的" + mans.size() + "个人");
    }

}
