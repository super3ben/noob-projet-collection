package com.manage.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import com.ui.Login;

import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manage extends JFrame implements ActionListener{


	 JTextField textField;
	 JPasswordField passwordField;
	 JButton btnNewButton_1;
	 JButton btnNewButton;
	JPanel jp=new JPanel(){public void paintComponent(java.awt.Graphics g){
		ImageIcon icon=new ImageIcon(this.getClass().getResource("qa.jpg"));
		g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
	}
};



public Manage(String title){
	super(title);
	setIconImage(Toolkit.getDefaultToolkit().getImage(Manage.class.getResource("qr.jpg")));
	init();
}
public void init(){
	mangeF=this;
	this.setResizable(false);
	this.setVisible(true);
	getContentPane().add(jp, BorderLayout.CENTER);
	jp.setLayout(null);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\uFF1A");
	lblNewLabel.setForeground(Color.ORANGE);
	lblNewLabel.setBounds(115, 61, 72, 18);
	jp.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("\u5BC6\u7801\uFF1A");
	lblNewLabel_1.setForeground(Color.ORANGE);
	lblNewLabel_1.setBounds(115, 122, 72, 18);
	jp.add(lblNewLabel_1);
	
	//用户名
	textField = new JTextField();
	textField.setBounds(222, 58, 119, 24);
	jp.add(textField);
	textField.setColumns(10);
	 
	//密码
	passwordField = new JPasswordField();
	passwordField.setBounds(222, 119, 119, 24);
	jp.add(passwordField);
	
	//登陆按钮
	 btnNewButton = new JButton("\u767B  \u9646");
	btnNewButton.setBounds(74, 188, 113, 27);
	jp.add(btnNewButton);
	
	//返回按钮
	 btnNewButton_1 = new JButton("\u8FD4  \u56DE");
	btnNewButton_1.setBounds(249, 188, 113, 27);
	jp.add(btnNewButton_1);
	
	JLabel lblNewLabel_2 = new JLabel("\u7BA1 \u7406 \u5458");
	lblNewLabel_2.setForeground(Color.RED);
	lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 20));
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setBounds(115, 13, 214, 35);
	jp.add(lblNewLabel_2);
	this.setBounds(400, 300, 472, 302);
	btnNewButton_1.addActionListener(this);
	btnNewButton.addActionListener(this);
}

//String pwd=new String(passwordField.getPassword());
//String name=textField.getText();

public void actionPerformed(ActionEvent e) {
	Object source=e.getSource();
	if(btnNewButton_1==source){
         Login.manF.setVisible(false);
         Login.guif.setVisible(true);
	}
	if(btnNewButton==source){
		if("admin".equals(textField.getText())&&"admin".equals(new String(passwordField.getPassword()))){
             JOptionPane.showMessageDialog(rootPane, "登陆成功！");
             mangeF.setVisible(false);
             manGUI=new ManagerGUI("管理员登录模式");
		}else{
			JOptionPane.showMessageDialog(rootPane, "用户名或密码错误");
		}
	}
}

static JFrame mangeF;
static JFrame manGUI;
}

