package FtpUtil;

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
		//���������10000�˿ڷ����ͻ�����  
		String server = "218.241.135.34";
        Socket socket=new Socket(server,10000);  
        //��Socket����õ�����������������Ӧ��BufferedReader����  
        BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        //��Socket����õ��������������PrintWriter����  
        PrintWriter os=new PrintWriter(socket.getOutputStream());  

        String string = "upload";
        os.println(string);
        os.flush();
        String s=is.readLine();  
        System.out.println("Server : "+s);//�ڱ�׼����ϴ�ӡ��Server������ַ���  
   
         
        is.close();//�ر�Socket������  
        os.close();//�ر�Socket�����  
        socket.close();//�ر�Socket  
	}

}
