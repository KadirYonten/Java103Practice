/**
 * @(#)DoublyList.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */


class doubleList  
  {
    Node listNode; // A standard node
    Node head = null; // The head of the list.
    Node tail = null; // The tail of the list.
    Node current = null; // This will be a marker for the current node of list.
    Node lastNode;  

    /* First, a method to determine if the list is empty */

    boolean isempty()
    {
      return tail == null;
    }  

    /* Now we need a method to add elements to the tail of the list. */

    void addToTail(char c)
    {

      if (tail == null)
        {  
          tail = new Node();  
          tail.next = null; 
          tail.prev = null;

          /* If this is the first node in the list, then 
           * make it the head as well.
           */

	  if (head == null)
	    {
	      head = tail;
	    }

        }

        else
          {  
 	    Node temp = new Node(); //for data manipulation.
	    temp.prev = tail;
	    temp.next = null;
	    tail.next = temp;
	    tail = temp;
          }

      tail.data = c; // We need to store data no matter what.

      current = tail;

    } //end void addToTail(char c)

    void addToHead(char c)
    {

      if (head == null)
        {
	  head = new Node();
	  head.next = null;
	  head.prev = null;
      
          /* If this is the first node in the list, then 
           * make it the tail as well.
           */

	  if (tail == null)
	    {
	      tail = head;
	    }

        }

        else
          {
	    Node temp = new Node(); //for data manipulation.
	    temp.prev = null;
	    temp.next = head;
	    head.prev = temp;
	    head = temp;
          }

        head.data = c; // We need to store data no matter what.

        current = head;

    } //end void addToHead(char c)


    /* The next function will add a node to the list directly after
     * the current position.  If we really need to add before the current 
     * position, it is trivial to simply move the current position back one
     * place, and equally trivial to write a method for adding before the
     * current position.
     */

    void addToCurrent(char c)
    {
      /* The only time current will be null is if the list doesn't yet
       * exist.  Just add to the head in this case.
       */

      if (current == null) addToHead(c);

      /*
       * If we are already at the head or the tail, we already have 
       * methods for adding to these, and adding to the head or the 
       * tail requires special considerations, so if we try calling 
       * this method at one of those two points, we should just
       * pass the data along to one of the methods for adding to the
       * head or the tail.
       */

      else if (current == head) addToHead(c);

      else if (current == tail) addToTail(c);

      else
        {
	  Node temp = new Node();
	  temp.data = c;
	  temp.next = current.next;
	  current.next = temp;
	  temp.prev = current;
	  temp.next.prev = temp;

	  current = temp;
        }
    } //end  void addToCurrent(char c)


    /* Now that we can create the list, we need a method for retrieving 
     * the data that we've entered...
     */

    char getCurrentData()
    {
      Node temp = new Node();
      temp = current;

      return temp.data;
    } // end char getCurrentData()

    void moveHead()
    {
      if (current != head) current = head;
    }

    void moveTail()
    {
      if (current != tail) current = tail;
    }

    void moveNext()
    {

      /* If we are at the tail, we don't need to do anything,
       * otherwsie we just move the current position to the 
       * next node.
       */

      if (!(current.next == null))
        {
	  System.out.println("moving to next.");
	  current = current.next;
        }

      else
        {
	  System.out.println("Couldn't move next!");
        }
    } //end void moveNext()

    /* And now one for moving towards the head of the list. */

    void movePrev()
    {

      /* If we are at the head, we don't need to do anything,
       * otherwsie we just move the current position to the 
       * previous node.
       */

      if(!(current.prev == null))
        {
	  System.out.println("moving to prev.");
	  current = current.prev;
        }
      else
        {
   	  System.out.println("Couldn't move prev!");
        }

    } //end void movePrev()

    /* Now that we can create, move around in, and read from 
     * our list, we need to be able to remove nodes from the 
     * list.  We'll focus on simply removing from the head and
     * the tail.
     */

    void removeTail()
    {
      if(tail != null)
        {
	  if (tail == current) current = tail.prev;
	  tail = null;
        }
    } 

    void removeHead()
    {
      if(head != null) 
        {
	  if (head == current) current = head.next;
	  head = null;
        }
    }

    /* This method will delete the current node, and set the next (read,
     * next towards tail) node as the new current.
     */

    void removeCurrent()
    {
      /* If current is null, then we haven't created the list yet, and
       * we don't want to do anything.
       */

      if (current != null)
        {
	  /* If current is the same as head or tail, we already have
	   * methods for diong that, so just call them.
	   */

	  if (current == head) removeHead();
	  else if (current == tail) removeTail();

	  /* Now we get down to buisiness */

	  else
	    {
	      current.prev.next = current.next;
              current.next.prev = current.prev;
	      current = current.next;
	    }
        } // end if(current != null)
    }// end void removeCurrent()

  } //end class doubleList
