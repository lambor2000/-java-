package day06;

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
