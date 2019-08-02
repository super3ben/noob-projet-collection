package com.clientData2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.clientData.Client;

public class DataManagement {
public static HashMap<String,Client> map=  getData("Client");
public void saveData(HashMap<String,Client> data,String fileName){
	ObjectOutputStream oos=null;
	try {
		oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		oos.writeObject(data);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
	try {
		oos.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

public static  HashMap<String,Client> getData(String fileName){
	ObjectInputStream ois=null;
	HashMap<String,Client> map1=null;
	try {
		ois = new ObjectInputStream(new FileInputStream(fileName));
		 map1=(HashMap<String, Client>) ois.readObject();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally{
	try {
		ois.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	return map1;
	
}
}
