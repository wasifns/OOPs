package assignment3;

import java.util.Scanner;

public class EmpPaySlip {

	
	public static void main(String[] args) {
		
		        int choice = 0;

		        Scanner s = new Scanner(System.in);

		        do {
		            System.out.println("\n-MENU-");
		            System.out.println("1. Programmer");
		            System.out.println("2. TeamLead");
		            System.out.println("3. Project Manager");
		            System.out.println("4. Assistant Project Manager");
		            System.out.println("5. Exit");

		            System.out.println("Enter your choice:");
		            choice = s.nextInt(); // Corrected variable name

		            switch (choice) {
		                case 1:
		                    Programmer p = new Programmer();
		                    p.Read();
		                    p.Display();
		                    p.calculateSalary(15000);
		                    break;

		                case 2:
		                    TeamLead t = new TeamLead();
		                    t.Read();
		                    t.Display();
		                    t.calculateSalary(52000);
		                    break;

		                case 3:
		                    ProjectManager pm = new ProjectManager();
		                    pm.Read();
		                    pm.Display();
		                    pm.calculateSalary(25000);
		                    break;

		                case 4:
		                    AssistantProjectManager ap = new AssistantProjectManager();
		                    ap.Read();
		                    ap.Display();
		                    ap.calculateSalary(20000);
		                    break;

		                case 5:
		                    System.out.println("\nExiting from the program!!!");
		                    break;
		            }

		        } while (choice != 5);
		    }
		

		
		
	

	}


