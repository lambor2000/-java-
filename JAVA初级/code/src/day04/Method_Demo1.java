package day04;

public class Method_Demo1 {
    //方法调用回顾
    //通过嵌套循环输出矩阵
    public static void main(String[] args){
        print();
    }
    private static void print(){
        for(int i = 0; i< 5 ;i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
