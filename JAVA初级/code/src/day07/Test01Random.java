package day07;

//获取1~n之间的随机数，包含n
import java.util.Random;
public class Test01Random {
    public static void main(String[] args){
     int n = 100;
     //创建对象
        Random r = new Random();
        //获取随机数
        int number = r.nextInt(n) + 1;
        //输出随机数
        System.out.println("number:"+ number);
    }
}
