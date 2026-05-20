public class TypeExample2 {
    public static void main(String[] args) {
        // double : 8バイト
        double d = 9.8;
        // int : 4バイト
        //        ↓キャスト
        int i = (int)d;

        System.out.println("dの値は" + d);
        System.out.println("iの値は" + i);

        // int : 4バイト
        int j = 10;
        // double : 8バイト
        double e = j;

        System.out.println("jの値は" + j);
        System.out.println("eの値は" + e);

        // int : 4バイト
        int k = 100;
        // long : 8バイト
        long l = k;

        System.out.println("kの値は" + k);
        System.out.println("lの値は" + l);

    }
}