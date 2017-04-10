package mypack;

public class SaveNumber {
	double firstNumber,secondNumber;
	double resultA;
	double resultB;
	public void setFirstNumber(double a){
		firstNumber=a;
	}
	public double getFirstNumber(){
		return this.firstNumber;
	}
	public void setSecondNumber(double b){
		secondNumber=b;
	}
	public double getSecondNumber(){
		return this.secondNumber;
	}
	
	public double getResultA(){
		return (firstNumber+secondNumber)/2 ;	
	}
	public double getResultB(){
		return Math.sqrt(firstNumber*secondNumber) ;	
	}
}
