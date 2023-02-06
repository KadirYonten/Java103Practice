/**
 * @(#)ara.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */

class ListFIFO
   {
    Node listNode; // A standard node in the linked list.
    Node tail; /* This is a special node, we use it to keep track of the 
                * first node in the list.
                */ 

    /* First define a function that determines whether or not
     * the list is empty.
     */

    boolean isempty()
    {
     return tail == null; 
    }

    void enqueue(char c)
    {
     Node temp = new Node(); // Create a temp node for data manipulation. 
     temp.next = listNode; // Assign the pointer of temp to another Node
     temp.data = c;  // Give the char passed into enqueue to the data segment

     /* Now we need to find out if this is the first node in the list.
      * If it is, we'll assign it to be tail, otherwise we'll make it a
      * regular node in the list.
      */  

     if(tail == null)
     {
      tail = temp;
     }

     listNode = temp;
    } // end void enqueue(char c)

   char dequeue()
   {
    char c = tail.data; /* Read the data segment of the first node into 
                         * the method.
                         */
    Node temp = new Node(); // Create a temp node for data manipulation.
    temp = listNode; // copy "current" node to temp.

    /* If temp.next is pointing to NULL, then we only have this one 
     * Node, and since we've already extracted data from it, we can just
     * return that data to the calling method.
     */

    if (temp.next == null)
    {
     tail = null;
     listNode = null;
    }

    /* As long as temp.next points to non-null data, then we have 
     * more nodes we can work with.
     */

    while (temp.next != null)
    {

     /* If the refference section of the next node in the list points to
      * null, then assign tail the temp node, set tail.next to null,
      * and break out of the loop. 
      */

     if(temp.next.next == null)
     {
      tail = temp;
      tail.next = null;
      break;
     }

     /* Otherwise set the current temp node to the value of the 
      * next temp node.
      */

     temp = temp.next;
    } // end while (temp.next != null)

    return c;
   } // end char dequeue();
  } // end class ListFIFO
  
 

