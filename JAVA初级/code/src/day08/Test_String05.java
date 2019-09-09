package day08;

public class Test_String05 {
    public  static void main(String[] args){
        //创建字符串对象
        String s = "lambor|niuniu|keka";
        String[] strArray = s.split("|");
        for (int x = 0; x<strArray.length;x++){
            System.out.println(strArray[x]);
        }
    }
}
