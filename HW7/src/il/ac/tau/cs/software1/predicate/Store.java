package il.ac.tau.cs.software1.predicate;

import java.util.List;

public class Store<T extends Product> {
	private List<T> inventory;
	
	public Store(List <T> inventory) {
		this.inventory = inventory;
	}

	public List<T> getInventory() {
		return inventory;
	}

	public String getInventoryDescription() { // Q4
		if (getInventory().isEmpty()) {
			return "";
		}
		String result = "";
		for (T product : inventory) {
			result += product.getDescription();
		}
		return result;
	}

	public void transform(Predicate<T> pred, Action<T> action) { // Q5
		for (T product : inventory) {
			if (pred.test(product)) {
				action.performAction(product);
			}
		}
	}
}
