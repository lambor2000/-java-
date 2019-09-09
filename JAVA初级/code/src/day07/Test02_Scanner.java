package day07;

//键盘录入三个数据并获得最大值
import java.util.Scanner;
public class Test02_Scanner {
        public static void main(String[] args){
         //创建对象
         Scanner sc = new Scanner(System.in);
         //接收数据
            System.out.println("请输入第一个数据");
            int a = sc.nextInt();
            System.out.println("请输入第二个数据");
            int b = sc.nextInt();
            System.out.println("请输入第三个数据");
            int c = sc.nextInt();
            //如何获取三个数据的最大值
            int temp = (a>b?a:b);
            int max =(temp>c?temp:c);
            System.out.println("max:"+max);
        }
}
