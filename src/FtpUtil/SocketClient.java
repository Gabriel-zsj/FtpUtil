package FtpUtil;
import java.io.BufferedReader;  
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.net.Socket;  
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
		//���������7890�˿ڷ����ͻ�����  
		String server = "123.56.162.108";
        Socket socket=new Socket(server,7890);  
		//Socket socket = new Socket(InetAddress.getLocalHost(),7890);
        //��Socket����õ�����������������Ӧ��BufferedReader����  
        //BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        //��Socket����õ��������������PrintWriter����  
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());    
        //dos.writeUTF("partition&encode ˼�ƾ���.txt"); 
        dos.writeUTF("checkIntegrity ˼�ƾ���");
        //String supload=is.readLine();  
        DataInputStream dis = new DataInputStream(socket.getInputStream());  
        String receive = dis.readUTF();     
        System.out.println("Server upload: "+receive);//�ڱ�׼����ϴ�ӡ��Server������ַ���  
      
        
        
        dis.close();//�ر�Socket������  
        dos.close();//�ر�Socket�����  
        socket.close();//�ر�Socket 
         

        return;
//        os.flush();
//        String s=is.readLine();  
//       System.out.println("Server : "+s);//�ڱ�׼����ϴ�ӡ��Server������ַ���  
//   
//         
//        is.close();//�ر�Socket������  
//        os.close();//�ر�Socket�����  
//        socket.close();//�ر�Socket  
	}

}
