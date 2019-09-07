package day06;

public class Student01 {
    //private使用格式 private 数据类型 变量名；
    //使用private修饰成员变量
    private String name;
    private int age;
    //
    //提供getXxx/setXxx方法可以访问成员变量
    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

   /* public void setAge(int age) {
        age = a;
    }*/
    public int getAge(){
        return age;
    }
}
