@[JAVA-DAY02][2019/09/07|11:35]
# 今日内容 
## 数据类型的转换
java程序中参与计算的数据，必须要保持数据类型一致，若数据类型不一致将发生类型的转换。
### [1] 数据类型的自动转换
>int i=1;
>byte b=2;//两数相加，运算结果变量的类型是`int`型。byte=1byte,int=4byte

**自动转换**就是将`取值范围小`的类型自动提升为`取值范围大`的类型
```java
public class TypeCast {
    //TypeCast类型转换
    public static  void  main(String[] args){
        int i = 1;
        byte b= 2;
        //byte x = b + i;//报错
        //int类型和byte类型运算，结果是int型
        int j= b + i;
        System.out.println(j);
        //byte类型占内存一个字节，和int类型运算时会提升为int类型，自动补充三个字节，结果为int型
        
        //同理，当一个int类型和一个double类型的变量运算时,int类型会自动提升为double类型
        //int类型4个字节，double类型有8个字节
        int m = 1;
        double d = 2.5;
        double n = m + d;
        System.out.println(n);

    }
}
```
**转换规则**
范围小的类型向范围大的类型提升，`byte、short、char`运算时直接提升为`int`
>**byte1、short2、char2**-->int4-->long8-->float4-->double8
>[各数据类型字节数表格](https://blog.csdn.net/qq_40892702/article/details/100579625)

### [2] 数据类型的强制转换
**强制转换**：将`取值范围大的类型`强制转换成`取值范围小的类型`，自动转换是java执行的，而强制转化需要自己动手
`转换格式：数据类型 变量名 =（数据类型）被转数据值；`
> int i = 1.5;//错误，double内存8个字节，int内存4个字节
> //`double类型强制转成int类型，直接去掉小数点`
> int i =(int)1.5;//注意要写()
```java
 public static  void  main(String[] args){
        //强制转换
        //short类型，内存占2个字节
        short s = 1;
       /* s和1做运算时,1为int型，s会被提升为int类型，结果赋值时会编译错误
     	short内存占2个字节，int类型占4个字节
  		必须将int强制转换成short才能完成赋值
         强制转换只能将取值范围类型大的转换成取值范围小的*/
        //s = s + 1;编译失败
        s =(short)(s+1);
        System.out.println(s);//s=2
    }
}
```
**注意事项**：
- 浮点转换成整数，直接取消小数点，可能会造成数据精度损失
- int强制转成short砍掉两个字节，可能会造成数据丢失，会出现不确定的结果
##  ASCII编码表
- **编码表**：将人类文字和一个十进制数进行对应组成的表格。为了让计算机识别人类文字。

- american standard code for information interchange **美国标准信息交换码**：`将所有英文字母，数字，符号和十进制进行对应
`

|字符|数值|
|:---|:---|
|0|48|
|9|57|
|A|65|
|Z|90|
|a|97|
|z|122|


### int和char类型运算原理
- char类型和int类型计算过程中,char类型先查询编码表得到常数，再求和。char内存2个字节，int类型4个字节，char类型提升为int型。
## 运算符
### 算数运算符

|+|加,字符串连接运算|
|:---|:---|
|-|减|
|*|乘|
|/|除|
|%|取模，两数相除取余|
|++、--|自增自减|


- 整数使用以上运算符不会得到小数
- ·`++`自增1，`--``自减
- ++i，i++在独立运算中没有没有区别；在混合运算中，`++i`先自加，再运算。`i++`,先运算，再自加。

```java
public class OperationalCharacter {
    public static void main(String[] args){
        //++a
        int a =1;
        int b = ++a;
        System.out.println(a);//2
        System.out.println(b);//2
        //a++
        int n = 1;
        int m = n++;
        System.out.println(n);//2
        System.out.println(m);//1

    }
}
```
- `+`号在遇上字符串的时候表示**拼接**
- “a”+"b"="ab"
- > System.out.println("5+5="+5+5);//55

### 赋值运算符
就是将符号右边的值赋给左边的变量
**先做运算，再赋值变量**


|=|等于号|
|:--|:--|
|+=|加等于|
|-=|减等于|
|*=|乘等于|
|/=|除等于|
|%=|取模等|


>int s =5;
        s+=5;//s先自加5再赋值变量
        System.out.println(s);//10

### 比较运算符


|==|两边数值相等，true|
|:---|:---|
|<|左小右，true|
|>|左大右，true|
|<=|左小等右，true|
|>=|左大等右，true|
|!=|两边数值不相等,true|


`比较运算符是两个数据间进行比较，运算结果都是布尔值true或false`

```java
//比较运算符
        System.out.println(1==1);//true
        System.out.println(1<2);//true
        System.out.println(3>4);//false
        System.out.println(3<=4);//true
        System.out.println(3>=4);//false
        System.out.println(3!=4);//true

```

### 逻辑运算符


|&&短路与|两边是true,true;一边false,结果为false;`短路特点：符号左边是false，右边不再运算`|
|:--|:--|
|`||`短路或|两边都是false,false;一边是ture，ture;`短路特点：符号左边是ture，右边不再运算`|
|!取反|！true,→false;!false→true|


- 逻辑运算符：用来连接两个布尔类型的运算符，运算结果是布尔值true或false.


```java
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&true);//false，右边不计算

        System.out.println(false||false);//false
        System.out.println(false||true);//true
        System.out.println(true||false);//true,右边不计
        System.out.println(!false);//true
