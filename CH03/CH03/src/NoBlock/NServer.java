package NoBlock;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.channels.spi.*;
import java.net.*;
import java.util.*;
import java.nio.charset.*;


public class NServer
{
	//���ڼ������Channel״̬��Selector
	private Selector selector = null;
	//����ʵ�ֱ��롢������ַ�������
	private Charset charset = Charset.forName("UTF-8");
    public void init()throws IOException
    {
		selector = Selector.open();
		//ͨ��open��������һ��δ�󶨵�ServerSocketChannelʵ��
		ServerSocketChannel server = ServerSocketChannel.open();
		InetSocketAddress isa = new InetSocketAddress(
			"127.0.0.1", 30000); 
		//����ServerSocketChannel�󶨵�ָ��IP��ַ
		server.socket().bind(isa);
		//����ServerSocket�Է�������ʽ����
		server.configureBlocking(false);
		//��serverע�ᵽָ��Selector����
		server.register(selector, SelectionKey.OP_ACCEPT);
		//��ѡ�����е�����һ������ͨ�����п��õ�I/O������ʱ��select()�������ش���0������
		while (selector.select() > 0) 
		{
			//����selector��selectedKeys()���������ʡ���ѡ�������selected key set�����еľ���ͨ����
			//���δ���selector�ϵ�ÿ����ѡ���SelectionKey
			for (SelectionKey sk : selector.selectedKeys())
			{
				//��selector�ϵ���ѡ��Key����ɾ�����ڴ����SelectionKey
				//Selector�����Լ�����ѡ��������Ƴ�SelectionKeyʵ���������ڴ�����ͨ��ʱ�Լ��Ƴ����´θ�ͨ����ɾ���ʱ��Selector���ٴν��������ѡ������С�
				selector.selectedKeys().remove(sk);
				//���sk��Ӧ��ͨ�������ͻ��˵���������
				if (sk.isAcceptable())
				{
					//����accept�����������ӣ������������˶�Ӧ��SocketChannel
					SocketChannel sc = server.accept();
					//���ò��÷�����ģʽ
					sc.configureBlocking(false);
					//����SocketChannelҲע�ᵽselector
					sc.register(selector, SelectionKey.OP_READ);
					//��sk��Ӧ��Channel���ó�׼��������������
					sk.interestOps(SelectionKey.OP_ACCEPT);
				}
				//���sk��Ӧ��ͨ����������Ҫ��ȡ
				if (sk.isReadable())
				{
					//��ȡ��SelectionKey��Ӧ��Channel����Channel���пɶ�������
					SocketChannel sc = (SocketChannel)sk.channel();
					//����׼��ִ�ж�ȡ���ݵ�ByteBuffer
					ByteBuffer buff = ByteBuffer.allocate(1024);
					String content = "";
					//��ʼ��ȡ����
					try
					{
						while(sc.read(buff) > 0)
						{
							buff.flip();
							content += charset.decode(buff);
						}
						//��ӡ�Ӹ�sk��Ӧ��Channel���ȡ��������
						System.out.println("=====" + content);
						//��sk��Ӧ��Channel���ó�׼����һ�ζ�ȡ
						sk.interestOps(SelectionKey.OP_READ);
					}
					//�����׽����sk��Ӧ��Channel�������쳣����������Channel
					//��Ӧ��Client���������⣬���Դ�Selector��ȡ��sk��ע��
					catch (IOException ex)
					{
						//��Selector��ɾ��ָ����SelectionKey
						sk.cancel();
						if (sk.channel() != null)
						{
							sk.channel().close();
						}
					}
					//���content�ĳ��ȴ���0����������Ϣ��Ϊ��,���ƹ㲥�Ĺ���
					if (content.length() > 0)
					{
						//������selector��ע�������SelectKey
						for (SelectionKey key : selector.keys())
						{
							//��ȡ��key��Ӧ��Channel
							Channel targetChannel = key.channel();
							//�����channel��SocketChannel����
							if (targetChannel instanceof SocketChannel)
							{
								//������������д���Channel��
								SocketChannel dest = (SocketChannel)targetChannel;
								dest.write(charset.encode(content));
							}
						}
					}
				}
			}
		}
    }
	
	public static void main(String[] args)
		throws IOException
	{
		new NServer().init();
	}
}
