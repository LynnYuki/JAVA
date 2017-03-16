package Ex;

import java.util.ArrayList;
import java.util.Collection;


public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("视频学Java");  //向栈中增加字符串
        stack.push("细说Java");   //向栈中增加字符串
        stack.push("Java从入门到精通(第2版)"); //向栈中增加字符串
        System.out.println("从栈中取出字符串：");
        while (!stack.empty()) {
            System.out.print((String) stack.pop()+" ");//删除栈中全部元素并进行输出
        }
        System.out.println();
        
        Stack<Number> stacknumber=new Stack<Number>();//创建Number类型的Stack
        Collection<Integer>   integers=new ArrayList<Integer>();//创建Integer类型的Collection
        integers.add(new Integer(2018));//往集合类中加入对象
        integers.add(2017);//往集合类中加入对象
        integers.add(2016);//往集合类中加入对象
        stacknumber.pushAll(integers);//将integers里面的元素依次压入栈中
        System.out.println("从栈中取出Integer：");
        while(!stacknumber.empty()){
        	System.out.print((stacknumber.pop())+" ");
        }
        
        stacknumber.push(new Integer(2018));//向栈中增加整型对象
        stacknumber.push(new Double(100.99));//向栈中增加Double对象
        stacknumber.push(new Float(13.14));//向栈中增加Float对象
        
        Collection<Object>   objects=new ArrayList<Object>();//声明可以加入任何类型的集合类
        
        stacknumber.popAll(objects);//把stacknumber中的元素出栈增加到集合类objects中
        System.out.println("从栈中取出object：");
        for(Object o:objects)
        {
        	System.out.print(o+" ");
        }
    }
}

