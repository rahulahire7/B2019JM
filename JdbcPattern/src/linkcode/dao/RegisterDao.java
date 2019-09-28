package linkcode.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import linkcode.model.Login;
import linkcode.model.Register;

public class RegisterDao {
	Connection con=null;
	PreparedStatement ps;
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
		return con;
	}
	public int saveData(List<Register> lst){
		Register r=lst.get(0);
		con=getConnection();
		int i=0;
		try {
			ps=con.prepareStatement("insert into linkcode values(?,?,?,?)");
			ps.setInt(1,r.getRegNo());
			ps.setString(2,r.getCustName());
			ps.setString(3,r.getUserName());
			ps.setString(4,r.getPassword());
			i=ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	public boolean validate(List<Login> lst){
		con=getConnection();
		Login l=lst.get(0);
		boolean b=false;
		try {
			ps=con.prepareStatement("select * from linkcode where username=? and password=?");
			ps.setString(1,l.getUserName());
			ps.setString(2,l.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}








