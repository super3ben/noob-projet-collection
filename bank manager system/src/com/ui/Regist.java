package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.clientData.Client;
import com.dataManger.ClientDb;

public class Regist extends JFrame{
	Client n;
	JPanel panel = new JPanel(){
		public void paintComponent(java.awt.Graphics g){
			ImageIcon icon = new ImageIcon(this.getClass().getResource("6.jpg"));
			g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
		};
	};
	JLabel lblNewLabel = new JLabel("ע��");
	JButton btnNewButton = new JButton("ע��");
	JLabel lblNewLabel_1 = new JLabel("�û�����");
	JTextField textField = new JTextField("�������û���",20);
	JLabel lblNewLabel_2 = new JLabel("���룺");
	JPasswordField pwdpassword = new JPasswordField();
	JLabel lblNewLabel_4 = new JLabel("���֤�ţ�");
	JTextField textField_1 = new JTextField("���������֤��",20);
	JButton btnNewButton_1 = new JButton("<");
	public Regist(String title){
		super(title);
		init();
	}
	public void init(){
		lblNewLabel.setBounds(160, 30, 100, 40);
		lblNewLabel.setFont(new Font("����",Font.BOLD, 30));
		panel.add(lblNewLabel);
		btnNewButton.setBounds(138, 270, 113, 40);
		btnNewButton.setFont(new Font("����",Font.BOLD, 30));
		panel.add(btnNewButton);
		lblNewLabel_1.setBounds(60, 80, 100, 20);
		lblNewLabel_1.setFont(new Font("����",Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.white);
		textField.setBounds(180, 80, 150, 20);
		textField.setFont(new Font("����",Font.BOLD, 10));
		panel.add(textField);
		lblNewLabel_2.setBounds(60, 140,100, 20);
		lblNewLabel_2.setForeground(Color.white);
		lblNewLabel_2.setFont(new Font("����",Font.BOLD, 20));
		panel.add(lblNewLabel_2);
		pwdpassword.setBounds(180, 140, 150, 20);
		pwdpassword.setFont(new Font("����",Font.BOLD, 10));
		panel.add(pwdpassword);
		lblNewLabel_4.setBounds(60,200, 110, 20);
		lblNewLabel_4.setFont(new Font("����",Font.BOLD, 20));
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setForeground(Color.white);
		textField_1.setBounds(181, 200, 150, 20);
		textField_1.setFont(new Font("����",Font.BOLD, 10));
		panel.add(textField_1);
		btnNewButton_1.setBounds(0, 0, 45, 33);
		btnNewButton_1.setIcon(new ImageIcon(this.getClass().getResource("2.jpg")));
		panel.add(btnNewButton_1);
		panel.setLayout(null);
		this.add(panel);
		this.setBounds(700, 200, 400, 400);
		this.setVisible(true);
		 this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		textField.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				String txt = textField.getText();
				if(txt.trim().length()<=0){
					textField.setText("�������û���");
			    }
			}
			public void focusGained(FocusEvent e) {
				String txt = textField.getText();
				if("�������û���".equals(txt)){
			    textField.setText("");
				}
			}
		});
		textField_1.addFocusListener(new FocusListener() {
			public void focusLost(FocusEvent e) {
				String txt = textField_1.getText();
				if(txt.trim().length()<=0){
					textField_1.setText("���������֤��");
			    }
			}
			public void focusGained(FocusEvent e) {
				String txt = textField_1.getText();
				if("���������֤��".equals(txt)){
					textField_1.setText("");
				}
			}
		});
		//ע��
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����");
				String cname = textField.getText();		
				String pwd = new String(pwdpassword.getPassword());
				String id = textField_1.getText();
				if(cname.equals("�������û���")||pwd.equals("")||id.equals("���������֤��")) {
					 JOptionPane.showMessageDialog(rootPane, "����дע����Ϣ");
				}else {
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����2");
				Set<String> client =  ClientDb.clients.keySet();
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����3");
				int random=(int)(Math.random()*100+1);
				String cardNO=String.valueOf(random);
				for(String c:client){
				   n=ClientDb.clients.get(c);
				  if(cardNO.equals(n.getCardNO())) {
					  random=(int)(Math.random()*100+1);
					  cardNO=String.valueOf(random);
				  }
				 if(n.getcName().equals(cname)){
					 JOptionPane.showMessageDialog(rootPane, "�û��Ѵ��ڣ�");
					 return;
				 }
				}
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����4");
//				Client cs = ClientDb.clients.get(cname);
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����5");
		
					
				
				
				
//				JOptionPane.showMessageDialog(rootPane, "ע�ᰴť�����6");
				Client cnew = new Client(cname,cardNO,pwd,id,1,0);
//				JOptionPane.showMessageDialog(rootPane, cnew);
				ClientDb.clients.put(cardNO, cnew);
				ClientDb.saveData(ClientDb.clients);
				JOptionPane.showMessageDialog(rootPane, "ע��ɹ�������Ϊ��"+random);
				Login.registF.setVisible(false);
				Login.guif.setVisible(true);
				}
			}
		});
         //����
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.registF.setVisible(false);
				Login.guif.setVisible(true);
			}
		});
	}

//	public static void main(String[] args) {
//		new Regist("ע��");
//	}

}
