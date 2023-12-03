package assignment3;

/*Design and develop inheritance for a given case study,
identify objects and relationships and implement inheritance wherever applicable.
Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members.
Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. 
Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. 
Generate pay slips for the employees with their gross and net salary.package assignment3;
*/
import java.util.Scanner;



public class Employee {

	    String Emp_name;
	    String Emp_Id;
	    String Address; // Corrected variable name
	    String Email_Id;
	    long Mobile_No;

	    Scanner s = new Scanner(System.in);

	    public void Read() {
	        System.out.println("Enter Name:");
	        Emp_name = s.nextLine();

	        System.out.println("Enter Employee ID:");
	        Emp_Id = s.nextLine();

	        System.out.println("Enter Address:");
	        Address = s.nextLine();

	        System.out.println("Enter Email ID:");
	        Email_Id = s.nextLine();

	        System.out.println("Enter Mobile No.:");
	        Mobile_No = s.nextLong(); // Corrected method invocation
	    }

	    public void Display() {
	        System.out.println("\n\n\t\t*****Employee Details*****");
	        System.out.println("Name:" + Emp_name);
	        System.out.println("Employee ID: " + Emp_Id);
	        System.out.println("Address: " + Address);
	        System.out.println("Email ID: " + Email_Id);
	        System.out.println("Mobile No.:" + Mobile_No);
	    }

	    public void calculateSalary(double basicPay) {
	        double DA = 0.97 * basicPay; // Corrected syntax
	        double HRA = 0.10 * basicPay; // Corrected syntax
	        double PF = 0.12 * basicPay;
	        double SCF = 0.001 * basicPay;

	        double Gross_sal = basicPay + DA + HRA;
	        double Net_sal = (Gross_sal - PF - SCF);
	        System.out.println("\n\n\t\t***** Salary Details*****");
	        System.out.println("Dearness Allowance: " + DA);
	        System.out.println("House Rent Allowance: " + HRA);
	        System.out.println("Provision Fund:" + PF);
	        System.out.println("Staff Club Fund: " + SCF);
	        System.out.println("Gross salary:" + Gross_sal);

	        System.out.println("Net salary:" + Net_sal);
	    }
	}

	

	
