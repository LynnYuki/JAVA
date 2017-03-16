package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardsTest {
    public static Object getMiddle(List<? extends Number> list) {
        return list.get(list.size() / 2);
    }
    
    public static <T extends Comparable<? super T>>  int search(T[] array, T key) {
        int low = 0;
        int mid = 0;
        int high = array.length;
        System.out.println("查找的中间值：");
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.print(mid+" ");
            if (key.compareTo(array[mid]) > 0) {
                low = mid + 1;
            } else if (key.compareTo(array[mid]) < 0) {
                high = mid - 1;
            } else {
                System.out.println();
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        System.out.print("整型列表的元素：");
        System.out.println(Arrays.toString(ints.toArray()));
        System.out.println("整型列表的中间数：" + getMiddle(ints));
        List<Double> doubles = new ArrayList<Double>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        System.out.print("浮点列表的元素：");
        System.out.println(Arrays.toString(doubles.toArray()));
        System.out.println("浮点列表的中间数：" + getMiddle(doubles));
        
        Integer[] intss = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("数据集合：");
        System.out.println(Arrays.toString(intss));
        System.out.println("元素3所对于的索引序号："+search(intss, 3));
        
       
    }
}
