package java_basic;

public class Variable {
    // 类变量 static
    static double salary = 2500;

    // 常量
    static final double PI = 3.14;
    final static double PI1 = 3.14;//修饰符， 不存在先后顺序
    String name;
    int age;

    public static void main(String[] args) {
//        局部变量
        int i = 10;
//        i 只能在main里打印
        System.out.println(i);

        //变量类型 变量名字
        Variable test =  new Variable();
        System.out.println(test.name);
        System.out.println(test.age);
        //因为加了static 所以能直接调用
//        System.out.println(salary);
        test.add();
    }

    public void add(){
        System.out.println(salary);
    }

}
