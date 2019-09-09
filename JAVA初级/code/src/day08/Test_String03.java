package day08;

public class Test_String03 {
    public static void main(String[] args){
        //创建字符串对象
        String s1 = "Hello Lambor!";

        //int length():获取字符串长度，及字符个数
        System.out.println(s1.length());
        System.out.println("-----");

        //String concat(String str):
        //将指定的字符串连接到该字符串的末尾
        String s2 = "牛牛要去哪里？";
        String s3 = s2.concat("  牛牛要回家");
        System.out.println(s3);
        System.out.println("-----");

        //char charAt(int index):获取指定索引处的字符
        System.out.println(s2.charAt(0));//[0,n)
        System.out.println(s2.charAt(4));
        System.out.println("-----");

        //int indexOf(String str):获取str在字符串对象中第一次出现的索引
        //没有返回-1
        System.out.println(s3.indexOf("回"));
        System.out.println(s3.indexOf("牛牛"));
        System.out.println(s3.indexOf("牛去"));
        System.out.println("-----");

        //String substring(int start):从start开始截取字符串到字符串结尾
        System.out.println(s3.substring(0));
        System.out.println(s3.substring(5));
        System.out.println("-----");

        //String substring (int start,int end):
        // 从start到end截取字符串，包含start,不含end
        System.out.println(s3.substring(0,s3.length()));
        System.out.println(s3.substring(3,8));

    }

}

