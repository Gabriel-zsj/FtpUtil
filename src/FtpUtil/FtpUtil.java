/*
 * FtpUtil.java
 *
 * Created on __DATE__, __TIME__
 */

package FtpUtil;

import java.awt.Dimension;
import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFileChooser;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author  __USER__
 */
public class FtpUtil extends javax.swing.JFrame {

	//private static String server = "218.241.135.34";
	private static String server = "192.168.253.130";
	private static int port = 21;
	//private static String username = "anonymous";
	//private static String password = "";
	private static String username = "uftp";
	private static String password = "123";
	

	/** Creates new form FtpUtil */
	public FtpUtil() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu19 = new javax.swing.JMenu();
		jMenu20 = new javax.swing.JMenu();
		jMenuBar3 = new javax.swing.JMenuBar();
		jMenu22 = new javax.swing.JMenu();
		jMenu23 = new javax.swing.JMenu();
		jToolBar1 = new javax.swing.JToolBar();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jPanel1 = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem17 = new javax.swing.JMenuItem();
		jMenuItem18 = new javax.swing.JMenuItem();
		jMenuItem26 = new javax.swing.JMenuItem();
		jMenuItem27 = new javax.swing.JMenuItem();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem19 = new javax.swing.JMenuItem();
		jMenuItem20 = new javax.swing.JMenuItem();
		jMenuItem21 = new javax.swing.JMenuItem();
		jMenuItem22 = new javax.swing.JMenuItem();
		jMenu11 = new javax.swing.JMenu();
		jMenuItem40 = new javax.swing.JMenuItem();
		jMenuItem39 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenu8 = new javax.swing.JMenu();
		jMenuItem13 = new javax.swing.JMenuItem();
		jMenuItem28 = new javax.swing.JMenuItem();
		jMenuItem29 = new javax.swing.JMenuItem();
		jMenuItem5 = new javax.swing.JMenuItem();
		jMenuItem15 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenu7 = new javax.swing.JMenu();
		jMenuItem23 = new javax.swing.JMenuItem();
		jMenuItem24 = new javax.swing.JMenuItem();
		jMenuItem25 = new javax.swing.JMenuItem();
		jMenu12 = new javax.swing.JMenu();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenuItem14 = new javax.swing.JMenuItem();
		jMenu13 = new javax.swing.JMenu();
		jMenuItem41 = new javax.swing.JMenuItem();
		jMenuItem42 = new javax.swing.JMenuItem();
		jMenuItem43 = new javax.swing.JMenuItem();
		jMenuItem44 = new javax.swing.JMenuItem();
		jMenuItem45 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenu9 = new javax.swing.JMenu();
		jMenuItem30 = new javax.swing.JMenuItem();
		jMenuItem31 = new javax.swing.JMenuItem();
		jMenuItem32 = new javax.swing.JMenuItem();
		jMenu14 = new javax.swing.JMenu();
		jMenuItem7 = new javax.swing.JMenuItem();
		jMenuItem46 = new javax.swing.JMenuItem();
		jMenu15 = new javax.swing.JMenu();
		jMenuItem8 = new javax.swing.JMenuItem();
		jMenuItem47 = new javax.swing.JMenuItem();
		jMenuItem48 = new javax.swing.JMenuItem();
		jMenuItem49 = new javax.swing.JMenuItem();
		jMenuItem50 = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem10 = new javax.swing.JMenuItem();
		jMenuItem11 = new javax.swing.JMenuItem();
		jMenuItem12 = new javax.swing.JMenuItem();
		jMenu16 = new javax.swing.JMenu();
		jMenuItem16 = new javax.swing.JMenuItem();
		jMenuItem6 = new javax.swing.JMenuItem();
		jMenuItem33 = new javax.swing.JMenuItem();
		jMenu17 = new javax.swing.JMenu();
		jMenuItem51 = new javax.swing.JMenuItem();
		jMenuItem52 = new javax.swing.JMenuItem();
		jMenuItem53 = new javax.swing.JMenuItem();
		jMenu18 = new javax.swing.JMenu();
		jMenuItem54 = new javax.swing.JMenuItem();
		jMenuItem55 = new javax.swing.JMenuItem();
		jMenuItem56 = new javax.swing.JMenuItem();
		jMenuItem57 = new javax.swing.JMenuItem();
		jMenuItem58 = new javax.swing.JMenuItem();
		jMenu21 = new javax.swing.JMenu();
		jMenuItem59 = new javax.swing.JMenuItem();
		jMenuItem60 = new javax.swing.JMenuItem();
		jMenuItem61 = new javax.swing.JMenuItem();
		jMenuItem70 = new javax.swing.JMenuItem();
		jMenuItem62 = new javax.swing.JMenuItem();

