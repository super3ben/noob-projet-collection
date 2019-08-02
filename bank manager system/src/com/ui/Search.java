package com.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.clientData.Client;
import com.dataManger.ClientDb;


public class Search extends JFrame{ 
	
	  JPanel nPanel = new JPanel(){
			public void paintComponent(java.awt.Graphics g){
				ImageIcon icon = new ImageIcon(this.getClass().getResource("5.jpg"));
				g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
			};
	  };
	  JLabel idLabel = new JLabel("查询结果");
//	  JLabel nameLabel = new JLabel("用户名");
//	  JLabel rmbLabel = new JLabel("币种");
//	  JLabel blLabel = new JLabel("账户余额");
//	 JPanel sPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,0,10));
	 JButton fButton = new JButton("");
	 String[] balances  = {"用户名","账号","身份证号","账户余额"};
     DefaultTableModel dtm= new DefaultTableModel(balances,0);
     JTable blTable =new JTable(dtm);
     JScrollPane scrollPane = new JScrollPane(blTable);
      public Search(String title){
    	  super(title);
    	  init();
      }
      public void init(){
          nPanel.setLayout(null);
    	  this.add(nPanel);
    	  nPanel.add(fButton);
    	  fButton.setBounds(0, 0, 45, 33);
  		  fButton.setIcon(new ImageIcon(this.getClass().getResource("2.jpg")));
    	  nPanel.add(idLabel);
    	  idLabel.setBounds(325, 50, 150, 35);
    	  idLabel.setForeground(Color.blue);
    	  idLabel.setFont(new Font("楷体", Font.BOLD, 30));
    	  nPanel.add(scrollPane,BorderLayout.CENTER);
          scrollPane.setBounds(0, 100, 800, 200);

    	  this.setBounds(600, 200, 800,300);
    	  this.setVisible(true);
    	  this.setResizable(false);
    	  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	  Client c=ClientDb.clients.get(Login.card);
    	  Object[] rowData = new Object[4];
  		  rowData[0] =c.getcName();
  		  rowData[1] =c.getCardNO();
  	      rowData[2] =c.getiD();
  		  rowData[3] =c.getMoney();
  		  dtm.addRow(rowData);
    	  
    	  
    	  

//    	  Collection<Client> coll = ClientDb.dm.values();
//            
//     		 Object[] rowData = new Object[4];
//     		 rowData[0] = .getcName();
//     		 rowData[1] = .getCardNO();
//     		 rowData[2] = .getiD();
//     		 rowData[3] = .getMoney();
//     		dtm.addRow(rowData);
     		 
     		 
     		 
     		 
     		 
     	 
    	  fButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerUI.search.setVisible(false);
				CustomerUI.customerui.setVisible(true);
			}
		});
      }

//      public static void main(String[] args) {
//		new Search("个人信息");
//	}
}
