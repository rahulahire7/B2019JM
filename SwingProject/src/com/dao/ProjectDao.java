package com.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;import java.util.logging.Logger;

import com.model.Login;
import com.model.Register;
import com.ui.LoginUi;

public class ProjectDao {
PreparedStatement ps;
	Connection con;
	ResultSet rs;
	public Connection getConnection(){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","123456789");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  con;
	}
	public int saveData(List<Register> lst){
		int i=0;
		Register r=lst.get(0);
		System.out.println("password is :in save"+r.getPassword());
		String pas=r.getPassword().toString();
		System.out.println("new pass :"+pas);
		con=getConnection();
		try {
			ps=con.prepareStatement("insert into linkcode values(?,?,?,?)");
			ps.setInt(1, r.getRegNo());
			ps.setString(2,r.getFirstName());
			ps.setString(3,r.getUserName());
			ps.setString(4,r.getPassword());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public boolean validate(List<Login> l){
		//validate..
		
		return false;
	}
	public boolean log_in(List<Login> lst) {
		int i=0;
		boolean b=false;
		System.out.println("in login method...");
		Login l=lst.get(0);
		con=getConnection();
		try {
			ps=con.prepareStatement("select * from linkcode where UserName=? and Password=?");
			System.out.println("user name :"+l.getUserName());
			System.out.println("password :"+l.getPassword());
			ps.setString(1,l.getUserName());
			ps.setString(2,l.getPassword());
			System.out.println("done..");
			rs=ps.executeQuery();
			System.out.println("test2..");
			
			if(rs.next()){
				System.out.println("valid...");
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
