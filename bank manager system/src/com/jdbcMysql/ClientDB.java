package com.jdbcMysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.clientData.Client;

public class ClientDB {
	public static Client checkDB() {
		Connection connection=ConnectionMyaqlDB.getConnection();
		Client client=null;
		try {
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from client");
			while(rs.next()) {
				client=new Client(rs.getString("name"), rs.getString("pasword"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}
	public static void creatClient() throws SQLException {
		Connection connection=ConnectionMyaqlDB.getConnection();
		Statement statement=connection.createStatement();
		statement.executeUpdate("create table client(id int(3) not null primary key auto_increament,"
				+ "cName varchar(10)+,cardNO varchar(10),cardPwd varchar(10),iD int(9),status int(1),money int(4)))");
		System.out.println("创建数据库");
	}
	public static void main(String[] args) throws SQLException {
		ClientDB c=new ClientDB();
		c.creatClient();
		
	}
}
