package day06;
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
