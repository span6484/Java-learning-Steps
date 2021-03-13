# Java序言

#### Java 三大版本

- JavaSE:	标准版 （桌面程序开发， 控制台开发）
- javaMe:  嵌入式开发 （手机，小家电）
- JavaEE:   E企业级开发 （web端，服务器开发） 

------

#### JDK, JRE, JVM

* JDK: 	Java Development Kit
  * 包含所有 （java）
* JRE:      Java Runtime Environment
  * 运行环境
* JVM:     JAVA Virtual Machine
  * java虚拟机



------

#### JavaSE 下载（mac）

> youtube link：https://www.youtube.com/watch?v=pxi3iIy4F5A

> oracle官网 :https://www.oracle.com/hk/java/technologies/javase/javase-jdk8-downloads.html

1. 安装

2. ```
   #vscode 中
   code ~/.bash_profile  
   ```

3. .bash_profile 文件中粘贴

   ```
   # jdk1.8.0_281.jdk 是列子，自己查看自己的版本
   export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home
   ```

4. ```
   source ~/.bash_profile
   echo $JAVA_HOME
   java -version
   ```

------

#### IntlliJ IDEA DOWNLOAD

> Youtube link: https://www.youtube.com/watch?v=q7WZaFQxSBI

> IntelliJ IDEA link: https://www.jetbrains.com/idea/download/#section=mac