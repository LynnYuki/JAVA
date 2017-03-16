package Ex;

import java.util.ArrayList;
import java.util.Collection;


public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("��ƵѧJava");  //��ջ�������ַ���
        stack.push("ϸ˵Java");   //��ջ�������ַ���
        stack.push("Java�����ŵ���ͨ(��2��)"); //��ջ�������ַ���
        System.out.println("��ջ��ȡ���ַ�����");
        while (!stack.empty()) {
            System.out.print((String) stack.pop()+" ");//ɾ��ջ��ȫ��Ԫ�ز��������
        }
        System.out.println();
        
        Stack<Number> stacknumber=new Stack<Number>();//����Number���͵�Stack
        Collection<Integer>   integers=new ArrayList<Integer>();//����Integer���͵�Collection
        integers.add(new Integer(2018));//���������м������
        integers.add(2017);//���������м������
        integers.add(2016);//���������м������
        stacknumber.pushAll(integers);//��integers�����Ԫ������ѹ��ջ��
        System.out.println("��ջ��ȡ��Integer��");
        while(!stacknumber.empty()){
        	System.out.print((stacknumber.pop())+" ");
        }
        
        stacknumber.push(new Integer(2018));//��ջ���������Ͷ���
        stacknumber.push(new Double(100.99));//��ջ������Double����
        stacknumber.push(new Float(13.14));//��ջ������Float����
        
        Collection<Object>   objects=new ArrayList<Object>();//�������Լ����κ����͵ļ�����
        
        stacknumber.popAll(objects);//��stacknumber�е�Ԫ�س�ջ���ӵ�������objects��
        System.out.println("��ջ��ȡ��object��");
        for(Object o:objects)
        {
        	System.out.print(o+" ");
        }
    }
}

