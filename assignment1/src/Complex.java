import java.util.Scanner;

public class Complex{
	public static void main(String[] args) { 
		int ch=0;
		float num1,num2;
		Comp_op calc=new Comp_op();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number with real and imagniary part.");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		Comp_op co1=new Comp_op(num1,num2);
		System.out.println("Enter second number with real and imagniary part.");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		Comp_op co2=new Comp_op(num1,num2);
		do {
			System.out.println("---------MENU---------");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			System.out.println("Enter choice");
			ch=sc.nextInt();
			
		switch(ch){
		case 1:
			calc.add(co1, co2);
			break;
		case 2:
			calc.sub(co1, co2);
			break;
		case 3:
			calc.mul(co1, co2);
			break;
		case 4:
			calc.div(co1, co2);
			break;
		default:
			System.out.println("Exiting the program.");
			
		}
			
	}while(ch!=5);
		
	}
 }

	