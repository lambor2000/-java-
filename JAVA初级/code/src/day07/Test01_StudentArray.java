package day07;

public class Test01_StudentArray {
    public static void  main(String[] args){
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象
        Student s1 = new Student("lambor",19);
        Student s2 = new Student("牛牛",22);
        Student s3 = new Student("可卡",7);

        //把学生对象作为元素赋值给学生数组
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //遍历学生数组
        for(int x= 0;x<students.length;x++){
            Student s = students[x];
            System.out.println(s.getName()+"----"+s.getAge());
        }
    }
}
