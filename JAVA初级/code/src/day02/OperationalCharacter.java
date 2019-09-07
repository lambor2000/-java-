package day02;

public class OperationalCharacter {
    public static void main(String[] args){
        //++a
        int a =1;
        int b = ++a;
        System.out.println(a);//2
        System.out.println(b);//2
        //a++
        int n = 1;
        int m = n++;
        System.out.println(n);//2
        System.out.println(m);//1

        //+在遇上字符串的时候表示拼接的含义
        System.out.println("5+5="+5+5);//55

        //赋值运算符，就是将符号右边的值赋给左边的变量
        int s =5;
        s+=5;//s先自加5再赋值变量
        System.out.println(s);//10

        //比较运算符
        System.out.println(1==1);//true
        System.out.println(1<2);//true
        System.out.println(3>4);//false
        System.out.println(3<=4);//true
        System.out.println(3>=4);//false
        System.out.println(3!=4);//true
        System.out.println("------");

        //逻辑运算符
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false，右边不计算

        System.out.println(false||false);//false
        System.out.println(false||true);//true
        System.out.println(true||false);//true,右边不计
        System.out.println(!false);//true

        //三元运算符格式
        int y =(1==2?100:200);
        System.out.println(y);//200
        int x =(3<=4?500:600);
        System.out.println(x);//500

    }
}
