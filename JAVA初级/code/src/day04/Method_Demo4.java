package day04;

public class Method_Demo4 {
    public static void main(String[] args){
        //整数求和1~100调用方法getSum
        //接受方法计算后的结果，整数
        int sum = getSum();
        System.out.println(sum);
    }
    public static int getSum(){
        int sum = 0;
        for(int i =1;i<=100;i++){
            sum =sum +i;
        }
        return sum;
    }
}
