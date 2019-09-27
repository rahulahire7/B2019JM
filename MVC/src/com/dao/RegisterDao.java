package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.model.Login;
import com.model.Register;

import sun.java2d.pipe.hw.AccelDeviceEventListener;

public class RegisterDao {
	private static Connection con;
	private PreparedStatement ps;
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:XE";
	private String userName="System";
	private String password="123456789";
	public Connection getConnection(){
		try{
			Class.forName(driver);
			con=DriverManager.getConnection(url,userName,password);
			System.out.println("COnnection :"+con);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	public int saveData(List<Register> lst){
		int i=0;
		System.out.println("save..1");
		con=getConnection();
		Register r=(Register)lst.get(0);
		try{
			ps=con.prepareStatement("insert into BankJm values(?,?,?,?,?)");
			ps.setInt(1,r.getAccNo());
			ps.setString(2,r.getCustName());
			ps.setString(3,r.getUserName());
			ps.setString(4,r.getPass());
			ps.setInt(5,r.getAccBal());
			i=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return i;
	}
	public boolean validate(List<Login> lst){
		getConnection();
		boolean b=false;
		Login l=(Login)lst.get(0);
		try
		{
			ps=con.prepareStatement("select * from bankjm where USERNAME=? AND PASSWORD=?");
			ps.setString(1,l.getUname());
			ps.setString(2,l.getPass());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
			System.out.println("result set");
				b=true;
			}
			else
			{
				System.out.println("no result..");
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return b;
	}

}





