package com.clientData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class DataManagement {
public static HashMap<String,Client> map=new HashMap<String,Client>();
public void saveData(HashMap<String,Client> data){
	ObjectOutputStream oos=null;
	try {
		oos = new ObjectOutputStream(new FileOutputStream("Client"));
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

public HashMap<String,Client> getData(){
	ObjectInputStream ois=null;
	HashMap<String,Client> map1=null;
	try {
		ois = new ObjectInputStream(new FileInputStream("Client"));
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
public static void main(String args) {
	
}
}
