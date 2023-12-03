/*2. Polymorphism Identify commonalities and differences between Publication, Book and Magazine classes.
Title, Price, Copies are common instance variables and saleCopy is common method. 
The differences are, Bookclass has author and orderCopies(). 
Magazine Class has methods orderQty, Current issue, receiveissue().
Write a program to find how many copies of the given books are ordered and display total sale of publication.*/

package assignment2;
class Publication{
	private String Title;
	private double Copies;
	private int Price;
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getPrice() {
		return Price;
		
	}
	public void setPrice(int price) {
		if(price>0) {
			Price = price;
			
		}
		else
			System.out.println("invalid price");
	}
	public double getCopies() {
		return Copies;
	}
	public void setCopies(double copies) {
		Copies = copies;
		
		
		
	}
	public void sellCopies(int qty) {
		System.out.println("Total sell copies $"+(qty*Price));
		
	}
}