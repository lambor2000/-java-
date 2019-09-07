package day06;


public class Test01_Student {
    public static void main(String[] args){
        //创建对象格式：类名 对象名 = new 类名（）；
        Student s = new Student();
        System.out.println("S:"+s);// System.out.println("S:"+s);//

        //直接输出成员变量值
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);//null
        System.out.println("-----");//0

        //给成员变量赋值
        s.name = "lambor";
        s.age = 19;

        //再次输出成员变量的值
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);//
        System.out.println("-----");//

        //调用成员的方法
        s.study();
        s.eat();
    }

}
