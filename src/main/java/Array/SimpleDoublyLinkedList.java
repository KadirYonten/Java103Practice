package linkedlistexamples;

import java.util.Scanner;

public class SimpleDoublyLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Elem2 front = null;    // First element of list.
        Elem2 back  = null;    // Last element of list.
        
        //... Read a list of words.
        while (in.hasNext()) {
            String word = in.next();
            
            Elem2 e = new Elem2();     // Create a new list element.
            e.data = word;           // Set the data field.
            
            //... Two cases must be handled differently
            if (front == null) {
                //... When the list is empty, we have to set the front pointer.
                front = e;            // Back element will be set below.
            } else {
                //... When we already have elements, we need to link to it.
                back.next = e;       // Link last elem to new element.
            }
            e.prev = back;
            back = e;                // Update back to link to new element.
        }
        
        System.out.println("*** Print words in order of entry");
        for (Elem2 e = front; e != null; e = e.next) {
            System.out.println(e.data);
        }
        
        System.out.println("*** Print words in reverse order of entry");
        for (Elem2 e = back; e != null; e = e.prev) {
            System.out.println(e.data);
        }
    }
}

////////////////////////////////////////////////////////////////////////// Elem2
// Simple classes to hold data are sometimes defined with public fields.
// This practice isn't good, but was done here for simplicity.
class Elem2 {
    public Elem2 next;   // Link to next element in the list.
    public Elem2 prev;   // Link to the previous element.
    public String data;  // Reference to the data.
}
