package day07;

//导包
import java.util.Random;
public class Demo01_Random {
    public static void main(String[] args){
        //创建键盘录入数据的对象
        // 可以得到一个随机数
        Random r = new Random();
      /*  int i = r.nextInt();
        System.out.println(i);*/

      for(int i = 0;i<3;i++){
          //随机生成一个数据
          int number = r.nextInt(10);
          //输出数据
          System.out.println("number:"+number);
      }

    }
}
