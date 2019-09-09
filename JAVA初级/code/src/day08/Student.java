package day08;

public class Student {
    private String name;
    private int age;
    //学生id
    private  int sid;
    //类变量，记录学生数量分配学号
    public  static  int numberOfStudent =0 ;

    public  Student(String name,int age){
        this.name = name;
        this.age = age;
        //通过numberOfStudent给学生分配学号
        this.sid = ++numberOfStudent;
    }
    public  void show(){
        System.out.println("Student:name"+name+",age="+age +",sid="+sid);
    }
}
