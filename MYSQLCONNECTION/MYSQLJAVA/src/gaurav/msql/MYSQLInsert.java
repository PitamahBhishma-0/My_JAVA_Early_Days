package gaurav.msql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class MYSQLInsert {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String username="root";
		String password="Use your mysql password";
	    @SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		
		try {			
			Connection connection=DriverManager.getConnection(url,username,password);
			String sql=("Insert Into costumer (firstname,lastname) VALUES (?,?)");
			PreparedStatement statement=connection.prepareStatement(sql);
			System.out.println("Enter your first name");
			String first=sc.nextLine();
			statement.setString(1, first.toUpperCase());
			System.out.println("Enter your surname");
			String second=sc.nextLine();
			statement.setString(2, second.toUpperCase());
			System.out.println("Your name is :"+first +" "+second);
			int rows=statement.executeUpdate();
			if(rows>0) {
				System.out.println("A row has been inserted");
			}
			statement.close();
			connection.close();
			
		} catch (SQLException e) {
			System.out.println("OOPS, ERROR!!!");
			e.printStackTrace();
		}
	}

}
