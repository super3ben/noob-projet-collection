package com.manage.client;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AdminFrame extends JFrame{
	
	JTabbedPane jtp=new JTabbedPane();//选项卡
	JPanel userP=new UserManagerPanel();//用户信息的panel
	
	
	public  AdminFrame(String title){
		super(title);
		init();
	}
	
	public void init(){
		userP.setBackground(Color.white);//设置选项卡的面板颜色为白色
		userP.setOpaque(true);
		jtp.add("客户信息",userP);//名字，面板
		//this.setLayout(null);
		this.add(jtp);
		//this.add(button);
		this.setBounds(200, 100, 900, 400);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
//	public static void main(String[] args) {
//		new AdminFrame("信息管理");
//		}
}
