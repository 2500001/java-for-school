public class TypeExample {
    public static void main(String args[]){
        int num = 100;//整数値・・・小数点がない値(-1,0,1,2,...)
        double d = 9.9;  //実数値・・・小数点がある値(3.14, 0.1, -0.5,...)
        boolean bool = true;   //真偽値・・・true(真)/false(偽)の値
        String str = "こんにちは世界";  //文字列(複数文字)


        char c = 'あ';  //文字(1文字)
        char c2 = 0x41;  //文字(1文字)
        byte b = 81;     //整数値(-128〜127)
        short s = 1000;   //整数値(-32768〜32767)

        


        System.out.println("numの値は" + num);
        System.out.println("dの値は" + d);
        System.out.println("cの値は" + c);
        System.out.println("c2の値は" + c2);
        System.out.println("bの値は" + b);
        System.out.println("sの値は" + s);
        System.out.println("boolの値は" + bool);
        System.out.println("strの値は" + str);
        
    }
}
