package day06;

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