		jMenu19.setText("File");
		jMenuBar2.add(jMenu19);

		jMenu20.setText("Edit");
		jMenuBar2.add(jMenu20);

		jMenu22.setText("File");
		jMenuBar3.add(jMenu22);

		jMenu23.setText("Edit");
		jMenuBar3.add(jMenu23);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jToolBar1.setRollover(true);

		jButton1.setText("\u9009\u62e9\u6587\u4ef6");
		jButton1.setFocusable(false);
		jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jToolBar1.add(jButton1);

		jButton2.setText("\u4e0a\u4f20\u6587\u4ef6");
		jButton2.setFocusable(false);
		jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton2);

		jButton3.setText("\u4e0b\u8f7d\u6587\u4ef6");
		jButton3.setFocusable(false);
		jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton3.setMaximumSize(new java.awt.Dimension(65, 23));
		jButton3.setMinimumSize(new java.awt.Dimension(65, 23));
		jButton3.setPreferredSize(new java.awt.Dimension(49, 23));
		jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jToolBar1.add(jButton3);

		jButton4.setText("\u66f4\u65b0\u76ee\u5f55");
		jButton4.setFocusable(false);
		jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jToolBar1.add(jButton4);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jPanel1.setLayout(new java.awt.GridLayout(1, 0));
		jPanel1.setLayout(new java.awt.GridLayout(0,2));
		btn = new JButton[10];
		for (int i = 0; i < 10; i++) {
			btn[i] = new JButton();
			jPanel1.add(btn[i]);
		}
		jMenu1.setText("\u7528\u6237\u8bbe\u7f6e");
		jMenu1.setFont(new java.awt.Font("微软雅黑", 0, 16));
		jMenu1.setMaximumSize(new java.awt.Dimension(80, 32767));
		jMenu1.setPreferredSize(new java.awt.Dimension(80, 19));

		jMenu5.setText("\u7cfb\u7edf\u7ba1\u7406\u5458");

		jMenuItem1.setText("\u8bbe\u7f6e\u7fa4\u7ec4\u7ba1\u7406\u5458");
		jMenu5.add(jMenuItem1);

		jMenuItem2.setText("\u5206\u914d\u7fa4\u7ec4\u7a7a\u95f4\u5927\u5c0f");
		jMenu5.add(jMenuItem2);

		jMenuItem17
				.setText("\u5efa\u7acb\u7fa4\u7ec4\u5171\u4eab\u6587\u4ef6\u5939");
		jMenu5.add(jMenuItem17);

		jMenuItem18.setText("\u8bbe\u7f6e\u7fa4\u7ec4\u6743\u9650");
		jMenu5.add(jMenuItem18);

		jMenuItem26.setText("\u5206\u914d\u4e2a\u4eba\u7a7a\u95f4\u5927\u5c0f");
		jMenu5.add(jMenuItem26);

		jMenuItem27.setText("\u5efa\u7acb\u4e2a\u4eba\u4e91\u6587\u4ef6\u5939");
		jMenu5.add(jMenuItem27);

		jMenu1.add(jMenu5);

		jMenu6.setText("\u4e1a\u52a1\u7fa4\u7ec4\u7ba1\u7406\u5458");

		jMenuItem19.setText("\u521b\u5efa\u5b50\u76ee\u5f55");
		jMenu6.add(jMenuItem19);

		jMenuItem20.setText("\u5220\u9664\u5b50\u76ee\u5f55");
		jMenu6.add(jMenuItem20);

		jMenuItem21.setText("\u79fb\u52a8\u5b50\u76ee\u5f55");
		jMenu6.add(jMenuItem21);

		jMenuItem22.setText("\u5206\u914d\u64cd\u4f5c\u6743\u9650");
		jMenu6.add(jMenuItem22);

		jMenu11.setText("\u521b\u5efa\u8054\u5408\u7f16\u8f91\u7ec4");

		jMenuItem40.setText("\u6307\u5b9a\u7528\u6237");
		jMenu11.add(jMenuItem40);

		jMenu6.add(jMenu11);

		jMenuItem39.setText("\u5220\u9664\u8054\u5408\u7f16\u8f91\u7ec4");
		jMenu6.add(jMenuItem39);

		jMenu1.add(jMenu6);

		jMenuItem3.setText("\u4e1a\u52a1\u7fa4\u7ec4\u7528\u6237");
		jMenu1.add(jMenuItem3);

		jMenu8.setText("\u4f01\u4e1a\u4e2a\u4eba\u7528\u6237");

		jMenuItem13.setText("\u521b\u5efa\u5b50\u76ee\u5f55");
		jMenu8.add(jMenuItem13);

		jMenuItem28.setText("\u5220\u9664\u5b50\u76ee\u5f55");
		jMenu8.add(jMenuItem28);

		jMenuItem29.setText("\u79fb\u52a8\u5b50\u76ee\u5f55");
		jMenu8.add(jMenuItem29);

		jMenuItem5.setText("\u521b\u5efa\u81ea\u7531\u7fa4\u7ec4");
		jMenu8.add(jMenuItem5);

		jMenuItem15.setText("\u53d6\u6d88\u81ea\u7531\u7fa4\u7ec4");
		jMenu8.add(jMenuItem15);

		jMenu1.add(jMenu8);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("\u7fa4\u7ec4\u7528\u6237\u64cd\u4f5c");
		jMenu2.setFont(new java.awt.Font("微软雅黑", 0, 16));
		jMenu2.setMaximumSize(new java.awt.Dimension(110, 32767));
		jMenu2.setPreferredSize(new java.awt.Dimension(50, 19));

		jMenu7.setText("\u4e0a\u4f20\u6587\u4ef6");

		jMenuItem23.setText("CP-ABE\u65b9\u5f0f");
		jMenu7.add(jMenuItem23);

		jMenuItem24.setText("\u9759\u6001\u5b8c\u6574\u6027\u65b9\u5f0f");
		jMenu7.add(jMenuItem24);

		jMenuItem25.setText("\u4e24\u8005\u7ec4\u5408\u65b9\u5f0f");
		jMenu7.add(jMenuItem25);

		jMenu2.add(jMenu7);

		jMenu12.setText("\u5171\u4eab\u6587\u4ef6");

		jMenuItem4.setText("ABE\u65b9\u5f0f\u4e0b\u8f7d\u6587\u4ef6");
		jMenu12.add(jMenuItem4);

		jMenuItem14.setText("\u4e0b\u8f7d\u6587\u4ef6\u5230\u672c\u5730");
		jMenu12.add(jMenuItem14);

		jMenu2.add(jMenu12);

		jMenu13.setText("\u9605\u8bfb\u6587\u4ef6");

		jMenuItem41.setText("\u5728\u7ebf\u6253\u5f00\u6587\u4ef6");
		jMenu13.add(jMenuItem41);

		jMenuItem42.setText("ABE\u65b9\u5f0f\u6253\u5f00\u6587\u4ef6");
		jMenu13.add(jMenuItem42);

		jMenu2.add(jMenu13);

		jMenuItem43.setText("\u6587\u4ef6\u5220\u9664");
		jMenu2.add(jMenuItem43);

		jMenuItem44.setText("\u9a8c\u8bc1\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu2.add(jMenuItem44);

		jMenuItem45.setText("\u6062\u590d\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu2.add(jMenuItem45);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("\u4e2a\u4eba\u7528\u6237\u64cd\u4f5c");
		jMenu3.setFont(new java.awt.Font("微软雅黑", 0, 16));
		jMenu3.setMaximumSize(new java.awt.Dimension(110, 32767));
		jMenu3.setPreferredSize(new java.awt.Dimension(55, 19));

		jMenu9.setText("\u4e0a\u4f20\u6587\u4ef6");

		jMenuItem30.setText("CP-ABE\u65b9\u5f0f");
		jMenu9.add(jMenuItem30);

		jMenuItem31.setText("\u9759\u6001\u5b8c\u6574\u6027\u65b9\u5f0f");
		jMenu9.add(jMenuItem31);

		jMenuItem32.setText("\u4e24\u8005\u7ec4\u5408\u65b9\u5f0f");
		jMenu9.add(jMenuItem32);

		jMenu3.add(jMenu9);

		jMenu14.setText("\u4e0b\u8f7d\u6587\u4ef6");

		jMenuItem7.setText("ABE\u65b9\u5f0f\u4e0b\u8f7d");
		jMenu14.add(jMenuItem7);

		jMenuItem46.setText("\u4e0b\u8f7d\u6587\u4ef6\u5230\u672c\u5730");
		jMenu14.add(jMenuItem46);

		jMenu3.add(jMenu14);

		jMenu15.setText("\u7f16\u8f91\u4fdd\u5b58\u6587\u4ef6");

		jMenuItem8.setText("\u5728\u7ebf\u7f16\u8f91\u4fdd\u5b58\u6587\u4ef6");
		jMenu15.add(jMenuItem8);

		jMenuItem47
				.setText("ABE\u65b9\u5f0f\u7f16\u8f91\u4fdd\u5b58\u6587\u4ef6");
		jMenu15.add(jMenuItem47);

		jMenu3.add(jMenu15);

		jMenuItem48.setText("\u6587\u4ef6\u5220\u9664");
		jMenu3.add(jMenuItem48);

		jMenuItem49.setText("\u9a8c\u8bc1\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu3.add(jMenuItem49);

		jMenuItem50.setText("\u6062\u590d\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu3.add(jMenuItem50);

		jMenuBar1.add(jMenu3);

		jMenu4.setText("\u81ea\u7531\u7fa4\u7ec4\u7528\u6237");
		jMenu4.setFont(new java.awt.Font("微软雅黑", 0, 16));
		jMenu4.setMaximumSize(new java.awt.Dimension(110, 32767));
		jMenu4.setPreferredSize(new java.awt.Dimension(55, 19));

		jMenuItem10.setText("\u521b\u5efa\u81ea\u7531\u7fa4\u7ec4\u7528\u6237");
		jMenu4.add(jMenuItem10);

		jMenuItem11.setText("\u521b\u5efa\u5171\u4eab\u6587\u4ef6\u5939");
		jMenu4.add(jMenuItem11);

		jMenuItem12.setText("\u5220\u9664\u5171\u4eab\u6587\u4ef6\u5939");
		jMenu4.add(jMenuItem12);

		jMenu16.setText("\u4e0a\u4f20\u6587\u4ef6");

		jMenuItem16.setText("\u903b\u8f91\u4e0a\u4f20\u6587\u4ef6");
		jMenu16.add(jMenuItem16);

		jMenuItem6.setText("ABE\u65b9\u5f0f\u4e0a\u4f20");
		jMenu16.add(jMenuItem6);

		jMenuItem33.setText("TPA\u65b9\u5f0f\u4e0a\u4f20");
		jMenu16.add(jMenuItem33);

		jMenu4.add(jMenu16);

		jMenu17.setText("\u4e0b\u8f7d\u6587\u4ef6");

		jMenuItem51.setText("\u4e0b\u8f7d\u6587\u4ef6\u5230\u672c\u5730");
		jMenu17.add(jMenuItem51);

		jMenuItem52.setText("ABE\u65b9\u5f0f\u4e0b\u8f7d");
		jMenu17.add(jMenuItem52);

		jMenuItem53.setText("TPA\u65b9\u5f0f\u4e0b\u8f7d");
		jMenu17.add(jMenuItem53);

		jMenu4.add(jMenu17);

		jMenu18.setText("\u5728\u7ebf\u9605\u8bfb\u6587\u4ef6");

		jMenuItem54.setText("\u5728\u7ebf\u6253\u5f00\u6587\u4ef6");
		jMenu18.add(jMenuItem54);

		jMenuItem55.setText("ABE\u65b9\u5f0f\u6253\u5f00");
		jMenu18.add(jMenuItem55);

		jMenu4.add(jMenu18);

		jMenuItem56.setText("\u5220\u9664\u6587\u4ef6");
		jMenu4.add(jMenuItem56);

		jMenuItem57.setText("\u9a8c\u8bc1\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu4.add(jMenuItem57);

		jMenuItem58.setText("\u6062\u590d\u6587\u4ef6\u5b8c\u6574\u6027");
		jMenu4.add(jMenuItem58);

		jMenuBar1.add(jMenu4);

		jMenu21.setText("\u8054\u5408\u7f16\u8f91\u7528\u6237");
		jMenu21.setFont(new java.awt.Font("微软雅黑", 0, 16));
		jMenu21.setMaximumSize(new java.awt.Dimension(110, 32767));
		jMenu21.setPreferredSize(new java.awt.Dimension(55, 19));

		jMenuItem59
				.setText("\u4e0a\u4f20\u6587\u4ef6\u5230\u6307\u5b9a\u6587\u4ef6\u5939");
		jMenu21.add(jMenuItem59);

		jMenuItem60.setText("\u5220\u9664\u6587\u4ef6");
		jMenu21.add(jMenuItem60);

		jMenuItem61.setText("\u5bf9\u6587\u4ef6\u8054\u5408\u7f16\u8f91");
		jMenu21.add(jMenuItem61);

		jMenuItem70.setText("\u7248\u672c\u7ba1\u7406");
		jMenu21.add(jMenuItem70);

		jMenuItem62.setText("\u4e0a\u4f20\u6587\u4ef6");
		jMenu21.add(jMenuItem62);

		jMenuBar1.add(jMenu21);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jToolBar1,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 712,
						Short.MAX_VALUE)
				.addComponent(jTextField1,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 712,
						Short.MAX_VALUE)
				.addComponent(jScrollPane2,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE, 712,
						Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(65, 65, 65)
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										319,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(94, 94, 94)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										234, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jToolBar1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										25,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														272,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPanel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														156,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(58, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)
			throws IOException {
		// TODO add your handling code here:
		testupdate();
	}

	public static void testupdate() throws IOException {

		FTPClient ftpClient = new FTPClient();
		ftpClient.connect(server);
		ftpClient.login(username, password);
		File srcFilename = new File(jTextField1.getText().toString());
		String remoteDir = "/student";
		//String remoteDir = "/uftp";
		FTPFile[] remoteFiles = ftpClient.listFiles(remoteDir);
		String dir = "目录" + remoteDir + "下的文件:";
		jTextArea1.append(dir + "\r\n");
		System.out.println("目录" + remoteDir + "下的文件:");
		if (remoteFiles != null) {
			for (int i = 0; i < remoteFiles.length; i++) {
				String name = remoteFiles[i].getName();
				long length = remoteFiles[i].getSize();
				String readableLength = FileUtils
						.byteCountToDisplaySize(length);
				System.out.println(name + ":\t\t" + readableLength);
				String detail = name + ":\t\t" + readableLength;
				jTextArea1.append(detail + "\r\n");
				String lenString = Long.toString(length);
				for (int j = 0; j < 5; j++) {
					btn[j].setText(name);
					btn[j + 1].setText(lenString);
				}
			}
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		testUpload();
	}

	public static void testUpload() {
		FTPClient ftpClient = new FTPClient();
		FileInputStream fis = null;

		try {
			ftpClient.connect(server);
			ftpClient.login(username, password);

			File srcFile = new File(jTextField1.getText().toString());
			System.out.println("本地文件名 " + srcFile.getName());
			fis = new FileInputStream(srcFile);
			//设置上传目录 
			ftpClient.changeWorkingDirectory("/student");
			//ftpClient.changeWorkingDirectory("/uftp");
			ftpClient.setBufferSize(1024);
			ftpClient.setControlEncoding("GBK");
			//设置文件类型（二进制） 
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			String remoteFilename = srcFile.getName();
			ftpClient.storeFile(remoteFilename, fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("FTP客户端出错！", e);
		} finally {
			IOUtils.closeQuietly(fis);
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
		}
		System.out.println("upload success!");
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws IOException {
		// TODO add your handling code here:
		//if (evt.getSource().equals(jButton1)) {
		JFileChooser jfc = new JFileChooser();
		jfc.setCurrentDirectory(new File("C:\\"));
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		jfc.setMultiSelectionEnabled(true);
		int state = jfc.showDialog(null, "选择");
		File f = jfc.getSelectedFile();
		System.out.println("当前选中的名字是 " + f.getName());
		jTextField1.setText(f.getCanonicalPath());

		//System.out.println(f.getAbsolutePath());
		System.out.println("当前选中的路径是 " + f.getCanonicalPath());
		//return f.getCanonicalPath();
		//}
	}

	public static void testDownload() {
		FTPClient ftpClient = new FTPClient();
		FileOutputStream fos = null;

		try {
			ftpClient.connect(server);
			ftpClient.login(username, password);
			File srcFilename = new File(jTextField1.getText().toString());
			String localFilerecover = "D:/" + srcFilename.getName();
			System.out.println("修复文件路径 " + localFilerecover);
			String remoteFileName = "/student/" + srcFilename.getName();
			//String remoteFileName = "/uftp/" + srcFilename.getName();
			fos = new FileOutputStream(localFilerecover);

			ftpClient.setBufferSize(1024);
			//设置文件类型（二进制） 
			ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
			ftpClient.retrieveFile(remoteFileName, fos);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("FTP客户端出错！", e);
		} finally {
			IOUtils.closeQuietly(fos);
			try {
				ftpClient.disconnect();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭FTP连接发生异常！", e);
			}
		}
		System.out.println("download success!");
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		testDownload();
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FtpUtil().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu11;
	private javax.swing.JMenu jMenu12;
	private javax.swing.JMenu jMenu13;
	private javax.swing.JMenu jMenu14;
	private javax.swing.JMenu jMenu15;
	private javax.swing.JMenu jMenu16;
	private javax.swing.JMenu jMenu17;
	private javax.swing.JMenu jMenu18;
	private javax.swing.JMenu jMenu19;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu20;
	private javax.swing.JMenu jMenu21;
	private javax.swing.JMenu jMenu22;
	private javax.swing.JMenu jMenu23;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenu jMenu7;
	private javax.swing.JMenu jMenu8;
	private javax.swing.JMenu jMenu9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuBar jMenuBar3;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem10;
	private javax.swing.JMenuItem jMenuItem11;
	private javax.swing.JMenuItem jMenuItem12;
	private javax.swing.JMenuItem jMenuItem13;
	private javax.swing.JMenuItem jMenuItem14;
	private javax.swing.JMenuItem jMenuItem15;
	private javax.swing.JMenuItem jMenuItem16;
	private javax.swing.JMenuItem jMenuItem17;
	private javax.swing.JMenuItem jMenuItem18;
	private javax.swing.JMenuItem jMenuItem19;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem20;
	private javax.swing.JMenuItem jMenuItem21;
	private javax.swing.JMenuItem jMenuItem22;
	private javax.swing.JMenuItem jMenuItem23;
	private javax.swing.JMenuItem jMenuItem24;
	private javax.swing.JMenuItem jMenuItem25;
	private javax.swing.JMenuItem jMenuItem26;
	private javax.swing.JMenuItem jMenuItem27;
	private javax.swing.JMenuItem jMenuItem28;
	private javax.swing.JMenuItem jMenuItem29;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem30;
	private javax.swing.JMenuItem jMenuItem31;
	private javax.swing.JMenuItem jMenuItem32;
	private javax.swing.JMenuItem jMenuItem33;
	private javax.swing.JMenuItem jMenuItem39;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem40;
	private javax.swing.JMenuItem jMenuItem41;
	private javax.swing.JMenuItem jMenuItem42;
	private javax.swing.JMenuItem jMenuItem43;
	private javax.swing.JMenuItem jMenuItem44;
	private javax.swing.JMenuItem jMenuItem45;
	private javax.swing.JMenuItem jMenuItem46;
	private javax.swing.JMenuItem jMenuItem47;
	private javax.swing.JMenuItem jMenuItem48;
	private javax.swing.JMenuItem jMenuItem49;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JMenuItem jMenuItem50;
	private javax.swing.JMenuItem jMenuItem51;
	private javax.swing.JMenuItem jMenuItem52;
	private javax.swing.JMenuItem jMenuItem53;
	private javax.swing.JMenuItem jMenuItem54;
	private javax.swing.JMenuItem jMenuItem55;
	private javax.swing.JMenuItem jMenuItem56;
	private javax.swing.JMenuItem jMenuItem57;
	private javax.swing.JMenuItem jMenuItem58;
	private javax.swing.JMenuItem jMenuItem59;
	private javax.swing.JMenuItem jMenuItem6;
	private javax.swing.JMenuItem jMenuItem60;
	private javax.swing.JMenuItem jMenuItem61;
	private javax.swing.JMenuItem jMenuItem62;
	private javax.swing.JMenuItem jMenuItem7;
	private javax.swing.JMenuItem jMenuItem70;
	private javax.swing.JMenuItem jMenuItem8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private static javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private static javax.swing.JTextField jTextField1;
	private javax.swing.JToolBar jToolBar1;
	private static javax.swing.JButton btn[];
	// End of variables declaration//GEN-END:variables

}