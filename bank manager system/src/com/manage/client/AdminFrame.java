package com.manage.client;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class AdminFrame extends JFrame{
	
	JTabbedPane jtp=new JTabbedPane();//ѡ�
	JPanel userP=new UserManagerPanel();//�û���Ϣ��panel
	
	
	public  AdminFrame(String title){
		super(title);
		init();
	}
	
	public void init(){
		userP.setBackground(Color.white);//����ѡ��������ɫΪ��ɫ
		userP.setOpaque(true);
		jtp.add("�ͻ���Ϣ",userP);//���֣����
		//this.setLayout(null);
		this.add(jtp);
		//this.add(button);
		this.setBounds(200, 100, 900, 400);
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
//	public static void main(String[] args) {
//		new AdminFrame("��Ϣ����");
//		}
}
