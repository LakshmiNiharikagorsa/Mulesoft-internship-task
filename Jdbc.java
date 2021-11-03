import java.sql.*;
public class Jdbc {
	public static void main(String args[])throws Exception{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			Statement stmt=con.createStatement();
			String s="select * from movies";
			ResultSet rs=stmt.executeQuery(s);
			while(rs.next()) {
				System.out.println("Name = "+rs.getString(1));
				System.out.println("Actor = "+rs.getString(2));
				System.out.println("Actress = "+rs.getString(3));
				System.out.println("Director = "+rs.getString(4));
				System.out.println("Year of Release = "+rs.getString(5));
			}
		
		con.close();
		}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
