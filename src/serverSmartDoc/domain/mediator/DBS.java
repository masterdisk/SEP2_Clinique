package serverSmartDoc.domain.mediator;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import java.sql.*;

import utility.persistence.MyDatabase;

public class DBS implements DbsPersistance {

	private MyDatabase myDatabase;
	
	public DBS() {
		try {
			myDatabase = new MyDatabase("org.postgresql.Driver",
					"jdbc:postgresql://localhost:5432/Clinique", "postgres", "hTrEa9982231");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public String fromByteToHex(byte[] digest) {
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(Integer.toHexString((int) (b & 0xff)));
		}
		String returnSb = sb.toString();
		return returnSb;
	}

	@Override
	public boolean verifyLogin(String login, String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] buffer = password.getBytes();
			md.update(buffer);
			byte[] digest = md.digest();
			
			String passwordHex = fromByteToHex(digest);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql = "SELECT * from accounts where (login=? and password=?)";
		try {
			myDatabase.query(sql, "%login","%passwordHex");
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
			
		}
		
		return true;
		
		
	}

}
