package Ex;

import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Receive extends Frame implements  Runnable,ActionListener{
	  int port;
	  InetAddress group=null;
	  MulticastSocket socket=null;
	  Button 开始接收,停止接收;
	  TextArea 显示正在接收的内容,显示已经接收的内容;
	  Thread thread;
	  boolean 停止=false;
	  public Receive(){
		  super("定时接收系统");
		  thread=new Thread(this);
		  开始接收=new Button("开始接收");
		  停止接收=new Button("停止接收");
		  开始接收.addActionListener(this);
		  停止接收.addActionListener(this);
		  显示正在接收的内容=new TextArea(10,10);
		  显示正在接收的内容.setForeground(Color.blue);
		  显示已经接收的内容=new TextArea(10,10);
		  Panel north=new Panel();
		  north.add(开始接收);
		  north.add(停止接收);
		  add(north,BorderLayout.NORTH);
		  Panel center=new Panel();
		  center.setLayout(new GridLayout(1,2));
		  center.add(显示正在接收的内容);
		  center.add(显示已经接收的内容);
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
	   if(e.getSource()==开始接收){
		 开始接收.setBackground(Color.blue);
		 停止接收.setBackground(Color.gray);
		 if(!thread.isAlive()){
			 thread=new Thread(this);
		 }
		 try{
			 System.out.println("开始接收");
			 thread.start();
			 停止=false;
		 }catch(Exception ee){}
	   }
	   if(e.getSource()==停止接收){
		   开始接收.setBackground(Color.gray);
		   停止接收.setBackground(Color.blue);
		   thread.interrupt();
		   停止=true;
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
				显示正在接收的内容.setText("显示正在接收的内容:\n"+message);
				显示已经接收的内容.setText(message+"\n");
			}catch(Exception e){}
			if(停止==true){
				break;
			}
			  
		  }
	 }	  
		public static void main(String[] args) {
			new Receive();
		}

	}



