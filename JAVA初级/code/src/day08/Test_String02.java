package day08;

//判断功能的方法
public class Test_String02 {
    public static void main(String[] args){
        //创建字符串对象
        String s1 ="lambor";
        String s2 ="lambor";
        String s3 ="LAMBOR";

        //boolean equals(Object obj):比较字符串的内容是否相同
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println("----");

        //boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println("-----");
    }
}
