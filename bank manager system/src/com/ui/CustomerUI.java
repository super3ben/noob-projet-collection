package com.ui;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.ui.Break;


import java.awt.Toolkit;
import java.awt.Color;


public class CustomerUI extends JFrame implements ActionListener{

//	JFrame 
	JFrame custoner=this;
	JButton btn1=new JButton("��ѯ������Ϣ");
	JButton btn2=new JButton("ȡ��");
	JButton btn3=new JButton("ת��");
	JButton btn4=new JButton("���");
	JButton btn5=new JButton("��ӡƾ��");
	JButton btn6=new JButton("�޸�����");
	JButton btn7=new JButton("��ѯ���");
	JButton btn8=new JButton("����");
	JPanel ControlP=new JPanel(){public void paintComponent(java.awt.Graphics g){
		ImageIcon icon=new ImageIcon(this.getClass().getResource("1.jpg"));
		g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
	}
};;
	JLabel infoLabel=new JLabel("�Ǽ�����");
	public CustomerUI(String title) {
		super(title);
//		setIconImage(Toolkit.getDefaultToolkit().getImage(CustomerUI.class.getResource("123.jpg")));
		init();
	}
	public void init() {
		ControlP.setLayout(null);
		getContentPane().add(ControlP);
	     infoLabel.setForeground(Color.WHITE);
		//�й�����
	     infoLabel.setFont(new Font("����",Font.BOLD,50));
	     infoLabel.setBounds(180, 20, 400, 60); 
	     infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
	     ControlP.add(infoLabel);
	     btn1.setForeground(Color.WHITE);
	     btn1.setBackground(Color.LIGHT_GRAY);
	     
	     //��ť
	     btn1.setBounds(70, 120, 250, 100);
	     btn1.setFont(new Font("����",Font.BOLD,30));
	     btn1.setForeground(Color.cyan);
	     btn1.setContentAreaFilled(false);
	     btn1.setBorderPainted(false);
	     ControlP.add(btn1); 
	     btn2.setForeground(Color.WHITE);
	     btn2.setBackground(Color.LIGHT_GRAY);
	     btn2.setBounds(450, 120, 250, 100);
	     btn2.setFont(new Font("����",Font.BOLD,30));
	     btn2.setForeground(Color.cyan);
	     btn2.setContentAreaFilled(false);
	     btn2.setContentAreaFilled(false);
	     btn2.setBorderPainted(false);
	     ControlP.add(btn2); 
	     btn3.setForeground(Color.WHITE);
	     btn3.setBackground(Color.LIGHT_GRAY);
	     btn3.setBounds(70, 270, 250, 100);
	     btn3.setFont(new Font("����",Font.BOLD,30));
	     btn3.setForeground(Color.cyan);
	     btn3.setContentAreaFilled(false);
	     btn3.setBorderPainted(false);
	     ControlP.add(btn3); 
	     btn4.setForeground(Color.WHITE);
	     btn4.setBackground(Color.LIGHT_GRAY);
	     btn4.setBounds(450, 270, 250, 100);
	     btn4.setFont(new Font("����",Font.BOLD,30));
	     btn4.setForeground(Color.cyan);
	     btn4.setContentAreaFilled(false);
	     btn4.setBorderPainted(false);
	     ControlP.add(btn4); 
	     btn5.setBackground(Color.LIGHT_GRAY);
	     btn5.setForeground(Color.WHITE);
	     btn5.setBounds(70, 420, 250, 100);
	     btn5.setFont(new Font("����",Font.BOLD,30));
	     btn5.setForeground(Color.cyan);
	     btn5.setContentAreaFilled(false);
	     btn5.setBorderPainted(false);
	     ControlP.add(btn5); 
	     btn6.setBackground(Color.LIGHT_GRAY);
	     btn6.setForeground(Color.WHITE);
	     btn6.setBounds(450, 420, 250, 100);
	     btn6.setFont(new Font("����",Font.BOLD,30));
	     btn6.setForeground(Color.cyan);
	     btn6.setContentAreaFilled(false);
	     btn6.setBorderPainted(false);
	     ControlP.add(btn6); 
	     btn7.setBackground(Color.LIGHT_GRAY);
	     btn7.setForeground(Color.WHITE);
	     btn7.setBounds(70, 570, 250, 100);
	     btn7.setFont(new Font("����",Font.BOLD,30));
	     btn7.setForeground(Color.cyan);
	     btn7.setContentAreaFilled(false);
	     btn7.setBorderPainted(false);
	     ControlP.add(btn7); 
	     btn8.setBackground(Color.LIGHT_GRAY);
	     btn8.setForeground(Color.WHITE);
	     btn8.setBounds(450, 570, 250, 100);
	     btn8.setFont(new Font("����",Font.BOLD,30));
	     btn8.setForeground(Color.cyan);
	     btn8.setContentAreaFilled(false);
	     btn8.setBorderPainted(false);
	     ControlP.add(btn8); 
		
		this.setBounds(450, 150, 799, 771);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		customerui=this;
		//����
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
	}
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj=e.getSource();
        if(obj==btn1) {
        	
        	customerui.setVisible(false);
			search=new Search("������Ϣ");
		}else if(obj==btn2) {
			
			custoner.setVisible(false);
			breakf=new Break("ȡ��");
		}else if(obj==btn3) {
			
			custoner.setVisible(false);
			transfer=new  TransferAccount("ת��");
		}else if(obj==btn4) {
			
			custoner.setVisible(false);
			deposit=new Deposit("���");
		}else if(obj==btn5) {
			new Print("��ӡƾ��");
		}else if(obj==btn6) {
			
			custoner.setVisible(false);
			mima=new Mima("����");
		}else if(obj==btn7) {
			check=new Check("��ѯ���");
			custoner.setVisible(false);
		}else if(obj==btn8){
			Login.cusf.setVisible(false);
            Login.guif.setVisible(true);
		}
//	   static JFrame  ;//ָ���½·��JFrame����
		
		
	}
	static JFrame customerui;
	static JFrame breakf;
	static JFrame search;
	static JFrame deposit;
	static JFrame transfer;
	static JFrame mima;
	static JFrame check;
	static JFrame print;
	
}

