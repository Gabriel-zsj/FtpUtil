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
		//向服务器的7890端口发出客户请求  
		String server = "123.56.162.108";
        Socket socket=new Socket(server,7890);  
		//Socket socket = new Socket(InetAddress.getLocalHost(),7890);
        //由Socket对象得到输入流，并构造相应的BufferedReader对象  
        //BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        //由Socket对象得到输出流，并构造PrintWriter对象  
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());    
        //dos.writeUTF("partition&encode 思科九年.txt"); 
        dos.writeUTF("checkIntegrity 思科九年");
        //String supload=is.readLine();  
        DataInputStream dis = new DataInputStream(socket.getInputStream());  
        String receive = dis.readUTF();     
        System.out.println("Server upload: "+receive);//在标准输出上打印从Server读入的字符串  
      
        
        
        dis.close();//关闭Socket输入流  
        dos.close();//关闭Socket输出流  
        socket.close();//关闭Socket 
         

        return;
//        os.flush();
//        String s=is.readLine();  
//       System.out.println("Server : "+s);//在标准输出上打印从Server读入的字符串  
//   
//         
//        is.close();//关闭Socket输入流  
//        os.close();//关闭Socket输出流  
//        socket.close();//关闭Socket  
	}

}
