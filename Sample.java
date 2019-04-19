public class Sample {
	public static void main(String[] args) {
		String title = "Very nice book";
		String body = "This is a testing book.";
		Book B = new Book(body, title);
		B.print();
	}
}