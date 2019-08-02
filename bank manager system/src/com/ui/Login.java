package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.omg.PortableServer.POAPackage.AdapterAlreadyExists;

import com.clientData.Client;
import com.dataManger.ClientDb;
import com.manage.ui.Manage;
import com.manage.ui.ManagerGUI;


public class Login extends JFrame{
	public static String card;
	static String pwd;
	    JLabel lblNewLabel = new JLabel("�Ǽ�����");
	    JLabel lblNewLabel_1 = new JLabel("���ţ�");
	    JLabel lblNewLabel_2 = new JLabel("���룺");
	    JLabel lblNewLabel_4 = new JLabel("��֤�룺");
	    JTextField textField =new JTextField("�����뿨��");
	    JPasswordField passwordField = new JPasswordField();
	    JTextField textField_1= new JTextField();

	    JTextField textField_2 = new JTextField();
	    
	    JButton btnNewButton = new JButton("��½");
	    JButton btnNewButton_1 = new JButton("ע��");
	    JButton btnNewButton_2 = new JButton("����Ա��½");
	    JPanel panel = new JPanel(){
		public void paintComponent(java.awt.Graphics g){
		ImageIcon icon=new ImageIcon(this.getClass().getResource("8.jpg"));
		g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
	}
};
        JLabel lblNewLabel_3 = new JLabel(""){
	       public void paintComponent(java.awt.Graphics g){
	    	   URL resource = this.getClass().getResource("7.jpg");
		      ImageIcon icon = new ImageIcon(resource);
		           g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
	       };
        };
	
     public Login (String title){
    	 super(title);
    	 init();
     }
     public void init(){
    	 lblNewLabel.setLabelFor(this);
 		lblNewLabel.setForeground(Color.RED);
 		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
 		lblNewLabel.setFont(new Font("����", Font.BOLD, 27));
 		lblNewLabel.setBounds(14, 13, 815, 32);
 		panel.add(lblNewLabel);
 		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 25));
		lblNewLabel_1.setBounds(339, 78, 172, 70);
		panel.add(lblNewLabel_1);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 25));
		lblNewLabel_2.setBounds(339, 161, 172, 70);
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("����", Font.BOLD, 25));
		lblNewLabel_4.setBounds(339, 256, 150, 70);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_2);
		textField.setBounds(497, 105, 191, 24);
		panel.add(textField);
		textField.setColumns(10);
		passwordField.setBounds(497, 188, 191, 24);
		panel.add(passwordField);
		textField_1.setBounds(461, 282, 86, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		textField_2.setBounds(596, 282, 86, 24);
		
	    for(int i=0;;i++){
			int random=(int)(Math.random()*10000);
			if(random>=1000){
				textField_2.setText(random+"");
				break;
			}else{
				
			}
		}
	    
		panel.add(textField_2);	
		textField_2.setColumns(20);
		textField_2.setEditable(false);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(294, 355, 135, 48);
		panel.add(btnNewButton);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(461, 355, 135, 48);
		panel.add(btnNewButton_1);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_2.setForeground(Color.gray);
		btnNewButton_2.setBounds(627, 355, 158, 48);
		btnNewButton_2.setContentAreaFilled(false);
        btnNewButton_2.setBorderPainted(false);
		panel.add(btnNewButton_2);
		lblNewLabel_3.setBounds(24, 69, 271, 258);
		panel.add(lblNewLabel_3);
 		
    	 panel.setForeground(Color.LIGHT_GRAY);
 	     this.add(panel);
 		 panel.setLayout(null);
    	 this.setResizable(false);
    	 this.setBounds(350, 200, 847, 490);
    	 this.setVisible(true);
    	 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	 guif=this;
    	 
    	 
    	 textField.addFocusListener(new FocusListener() {
 			public void focusLost(FocusEvent e) {
 				String txt = textField.getText();
 				if(txt.trim().length()<=0){
 					textField.setText("�����뿨��");
 			    }
 			}
 			public void focusGained(FocusEvent e) {
 				String txt = textField.getText();
 				if("�����뿨��".equals(txt)){
 			    textField.setText("");
 				}
 			}
 		});
    	 btnNewButton.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				card = textField.getText();
 				pwd = new String(passwordField.getPassword());
				Client client = ClientDb.clients.get(card);  //**************************
				String a = textField_1.getText();
				String b = textField_2.getText();
				textField_2.setText(null);
                for(int i=0;;i++){
        			int random=(int)(Math.random()*10000);
        			if(random>=1000){
        				textField_2.setText(random+"");
        				break;
        			}else{
        				
        			}
        		}

				if(client==null||!pwd.equals(client.getCardPwd())){
					JOptionPane.showMessageDialog(rootPane, "���Ż��������");
				}else if(!a.equals(b)){
					JOptionPane.showMessageDialog(rootPane, "��֤�����");
				}else{
					textField.setText("�����뿨��");
                    textField_1.setText(null);
                    passwordField.setText(null);
                    textField_2.setText(null);
                    for(int i=0;;i++){
            			int random=(int)(Math.random()*10000);
            			if(random>=1000){
            				textField_2.setText(random+"");
            				break;
            			}else{
            				
            			}
            		}
					JOptionPane.showMessageDialog(rootPane, "��½�ɹ���");   
                    guif.setVisible(false);
                    cusf=new CustomerUI("�û�ģʽ");
				}
 			}
 		});
    	 btnNewButton_1.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				textField.setText("�����뿨��");
                textField_1.setText(null);
                passwordField.setText(null);
                textField_2.setText(null);
                for(int i=0;;i++){
        			int random=(int)(Math.random()*10000);
        			if(random>=1000){
        				textField_2.setText(random+"");
        				break;
        			}else{
        				
        			}
        		}
 				guif.setVisible(false);
 				registF=new Regist("ע��");
 			}
 		});
    	 btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("�����뿨��");
                textField_1.setText(null);
                passwordField.setText(null);
                textField_2.setText(null);
                for(int i=0;;i++){
        			int random=(int)(Math.random()*10000);
        			if(random>=1000){
        				textField_2.setText(random+"");
        				break;
        			}else{
        				
        			}
        		}
              
				guif.setVisible(false);
				manF=new Manage("����Ա��½����");
			}
		});
     }
     public static JFrame guif;
     public static JFrame manF;
     static JFrame cusf;
     static JFrame registF;
     static JFrame Mguif;
     static JFrame managegui;
     
     public static void main(String[] args){
    	 new Login("��½");
     }
}
