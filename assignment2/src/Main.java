package assignment2;
class Main{
	public static void main(String[] args) {
		Book obj1 =new Book();
		
		//set book properties
		obj1.setTitle("Name:Atomic Habits");
		obj1.setAuthor("Auhtor:James Clear");
		obj1.setPrice(650);
		obj1.setCopies(1000);
		
		//order more copies
		obj1.orderCopies(200);
		
		//get book properties
		System.out.println(obj1.getTitle());
		System.out.println(obj1.getAuthor());
		System.out.println(obj1.getPrice());
		
		//sell copy
		obj1.sellCopies(10);
		
		 //set Magazine properties
		Magzine obj2 = new Magzine();
		obj2.setTitle("Title: The Java Mag");
		obj2.setPrice(50);
		obj2.setorderQty(50);
		
		//sell copies
		obj2.sellCopies(20);
		
		//receive new issue
		obj2.recNewIssue("October");
		obj2.setCurrentIssue("Current Issue: September");
		
		//GEt properties
		System.out.println(obj2.getCurrentIssue());
		System.out.println(obj2.getTitle());
		System.out.println(obj2.getPrice());
		System.out.println(obj2.getCopies());
		
		//sell more copies 
		obj2.sellCopies(30);
		
		//receive new Issue
		obj2.recNewIssue("New Issue: October");
		
		
		
		
		
		
		
	}
}