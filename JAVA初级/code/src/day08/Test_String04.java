package day08;

public class Test_String04 {
    public static void main(String[] args){
        //创建字符串对象
        String s1 ="lambor";

        //char[] to charArray():把字符串转换为字符数组
        char[] chs = s1.toCharArray();
        for(int x=0;x < chs.length;x++){
            System.out.println(chs[x]);
        }
        System.out.println("------");

        //byte[] getByte():把字符串转换为字节数组
        byte[] bytes = s1.getBytes();
        for(int x =0;x < bytes.length;x++){
            System.out.println(bytes[x]);
        }
        System.out.println("----");

        //替换字母or为大写OR
        String replace = s1.replace("or","OR");
        System.out.println(replace);
        System.out.println("----");

    }
}
