package jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		
				String jdbcUrl = "jdbc:mysql://localhost:3306/db_student?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
				String user = "db_webapp";
				String pass = "lanon900";
				
				try {
					System.out.println("Connecting to database: " +jdbcUrl);
					
					Connection mycon = DriverManager.getConnection(jdbcUrl, user, pass);
					
					System.out.println("Connection Susccessful");
				}catch(Exception ex) {
					ex.printStackTrace();
				}

	}

}
