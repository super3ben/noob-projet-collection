
package com.dataManger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import com.clientData.Client;


public class ClientDb {
      public static HashMap<String, Client> clients= (HashMap<String, Client>) getData();
      public static void saveData(Object Data){
    	  ObjectOutputStream oos = null;
    	  try {
//    		  clients.put(Data., Data)
  			oos = new ObjectOutputStream(new FileOutputStream("Client"));
  			oos.writeObject(Data);
  		} catch (Exception e) {
  			e.printStackTrace();
  		}finally{
  			try{
  				if(oos!=null)oos.close();
  			}catch(Exception e){
  				
  			}
  		}
      }
      public static Object getData(){
    	  File f = new File("Client");
     	 //判断如果文件不存在，那么直接返回null
     	 if(!f.exists()){
     		 return new HashMap<String,Client>();
     	 }
     	 ObjectInputStream ois = null;
     	 Object data = null;
     	 try{
     		 ois = new ObjectInputStream(new FileInputStream(f));
     		 data = ois.readObject();
     	 }catch(Exception e){
     		 e.printStackTrace();
     	 }finally{
     		 try{
     			 if(ois!=null) 
     				 ois.close();
     	 }catch(Exception e){
     	     }
     	 }
          return data;
      }
}
