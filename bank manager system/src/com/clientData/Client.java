package com.clientData;

import java.io.Serializable;

public class Client implements Serializable{
private String cName;
private String cardNO;
private String cardPwd;
private String iD;
private int status;
private double money;
public Client(){
	
}
public Client(String cName, String cardNO, String cardPwd, String iD, int status,
		double money) {
	super();
	this.cName = cName;
	this.cardNO = cardNO;
	this.cardPwd = cardPwd;
	this.iD = iD;
	this.status = status;
	this.money = money;

}
public Client(String cName, String cardPwd) {
	// TODO Auto-generated constructor stub
	super();
	this.cardPwd=cardPwd;
	this.cName=cName;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getCardNO() {
	return cardNO;
}
public void setCardNO(String cardNO) {
	this.cardNO = cardNO;
}
public String getCardPwd() {
	return cardPwd;
}
public void setCardPwd(String cardPwd) {
	this.cardPwd = cardPwd;
}
public String getiD() {
	return iD;
}
public void setiD(String iD) {
	this.iD = iD;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
}
@Override
public String toString() {
	return "Client [cName=" + cName + ", cardNO=" + cardNO + ", cardPwd=" + cardPwd + ", iD=" + iD + ", status="
			+ status + ", money=" + money + "]";
}

}

