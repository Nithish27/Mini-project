package Atm_Project;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class AtmProject {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root,"root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from atmproject");
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		while(rs.next()){
			System.out.println(rs.getInt(1) +"-"+ rs.getString(2));
			map.put(rs.getInt(1), rs.getInt(3));
		}
		Declare dc = new Declare(map);
		st.close();
		con.close();
	}
}