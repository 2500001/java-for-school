public class Main {
    public static void main(String[] args) {
        // Hello();
        Countdown();
    }

    //countdownメソッドを自作する
    public static void Countdown(){
        //処理
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }

    //helloメソッドを自作する
    public static void Hello(){
        //処理
        System.out.println("Hello, World!");
    }
}
