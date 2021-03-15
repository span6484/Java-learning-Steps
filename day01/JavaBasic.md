# JAVA 基础

#### Java 程序运行机制

- 编译型：

  c, c++

- 解释型:

  速度慢一点

流程：

生成 .java -> java编译器 -> 字节码 .class文件 -> 类装载器 -> 字节码校验器 -> 解释器  -> 操作系统平台

------

#### Java 是强类型语言

* 要求变量的使用要严格符合规定，所有变量必须先***定义***

------

#### Java 数据类型两大类

- **primitive type**

  | 类型   | 字节              |
  | ------ | ----------------- |
  | byte   | 1      (-128~127) |
  | short  | 2                 |
  | int    | 4                 |
  | long   | 8                 |
  | float  | 4                 |
  | double | 8                 |
  | char   | 2                 |

  

- **reference type**

  - class
  - interface
  - array

* 强制转换 由高到低 （类型）变量名

  ```
  int i = 128;
  byte b = (byte)i;	#强转byte内存溢出
  double c = i		自动转换
  
  output: 128
  				-128
  				128.0
  				
  
  ```

  ```
  public class java_basic.OutOfMemory {
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
  ```

------



#### 变量和常量

* 类变量
* 实例变量
* 局部变量

```
public class java_basic.Variable {
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
        java_basic.Variable test =  new java_basic.Variable();
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

```

------

#### 运算符

1. a++和++a

   ```java
   public class java_basic.calculate {
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
       }
   }
   ```

   ```
   output
   b is 3
   c is 5
   ```

2.  幂运算

   ```java
   // 2^3       
   double pow = Math.pow(2,3);
   System.out.println(pow);				
   ```

3. 位运算

   ```
   A = 0011 1100
   b = 0000 1101
   
   A&B	= 0000 1100
   A|B = 0011 1101
   A^B = 0011 0001
   ~B  = 1111 0010
   <<2     乘以1
   >>2			除以2
   ```

   

4. 三元运算符

   x ? y : z.  	如果x=true ，结果为y，否则为z

   ```
   public class java_basic.operator {
       public static void main(String[] args) {
   
           int score = 80;
           String tpe = score < 60 ?"不及格":"及格";
           System.out.println(tpe);
       }
   }	
   ```

5. 包

   * 包的本质就是文件夹

   * 使用**import**调用

   * package com.kuange.java_basic.operator

     com->总路径

     kuange -> com 下的包

     java_basic.operator->kuange 下的包

   * 想导入别的包 使用 import

     ex： import com.kuange.base

     也可以用 * 导入很多东西

     import com.kuange.*	 

   

6. 命令生成java doc

```
javadoc 参数 java文件
javadoc -encoding UTF-8 -charset UTF-8 Doc.java
```

![Screen Shot 2021-03-15 at 10.51.40 PM](/Users/shaoqiupan/Desktop/Screen Shot 2021-03-15 at 10.51.40 PM.png)

​													这个图片在运行 javadoc后，文件夹中的index文件



