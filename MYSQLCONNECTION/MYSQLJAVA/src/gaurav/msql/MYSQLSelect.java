package gaurav.msql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQLSelect {

	public static void main(String[] args){
		 String url="jdbc:mysql://localhost:3306/java";
		 String username="root";
		 String pwd="enter your password of SQL";
		 try {
			Connection connection=DriverManager.getConnection(url,username,pwd);
		    String sql="Select * from costumer";
		    Statement st=connection.createStatement();
		    ResultSet res=st.executeQuery(sql);
			int count=0;
		    while(res.next()) {
		    	//Give the name of the tables in MYSQL.
		    	String firstname=res.getString("firstname");
		    	String lastname=res.getString("lastname");
		    	count++;
		    	System.out.println("Costumer names are :"+count+")"+" "+firstname+" "+lastname);
		    }
		    connection.close();
		} catch (SQLException e) {
			System.out.println("OOPS ERROR!!!!!!!1");
			e.printStackTrace();
		}
	}

}
