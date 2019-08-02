package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.clientData.Client;
import com.dataManger.ClientDb;
import com.db.Arith;



public class TransferAccount extends JFrame {

	JPanel contentPane = new JPanel(){
		public void paintComponent(java.awt.Graphics g){
			ImageIcon icon = new ImageIcon(this.getClass().getResource("10.jpg"));
			g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
		};
	};
	JLabel label = new JLabel("转账");
	JLabel label_1 = new JLabel("转账卡号：");
	JTextField textField  = new JTextField(10);
	JLabel label_2 = new JLabel("转账数目：");
	JTextField textField1  = new JTextField(10);
	JButton button = new JButton("确认转账");
	JButton button_1 = new JButton("返回");
	public TransferAccount(String title){
		super(title);
		init();
	}
	public void init(){
		contentPane.add(label);
		//转账
		label.setBounds(225, 40,100, 30);
		label.setFont(new Font("楷体", Font.BOLD, 40));
		label.setForeground(Color.white);
		contentPane.add(label);
		//转账卡号
		label_1.setBounds(120, 90, 150, 20);
		label_1.setFont(new Font("楷体", Font.BOLD, 20));
		label_1.setForeground(Color.WHITE);
		contentPane.add(label_1);
		contentPane.add(textField);	
		textField.setBounds(239, 93, 150, 24);
		textField.setFont(new Font("楷体", Font.BOLD, 20));
		//转账数目
		label_2.setBounds(120, 150, 150, 20);
		label_2.setFont(new Font("楷体", Font.BOLD, 20));
		label_2.setForeground(Color.WHITE);
		contentPane.add(label_2);
		contentPane.add(textField1);	
		textField1.setBounds(239, 150, 150, 24);
		textField1.setFont(new Font("楷体", Font.BOLD, 20));
		//确定转账
		contentPane.add(button);
		button.setBounds(206, 230, 120, 27);
		button.setFont(new Font("楷体", Font.BOLD, 20));
		contentPane.add(button_1);
		
		button_1.setBounds(0, 0, 45, 33);
		button_1.setIcon(new ImageIcon(this.getClass().getResource("2.jpg")));
		contentPane.setLayout(null);

		this.add(contentPane);
		this.setBounds(600, 200, 540, 350);
		this.setVisible(true);
		 this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerUI.transfer.setVisible(false);
				CustomerUI.customerui.setVisible(true);
			}
		});
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				ClientDB db=new ClientDB();
				/*HashMap<String,Client> cmap=db.getData("Client");
				Collection<Client> clients=cmap.values();*/
				String card1=textField.getText();//卡号
				String str=textField1.getText();//money
				double money=Double.parseDouble(str);//转为double
				Client client=ClientDb.clients.get(Login.card);//转出账户
//				Collection<Client> clt=ClientDb.clients.values();
				
						
				  Client client1=ClientDb.clients.get(card1);//转到账户
				  
				  
					if(!(client1==null)) {      //
						if(!client1.getCardNO().equals(Login.card)){
							if(client.getStatus()==1) {
								if(client.getMoney()>=money) {
									double cMoney=Arith.sub(client.getMoney(), money);//转出账号减去money
									double c1Money=Arith.add(client1.getMoney(), money);//转入账号加money
									client.setMoney(cMoney);
									client1.setMoney(c1Money);
									ClientDb.clients.put(Login.card, client);
									ClientDb.clients.put(card1,client1);
									ClientDb.saveData(ClientDb.clients);
									JOptionPane.showMessageDialog(button, "转账成功");
								}else {
									JOptionPane.showMessageDialog(button, "余额不足");
								}
							}else {
								JOptionPane.showMessageDialog(button, "卡号已被冻结");
							}
						}else {
							JOptionPane.showMessageDialog(button, "禁止给自己转账");
						}
					
					}else {
						JOptionPane.showMessageDialog(button, "转账卡号不存在");
					
					}
					
				
				}
		});
	}

	
}