package com.clientData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.clientData.Client;
//初始化三个对象数据持久放到放到data这个文件
public class InitData {
public static void main(String[] args) {
	Client Client1=new Client("张三","123456789","123qq","123456789",1,100.0);
	                        //String cName, String cardNO, String cardPwd, String iD, int status,double money
	Client Client2=new Client("李四","234567891","123.qq","234567891",0,200.0);
	Client Client3=new Client("王五","345678912","123.qq","345678912",1,300.0);
	HashMap<String,Client> map=new HashMap<String,Client>();
	map.put("123456789", Client1);
	map.put("234567891", Client2);
	map.put("345678912", Client3);
	ObjectOutputStream oos=null;
	try {
		oos=new ObjectOutputStream(new FileOutputStream("Client"));
		oos.writeObject(map);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally{
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}
