package day02;

public class TypeCast {
    //TypeCast类型转换
    public static  void  main(String[] args){
        int i = 1;
        byte b= 2;
        //byte x = b + i;//报错
        //int类型和byte类型运算，结果是int型
        int j= b + i;
        System.out.println(j);
        /*byte类型占内存一个字节，和int类型运算时会提升为int类型，自动补充三个字节，结果为int型*/

        //同理，当一个int类型和一个double类型的变量运算时,int类型会自动提升为double类型
        //int类型4个字节，double类型有8个字节
        int m = 1;
        double d = 2.5;
        double n = m + d;
        System.out.println(n);

        //强制转换
        //short类型，内存占2个字节
        short s = 1;
//        s和1做运算时,1为int型，s会被提升为int类型，结果赋值时会编译错误
//        short内存占2个字节，int类型占4个字节
//        必须将int强制转换成short才能完成赋值
//        强制转换只能将`取值范围类型大`的转换成`取值范围小`的
        //s = s + 1;//编译失败
        s =(short)(s+1);
        System.out.println(s);

    }
}
