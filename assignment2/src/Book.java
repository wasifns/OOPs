package assignment2;
class Book extends Publication{
	private String Author;
	private double orderCopies;
	public String getAuthor() {
		return Author; 
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public double getorderCopies() {
		return orderCopies;
		
	}
	public void setorderCopies(double Copies) {
		orderCopies = Copies;
		
	}
	public void orderCopies(double pcopies) {
		setCopies(getCopies() + pcopies);
		
	}
	public void sellCopies(int qty, int Price) {
		System.out.println("Total Book sale: $"+ (qty*Price));
	}
	
}