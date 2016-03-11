package python;

import java.util.Scanner;

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
	 * Print the length of an array.
	 * @param e: the array of any kind
	 * @return the length of that array
	 */
	public static final int len(Object[] e) {
		return e.length;
	}
	
	/**
	 * Convert an int to an int (performs no change)
	 * @param param: the int to not change
	 * @return: the parameter
	 */
	public static final int _int(int param) {
		return param;
	}
	
	/**
	 * Convert a float to an int
	 * @param param: the float to convert
	 * @return the float converted to an int
	 * @throws ValueError if unable to convert
	 */
	public static final int _int(float param) {
		try{
			return (int) param;
		}
		catch (Exception e) {
			throw new ValueError("Float", "int");
		}
	}
	
	/**
	 * Convert the string to an int
	 * @param param: the string to convert
	 * @return the int
	 * @throws ValueError if unable to convert
	 */
	public static final int _int(String param) {
		try{
			return Integer.parseInt(param);
		}
		catch (Exception e) {
			throw new ValueError("String", "int");
		}
	}
	
	/**
	 * Convert a double to an int
	 * @param param: the double to convert
	 * @return the int conversion
	 * @throws ValueError if unable to convert
	 */
	public static final int _int(double param) {
		try{
			return (int) param;
		}
		catch (Exception e) {
			throw new ValueError("double", "int");
		}
	}
	
	/**
	 * Convert a float to a float (no change).
	 * @param param: the float to convert to a float (once again, no change)
	 * @return the float
	 */
	public static final float _float(float param) {
		return param;
	}
	

	/**
	 * Convert an int to a float 
	 * @param param: the int to convert to a float
	 * @return the floated int
	 * @throws ValueError if the conversion breaks
	 */
	public static final float _float(int param) {
		try{
			return (float) param;
		}
		catch (Exception e) {
			throw new ValueError("int", "float");
		}
	}
	
	/**
	 * Convert a double to a float
	 * @param param: the double to convert
	 * @return the floated double
	 * @throws ValueError if there is an error
	 */
	public static final float _float(double param) {
		try{
			return (float) param;
		}
		catch (Exception e) {
			throw new ValueError("double", "float");
		}
	}
	
	/**
	 * Convert a string to a float
	 * @param param: the string to convert
	 * @return the floated string
	 * @throws ValueError if there is an error
	 */
	public static final float _float(String param) {
		try{
			return Float.parseFloat(param);
		}
		catch (Exception e) {
			throw new ValueError("String", "float");
		}
	}
	
	/**
	 * Get input from System.in
	 * @param prompt: the prompt to give users before they enter
	 * @return the input
	 */
	public static final String input(String prompt) {
		print(prompt);
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		in.close();
		return data;
	}
	
	/**
	 * Unprompted input from System.in
	 * @return the input
	 */
	public static final String input() {
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		in.close();
		return data;
	}
	
	
	/**
	 * The python-like runtime exception
	 */
	public static class TypeError extends RuntimeException {
		public TypeError (String errorMessage) {
			super(errorMessage);
		}
	}
	
	public static class ValueError extends RuntimeException {
		public ValueError(String type1, String type2) {
			super ("Unable to convert from a " + type1 + " to " + type2);
		}
	}
	
}
