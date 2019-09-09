package day07;

//导包
import java.util.Scanner;
public class Demo01_Scanner {
    public static  void main(String[] args){
        //创建键盘录入数据的对象
        //System.in系统输入是指通过键盘录入数据
        Scanner sc = new Scanner(System.in);

        //接受数据
        System.out.println("请录入一个整数");
        int i =sc.nextInt();
        //输出数据
        System.out.println("i："+i);
    }

}
