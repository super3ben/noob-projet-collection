package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.soap.Text;

import com.clientData.Client;
import com.dataManger.ClientDb;
import com.db.Arith;


public class Break extends JFrame{

	JPanel contentPane = new JPanel(){
		public void paintComponent(java.awt.Graphics g){
			ImageIcon icon = new ImageIcon(this.getClass().getResource("4.jpg"));
			g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
		};
	};
	JLabel label = new JLabel("取款");
	JLabel label_1 = new JLabel("取款数：");
	JTextField textField  = new JTextField(10);
	JButton button = new JButton("确认取款");
	JButton button_1 = new JButton("返回");
	JLabel label_2 = new JLabel("（0-500000）");
	public Break(String title){
		super(title);
		init();
	}
	public void init(){
		contentPane.add(label);
		label.setBounds(225, 40,100, 30);
		label.setFont(new Font("楷体", Font.BOLD, 40));
		label.setForeground(Color.white);
		contentPane.add(label_1);
		label_1.setBounds(120, 90, 150, 30);
		label_1.setFont(new Font("楷体", Font.BOLD, 30));
		contentPane.add(label_2);
		label_2.setBounds(225, 120, 150, 20);
		label_2.setFont(new Font("楷体", Font.BOLD, 20));
		contentPane.add(textField);	
		textField.setBounds(239, 93, 118, 24);
		textField.setFont(new Font("楷体", Font.BOLD, 20));
		contentPane.add(button);
		button.setBounds(206, 180, 120, 27);
		button.setFont(new Font("楷体", Font.BOLD, 20));
		contentPane.add(button_1);
		button_1.setBounds(0, 0, 45, 33);
		button_1.setIcon(new ImageIcon(this.getClass().getResource("2.jpg")));
		contentPane.setLayout(null);

		this.add(contentPane);
		this.setBounds(600, 200, 540, 300);
		this.setVisible(true);
		 this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerUI.breakf.setVisible(false);
				CustomerUI.customerui.setVisible(true);
			}
		});
		//确定取款
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText();				
				double num1=Double.parseDouble(num);
				/*ClientDb db=new ClientDb();
			    HashMap<String,Client> cmap=db.getData("Client");//
				Collection<Client> clients=cmap.values();*/
				Client client = ClientDb.clients.get(Login.card);
				
					if(client.getCardNO().equals(Login.card)) {
						if(client.getStatus()!=0) {
							if(num1<=client.getMoney()) {
								double money=Arith.sub(client.getMoney(), num1);
								client.setMoney(money);
								/*cmap.put(c2.getiD(),c2 );
								db.saveData(cmap, "Client")*/;
								ClientDb.clients.put(Login.card, client);
								
								ClientDb.saveData(ClientDb.clients);
								JOptionPane.showMessageDialog(button, "取款成功");
							}else {
								JOptionPane.showMessageDialog(button, "余额不足");
							}
						  }else {
							JOptionPane.showMessageDialog(button, "用户已被冻结");
							
						}
					}
				}
			
		});
	}
	

}
