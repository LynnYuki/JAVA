package Ex;
 
//定义一个Person类
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
	//下面是name和idStr的setter和getter方法。
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
	//重写equals方法，提供自定义的相等标准
	public boolean equals(Object obj)
	{
		//只有当obj是Person对象
	if (obj != null && obj instanceof Person2)
		{
			Person2 personObj = (Person2)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
		if (this.getIdStr().equals(personObj.getIdStr()))
			{
				return true;
			}
		}
	return false;
  }

	//重写equals方法，提供自定义的相等标准
/*	public boolean equals(Object obj)
	{
		//待比较的两个对象是同一个对象，直接返回true
		if(this == obj)
		{
			return true;
		}
		//只有当obj是Person对象
		if (obj != null && obj.getClass() == Person2.class)
		{
			Person2 personObj = (Person2)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
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
		Person2 p1 = new Person2("孙悟空" , "12343433433");
		Person2 p2 = new Person2("孙行者" , "12343433433");
		Person2 p3 = new Person2("孙悟饭" , "99933433");
		Student s1 = new Student("白骨精" , "12343433433","001");
		//p1和p2的idStr相等，所以输出true
		System.out.println("p1和p2是否相等？" + p1.equals(p2));
		//p2和p3的idStr不相等，所以输出false
		System.out.println("p2和p3是否相等？" + p2.equals(p3));
		
		System.out.println("p1和s1是否相等？" + p1.equals(s1));
		System.out.println("s1和p1是否相等？" + s1.equals(p1));
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
		//只有当obj是Person对象
	if (obj != null && obj instanceof Student)
		{
		    Student sObj = (Student)obj;
			//并且当前对象的idStr与obj对象的idStr相等才可判断两个对象相等
		if (this.getSno().equals(sObj.getSno()))
			{
				return true;
			}
		}
	return false;
  }
}