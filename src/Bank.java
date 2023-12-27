import java.sql.*;

public class Bank {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 String name  ="devarshi";
		 String email = "devarshi@gmail.com";
		 String password= "dev-rishi";
		 String gender= "male";
		
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","@Addy1910");
	     
         PreparedStatement ps = con.prepareStatement("insert into bank values('"+name+"','"+email+"','"+password+"','"+gender+"')");
         int result= ps.executeUpdate();
         
         if(result>0) {
        	 System.out.println("success");
         }
         else {
        	 System.out.println("fail");
         }
	}
}
