/**
 * @(#)Link.java
 *
 *
 * @author T.Karacay 
 * @version 1.00 2006/10/29
 */

// Purpose: Demonstrates a really simple singly-linked list.
//          Main builds list of words, prints it using two styles.
// Author : Fred Swartz, 21 Feb 2006, placed in the public domain.

import java.util.Scanner;

public class SimpleSinglyLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Elem front = null;    // First element of list.
        Elem back  = null;    // Last element of list.
        
        //... Read a list of words.
        while (in.hasNext()) {
            String word = in.next();
            
            Elem e = new Elem();     // Create a new list element.
            e.data = word;           // Set the data field.
            
            //... Two cases must be handled differently
            if (front == null) {
                //... When the list is empty, we have to set the front pointer.
                front = e;            // Back element will be set below.
            } else {
                //... When we already have elements, we need to link to it.
                back.next = e;       // Link last elem to new element.
            }
            back = e;                // Update back to link to new element.
        }
        
        //... While loop to print list in forward order.
        System.out.println("*** Print words in order of entry");
        Elem curr = front;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
        
        System.out.println("*** Print words in order of entry");
        for (Elem e = front; e != null; e = e.next) {
            System.out.println(e.data);
        }
        
        //... Printing list in backward order is an interesting exercise.
        //    But too much for here.
    }
}

////////////////////////////////////////////////////////////////////////// Elem
// Simple class to hold data are sometimes defined with public fields.
// This practice isn't good, but was done here for simplicity.
class Elem {
    public Elem next;    // Link to next element in the list.
    public String data;  // Reference to the data.
}

 