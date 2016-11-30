package text03;

import java.util.ArrayList;
import java.util.List;

/*古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？*/
public class Text03 {
	
	public static void main(String[] args) {
		//装兔子的对数的
        List<LittleRabbit> list = new ArrayList<>();
        list.add(new LittleRabbit());
        for (int k = 1; k <= 6; k++) {
            for (int j = 0; j < list.size(); j++) {
            	LittleRabbit rabbit = (LittleRabbit) list.get(j);
                int age = rabbit.getAge();
                System.out.println("第"+(j+1)+"对兔子的年龄"+age);
                if (age >= 3) {
                    list.add(new LittleRabbit());
                }
                age++;
                
                rabbit.setAge(age);
            }
            System.out.println("第" + k + "个月有" + list.size() + "对兔子，一共"+list.size()*2+"只。");
            System.out.println("----------------------------------------");
        }
    }

}
