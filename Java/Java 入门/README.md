# java

## 安装

https://www.oracle.com/java/technologies/downloads/#jdk17-windows

- 下载 jdk 并安装，安装路径不要有中文和空格
- 终端中输入 java -version 验证安装成功

## 初步使用

### 编写

- 编写 HelloWorld.java 文件
- class 名要与文件名一样

```
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}
```

### 编译

- 终端中 javac HelloWorld.java 编译生成 class 文件

### 运行

- 终端中 java HelloWorld 运行 class 文件
- JDK11 开始支持 java HelloWorld.java 直接运行源代码文件
