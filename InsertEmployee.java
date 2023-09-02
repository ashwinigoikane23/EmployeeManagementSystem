package EmpProj;
import java.sql.*;
import java.util.Scanner;

	class Employee{
		void insert() {
			Connection con=null;
			PreparedStatement pstmt=null;
			System.out.println("Create new employee..");
			System.out.println();
			String sql="insert into employee (Id,Fname,Lname,Age) values (?,?,?,?)";
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Id:");
			int i=sc.nextInt();
			System.out.println("Enter Fname:");
			String f=sc.next();
			System.out.println("Enter Lname:");
			String l=sc.next();
			System.out.println("Enter Age:");
			int a=sc.nextInt();
			try {
				con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","Test@123");
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1,i);
				pstmt.setString(2, f);
				pstmt.setString(3, l);
				pstmt.setInt(4, a);
			    pstmt.executeUpdate();
			System.out.println("Information insertwd successfully....");
			}
			catch(SQLException e) 
			{
				System.out.println(e);
				e.printStackTrace();
			}
		}
	
	}
	public class InsertEmployee {
	
	}