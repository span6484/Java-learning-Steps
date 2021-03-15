package java_basic;

public class OutOfMemory {
    public static void main(String[] args) {
//        可以加下划线
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;
        System.out.println(total); //--1474836480 溢出了

        long total2 = money*((long)years);
        System.out.println(money);
    }
}
