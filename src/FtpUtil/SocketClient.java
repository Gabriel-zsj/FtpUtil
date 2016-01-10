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
		//向服务器的10000端口发出客户请求  
		String server = "218.241.135.34";
        Socket socket=new Socket(server,10000);  
        //由Socket对象得到输入流，并构造相应的BufferedReader对象  
        BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));  
        //由Socket对象得到输出流，并构造PrintWriter对象  
        PrintWriter os=new PrintWriter(socket.getOutputStream());  

        String string = "upload";
        os.println(string);
        os.flush();
        String s=is.readLine();  
        System.out.println("Server : "+s);//在标准输出上打印从Server读入的字符串  
   
         
        is.close();//关闭Socket输入流  
        os.close();//关闭Socket输出流  
        socket.close();//关闭Socket  
	}

}
