import java.util.Arrays; 
/**
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu) 
 * 405 - OOP
 * This is due Monday 9/16
 * 
 */
public class IntArrays {

	/** #2  *toString method    DONE
	 * Returns a string representation of the contents of the specified array.
	 * @param a read in (type->(int[])) 
	 * @return a string representation of the contents of the int array
	 */
	public static String toString(int[] a) {
		String s = new String(Arrays.toString(a));
		return s;
	}
	
	/**  #3   *compare      DONE
	 * Determines whether or not the arrays have the same contents.
	 * @param a1 read in 
	 * @param a2 read in 
	 * @return True if the arrays are of the same length and have the same
	 * elements
	 * False otherwise.
	 */
	public static boolean compare(int[] a1, int[] a2) {
		//Creates 2 objects to compare the 2 given integer arrays
		Object[] arr1 = {a1};
		Object[] arr2 = {a2};
		//Using deep equals method from Arrays import package.
		if(Arrays.deepEquals(arr1, arr2)){
			return true;
		}
		return false;            //If .deepEquals is false, return false;
	}

	/** #4    *concatenate
	 * Returns the concatenation of the two specified arrays.
	 * @param a1 Read in
	 * @param a2 Read in
	 * @return an array that corresponds to the concatenation of the two specified arrays.
	 */
	public static int[] concatenate(int[] a1, int[] a2) {
		//Catches the null exceptions
		if(a1 == null) {
			return null;
		}
		if(a2 == null) {
			return a1;
		}
		
		//Creates a new int array w/ the size of a1 + a2
		int a3[] = new int[a1.length + a2.length];
		
		//Loops over both a1 + a2 and adds their contents
		//to a3 one element @ a time.
		int i = 0;
		for(int element : a1) {
			a3[i] = element;
			i++;
		}
		for(int element : a2) {
			a3[i] = element;	
			i++;
		}

		return a3;
	}
	/** #5       *merge
	 * Merges two sorted arrays into one sorted array
	 * @param a1 a sorted int array
	 * @param a2 a sorted int array.
	 * @returns a sorted array containing the elements from the specified sorted arrays.
	 */
	public static int[] merge(int[] a1, int[] a2) {
		if(a1 == null) {
			return null;
		}
		if(a2 == null) {
			return a1;
		}
		
		//Creates a new int array w/ the size of a1 + a2
		int a3[] = new int[a1.length + a2.length];
		
		//Loops over both a1 + a2 and adds their contents
		//to a3 one element @ a time.
		int i = 0;
		for(int element : a1) {
			a3[i] = element;
			i++;
		}
		for(int element : a2) {
			a3[i] = element;	
			i++;
		}
	
		//Now (If it makes it here), this array is sorted.
		Arrays.sort(a3);
		return a3;
	}
	
	/**
	 * The main function.
	 * Calls the 4 testing methods
	 */
	public static void main(String[] args) {
		testToString();
		testCompare();
		testConcatenate();
		testMerge();
		System.exit(1);
	}

	private static void testToString() {
		System.out.println(toString(new int[] { 1, 2, 3 }));
		System.out.println(toString(new int[] {}));
		System.out.println(toString(null));
		System.out.println("End of toString \n 	 ");
	}

	private static void testCompare() {
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2, 3 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2, 4 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, new int[] { 1, 2 }));
		System.out.println(compare(new int[] { 1, 2, 3 }, null));
		System.out.println(compare(null, null));
		System.out.println("End of compare \n ");
	}

	private static void testConcatenate() {
		System.out.println(toString(concatenate(new int[] { 1, 2, 3 }, new int[] { 1, 3 })));
		System.out.println(toString(concatenate(new int[] { 1, 2, 3 }, null)));
		System.out.println(toString(concatenate(null, null)));
		System.out.println("End of concatenate \n ");
	}
	
	private static void testMerge() {
		System.out.println(toString(merge(new int[] { 1, 2, 3 }, new int[] { 1, 3 })));
		System.out.println(toString(merge(new int[] { 1, 2, 3 }, null)));
		System.out.println(toString(merge(null, null)));
		System.out.println("End of merge \n ");
	}

}