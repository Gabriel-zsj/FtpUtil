package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test extends JFrame implements ActionListener {
	private static final long serialVersionUID = -3597288512867691569L;
	JTextField labfilepath;
	JPanel panel;
	JButton btn;

	public test() {
		labfilepath = new JTextField(30);
		btn = new JButton("浏览");
		btn.addActionListener(this);

		panel = new JPanel();
		panel.add(btn);
		panel.add(labfilepath);
		getContentPane().add(panel);
		setTitle("选择上传日志文件夹");
		setLocation(400,200);
		setSize(500, 150);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		chooser.setMultiSelectionEnabled(false);
		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		chooser.setDialogTitle("选择上传日志文件夹");
		int result = chooser.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			String filepath = file.getAbsolutePath();
			labfilepath.setText( filepath);// 将文件路径设到JTextField
		}
	}

	public static void main(String args[]) {
		new test();
	}
	
}

