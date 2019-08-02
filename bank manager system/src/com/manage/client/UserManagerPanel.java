package com.manage.client;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.clientData.Client;
import com.clientData2.DataManagement;

public class UserManagerPanel extends JPanel{
	JPanel northPanel=new JPanel( new FlowLayout(FlowLayout.LEFT,60,5) );//panel 默认为flowLayout布局
	String[] columnNames={"序号","姓名","卡号","密码","身份证号","状态","余额"};
	DefaultTableModel dtm=new DefaultTableModel(columnNames,0);//表格数目为0，第一个参数为数组
	JTable userTable=new JTable(dtm);//创建表格
	JScrollPane scrollPane=new JScrollPane(userTable);//表格加在滚动面板上才能显示
	JButton button=new JButton("检索");
	JButton button1=new JButton("显示全部");
	JLabel label1=new JLabel("姓名：");
	//JLabel label=new JLabel("请选择检索条件：");
	//JComboBox box=new JComboBox(new String[]{"姓名","身份证号","卡号"});
	//JLabel label2=new JLabel("身份证号：");
	//JLabel label3=new JLabel("卡号：");
	JTextField field1=new JTextField(8);
	JTextField field2=new JTextField(8);
	JTextField field3=new JTextField(8);
	ArrayList<Client> list=new ArrayList<Client>();
	
	public UserManagerPanel() {
		this.setLayout(new BorderLayout());
		init();
		}
	
	public void init(){
		this.add(northPanel,BorderLayout.NORTH);
		//button.setBounds(380, 0, 30, 30);
		//northPanel.setLayout(null);
		//northPanel.add(label);
		northPanel.add(label1);  northPanel.add(field1);
		//northPanel.add(box);
		//northPanel.add(label2);  northPanel.add(field2);
		//northPanel.add(label3);  northPanel.add(field3);
		northPanel.add(button);  northPanel.add(button1);
		DataManagement dm=new DataManagement();
		DataManagement.map.putAll(dm.getData("client"));
//		for(String s:DataManagement.map.keySet()){
//			Object[] rowData =new Object[7];
//			rowData[0]=DataManagement.map.get(s).getSN();
//			rowData[1]=DataManagement.map.get(s).getCName();
//			rowData[2]=DataManagement.map.get(s).getCardNO();
//			rowData[3]=DataManagement.map.get(s).getCardPwd();
//			rowData[4]=DataManagement.map.get(s).getID();
//			rowData[5]=DataManagement.map.get(s).getStatus();
//			rowData[6]=DataManagement.map.get(s).getMoney();
//			dtm.addRow(rowData);
//		}
		
		for(String s:DataManagement.map.keySet()){
			list.add(DataManagement.map.get(s));
		}
		
		Object[] rowData=new Object[7];
		for(int i=0;i<list.size();i++){
		rowData[0]=i+1;
		rowData[1]=list.get(i).getcName();
		rowData[2]=list.get(i).getCardNO();
		rowData[3]=list.get(i).getCardPwd();
		rowData[4]=list.get(i).getiD();
		if(list.get(i).getStatus()==1)
		    rowData[5]="正常";
		else if(list.get(i).getStatus()==0)
			rowData[5]="冻结";
		rowData[6]=list.get(i).getMoney();
		dtm.addRow(rowData);
		}
		this.add(scrollPane,BorderLayout.CENTER);
		
		ArrayList<Client> list1=new ArrayList<Client>();
		ArrayList<Client> list2=new ArrayList<Client>();
		list1.addAll(list);
		list2.addAll(list);
		button.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
					String key=field1.getText();
             if(key==null)  return ;
             else{ 
				for(int i=list1.size()-1;i>=0;i--)
				dtm.removeRow(i);
				for(int i=0;i<list.size();i++){
					Client userI=list.get(i);
					String value=userI.getcName();
					if (value.indexOf(key) < 0){
				        continue;}
					
					else { 
						list1.add(userI);}
				}
				
				for(int i=list2.size()-1;i>=0;i--)  list1.remove(i);
				Object[] rowData1=new Object[7];
				for(int i=0;i<list1.size();i++){
					rowData1[0]=i+1;
					rowData1[1]=list1.get(i).getcName();
					rowData1[2]=list1.get(i).getCardNO();
					rowData1[3]=list1.get(i).getCardPwd();
					rowData1[4]=list1.get(i).getiD();
					if(list.get(i).getStatus()==1)
					    rowData1[5]="正常";
					else if(list1.get(i).getStatus()==0)
						rowData1[5]="冻结";
					rowData1[6]=list1.get(i).getMoney();
					dtm.addRow(rowData1);
					}
				list2.clear();
				list2.addAll(list1);
             }
				}
		});
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=list2.size()-1;i>=0;i--)  dtm.removeRow(i);
				Object[] rowData1=new Object[7];
				for(int i=0;i<list.size();i++){
					rowData1[0]=i+1;
					rowData1[1]=list.get(i).getcName();
					rowData1[2]=list.get(i).getCardNO();
					rowData1[3]=list.get(i).getCardPwd();
					rowData1[4]=list.get(i).getiD();
					if(list.get(i).getStatus()==1)
					   rowData1[5]="正常";
					else if(list.get(i).getStatus()==0)
						rowData[5]="冻结";
					rowData1[6]=list.get(i).getMoney();
					dtm.addRow(rowData1);
					list2.clear();
					list2.addAll(list);	
					list1.clear();
					list1.addAll(list);
				}
				
			}
		});
	}
}			
				
				
				
				
//				List<Integer> searchHitRows = new ArrayList<Integer>();
//				searchHitRows.clear();
//				String key=field1.getText();
//				if (key == null || "".equals(key))
//				      return;
//				for (int i = 0; i < list.size(); i++) {
//				      User userI = list.get(i);
//				      String value = userI.getCName();
//				      if (value.indexOf(key) < 0)
//				        continue;
//				      int j = 0;
//				      for (j = i - 1; j >= 0; j--) {
//				        User userJ = list.get(j);
//				        String valueJ = userJ.getCName();
//				        if (valueJ.indexOf(key) >= 0)
//				          break;
//				      }
//				      User temp = list.get(j + 1);
//				      list.set(j + 1, userI);
//				      list.set(i, temp);
//				      searchHitRows.add(Integer.valueOf(j + 1));
//				      
				
				//System.out.println("客户的数量为："+list.size());
				// TODO Auto-generated method stub
				/* DefaultRowSorter sorter=(DefaultRowSorter)userTable.getRowSorter();//返回负责排序的对象 				
					if(sorter==null){
						sorter=new TableRowSorter<>(dtm);
						userTable.setRowSorter(sorter);
						
					
					}
					sorter.setRowFilter(new RowFilter(){
						public boolean include(Entry entry){
							Integer i=(Integer)entry.getIdentifier();
							String name=field1.getText();
							if(name.trim().length()>0){
								String gName=(String)dtm.getValueAt(i, 0);
							    if(gName.indexOf(name)==-1){
							    	return false;
							    }
							}
							
							return true;
						}
					});*/
			
				

