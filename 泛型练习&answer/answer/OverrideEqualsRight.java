package Ex;
 
//����һ��Person��
class Person2
{
	private String name;
	private String idStr;
	public Person2(){}
	public Person2(String name , String idStr)
	{
		this.name = name;
		this.idStr = idStr;
	}
	//������name��idStr��setter��getter������
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		 return this.name;
	}

	public void setIdStr(String idStr)
	{
		this.idStr = idStr;
	}
	public String getIdStr()
	{
		 return this.idStr;
	}
	//��дequals�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj)
	{
		//ֻ�е�obj��Person����
	if (obj != null && obj instanceof Person2)
		{
			Person2 personObj = (Person2)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
		if (this.getIdStr().equals(personObj.getIdStr()))
			{
				return true;
			}
		}
	return false;
  }

	//��дequals�������ṩ�Զ������ȱ�׼
/*	public boolean equals(Object obj)
	{
		//���Ƚϵ�����������ͬһ������ֱ�ӷ���true
		if(this == obj)
		{
			return true;
		}
		//ֻ�е�obj��Person����
		if (obj != null && obj.getClass() == Person2.class)
		{
			Person2 personObj = (Person2)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if (this.getIdStr().equals(personObj.getIdStr()))
			{
				return true;
			}
		}
		return false;
	}*/

}
public class OverrideEqualsRight
{
	public static void main(String[] args) 
	{
		Person2 p1 = new Person2("�����" , "12343433433");
		Person2 p2 = new Person2("������" , "12343433433");
		Person2 p3 = new Person2("����" , "99933433");
		Student s1 = new Student("�׹Ǿ�" , "12343433433","001");
		//p1��p2��idStr��ȣ��������true
		System.out.println("p1��p2�Ƿ���ȣ�" + p1.equals(p2));
		//p2��p3��idStr����ȣ��������false
		System.out.println("p2��p3�Ƿ���ȣ�" + p2.equals(p3));
		
		System.out.println("p1��s1�Ƿ���ȣ�" + p1.equals(s1));
		System.out.println("s1��p1�Ƿ���ȣ�" + s1.equals(p1));
	}
}

class Student extends Person2{
	private String sno;
	
	public Student(String name , String idStr,String sno){
		super(name,idStr);
		this.sno=sno;
	}
	public String getSno(){
		return this.sno;
	}
	public boolean equals(Object obj)
	{
		//ֻ�е�obj��Person����
	if (obj != null && obj instanceof Student)
		{
		    Student sObj = (Student)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
		if (this.getSno().equals(sObj.getSno()))
			{
				return true;
			}
		}
	return false;
  }
}