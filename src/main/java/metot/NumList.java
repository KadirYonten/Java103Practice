
/** This class will build us a list of numbers and return the total count, sum, or average when asked
 */
public class NumList {

	final static double PI = 3.1415927;	// A constant value that may be of use at some point

	ArrayList my_list;	// this keeps track of your data
	int count;		// how many items have been stored

	/** Basic constructor
	 *  Makes a new numList
	 */
	public NumList() {			// never has a return value, not even void
		my_list = new ArrayList();	// initilizes my_list to point to a new ArrayList
		count = 0;			// tells count to start at 0 (empty list)
	}

	/** Constructor with an argument (int newNum)
	 *  Makes a new numList and adds newNum to it
	 */
	public NumList(int newNum) {
		this();			// Calls your other constructor to do list setup, saves having to copy and past code
		this.add(newNum);	// Calls an in-class method, again this saves having to copy and past code
	}

	/** Our basic add method 
	 */
	public void addNum(int newNum) {
		my_list.add(newNum);		// if my_list had not been initilized, this wouldn't work
		count++;			// ditto, you can add to 0, but you can't add to null
	}

	/** returns the number of elements in the list 
	 */
	public int getCount() {
		assert count == my_list.size();		// Check to see if you have made a counting error somewhere
		return count;				// give the users a count of the number of elements
	}

	/** returns the total value of the list
	 */
	public int getTotal() {
		int total = 0;

		/* Add up all the numbers in the list
		*  Finish this if you are so inclined. */

		return total;
	}

	/** returns the average value of the list
	 */
	public int getAve() {
		int ave = 0;

		/* Compute the average
		*  Finish this if you are so inclined. */

		return ave;
	}

} // end of numList class