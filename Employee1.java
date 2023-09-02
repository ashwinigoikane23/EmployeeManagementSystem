package EmpProj;

import java.sql.*;
public class Employee1 {

	public static void main(String[] args) {
	try{
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:/EmplyeeProject","root","Test@123");
	Statement stmt=con.createStatement();
	
//	String sql="create database EmplyeeProject";
//	stmt.executeUpdate(sql);
//	System.out.println("Database created successfully...");
	
	String sql="create table Employee(Id int primary key,Fname varchar(30),Lname varchar(30),Age int)";
	stmt.executeUpdate(sql);
	System.out.println("Table created successfully...");
	}
	catch(SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	}

}