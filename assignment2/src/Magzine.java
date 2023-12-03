package assignment2;
class Magzine extends Publication{
	private double orderQty;
	private String currentIssue;
	public String getCurrentIssue() {
		return currentIssue;
	}
	public void setCurrentIssue(String currIssue) {
		this.currentIssue = currIssue;
	}
	public double getorderQty() {
		return orderQty;
		
	}
	public void setorderQty(double Copies) {
		orderQty = Copies;
	}
	public void recNewIssue(String pNewIssue) {
		setCopies(orderQty);
		currentIssue = pNewIssue;	
	}
	public void sellCopies(int qty, int Price) {
		System.out.println("Total Magzine sale: $"+ (qty*Price)); 
	}
}