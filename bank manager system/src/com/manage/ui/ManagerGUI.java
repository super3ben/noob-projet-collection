package com.manage.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.clientData.Client;
import com.clientData2.DataManagement;
import com.manage.client.AdminFrame;
import com.ui.Login;

public  class ManagerGUI extends JFrame{


	JFrame frame=this;
	
	JPanel pane=new JPanel(){public void paintComponent(java.awt.Graphics g){
		ImageIcon icon=new ImageIcon(this.getClass().getResource("13.jpeg"));
		g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());}
	};
	
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	JPanel panel3=new JPanel();
	JButton button1=new JButton("����Աģʽ");
	JButton button2=new JButton("�ص���¼����");
	JButton button3=new JButton("��              ��");
	JButton button4=new JButton("��              ��");
	JButton button5=new JButton("��              ʧ");
	JButton button6=new JButton("��              ��");
	JLabel label=new JLabel("�Ǽ�����");
	JButton button7=new JButton("��  Ϣ  ��  ѯ");


public ManagerGUI(){
   
}
public ManagerGUI(String title){
	super(title);
	initFrame();
}
public void initFrame(){

	this.setLayout(null);
	panel1.setLayout(null);
	panel2.setLayout(null);
	panel3.setLayout(null);
	
	button1.setForeground(Color.white);
	button2.setForeground(Color.white);
	button3.setForeground(Color.white);
	button4.setForeground(Color.white);
	button5.setForeground(Color.white);
	button6.setForeground(Color.white);
	button7.setForeground(Color.white);
	
	//��������Ϊ͸��
	panel1.setBackground(null);
	panel1.setOpaque(false);
	panel2.setBackground(null);
	panel2.setOpaque(false);
	panel3.setBackground(null);
	panel3.setOpaque(false);
	
	     panel1.setBorder(BorderFactory.createTitledBorder("ע�������"));
         panel1.setBounds(10, 170, 250, 250);   
         panel2.setBorder(BorderFactory.createTitledBorder("��ʧ�ͽ��"));  
         panel2.setBounds(325, 170, 250, 250);
         panel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
         panel3.setBounds(172, 10, 250, 70);
         
         button1.setBounds(10,50,120,40);
        button1.setForeground(Color.cyan);
         button2.setBounds(10, 500, 120, 40);
         button2.setContentAreaFilled(false);
	     button2.setBorderPainted(false);
         button3.setBounds(65, 60 , 120, 40);
         button3.setContentAreaFilled(false);
	     button3.setBorderPainted(false);
         button4.setBounds(65, 150 , 120, 40);
         button4.setContentAreaFilled(false);
	     button4.setBorderPainted(false);
         button5.setBounds(65, 60 , 120, 40);
         button5.setContentAreaFilled(false);
	     button5.setBorderPainted(false);
         button6.setBounds(65, 150 , 120, 40);
         button6.setContentAreaFilled(false);
	     button6.setBorderPainted(false);
         button7.setBounds(453, 500, 120, 40);
         button7.setContentAreaFilled(false);
	     button7.setBorderPainted(false);
         
         label.setBounds(50,10,160,50);
         label.setFont(new Font("����", Font.BOLD, 38));
         
	this.add(panel1);
	this.add(panel2);
	this.add(panel3);
	this.add(button1);
	this.button1.setEnabled(false);
	this.add(button2);
	panel1.add(button3);
	panel1.add(button4);
	panel2.add(button5);
	panel2.add(button6);
	panel3.add(label);
	this.add(button7);
	
	button3.addActionListener(new ActionListener() {
	       JFrame frame1=new JFrame("����ϵͳ");         
	       
	       JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("14.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
		};
	       JLabel label1=new JLabel("������������");
	       JLabel label2=new JLabel("���������֤�ţ�");
	       JLabel label3=new JLabel("���������룺");
	       JTextField field1=new JTextField();
	       JTextField field2=new JTextField();
	       JPasswordField field3=new JPasswordField();
	       JButton button=new JButton("�������");
	       
			public void actionPerformed(ActionEvent e) {
				   //frame.setVisible(false);
				   frame1.setBounds(300, 100, 300, 500);

//			       frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
			       frame1.setVisible(true);
			       frame1.add(panel);
			       panel.setLayout(null);
	                    label1.setBounds(30	,50, 100, 30);
	                    label1.setForeground(Color.white);
	             panel.add(label1);
	                    label2.setBounds(30, 100, 110, 30);
	                    label2.setForeground(Color.white);
	             panel.add(label2);
	                    label3.setBounds(30, 150, 100, 30);
	                    label3.setForeground(Color.white);
	             panel.add(label3);
	                    field1.setBounds(130, 50, 140, 30);
	             panel.add(field1);
	                    field2.setBounds(130, 100, 140, 30);
	             panel.add(field2);
	                    field3.setBounds(130, 150, 140, 30);
	             panel.add(field3);
	                    button.setBounds(90, 250, 100, 40);
	             panel.add(button);
             
             button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String name=field1.getText();
					String id=field2.getText();
					String  pwd=new String(field3.getPassword());
					DataManagement dm=new DataManagement();
					
					if(name.trim().length()<=0)	JOptionPane.showMessageDialog(frame1, "�û�������Ϊ�գ�");
					else if(id.trim().length()!=9)  JOptionPane.showMessageDialog(frame1, "���֤�Ų���Ϊ����Ϊ��λ���֣�");
					
					else if(pwd.trim().length()<=5||pwd.trim().length()>=10) JOptionPane.showMessageDialog(frame1, "���벻��Ϊ���Ҳ�������λ��������λ��");
				    if(name.trim().length()>0&&id.trim().length()==9&&pwd.trim().length()>=6&&pwd.trim().length()<=9){
						DataManagement.map.putAll(dm.getData("Client"));
						for(String s:DataManagement.map.keySet()){
							if(id.equals(s))  JOptionPane.showMessageDialog(frame1, "�����֤���Ѿ���ע�ᣡ");
						}
						if(DataManagement.map.containsKey(id)==false) {
							w:while(true){
						String cardNO=String.valueOf(RandomNumber.getNum());
						if(String.valueOf(cardNO).length()!=9) continue;
						for(String s:DataManagement.map.keySet()){
							Client  userc=DataManagement.map.get(s);
							if(userc.getCardNO().equals(cardNO)) continue w;
						}
//						System.out.println(cardNO);
						Client user=new Client(name,cardNO,pwd,id,1,0.0d);
						DataManagement.map.put(id, user);
						dm.saveData(DataManagement.map, "Client");
						JOptionPane.showMessageDialog(frame1,"ע��ɹ�������Ϊ"+cardNO );
						
						break;
						}
					} 
				}
				    }
			});
		}
	});
	button4.addActionListener(new ActionListener() {
		JFrame frame2=new JFrame("����ϵͳ");
		JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("15.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
		};
		JLabel label1=new JLabel("������Ҫע���Ŀͻ�����");;
		JLabel label2=new JLabel("������ÿͻ����ţ�");
		JLabel label3=new JLabel("������ÿͻ����֤�ţ�");
		JLabel label4=new JLabel("������ÿͻ����룺");
		JTextField field1=new JTextField();
		JTextField field2=new JTextField();
		JTextField field3=new JTextField();
		JPasswordField field4=new JPasswordField();
		JButton button=new JButton("���ע��");
		
		public void actionPerformed(ActionEvent e) {
			   frame2.add(panel);
			   panel.setLayout(null);
			            label1.setBounds(5	,50, 150, 30);
			            label1.setForeground(Color.white);
	             panel.add(label1);
	                    label2.setBounds(5, 100, 130, 30);
			            label2.setForeground(Color.white);
	             panel.add(label2);
	                    label3.setBounds(5, 150, 150, 30);
			            label3.setForeground(Color.white);
	             panel.add(label3);
	                    label4.setBounds(5, 200, 130, 30);
			            label4.setForeground(Color.white);
	             panel.add(label4);
	                    field1.setBounds(140, 50, 140, 30);
	             panel.add(field1);
	                    field2.setBounds(140, 100, 140, 30);
	             panel.add(field2);
	                    field3.setBounds(140, 150, 140, 30);
	             panel.add(field3);
	                    field4.setBounds(140, 200, 140, 30);
	             panel.add(field4); 
	                    button.setBounds(90, 280, 100, 40);
	             panel.add(button);
			   frame2.setBounds(300, 100, 300, 500);
		       //frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
		       frame2.setVisible(true);
		         button.addActionListener(new ActionListener() {
				     public void actionPerformed(ActionEvent e) {
				    	 String name=field1.getText();
				    	 String cardNO=field2.getText();
				 		 String id=field3.getText();
				 		 String pwd=new String(field4.getPassword());
	                     DataManagement dm=new DataManagement();
	                     int len=cardNO.trim().length();
	                    if(name.trim().length()<=0)	JOptionPane.showMessageDialog(frame2, "�û�������Ϊ�գ�");
	                    else if(len!=9)  JOptionPane.showMessageDialog(frame2, "���Ų���Ϊ����Ϊ��λ���֣�");
	                    else if(id.trim().length()!=9)  JOptionPane.showMessageDialog(frame2, "���֤�Ų���Ϊ����Ϊ��λ���֣�");
	                    else if(pwd.trim().length()<=5||pwd.trim().length()>=10) JOptionPane.showMessageDialog(frame2, "���벻��Ϊ���Ҳ�������λ��������λ��");
	 					if(name.trim().length()>0&&id.trim().length()==9&&pwd.trim().length()>=6&&pwd.trim().length()<=9&&len==9){
	                     DataManagement.map.putAll(dm.getData("Client"));
	                     Client user=DataManagement.map.get(id);
	                     if(user==null) JOptionPane.showMessageDialog(frame2, "��Ҫע���Ŀͻ������ڣ�");
	                      if(name.equals(user.getcName())&&cardNO.equals(user.getCardNO())&&
	                    		 id.equals(user.getiD())&&pwd.equals(user.getCardPwd())){
	                       DataManagement.map.remove(id);
	                      HashMap<String, Client> map1=new HashMap<String,Client>();
	                      map1.putAll(DataManagement.map);
	                      dm.saveData(map1, "Client");
	                      JOptionPane.showMessageDialog(frame2, "ע���ɹ���"); 
	                      }
	                      else{
	                    	  JOptionPane.showMessageDialog(frame2, "���������Ϣ��ƥ�䣡");
	                      }
						}
	 					}
					});
		}
	});
	button5.addActionListener(new ActionListener() {
		JFrame frame3=new JFrame("��ʧϵͳ");
		JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("16.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
		};
		JLabel label1=new JLabel("������Ҫ��ʧ�Ŀͻ�����");;
		JLabel label2=new JLabel("������ÿͻ����ţ�");
		JLabel label3=new JLabel("������ÿͻ����֤�ţ�");
		JLabel label4=new JLabel("������ÿͻ����룺");
		JTextField field1=new JTextField();
		JTextField field2=new JTextField();
		JTextField field3=new JTextField();
		JPasswordField field4=new JPasswordField();
		JButton button=new JButton("�����ʧ");
	public void actionPerformed(ActionEvent e) {
		 frame3.add(panel);
		 panel.setLayout(null);
        label1.setBounds(5	,50, 150, 30);
        label1.setForeground(Color.white);
	     panel.add(label1);
	            label2.setBounds(5, 100, 130, 30);
	            label2.setForeground(Color.white);
	     panel.add(label2);
	            label3.setBounds(5, 150, 150, 30);
	            label3.setForeground(Color.white);
	     panel.add(label3);
	            label4.setBounds(5, 200, 130, 30);
	            label4.setForeground(Color.white);
	     panel.add(label4);
	            field1.setBounds(140, 50, 140, 30);
	     panel.add(field1);
	            field2.setBounds(140, 100, 140, 30);
	     panel.add(field2);
	            field3.setBounds(140, 150, 140, 30);
	     panel.add(field3);
	            field4.setBounds(140, 200, 140, 30);
	     panel.add(field4); 
	            button.setBounds(90, 280, 100, 40);
	     panel.add(button);
		   frame3.setBounds(300, 100, 300, 500);
		   //frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame3.setVisible(true);
		      button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					 String name=field1.getText();
					 String cardNO=field2.getText();
			 		 String id=field3.getText();
			 		 String pwd=new String(field4.getPassword());
			 		 
			 		DataManagement dm=new DataManagement();
			 		int len=cardNO.length();
			 		if(name.trim().length()<=0)	JOptionPane.showMessageDialog(frame3, "�û�������Ϊ�գ�");
			 		else if(len!=9)  JOptionPane.showMessageDialog(frame3, "���Ų���Ϊ����Ϊ��λ���֣�");
                    else if(id.trim().length()!=9)  JOptionPane.showMessageDialog(frame3, "���֤�Ų���Ϊ����Ϊ��λ���֣�");
                    else if(pwd.trim().length()<=5||pwd.trim().length()>=10) JOptionPane.showMessageDialog(frame3, "���벻��Ϊ���Ҳ�������λ��������λ��");
 					if(name.trim().length()>0&&id.trim().length()==9&&pwd.trim().length()>=6&&pwd.trim().length()<=9&&len==9){
                    DataManagement.map.putAll(dm.getData("Client"));
                    Client user=DataManagement.map.get(id);
                    if(user==null) JOptionPane.showMessageDialog(frame3, "��Ҫ��ʧ�Ŀͻ������ڣ�");
                     if(name.equals(user.getcName())&&cardNO.equals(user.getCardNO())&&
                   		 id.equals(user.getiD())&&pwd.equals(user.getCardPwd())){
                      DataManagement.map.get(id).setStatus(0);
                     HashMap<String, Client> map1=new HashMap<String,Client>();
                     map1.putAll(DataManagement.map);
                     dm.saveData(map1, "Client");
                     JOptionPane.showMessageDialog(frame3, "��ʧ�ɹ���"); 
                     }
                     else{
                   	  JOptionPane.showMessageDialog(frame3, "���������Ϣ��ƥ�䣡");
                     }
				}
 					}
			});
		}
	});
