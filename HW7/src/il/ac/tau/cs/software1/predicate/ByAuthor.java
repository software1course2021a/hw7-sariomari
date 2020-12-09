package il.ac.tau.cs.software1.predicate;

public class ByAuthor implements Predicate<Book> {
	private char letter;

	public ByAuthor(char letter) { // Q2
		setLetter(letter);
	}

	@Override
	public boolean test(Book book) { // Q2
		char fl = book.getAuthor().toLowerCase().charAt(0);
		if (fl == letter)
			return true;
		return false;
	}
	public void setLetter(char letter) {
		this.letter = letter;
	}
	public char getLetter() {
		return this.letter;
	}
}