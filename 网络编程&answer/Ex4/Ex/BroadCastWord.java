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
  Button select,开始广播,停止广播;
  File file=null;
  String FileDir=null,fileName=null;
  FileReader in=null;
  BufferedReader bufferIn=null;
  int token=0;
  TextArea 显示正在播放的内容,显示已经播放的内容;
  public BroadCastWord(){
	  super("单词广播系统");
	  select=new Button("选择要广播的文件");
	  开始广播=new Button("开始广播");
	  停止广播=new Button("停止广播");
	  select.addActionListener(this);
	  开始广播.addActionListener(this);
	  停止广播.addActionListener(this);
	  time=new Timer(2000,this);
	  open=new FileDialog(this,"选择要广播的文件",FileDialog.LOAD);
	  显示正在播放的内容=new TextArea(10,10);
	  显示正在播放的内容.setForeground(Color.blue);
	  显示已经播放的内容=new TextArea(10,10);
	  Panel north=new Panel();
	  north.add(select);
	  north.add(开始广播);
	  north.add(停止广播);
	  add(north,BorderLayout.NORTH);
	  Panel center=new Panel();
	  center.setLayout(new GridLayout(1,2));
	  center.add(显示正在播放的内容);
	  center.add(显示已经播放的内容);
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
			  显示正在播放的内容.setText(null);
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
		  else if(e.getSource()==开始广播){
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
					  显示正在播放的内容.setText("正在广播的内容:\n"+s);
					  显示已经播放的内容.append(s+"\n");
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
		  else if(e.getSource()==停止广播){
			  time.stop();
		  }
		  
	  }
	  
	public static void main(String[] args) {
		BroadCastWord broad=new BroadCastWord();
	}

}
