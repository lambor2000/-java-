package day07;

//猜数小游戏 先生成0~100以内的随机数，系统提示大还是小了，直到玩家猜中
import java.io.InputStream;
import  java.util.Random;
import java.util.Scanner;

public class Test02_Random {
    public static void main(String[] args) {
        //系统产生一个1~100
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        while (true) {
            //键盘录入要猜的数据
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字（1-100）：");
            int guessNumber = sc.nextInt();

            //比较这两个数据
            if(guessNumber > number){
                System.out.println("你猜的数"+guessNumber+"大了");
            }else if(guessNumber < number){
                System.out.println("你猜的数"+guessNumber+"小了");
            }else{
                System.out.println("猜中了");
                break;
            }

        }
    }
}
