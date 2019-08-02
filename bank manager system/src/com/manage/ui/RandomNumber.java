package com.manage.ui;

public class RandomNumber {

	static int m=(int)(Math.random()*10);
public static String getNum(){
	int[] num=new int[8];
	String number=String.valueOf(m);
	for(int i=0;i<8;i++){
	num[i]=(int)(Math.random()*10);
	number=number+String.valueOf(num[i]);
	}
	
	return number;
}
public static void main(String[] args) {
	RandomNumber rm=new RandomNumber();
	System.out.println(m);
	System.out.println(rm.getNum());
}
}
