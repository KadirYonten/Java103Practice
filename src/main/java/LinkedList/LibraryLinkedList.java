// Purpose: Contrast library LinkedList with the manual solutions.
//          The link management infrastructure is completely hidden.
// Author : Fred Swartz, 21 Feb 2006, placed in the public domain.

package linkedlistexamples;

import java.util.*;

public class LibraryLinkedList {
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in);
        
        LinkedList<String> lst = new LinkedList<String>();
        
        //... Read and build list of words.
        while (in.hasNext()) {
            String word = in.next();
            lst.add(word);
        }
        
        //... Enhanced for loop to print list forward.
        //    Could also use an Iterator (forward only) or
        //    ListIterator (forward or backward).
        System.out.println("*** Print words in order of entry");
        for (String s : lst) {
            System.out.println(s);
        }
        
        //... Use ListIterator go to backward.  Start at end.
        System.out.println("*** Print words in reverse order of entry");
        for (ListIterator<String> lit = lst.listIterator(lst.size()); lit.hasPrevious();) {
            System.out.println(lit.previous());
        }
    }
}

