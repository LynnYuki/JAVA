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
			  reset();	//���ÿ�ʼ
		  }
		  //���ú͵��ó�Ա���ԣ������Ϸ���� 
		  public void setGuess(String guess) {
			  count++;
			  try {
				  this.guess = Integer.parseInt(guess);
			  }
			  catch (NumberFormatException e) {
				  this.guess = -1;
			  }
			  //�ж��������������ʵ�ʼ۸��Ƿ���ͬ�������������Ƿ����Ҫ��
			  if (this.guess == answer) {
				  success = true;
			  }
			  else if (this.guess == -1) {
				  info = "�����ٲ�һ�Σ�";
			  }
			  else if (this.guess < answer) {
				  info = "���µļ۸�С�ˣ�";
			  }
			  else if (this.guess > answer) {
				  info = "���µļ۸���ˣ�";
			  }		  
			  //��������
			  if(this.guess >100){
				  info="������1��100֮������֣�";
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
			  //�����������������1��100֮��
			  answer = Math.abs(new Random().nextInt() % 100) + 1;
			  System.out.println(answer);
			  picture=answer%4+1;
			  success = false;
			  count = 0;
		  }
	}
