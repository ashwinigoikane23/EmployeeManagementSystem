package EmpProj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Result {
void showAll(){
	System.out.println("Information of all employee...");
	System.out.println();
	 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","Test@123");
			Statement stmt=con.createStatement();
			String sql="select* from employee";
			ResultSet rs=stmt.executeQuery(sql);
			System.out.println("Id"+" "+"Fname"+"   "+"Lname"+"   "+"Age");
			System.out.println("-------------------------------------------------------------------------------------------------------------");
			while(rs.next())
			{
				
				
				System.out.println(+rs.getInt("id")+"  "+rs.getString("Fname")+"  "+rs.getString("Lname")+"  "+rs.getInt("Age"));
				System.out.println("-------------------------------------------------------------------------------------------------------------");
			}
		}
			catch(SQLException e)
			{
			   e.printStackTrace();
			}
}
void delete()
{
	PreparedStatement pstmt=null;
	
	try {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","mrunali");
		
		String del="Delete from employee where id=? ";
		pstmt=con.prepareStatement(del);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id to be deleted");
		int i=sc.nextInt();
		pstmt.setInt(1,i);
		int r=pstmt.executeUpdate();
		if(r>0) {
		System.out.println("Information deleted successfully.....");
		}
		else
		{
			System.out.println("Failed! Sorry there is no record of this id. ");
		}
	}
	catch(SQLException e)
	{
	   e.printStackTrace();
	}
}
void show()
{
	
	 try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","mrunali");
			Statement stmt=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id of employee:");
			int i=sc.nextInt();
			String sql=("select* from employee where id="+i);	
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next())
			{
				
				System.out.println("Employe details:");
				System.out.println(+rs.getInt("id")+"  "+rs.getString("Fname")+"  "+rs.getString("Lname")+"  "+rs.getInt("Age"));
				
			}
		}
			catch(SQLException e)
			{
			   e.printStackTrace();
			}
}
 }