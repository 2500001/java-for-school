import java.util.Scanner;
public class InputExample2 {
    public static void main(String[] args) {
        //入力を受け付ける部分を作る
        Scanner in = new Scanner(System.in);
        System.out.println("三角形の面積を計算します");
        System.out.println("底辺の長さを入力してください");
        double base = in.nextDouble();
        System.out.println("高さの長さを入力してください");
        double height = in.nextDouble();
        double area = base * height / 2;
        System.out.println("三角形の面積は" + area);
        in.close();
    }
}
