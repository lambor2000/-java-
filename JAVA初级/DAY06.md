@[JAVA-DAY06|2019/09/07]
@[toc]
# 今日内容
## 面向对象
**对象**：现实中的一切事物，每种事物都具备自己的**属性**和**行为**

+ 区别面向过程，强调调用对象的行为实现功能，而非一步一步实现
+ 面向过程：(以吃饭为例)拿起勺子，挖一口，塞进嘴里，咀嚼，重复以上步骤直到吃完。`强调步骤`
+ 面向对象：勺子(吃饭)。`强调对象`

面向对象这一思想能将复杂的事情简单化，令我们从执行者变成了指挥者。它的三大基本特征，`封装`，`继承`和`多态`。


## 类与对象
### 类
**类**：一组相关**属性**和**行为**的集合。一类事物的模板。
**属性**：事物的状态。
**行为**：事物能够做什么。
比如狗，属性：名字，年龄，颜色。行为：叫，走，躺下。
**对象**：一类事物的具体体现。类的一个**实例**。
比如一条狗，属性：可卡，7岁，棕色。行为：跳脚，上扑，汪汪叫。
`类是对象的模板，抽象的；对象是类的实体，具体的`好比设计图和具体的实物。
>**类的定义**：
```java
public class Student {
    //成员变量
    String name;
    int age;
    //定义方法
    public void study(){
        System.out.println("好好学习将来养牛牛！");
    }
    public void eat(){
        System.out.println("吃饱了才有力气减肥");
    }
}
```
>**定义类**：定义成员变量和方法
>**成员变量**：在类中，方法外。
>**成员方法**：把static去掉
### 对象
创建对象：
>类名 对象名 = new 类名（）；

使用对象访问类中的成员：
>对象名.成员变量；
>对象名.成员方法();
>
```java
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
```
### 成员变量的默认值

||数据类型|默认值|
|:---|:---|:---|
|基本类型|整数(byte,short,int,long)|0|
||浮点数(float,double)|0.0|
||字符(char)|'\u0000'|
||布尔(boolean)|false|
|引用类型|数组，类，接口|null|

### 类与对象的练习
```java
//定义手机类
public class Phone {
    String brand;
    int price;
    String color;

    public void call(String name){
        System.out.println("记得给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("只给牛牛发短信");
    }
}
```


```java
public class Test02Phone {
    public static void main(String[] args){
        //创建对象
        Phone p =new Phone();
        //输出成员变量
        System.out.println("品牌："+p.brand);//null
        System.out.println("价格："+p.price);//0
        System.out.println("品牌："+p.color);//null
        System.out.println("------");

        //给成员变量赋值
        p.brand = "牛牛牌";
        p.price = 66666;
        p.color = "黑色劲牛";

        //再次输出成员变量
        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("品牌："+p.color);
        System.out.println("------");

        //调用方法
        p.call("牛牛");
        p.sendMessage();

    }
}
```
引用类型作为参数，传递的是地址值

### 成员变量和局部变量的区别
|区别|成员/全局变量|局部变量|
|:---|:----|:---|
|类中的位置|类中，方法外|方法中/方法声明上(形式参数)|
|作用范围不一样|类中|方法中|
|初始化值|有默认值|没有默认值。必须先定义，赋值，最后使用|
|内存中的位置不同|堆内存|栈内存|
|生命周期不同|随着对象存在|随着方法调用存在|
## 封装(encapsulation )
### 概述
- **封装**：可被认为是一个保护屏障，防止该类的代码和数据被其他类随意访问。
- **原则**：将属性隐藏起来，如果要访问某个属性，提供公共方法对其访问。
- **步骤**：使用`private`关键字修饰成员变量→对需要访问的成员变量提供一对`getXxx`、`setXxx`方法
### private关键字
**含义**：
1. 权限修饰符，代表最小权限
2. 可以修饰成员变量和成员方法
3. 被private修饰后的成员变量和成员方法，只有在本类才能访问。


**private使用格式**：
`private 数据类型 变量名；`

```java
public class Student {
    //private使用格式 private 数据类型 变量名；
    //使用private修饰成员变量
    private String name;
    private int age;
    //
    //提供getXxx/setXxx方法可以访问成员变量
    public void setName(String n){
        name = n;//形参名字并不符合见名知意的规定
   //若使用name=name(String name)则使成员变量名被隐藏无法被访问。this解决重名问题。
    }
    
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        age = a;
    }
    public int getAge(){
        return age;
    }
}
```


### 封装的优化
####  this关键字
**this**方法被哪个对象调用，this就表示谁。所在类的当前对象的引用(地址值)。

```java
public class Student02 {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```
方法中只有一个变量名时，默认也是使用`this`修饰，可省略不写

#### 构造方法
>- 所有类都有构造方法，因为java自动提供了一个无参数构造方法，一旦自己定义了构造方法，java自动提供的默认无参数构造方法就会失效。 
>- 当一个对象被创建的时候，构造方法用来初始化该对象，给对象的成员变量赋初始值
>`修饰符 构造方法名(参数列表){//方法体}`

```java
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
```
## 标准代码--JavaBean
`JavaBean`是一种标准规范，符合它的标准的类必须是具体的和公共的，并且具有无参数的构造方法，提供用来操作成员变量的set和get方法。

学生类定义
```java
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
```

**测试类定义**
```java
public class TestStudent04 {
    public static void main(String[] args){
        //无参数构造使用
        Student04 s = new Student04();
        s.setName("牛牛");
        s.setAge(22);
        System.out.println(s.getName()+"----"+s.getAge());

        //带参数构造使用
        Student04 m = new Student04("lambor",18);
        System.out.println(m.getName()+"----"+m.getAge());
    }
}
```