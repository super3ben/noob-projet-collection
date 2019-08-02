package com.manage.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

import com.clientData2.DataManagement;
import com.clientData.Client;

public class TestUser {
public static void main(String[] args) {
	ObjectInputStream ois=null;
	HashMap<String, Client> map=null;
	try {
		ois = new ObjectInputStream(new FileInputStream("Client"));
		map = (HashMap<String,Client>)ois.readObject();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			ois.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	for(String s:map.keySet()){
		System.out.println(map.get(s).toString());
	}
	System.out.println("*********************************");
	for(String s:DataManagement.map.keySet()){
		System.out.println(DataManagement.map.get(s).toString());
	}
	}
}
