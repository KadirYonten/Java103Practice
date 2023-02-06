/**
 * @(#)javaList.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */

import java.lang.*;
   import java.util.*;

   public class javalist 
   {
       LinkedList list = new LinkedList();
    
       public javalist(LinkedList list){this.list = list;}

       void enqueue(Object o)
       {
	   list.addFirst(o);
       }

       Object dequeue()
       {
           return list.removeFirst();
       }

       boolean isempty()
       {
	   if (list.size() < 1)
	       {
		return true;
               }

	   else
	       {
		   return false;
	       }
       }
   }
