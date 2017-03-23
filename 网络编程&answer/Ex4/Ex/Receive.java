package Ex;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Receive extends Frame implements  Runnable,ActionListener{
	  int port;
	  InetAddress group=null;
	  MulticastSocket socket=null;
	  Button ��ʼ����,ֹͣ����;
	  TextArea ��ʾ���ڽ��յ�����,��ʾ�Ѿ����յ�����;
	  Thread thread;
	  boolean ֹͣ=false;
	  public Receive(){
		  super("��ʱ����ϵͳ");
		  thread=new Thread(this);
		  ��ʼ����=new Button("��ʼ����");
		  ֹͣ����=new Button("ֹͣ����");
		  ��ʼ����.addActionListener(this);
		  ֹͣ����.addActionListener(this);
		  ��ʾ���ڽ��յ�����=new TextArea(10,10);
		  ��ʾ���ڽ��յ�����.setForeground(Color.blue);
		  ��ʾ�Ѿ����յ�����=new TextArea(10,10);
		  Panel north=new Panel();
		  north.add(��ʼ����);
		  north.add(ֹͣ����);
		  add(north,BorderLayout.NORTH);
		  Panel center=new Panel();
		  center.setLayout(new GridLayout(1,2));
		  center.add(��ʾ���ڽ��յ�����);
		  center.add(��ʾ�Ѿ����յ�����);
		  add(center,BorderLayout.CENTER);
		  validate();
		  port=5000;
		  try{
			 
			  group=InetAddress.getByName("239.255.0.0");
			  socket=new MulticastSocket(port);
			  socket.joinGroup(group);
		  }catch(Exception e){
			  System.out.println("Error"+e);
		  }
		  setBounds(100,50,360,380);
		  setVisible(true);
		  addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e)
				{
				System.exit(0) ;
				} }
			 );
	  } 
	 public void actionPerformed(ActionEvent e){
	   if(e.getSource()==��ʼ����){
		 ��ʼ����.setBackground(Color.blue);
		 ֹͣ����.setBackground(Color.gray);
		 if(!thread.isAlive()){
			 thread=new Thread(this);
		 }
		 try{
			 System.out.println("��ʼ����");
			 thread.start();
			 ֹͣ=false;
		 }catch(Exception ee){}
	   }
	   if(e.getSource()==ֹͣ����){
		   ��ʼ����.setBackground(Color.gray);
		   ֹͣ����.setBackground(Color.blue);
		   thread.interrupt();
		   ֹͣ=true;
	   }
	   }
	 
	 public void run(){
		 
		while(true){
			byte data[]=new byte[8192];
			DatagramPacket packet=null;
			packet=new DatagramPacket(data,data.length,group,port);
			try{
				socket.receive(packet);
				String message=new String(packet.getData(),0,packet.getLength());
				System.out.println(message);
				��ʾ���ڽ��յ�����.setText("��ʾ���ڽ��յ�����:\n"+message);
				��ʾ�Ѿ����յ�����.setText(message+"\n");
			}catch(Exception e){}
			if(ֹͣ==true){
				break;
			}
			  
		  }
	 }	  
		public static void main(String[] args) {
			new Receive();
		}

	}



