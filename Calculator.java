package work190402;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calculator frame = new Calculator();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(14, 26, 347, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "+");
			}
		});
		button.setFont(new Font("宋体", Font.PLAIN, 24));
		button.setBounds(42, 103, 47, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "-");
			}
		});
		button_1.setFont(new Font("宋体", Font.PLAIN, 24));
		button_1.setBounds(123, 103, 47, 46);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
			}
		});
		button_2.setFont(new Font("宋体", Font.PLAIN, 24));
		button_2.setBounds(215, 103, 47, 46);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("/");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
			}
		});
		button_3.setFont(new Font("宋体", Font.PLAIN, 24));
		button_3.setBounds(314, 103, 47, 46);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "1");
			}
		});
		button_4.setFont(new Font("宋体", Font.PLAIN, 24));
		button_4.setBounds(42, 185, 47, 46);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("2");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_5.setFont(new Font("宋体", Font.PLAIN, 24));
		button_5.setBounds(123, 185, 47, 46);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("3");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_6.setFont(new Font("宋体", Font.PLAIN, 24));
		button_6.setBounds(215, 185, 47, 46);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_7.setFont(new Font("宋体", Font.PLAIN, 24));
		button_7.setBounds(314, 185, 47, 46);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_8.setFont(new Font("宋体", Font.PLAIN, 24));
		button_8.setBounds(42, 262, 47, 46);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_9.setFont(new Font("宋体", Font.PLAIN, 24));
		button_9.setBounds(123, 262, 47, 46);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("7");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_10.setFont(new Font("宋体", Font.PLAIN, 24));
		button_10.setBounds(215, 262, 47, 46);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("8");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_11.setFont(new Font("宋体", Font.PLAIN, 24));
		button_11.setBounds(314, 262, 47, 46);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("9");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_12.setFont(new Font("宋体", Font.PLAIN, 24));
		button_12.setBounds(42, 339, 47, 46);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_13.setFont(new Font("宋体", Font.PLAIN, 24));
		button_13.setBounds(123, 339, 47, 46);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton(".");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
 		button_14.setFont(new Font("宋体", Font.PLAIN, 24));
		button_14.setBounds(215, 339, 47, 46);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//11+22
				String str = textField.getText();
				int pos = str.indexOf("+");//未找到返回-1
				int pos1 = str.indexOf("-");
				int pos2 = str.indexOf("*");
				int pos3 = str.indexOf("/");
				if(pos!=-1) {
				String a1 = str.substring(0, pos);
				
				int na1 = Integer.parseInt(a1);
				//parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
				//如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数
				
				String b1 = str.substring(pos+1);
				
				int nb1 = Integer.parseInt(b1);
				
				int c1 = na1 + nb1;
				textField.setText(""+c1);
				}
				else if(pos1!=-1)
				{
					String a1 = str.substring(0, pos1);
					
					int na1 = Integer.parseInt(a1);
					//parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
					//如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数
					
					String b1 = str.substring(pos1+1);
					
					int nb1 = Integer.parseInt(b1);
					
					int c1 = na1 - nb1;
					textField.setText(""+c1);
				}
				else if(pos2!=-1)
				{
					String a1 = str.substring(0, pos2);
					
					int na1 = Integer.parseInt(a1);
					//parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
					//如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数
					
					String b1 = str.substring(pos2+1);
					
					int nb1 = Integer.parseInt(b1);
					
					int c1 = na1 * nb1;
					textField.setText(""+c1);
				}
				else if(pos3!=-1)
				{
					String a1 = str.substring(0, pos3);
					
					int na1 = Integer.parseInt(a1);
					//parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
					//如果方法有两个参数， 使用第二个参数指定的基数，将字符串参数解析为有符号的整数
					
					String b1 = str.substring(pos3+1);
					int nb1 = Integer.parseInt(b1);
					if(nb1==0)
					{
						textField.setText(""+"错误");
					}
					int c1 = na1 / nb1;
					textField.setText(""+c1);
				}
				
			}
		});
		button_15.setFont(new Font("宋体", Font.PLAIN, 24));
		button_15.setBounds(314, 339, 47, 46);
		contentPane.add(button_15);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				
			}
		});
		btnC.setFont(new Font("宋体", Font.PLAIN, 24));
		btnC.setBounds(395, 26, 47, 46);
		contentPane.add(btnC);
	}

}