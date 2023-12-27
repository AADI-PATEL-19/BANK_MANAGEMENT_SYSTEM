import java.sql.*;
import javax.swing.*;

public class bank_system {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String name  ="jethalal";
		 String email = "jetha01@gmail.com";
		 String password= "kutchi";
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
        
        new bank_system();
	}
	
	JFrame frame;
    JLabel label1, label2, label3;
    JTextField textfield1, textfield2, textfield3;
    JButton Submit,Reset;
	
	
	bank_system(){
		frame=new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(800,800);

        label1=new JLabel("Enter Your Username: ");
        label1.setBounds(20,20,150,20);
        label2=new JLabel("Enter Your Email: ");
        label2.setBounds(20,50,150,20);
        label3=new JLabel("Enter Your Password: ");
        label3.setBounds(20,80,150,20);

        textfield1=new JTextField();
        textfield1.setBounds(250,20,100,20);
        textfield2=new JTextField();
        textfield2.setBounds(250,50,100,20);
        textfield3=new JTextField();
        textfield3.setBounds(250,80,100,20);

        Submit=new JButton("Login");
        Submit.setBounds(50,120,160,40);
        Reset=new JButton("Reset");
        Reset.setBounds(200,120,160,40);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textfield1);
        frame.add(textfield2);
        frame.add(textfield3);
        frame.add(Submit);
        frame.add(Reset);
	}
}





		
		 