```
### 三元运算符的格式和计算结果
>数据类型 变量名 =布尔类型表达式？结果1：结果2
>true赋值结果1；false赋值结果2
```java
        int y =(1==2?100:200);
        System.out.println(y);//200
        int x =(3<=4?500:600);
        System.out.println(x);//500
```

## 方法的概念
**方法**：将一个功能抽取出来。代码单独定义在一个大括号内，形成一个单独的功能。需要这个功能时，再进行调用。
```java
修饰符 返回值类型 方法名（参数列表）{
		代码...
		return;
}
```
**目前固定写法**

 - 修饰符：`public static` 
 - 返回值类型：`void `
 - 方法名：自定义，满足标识符规范，用来调用方法
 - 
   return:方法结束。返回值为void时，return可以不写
  ```java
   public static void methodName(){
             System.out.println("我是一个方法")
    }
  ```

### 方法调用
- 在主方法中写需要调用的方法名即可。
- 方法定义注意事项：方法不能定义在另一个方法里；方法必须定义在一类中方法外
- class为类，类中，main方法外可定义方法

```java
public class Invoke {
    //方法调用练习
    public static void main(String[] args){
        //定义调用的方法
        method();
        operator();
    }

//定义方法，被main方法调用
    public static void method(){
        System.out.println("lambor定义的方法，需要被main调用运行");
    }
//定义方法，方法定义三元运算符
    public  static void operator(){
        int i = 0;//operator运算
        i = (1==2 ? 100:200);
        System.out.println(i);
        int j = 0;
        j = (3<=4? 500:600);
        System.out.println(j);
        
    }
}
```

### JShell脚本工具
适合片段代码的测试，代码特别少，不愿意编写类，main方法的时候。DOS命令行直接输入jShell命令启动。

## 拓展内容
**+=的扩展**
```java

public class AdditionalPractice {
    public static void main(String[] args){
        short s = 1;
        s+=1;
        System.out.println(s);
        //s+=1就是s=(short)(s+1)
        //+=是一个运算符，只运行一次，没有强制转换的意思
    }
}
```
**变量与常量的扩展**
```java
        byte b1 =1;
        byte b2 =2;
        byte b3 =1+2;
        byte b4 = b1+b2;//从int转换成byte会有缺失
        System.out.println(b3);
        System.out.println(b4);
```
- b3 = 1+2时，1和2为常量，用javac编译时，已经确定了1+2的结果并没有超过byte类型取值范围，即可以赋值给变量b3。
- b4 =b2+b3，b2,b3都是变量，变量的值是可以变化的，在编译时javac无法确定b2+b3的结果如何，因此会将结果以int类型进行处理。int类型无法赋值给byte类型。
**更改可运行**
```java
        byte b1 =1;
        byte b2 =2;
        byte b4 = (byte)(b1+b2);//从int转换成byte会有缺失
        System.out.println(b4);

```