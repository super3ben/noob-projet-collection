package com.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.clientData.Client;
import com.dataManger.ClientDb;

public class Print extends JFrame{
	JPanel jp=new JPanel(){public void paintComponent(java.awt.Graphics g){
		ImageIcon icon=new ImageIcon(this.getClass().getResource("9.jpg"));
		g.drawImage(icon.getImage(), 0, 0, icon.getImageObserver());
	}
};
	JButton jb=new JButton("打印凭条");
    JTextArea ta=new JTextArea();


public Print(String title){
	super(title);
	init();
	
}
public void init(){
	  jp.setLayout(null);
	  this.add(jp);
	  Client c=ClientDb.clients.get(Login.card);
	  ta.append("卡号:"+c.getCardNO()+"\r\n");
	  ta.append("姓名:"+c.getcName()+"\r\n");
	  ta.append("身份证号:"+c.getiD()+"\r\n");
	  ta.append("余额:"+c.getMoney()+"\r\n");
	  ta.setBounds(0,0, 400, 350);
	  ta.setFont(new Font("楷体", Font.BOLD, 20));	  
	  jp.add(ta);
	  jb.setBounds(140, 390, 100, 50);
	  jb.setFont(new Font("楷体", Font.BOLD, 15));
      jp.add(jb);
	  this.setBounds(690, 200, 400, 500);
	  this.setVisible(true);
	  jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(c.getCardNO()+"\r\n"+c.getcName()+"\r\n"+c.getiD()+"\r\n"+c.getMoney());
				JOptionPane.showMessageDialog(rootPane, "打印成功！");
				 CustomerUI.print.setVisible(false);
			}
		});
	      
      

}









}