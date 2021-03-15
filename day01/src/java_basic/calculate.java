package java_basic;

public class calculate {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;
        // b = a ++ 可以拆分成
        //b = a
        // a = a + 1
        int c = ++a;
        // c = ++a 可以拆分成
        //a = a + 1
        // c = a
        System.out.println("b is "+b);
        System.out.println("c is "+c);

        double pow = Math.pow(2,3);
        System.out.println(pow);
        System.out.println(false||true);
    }
}
