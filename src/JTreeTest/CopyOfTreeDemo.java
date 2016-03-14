package JTreeTest;

import java.awt.ScrollPane;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

public class CopyOfTreeDemo {
		private static String server = "123.56.162.108";
		private static int port = 21;
		private static String username = "yuanfei";
		private static String password = "123";
		public static FTPClient ftpClient = new FTPClient();
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {	
		//UIManager.setLookAndFeel(new );
		ftpClient.connect(server);
		ftpClient.login(username, password);
		ftpClient.setControlEncoding("GBK");
		final JTree tree = new JTree(test("E:\\cloud\\"));
		JFrame frame  = new JFrame("JTreeDemo");
		JScrollPane scrollPane =new JScrollPane();
		frame.add(scrollPane);
		scrollPane.setViewportView(tree);
		tree.setEditable(true);
		tree.setDragEnabled(true);
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			   public void valueChanged(TreeSelectionEvent e) {
			    DefaultMutableTreeNode note = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
			    String name = note.toString();//获得这个结点的名称
			    System.out.println(name);
			   }
			  });
//		JScrollPane jScrollPane3 = null;
//		jScrollPane3.add(tree);
//		frame.add(jScrollPane3);
//		JPanel panel = new JPanel();
//		panel.add(new JScrollPane(tree));
//		panel.setVisible(true);
		
		
//		frame.add(tree);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static DefaultMutableTreeNode test(String remote) throws IOException{
		String remoteDir = remote;
		File file = new File(remote);
		ftpClient.setControlEncoding("GBK");
		File[] remoteFiles = file.listFiles();
		DefaultMutableTreeNode top = new DefaultMutableTreeNode(remoteDir);
		if(remoteFiles != null){
			for(int i = 0;i < remoteFiles.length;i++){
				if(remoteFiles[i].isFile()==true){
				String tmp = remoteFiles[i].getName();
				String name = new String(tmp.getBytes("UTF-8"), "UTF-8");
				top.add(new DefaultMutableTreeNode(name));
				}else if(remoteFiles[i].isDirectory()==true){
					String tmp = remoteFiles[i].getName();
					String name = new String(tmp.getBytes("UTF-8"), "UTF-8");
					//DefaultMutableTreeNode node = new DefaultMutableTreeNode(name);
					top.add(test(remoteDir+name+"\\"));
				}
			}
		}

		//JTree tree = new JTree(top);
		return top;
	}

}
//final JTree tree = new JTree(test("C:\\Users\\"));
//jScrollPane1.setViewportView(tree);
//tree.setEditable(true);
//tree.setDragEnabled(true);
//tree.addTreeSelectionListener(new TreeSelectionListener() {
//	   public void valueChanged(TreeSelectionEvent e) {
//	    DefaultMutableTreeNode note = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
//	    String name = note.toString();//获得这个结点的名称
//	    System.out.println(name);
//	   }
//	  });
