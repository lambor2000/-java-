package day02;

public class Invoke {
    //方法调用练习
    public static void main(String[] args){
        //定义调用的方法
        method();
        operator();
    }

//定义方法，被main方法调用
    public static void method(){
        System.out.println("lambor定义的方法，需要被main调用运行");
    }
//定义方法，方法定义三元运算符
    public  static void operator(){
        int i = 0;//operator运算
        i = (1==2 ? 100:200);
        System.out.println(i);
        int j = 0;
        j = (3<=4? 500:600);
        System.out.println(j);

    }
}