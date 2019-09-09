package day08;

public class Test_String01 {
    //字符串不变：字符串的值在创建后不能被更改
    public static void main(String[] args){
     String s1 = "abc";
     s1 += "d";//字符串的拼接
     System.out.println(s1);
     //内存中有"abc","abcd"两个对象，s1从指向”abc“改变指向指向了"abcd"

        // 因为String对象是不可变的，所以它们可以被共享
        String s2 ="abc";
        //内存中只有一个”abc“对象被创建，同时可以被s1和s2共享
        System.out.println(s2);//abc

        //"abc"等效于”char[] data={'a','b','c'}“
        String str = "lambor";
        char data[] ={'l','a','m','b','o','r'};
        String str3 = new String(data);
        //String 底层是靠字符数组实现的
        System.out.println(str);
        System.out.println(str3);

        //无参构造
        String str6 = new String();//空
        //通过字符数组构造
        char chars[] = {'a','b','c'};
        String str7 = new String(chars);//abc
        //通过字节数组构造
        byte bytes[] = {97,98,99};
        String str8 = new String(bytes);//abc
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str8);

    }
}