button6.addActionListener(new ActionListener() {
		
		JFrame frame4=new JFrame("���ϵͳ");
		JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("17.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
		};
		JLabel label1=new JLabel("������Ҫ��ҵĿͻ�����");;
		JLabel label2=new JLabel("������ÿͻ����ţ�");
		JLabel label3=new JLabel("������ÿͻ����֤�ţ�");
		JLabel label4=new JLabel("������ÿͻ����룺");
		JTextField field1=new JTextField();
		JTextField field2=new JTextField();
		JTextField field3=new JTextField();
		JPasswordField field4=new JPasswordField();
		JButton button=new JButton("������");
	public void actionPerformed(ActionEvent e) {
		 frame4.add(panel);
		 panel.setLayout(null);
        label1.setBounds(5	,50, 150, 30);
        label1.setForeground(Color.white);
	     panel.add(label1);
	            label2.setBounds(5, 100, 130, 30);
	            label2.setForeground(Color.white);
	     panel.add(label2);
	            label3.setBounds(5, 150, 150, 30);
	            label3.setForeground(Color.white);
	     panel.add(label3);
	            label4.setBounds(5, 200, 130, 30);
	            label4.setForeground(Color.white);
	     panel.add(label4);
	            field1.setBounds(140, 50, 140, 30);
	     panel.add(field1);
	            field2.setBounds(140, 100, 140, 30);
	     panel.add(field2);
	            field3.setBounds(140, 150, 140, 30);
	     panel.add(field3);
	            field4.setBounds(140, 200, 140, 30);
	     panel.add(field4); 
	            button.setBounds(90, 280, 100, 40);
	     panel.add(button);
	   frame4.setBounds(300, 100, 300, 500);
	   //frame4.setDefaultCloseOperation(EXIT_ON_CLOSE);
	   frame4.setVisible(true);
	      button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String name=field1.getText();
				 String cardNO=field2.getText();
		 		 String id=field3.getText();
		 		 String pwd=new String(field4.getPassword());
		 		 
		 		DataManagement dm=new DataManagement();
		 		int len=cardNO.length();
		 		    if(name.trim().length()<=0)	JOptionPane.showMessageDialog(frame4, "�û�������Ϊ�գ�");
		 		    else if(len!=9)  JOptionPane.showMessageDialog(frame4, "���Ų���Ϊ����Ϊ��λ���֣�");
		 		    else if(id.trim().length()!=9)  JOptionPane.showMessageDialog(frame4, "���֤�Ų���Ϊ����Ϊ��λ���֣�");
		 		    else if(pwd.trim().length()<=5||pwd.trim().length()>=10) JOptionPane.showMessageDialog(frame4, "���벻��Ϊ���Ҳ�������λ��������λ��");
		 		     if(name.trim().length()>0&&id.trim().length()==9&&pwd.trim().length()>=6&&pwd.trim().length()<=9&&len==9){
                DataManagement.map.putAll(dm.getData("Client"));
                Client user=DataManagement.map.get(id);
                if(user==null) JOptionPane.showMessageDialog(frame4, "��Ҫ��ʧ�Ŀͻ������ڣ�");
                 if(name.equals(user.getcName())&&cardNO.equals(user.getCardNO())&&
               		 id.equals(user.getiD())&&pwd.equals(user.getCardPwd())){
                  DataManagement.map.get(id).setStatus(1);
                 HashMap<String, Client> map1=new HashMap<String,Client>();
                 map1.putAll(DataManagement.map);
                 dm.saveData(map1, "Client");
                 JOptionPane.showMessageDialog(frame4, "��ҳɹ���"); 
                 }
                 else{
               	  JOptionPane.showMessageDialog(frame4, "���������Ϣ��ƥ�䣡");
                 }
			}
			
			}
		});
	}});

	button7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
    	AdminFrame af=new AdminFrame("��Ϣ����");
    	
		}
	}); 
	
	 button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Manage.manGUI.setVisible(false);
			Login.guif.setVisible(true);
			
		}
	});
	
	this.setBounds(100, 100, 600, 600);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setVisible(true);
	this.add(pane);	
	    pane.setBounds(0, 0, 600, 600);
	
}
public static void main(String[] args) {
	new ManagerGUI("����Աģʽ");
}
}
