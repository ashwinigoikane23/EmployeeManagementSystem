package EmpProj;

import java.sql.*;
import java.util.Scanner;
public class UpdatePro {
	void update() {
		System.out.println("Update employee...");
		System.out.println();
		PreparedStatement pstmt=null;
		System.out.println("1. Update first name.");
		System.out.println("2. Update last name.");
		System.out.println("3. Update age.");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		try{
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","Test@123");
				Statement stmt=con.createStatement();
				switch(ch)
				{
				case 1:
					String query="Update employee set fname=? where id=? ";
					pstmt=con.prepareStatement(query);

					System.out.println("Enter the employee id to be updated:");
					int i=sc.nextInt();
					
					System.out.println("Enter new fname:");
					String fname=sc.next();
					
					pstmt.setString(1,fname );
					pstmt.setInt(2,i);
					int r=pstmt.executeUpdate();
					if(r>0) {
					System.out.println("Information updated successfully.....");
					}
					else
					{
						System.out.println("Failed! Sorry there is no record of this id. ");
					}
				break;
				case 2:
				    query="Update employee set lname=? where id=? ";
					pstmt=con.prepareStatement(query);

					System.out.println("Enter the employee id to be updated:");
					 i=sc.nextInt();
					
					System.out.println("Enter new lname:");
					String lname=sc.next();
					
					pstmt.setString(1,lname );
					pstmt.setInt(2,i);
				    r=pstmt.executeUpdate();
					if(r>0) {
					System.out.println("Information updated successfully.....");
					}
					else
					{
						System.out.println("Failed! Sorry there is no record of this id. ");
					}
				break;
				case 3:
				    query="Update employee set age=? where id=? ";
					pstmt=con.prepareStatement(query);

					System.out.println("Enter the employee id to be updated:");
				    i=sc.nextInt();
					
					System.out.println("Enter new age:");
					int age=sc.nextInt();
					
					pstmt.setInt(1,age );
					pstmt.setInt(2,i);
				    r=pstmt.executeUpdate();
					if(r>0) {
					System.out.println("Information updated successfully.....");
					}
					else
					{
						System.out.println("Failed! Sorry there is no record of this id. ");
					}
				break;
				
				    default:
				    	System.out.println("Error...");
				}
				
				
		}
				catch(SQLException e)
				{
				   e.printStackTrace();
				}
	}

}