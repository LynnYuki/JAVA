
import java.util.*;

public class Canvas
{
	//ͬʱ�ڻ����ϻ��ƶ����״
	public void drawAll(List<Shape> shapes)
	//public void drawAll(List<?> shapes)
	//public void drawAll(List<? extends Shape> shapes)
	{
		for (Shape s : shapes)
		//for (Object o : shapes)
		{
			//Shape s=(Shape)o;
			s.draw(this);
		}
	}
	
	public static void main(String[] args)
	{
		List<Circle> circleList = new ArrayList<Circle>();
		List<Rectangle> rectangle = new ArrayList<Rectangle>();
		circleList.add(new Circle());
		rectangle.add(new Rectangle());
		Canvas c = new Canvas();
		c.drawAll(circleList);
	}
}

//����һ��������Shape
 abstract class Shape
{ 
	public abstract void draw(Canvas c); 
}


class Rectangle extends Shape 
{
	//ʵ�ֻ�ͼ�������Դ�ӡ�ַ�����ģ�⻭ͼ����ʵ��
	public void draw(Canvas c) 
	{ 
		System.out.println("��һ�����λ��ڻ���" + c + "��");
	} 
} 

//����Shape������Circle
 class Circle extends Shape
{
	//ʵ�ֻ�ͼ�������Դ�ӡ�ַ�����ģ�⻭ͼ����ʵ��
	public void draw(Canvas c)
	{
		System.out.println("�ڻ���" + c + "��һ��Բ");
	}
}