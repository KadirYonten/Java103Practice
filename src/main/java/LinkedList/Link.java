/**
 * @(#)Link.java
 *
 *
 * @author T.Karacay 
 * @version 1.00 2006/10/29
 */


public class Link 
{ 
	public int value; 						// value of element 
	public Link next; 						// reference to next 
		public Link(int n, Link lnk) 		// constructor 
		{ value = n; next = lnk; } 
	public static void main(String args[]) 
	{ 										// initialize list head 
	 	Link head = null; 					// add some entries to list 
		for (int i = 1; i <= 10; i++) 
			head = new Link(i, head); 		// dump out entries 
		Link p = head; 
		while (p != null) 
			{ System.out.println(p.value); 
			  p = p.next; } 
	} 
} 