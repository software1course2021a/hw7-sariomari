package il.ac.tau.cs.software1.predicate;

public class ByPrice implements Predicate<SmartPhone>{
	private double maxPrice;
	
	public ByPrice(double maxPrice) { // Q2
		setMaxPrice(maxPrice);
	}

	public void setMaxPrice(double price) {
		this.maxPrice = price;
		
	}
	public double getMaxPrice() {
		return this.maxPrice;
	}

	@Override
	public boolean test(SmartPhone phone) { // Q2
		double price = phone.getPrice();
		return (price <= this.maxPrice);
	}
	
	

}
