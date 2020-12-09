package il.ac.tau.cs.software1.predicate;

public class Discount implements Action<Book> {
	private double percent;
	
	public Discount(double percentage) { // Q3
		double p = percentage/100;
		setPercent(p);
	}
	public void setPercent(double percentage) {
		this.percent = percentage;
	}
	public double getPercent() {
		return this.percent;
	}
	
	
	@Override
	public void performAction(Book book) { // Q3
		double newPrice = book.getPrice() * getPercent();
		book.setPrice(newPrice);
	}
	
}
