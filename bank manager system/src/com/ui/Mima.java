package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import com.clientData.Client;
import com.dataManger.ClientDb;

public class Mima extends JFrame {
	 JPasswordField passwordField=new JPasswordField();
	 JPasswordField passwordField_1=new JPasswordField();
	 JPasswordField passwordField_2=new JPasswordField();
	 JButton btnNewButton = new JButton("\u786E \u8BA4");
	 JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
	 JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
			ImageIcon icon=new ImageIcon(this.getClass().getResource("11.jpg"));
			g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
		}
	};
	
public Mima(String title){
	super(title);
	getContentPane().setLayout(null);
	panel.setSize(410, 273);
	
	JLabel lblNewLabel = new JLabel("\u4FEE\u6539\u5BC6\u7801");
	lblNewLabel.setForeground(Color.WHITE);
	lblNewLabel.setFont(new Font("宋体", Font.BOLD, 25));
	lblNewLabel.setBounds(141, 13, 123, 35);
	getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("\u539F \u5BC6 \u7801\uFF1A");
	lblNewLabel_1.setForeground(new Color(255, 239, 213));
	lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 17));
	lblNewLabel_1.setBounds(40, 75, 113, 18);
	getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("\u65B0 \u5BC6 \u7801\uFF1A");
	lblNewLabel_2.setForeground(new Color(255, 228, 181));
	lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 17));
	lblNewLabel_2.setBounds(40, 106, 113, 30);
	getContentPane().add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("\u518D\u6B21\u786E\u8BA4\uFF1A");
	lblNewLabel_3.setForeground(new Color(0, 0, 128));
	lblNewLabel_3.setFont(new Font("宋体", Font.BOLD, 17));
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setBounds(26, 148, 120, 18);
	getContentPane().add(lblNewLabel_3);
	passwordField.setBackground(new Color(0, 0, 255));
	passwordField.setForeground(new Color(255, 255, 0));
	
    //原密码
	passwordField.setBounds(174, 72, 147, 24);
	passwordField.setOpaque(false);
	//passwordField.setBorder();
	getContentPane().add(passwordField);
	passwordField.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String mima=new String(passwordField.getPassword());
				}
	});
	passwordField_1.setBackground(new Color(255, 255, 255));
	passwordField_1.setForeground(new Color(255, 215, 0));
	
	//修改密码
	passwordField_1.setBounds(174, 146, 147, 24);
	passwordField_1.setOpaque(false);
	getContentPane().add(passwordField_1);
	passwordField_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			
		}
	});
	passwordField_2.setForeground(new Color(255, 215, 0));
	
	//新密码
	passwordField_2.setBounds(174, 109, 147, 24);
	getContentPane().add(passwordField_2);
	passwordField_2.setOpaque(false);
	
	//确认按钮

	btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 15));
	btnNewButton.setForeground(Color.RED);
	btnNewButton.setBounds(50, 183, 113, 27);
	btnNewButton.setContentAreaFilled(false);
	btnNewButton.setBorderPainted(false);
	getContentPane().add(btnNewButton);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//显示用户界面 并持久化数据
			Client client=ClientDb.clients.get(Login.card);
			String pwd=new String(passwordField.getPassword());
			String pwd1=new String(passwordField_1.getPassword());
			String pwd2=new String(passwordField_2.getPassword());
			if(pwd.equals(client.getCardPwd())){
				if(pwd1.equals(pwd2)){
					JOptionPane.showMessageDialog(rootPane, "修改密码成功");
					client.setCardPwd(new String(passwordField_1.getPassword()));
					
					ClientDb.clients.put(Login.card,client);
					ClientDb.saveData(ClientDb.clients);
					//回用户界面
					
				}else{
					JOptionPane.showMessageDialog(rootPane,"修改密码不一致");
				}
			}else{
				JOptionPane.showMessageDialog(rootPane, "密码错误");
			}
		}
	});
	
	//取消按钮
	
	btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
	btnNewButton_1.setForeground(Color.RED);
	btnNewButton_1.setBounds(207, 183, 113, 27);
	getContentPane().add(btnNewButton_1);
	btnNewButton_1.setContentAreaFilled(false);
	btnNewButton_1.setBorderPainted(false);
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//回到用户界面
			//CustomerUI.ji.setVisible(false);
			//CustomerUI.jo.setVisible(true);
			
	CustomerUI.mima.setVisible(false);
	CustomerUI.customerui.setVisible(true);
		}
	});
	init();
}
public void init(){
	this.setVisible(true);
	this.setBounds(500,250,410,273);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setResizable(false);
	getContentPane().add(panel);
}

}