package EmpProj;

import java.util.Scanner;
public class FinalEmployee {

	public static void main(String[] args) {
		System.out.println("!!------------------ Welcome To Employee Management System ------------------!!"
				+ "                                                                                           ");
		Scanner sc=new Scanner(System.in);
		
		do {
		System.out.println("0. Exit.");
		System.out.println("1. Insert new employee.");
		System.out.println("2. Show all employee.");
		System.out.println("3. Show employee by id.");
		System.out.println("4. Update employee information.");
		System.out.println("5. Delete employee information.");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch (ch) {
		case 0:
			System.exit(0);
			break;
		case 1:
			Employee e=new Employee();
			e.insert();
			break;
		case 2:
			Result r=new Result();
			r.showAll();
			break;
		case 3:
			Result s=new Result();
			s.show();
			break;
		case 4:
			UpdatePro u=new UpdatePro();
			u.update();
			break;
		case 5:
			Result d=new Result();
			d.delete();
			break;
			default:
				System.out.println("Thank you for visiting our system...");
			
			
		}
		
		}
		while(true);

	}

}