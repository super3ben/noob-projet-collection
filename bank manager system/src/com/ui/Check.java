package com.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.clientData.Client;
import com.dataManger.ClientDb;

public class Check extends JFrame{
	  JLabel label2  = new JLabel("用户当前余额:");
	  JPanel panel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("5.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
	  };
	  JButton button = new JButton("<");
	  Client c=ClientDb.clients.get(Login.card);
	  double b = c.getMoney();
	  String  m=String.valueOf(b);
	  JLabel label = new JLabel(m);
	
      public Check(String title){
    	  super(title);
    	  init();
      }
      public void init(){
    	  panel.add(button);
    	  button.setBounds(0, 0, 45, 33);
    	  button.setIcon(new ImageIcon(this.getClass().getResource("2.jpg")));
    	  label.setBounds(350,100, 300,40);
    	  label.setFont(new Font("楷体", Font.BOLD, 40));
    	  panel.add(label);
    	  label2.setBounds(50, 100, 300, 35);
    	  label2.setFont(new Font("楷体", Font.BOLD, 35));
    	  label2.setForeground(Color.white);
    	  panel.add(label2);
    	  panel.setLayout(null);
    	  this.add(panel);
    	  this.setBounds(600,200,600,300);
    	  this.setVisible(true);
    	  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	  button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerUI.check.setVisible(false);
				CustomerUI.customerui.setVisible(true);
			}
		});
      }
    
}
