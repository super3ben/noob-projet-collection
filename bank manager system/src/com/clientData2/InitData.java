package com.clientData2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import com.clientData.Client;
//��ʼ�������������ݳ־÷ŵ��ŵ�data����ļ�
public class InitData {
public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	Client user1=new Client("����","123456789","123.qq","123456789",1,100.0d);
	Client user2=new Client("����","234567891","123.qq","234567891",1,200.0d);
	Client user3=new Client("����","345678912","123.qq","345678912",1,300.0d);
	HashMap<String,Client> map=new HashMap<String,Client>();
	map.put("123456789", user1);
	map.put("234567891", user2);
	map.put("345678912", user3);
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
//	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("data"));
//	HashMap<String,User> map1=(HashMap<String, User>) ois.readObject();
//	System.out.println(map1.containsKey("234567891"));
}
}
