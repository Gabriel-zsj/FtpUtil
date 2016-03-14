package JTreeTest;

import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class TestC {
	private static String server = "192.168.253.137";
	private static int port = 21;
	private static String username = "yuanfei";
	private static String password = "123";
	public static FTPClient ftpClient = new FTPClient();
	/**
	 * @param args
	 * @throws IOException 
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws SocketException, IOException {
		// TODO Auto-generated method stub
		ftpClient.connect(server);
		ftpClient.login(username, password);
		
		ftpClient.setControlEncoding("GBK");
		FTPFile[] remoteFiles = ftpClient.listFiles("/999");
		System.out.println(remoteFiles[1].getName().toString());
	}

}
