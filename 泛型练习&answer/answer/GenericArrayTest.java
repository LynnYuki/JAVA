package Ex;

import java.util.Arrays;

public class GenericArrayTest {
    public static void main(String[] args) {
        System.out.println("创建String类型的数组并向其添加元素：Java");
        GenericArray<String> stringArray = new GenericArray<String>(String.class, 10);
        stringArray.put(0, "Java基础程序设计");
        stringArray.put(1, "Java进阶程序设计");
        stringArray.put(2, "Java Web程序设计");
        stringArray.put(3, "Java 框架设计");
        System.out.println("String类型的数组元素：" + stringArray.get(0));
        System.out.println("创建Integer类型的数组并向其添加元素：123456789");
        GenericArray<Integer> integerArray = new GenericArray<Integer>(Integer.class, 10);
        integerArray.put(0, 123456789);
        System.out.println("Integer类型的数组元素：" + integerArray.get(0));
    }
}
