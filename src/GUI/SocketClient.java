package GUI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//���������12345�˿ڷ����ͻ�����  
		String server = "192.168.253.139";
        Socket socket=new Socket(server,12345);  
        //��Socket����õ�����������������Ӧ��BufferedReader����  
        BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        //��Socket����õ��������������PrintWriter����  
        PrintWriter os=new PrintWriter(socket.getOutputStream());  

        String stringupload = "partition&encode|"+gui.srcFileName();
        os.println(stringupload);
        os.flush();
        String supload=is.readLine();  
        System.out.println("Server upload: "+supload);//�ڱ�׼����ϴ�ӡ��Server������ַ���  
      
        is.close();//�ر�Socket������  
        os.close();//�ر�Socket�����  
        socket.close();//�ر�Socket  
	}


}
