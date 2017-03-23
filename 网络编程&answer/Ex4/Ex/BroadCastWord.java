package Ex;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.Timer;

public class BroadCastWord extends Frame implements  ActionListener{
  int port;
  InetAddress group=null;
  MulticastSocket socket=null;
  Timer time=null;
  FileDialog open=null;
  Button select,��ʼ�㲥,ֹͣ�㲥;
  File file=null;
  String FileDir=null,fileName=null;
  FileReader in=null;
  BufferedReader bufferIn=null;
  int token=0;
  TextArea ��ʾ���ڲ��ŵ�����,��ʾ�Ѿ����ŵ�����;
  public BroadCastWord(){
	  super("���ʹ㲥ϵͳ");
	  select=new Button("ѡ��Ҫ�㲥���ļ�");
	  ��ʼ�㲥=new Button("��ʼ�㲥");
	  ֹͣ�㲥=new Button("ֹͣ�㲥");
	  select.addActionListener(this);
	  ��ʼ�㲥.addActionListener(this);
	  ֹͣ�㲥.addActionListener(this);
	  time=new Timer(2000,this);
	  open=new FileDialog(this,"ѡ��Ҫ�㲥���ļ�",FileDialog.LOAD);
	  ��ʾ���ڲ��ŵ�����=new TextArea(10,10);
	  ��ʾ���ڲ��ŵ�����.setForeground(Color.blue);
	  ��ʾ�Ѿ����ŵ�����=new TextArea(10,10);
	  Panel north=new Panel();
	  north.add(select);
	  north.add(��ʼ�㲥);
	  north.add(ֹͣ�㲥);
	  add(north,BorderLayout.NORTH);
	  Panel center=new Panel();
	  center.setLayout(new GridLayout(1,2));
	  center.add(��ʾ���ڲ��ŵ�����);
	  center.add(��ʾ�Ѿ����ŵ�����);
	  add(center,BorderLayout.CENTER);
	  validate();
	  try{
		  port=5000;
		  group=InetAddress.getByName("239.255.0.0");
		  socket=new MulticastSocket(port);
		  socket.setTimeToLive(1);
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
		  if(e.getSource()==select){
			  ��ʾ���ڲ��ŵ�����.setText(null);
			  open.setVisible(true);
			  fileName=open.getFile();
			  FileDir=open.getDirectory();
			  if(fileName!=null){
				  time.stop();
				  file=new File(FileDir,fileName);
				  try{
					  file=new File(FileDir,fileName);
					  in=new FileReader(file);
					  bufferIn=new BufferedReader(in);
							  
				  }catch(IOException ee){}
			  }
		  }
		  else if(e.getSource()==��ʼ�㲥){
			  time.start();
		  }
		  else if(e.getSource()==time){
			  String s=null;
			  try{
				  if(token==-1){
					  file=new File(FileDir,fileName);
					  in=new FileReader(file);
					  bufferIn=new BufferedReader(in);
				  }
				  s=bufferIn.readLine();
				  if(s!=null){
					  token=0;
					  ��ʾ���ڲ��ŵ�����.setText("���ڹ㲥������:\n"+s);
					  ��ʾ�Ѿ����ŵ�����.append(s+"\n");
					 DatagramPacket packet=null;
					 byte data[]=s.getBytes();
					 packet=new DatagramPacket(data,data.length,group,port);
					 socket.send(packet);
				  }
				  else{
					  token=-1;
				  }
			  }catch(IOException ee){}
		  }
		  else if(e.getSource()==ֹͣ�㲥){
			  time.stop();
		  }
		  
	  }
	  
	public static void main(String[] args) {
		BroadCastWord broad=new BroadCastWord();
	}

}
