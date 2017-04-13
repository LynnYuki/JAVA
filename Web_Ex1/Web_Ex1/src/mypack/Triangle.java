package mypack;

public class Triangle {
	double a;
	double b;
	double c;

	
	public void setA(double s){
		a=s;
		System.out.println(Double.valueOf(s));
	}
   
	public void setB(double s){
		b=s;
	}

	 
	public void setC(double s){
		c=s;
	}
   
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	
	public double getArea(){
		 double p=(a+b+c)/2.0;
		 double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		 return area;
	}
}
