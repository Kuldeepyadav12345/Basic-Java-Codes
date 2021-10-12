package Connections;

import java.sql.DriverManager;

public class Connection {

	public static void main(String[] args) {
		//System.out.println("response");
		getDestinationDBConnection();
		
			
			}
	static java.sql.Connection getDestinationDBConnection() {
		java.sql.Connection lResponse = null;
		try {
		String lURL = "jdbc:oracle:thin:@localhost:1521:XE";
		String lUserName = "system";
		String lPassword = "system";
		String lDriverClass = "oracle.jdbc.driver.OracleDriver";
		Class.forName(lDriverClass);
		lResponse =  DriverManager.getConnection(lURL, lUserName, lPassword);
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println(lResponse);
		return  lResponse;
		}
		
}

