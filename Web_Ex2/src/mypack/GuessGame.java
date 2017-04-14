package mypack;

import java.util.Random;

public class GuessGame {	
		  private int answer;	  
		  private int guess;	  
		  private boolean success;	  
		  private String info;	  
		  private int count;	  
		  private int picture;
		  public GuessGame() {
			  reset();	//重置开始
		  }
		  //设置和调用成员属性，完成游戏功能 
		  public void setGuess(String guess) {
			  count++;
			  try {
				  this.guess = Integer.parseInt(guess);
			  }
			  catch (NumberFormatException e) {
				  this.guess = -1;
			  }
			  //判断所输入的数字与实际价格是否相同，或输入数字是否符合要求
			  if (this.guess == answer) {
				  success = true;
			  }
			  else if (this.guess == -1) {
				  info = "出错，再猜一次！";
			  }
			  else if (this.guess < answer) {
				  info = "您猜的价格小了！";
			  }
			  else if (this.guess > answer) {
				  info = "您猜的价格大了！";
			  }		  
			  //输入数字
			  if(this.guess >100){
				  info="请输入1到100之间的数字！";
			  }
		  }	  	
		  public boolean getSuccess() {
			  return success;
		  }
		  public String getInfo() {
			  return info;
		  }
		  public int getCounter() {
			  return count;
		  }
		  public int getAnswer(){
			  return answer;
		  }	  
		  public int getPicture(){
			  return picture;
		  }
		  public void reset() {
			  //产生随机数，控制在1到100之间
			  answer = Math.abs(new Random().nextInt() % 100) + 1;
			  System.out.println(answer);
			  picture=answer%4+1;
			  success = false;
			  count = 0;
		  }
	}
