import java.io.*;
import java.util.Scanner;
public class Comp_op {
	float real, imag;
	
	Comp_op(){
		this.real=0;
		this.imag=0;
	}
    Comp_op(float num1,float num2){
    	real=num1;
    	imag=num2;
    	
    }
	void add(Comp_op num1,Comp_op num2){
		
		real=(num1.real + num2.real);
		imag=(num1.imag + num2.imag);
		System.out.println("Addition is:"+real+"+"+imag+"i");
		
	}
	void sub(Comp_op num1, Comp_op num2) {
		real=(num1.real - num2.real);
		imag=(num1.imag - num2.imag);
		System.out.println("Subtraction is:"+real+"-"+imag+"i");
	}
	void mul(Comp_op num1,Comp_op num2) {
		real=((num1.real*num2.real)-(num1.imag*num2.imag));
		imag=((num1.real*num2.imag)+(num2.real*num1.imag));
		System.out.println("Multiplication is:"+real+"+"+imag+"i");
	}
    void div(Comp_op num1, Comp_op num2) {
    	float deno;
    	deno=((num2.real*num2.real)+(num2.imag*num2.imag));
    	real=(num1.real/num2.real)/deno;
    	imag=(num1.imag/num2.imag)/deno;
    	System.out.println("Division is:"+real+"+"+imag+"i");
    }
}
   
	



