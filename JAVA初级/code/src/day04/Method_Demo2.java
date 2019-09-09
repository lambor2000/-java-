package day04;

public class Method_Demo2 {
    //定义方法实现两个整数的求和计算
    //明确返回值类型：整数
    //明确参数列表 参数列表可以定义两个int类型
    public static void main(String[] args){
        //调用方法getSum,传递两个整数。
        //传递的实际数据又称为实际参数
        //接收方法计算后的结果，返回值
        int sum = getSum(5,6);
        System.out.println(sum);
    }
    /*
    定义计算两个整数的方法
    返回值类型，计算结果是int
    参数：不确定数据求和，定义int参数，参数又称为形式参数
    */

    public static int getSum(int a,int b){
        return a+b;
    }
}
