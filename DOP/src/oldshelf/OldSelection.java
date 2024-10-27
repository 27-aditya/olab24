package oldshelf;

public class OldSelection {

	// TODO: Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		if (o instanceof Book) {
			if (o instanceof Comic) 
				return ((Comic)o).getTitle();
			else if (o instanceof Fiction) 
				return ((Fiction)o).getName();
			else if (o instanceof TextBook) 
				return ((TextBook)o).getSubject();
		}
		
		return null;
	}

	public static void main(String[] args) {
		// TODO: Write a test code here and execute and text.
		TextBook tb = new TextBook("History");
		System.out.println(getAgeOrTitle(tb));
		
		Fiction fc = new Fiction("Lord of the rings",FictionType.Tragedy);
		System.out.println(getAgeOrTitle(fc));
		
		Comic cc = new Comic("Spiderman", 16);
		System.out.println(getAgeOrTitle(cc));
	}
}