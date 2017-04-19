package Class;
 
//����һ��Person��
class Person1
{
	private String name;
	public Person1(){}
	public Person1(String name)
	{
		this.name = name;
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
	

  //��дequals�������ṩ�Զ������ȱ�׼
	public boolean equals(Object obj)
	{
		//ֻ�е�obj��Person����
		if (obj != null && obj instanceof Person1)
		{
		Person1 personObj = (Person1)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if (this.getName().equals(personObj.getName()))
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
		if (obj != null && obj.getClass() == Person1.class)
		{
			Person1 personObj = (Person1)obj;
			//���ҵ�ǰ�����idStr��obj�����idStr��Ȳſ��ж������������
			if (this.getName().equals(personObj.getName()))
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
		Person1 p1 = new Person1("�����");
		Person1 p2 = new Person1("�����");
		Person1 p3 = new Person1("����");
		//p1��p2��name��ȣ��������true
		System.out.println("p1��p2�Ƿ���ȣ�" + p1.equals(p2));
		//p2��p3��name����ȣ��������false
		System.out.println("p2��p3�Ƿ���ȣ�" + p2.equals(p3));
		System.out.println();
		
		 Student s1=new Student("�����","123","Computer");
		 System.out.println("p1��s1�Ƿ���ȣ�" + p1.equals(s1));
		 System.out.println("s1��p1�Ƿ���ȣ�" + s1.equals(p1));
		
		
		
	}
}

class Student extends Person1{
   private String Sid;
   private String major;
   
   Student(){}
   Student(String name,String Sid,String major){
	   super(name);
	   this.Sid = Sid;
	   this.major = major;
   }
   public void setSid(String Sid){
	   this.Sid = Sid;
   }
   public void setMajor(String major){
	   this.major=major;
   }
   public String  getSid(){
	   return this.Sid;
   }
   public String getMajor(){
	   return this.major;
   }
  public boolean equals(Object obj){
	   {
			//���Ƚϵ�����������ͬһ������ֱ�ӷ���true
			if(this == obj)
			{
				return true;
			}
			//ֻ�е�obj��Person����
			if (obj != null && obj instanceof Student)
			//if (obj != null && obj.getClass() == Student.class)
			{
				Student studentObj = (Student)obj;
				//���ҵ�ǰ�����idStr��obj�����Sid��Ȳſ��ж������������
                super.equals(studentObj);
				if (this.getSid().equals(studentObj.getSid()))
				{
					return true;
				}
			}
			return false;
		}
   }
}

