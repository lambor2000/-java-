package day02;

public class AdditionalPractice {
    public static void main(String[] args){
        short s = 1;
        s+=1;
        System.out.println(s);
        //s+=1就是s=(short)(s+1)
        //+=是一个运算符，只运行一次，没有强制转换的意思

        byte b1 =1;
        byte b2 =2;
        byte b3 =1+2;
        byte b4 = (byte)(b1+b2);//从int转换成byte会有缺失
        System.out.println(b3);
        System.out.println(b4);
    }
}
