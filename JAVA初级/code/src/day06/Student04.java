package day06;

public class Student04 {
    //成员变量
    //构造方法
    //无参数的构造方法 必须
    //有参数构造方法 建议
    //成员方法
    //getXxx
    //setXxx

    //成员变量
    private String name;
    private int age;
    //构造无参数方法 必须
    public Student04(){}
    //构造有参数方法 建议
    public Student04(String name,int age){
        this.name = name;
        this.age = age;
    }

    //成员方法


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
