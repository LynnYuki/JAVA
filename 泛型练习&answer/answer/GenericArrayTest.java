package Ex;

import java.util.Arrays;

public class GenericArrayTest {
    public static void main(String[] args) {
        System.out.println("����String���͵����鲢�������Ԫ�أ�Java");
        GenericArray<String> stringArray = new GenericArray<String>(String.class, 10);
        stringArray.put(0, "Java�����������");
        stringArray.put(1, "Java���׳������");
        stringArray.put(2, "Java Web�������");
        stringArray.put(3, "Java ������");
        System.out.println("String���͵�����Ԫ�أ�" + stringArray.get(0));
        System.out.println("����Integer���͵����鲢�������Ԫ�أ�123456789");
        GenericArray<Integer> integerArray = new GenericArray<Integer>(Integer.class, 10);
        integerArray.put(0, 123456789);
        System.out.println("Integer���͵�����Ԫ�أ�" + integerArray.get(0));
    }
}
