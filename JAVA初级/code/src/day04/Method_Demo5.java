package day04;
//实现不定次数的打印
public class Method_Demo5 {

    public static void main(String[] args){
        //调用方法printHelloWorld,传递整数
        printHelloWorld(2);
    }
    public static void printHelloWorld(int n){
        for (int i = 0;i<n;i++){
            System.out.println("HelloWorld!");
        }
    }
}
