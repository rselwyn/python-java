package python;

public final class PythonWrapper {
	
	/**
	 * Print just like the python "print()" method
	 * @param e: the data to print
	 */
	public static final <E> void print(E e) {
		System.out.println(e);
	}
	
	/**
	 * Print the length of a string
	 * @param e: the string to get the length of.
	 * @return the length
	 */
	public static final int len(String e) {
		return e.length();
	}
	
	/**
	 * The python-like runtime exception
	 */
	public static class TypeError extends Exception {
		public TypeError (String errorMessage) {
			super(errorMessage);
		}
	}
}
