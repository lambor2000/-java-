package day06;

public class Student03 {
    private String name;
    private int age;
    //无参数的构造方法
    //构造方法在写法上，方法名与他所在的类名相同。
    //它没有返回值，所以不需要返回值类型，甚至不需要使用void。
    public Student03(){}

    //有参数的构造方法
    public Student03(String name,int age){
        this.name = name;
        this.age = age;
    }
    //如果本身没有提供构造方法，系统也会给出无参数构造方法。
    //若是本身提供了构造方法，系统将不再提供无参数构造方法。
    //构造方法是可以重载的，既可以定义参数，也可以不定义参数。
}
