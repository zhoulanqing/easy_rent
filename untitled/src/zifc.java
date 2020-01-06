import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

interface woxiangsharen{
    void shar();
}

class renjiA implements woxiangsharen{

    @Override
    public void shar() {
        System.out.print("杀人放A");
    }
}
class renjiB extends renjiA implements woxiangsharen{

    @Override
    public void shar() {
        System.out.print("杀人放B");
    }
}

public class zifc {





    public static  void  main(String[] args){
     renjiA r= new renjiB();

     r.shar();


        //        int price =200;

//        int yajin ;
//        yajin =+price;
//        System.out.println(price);
//        System.out.println(yajin);
    //   tianxian();  字符串操作 反转
 //shuzu();  //数组和LIst集合转换
 //dd();
//gg();

//        int b =1;
//     for( int i=0;i<10;i++){
//
//      if(b <5){
//          System.out.println("嘿嘿");
//             ++b;
//
//      }else {
//          System.out.println("傻逼");
//      }
//
//
//        }
//        System.out.println("弱智");
      //  storyCodeRandom();

    }
    public static  String tianxian() {
       String un = "周蓝青";
    int  s =un.length();
        String reverse = "";
        for (int i = 0; i < s; i++)
            reverse = un.charAt(i) + reverse;

        System.out.print(reverse);

return reverse;
    }

public static  void shuzu(){
    List list = new ArrayList();
    list.add("1");
    list.add("2");

    list.add("4");


    final int size= list.size();
    System.out.print(size);
    String[] arr = (String[]) list.toArray(new String[size]);
System.out.print(arr);
}

 public static  void  dd(){

     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
     System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
 }
 public  static  void  gg(){
        int amount = 100;
     BigDecimal orderAmount = new BigDecimal(amount).divide(new BigDecimal(100));
     System.out.println(orderAmount);
 }

    public static String storyCodeRandom() {
        int random = (int) (Math.random() * 10000);
        if (("" + random).length() == 3) {
            return System.currentTimeMillis() + "0" + random;
        } else if (("" + random).length() == 2) {
            return System.currentTimeMillis() + "00" + random;
        } else if (("" + random).length() == 1) {
            return System.currentTimeMillis() + "000" + random;
        } else {
            return System.currentTimeMillis() + random+"";
        }
    }


















}
