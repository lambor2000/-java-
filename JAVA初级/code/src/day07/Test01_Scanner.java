package day07;


//从键盘中录入两个数据求和
import java.util.Scanner;
public class Test01_Scanner {
    public static void main(String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b =sc.nextInt();
        //求和
        int sum = a + b;
        System.out.println("sum:"+sum);
    }
}
