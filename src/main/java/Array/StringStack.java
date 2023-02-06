/**
 * @(#)ara.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */

public class StringStack {
private Node first = null;
private class Node {
String item;
Node next;
}
public boolean isEmpty() { return first == null; }
public void push(String item) {
Node second = first;
first = new Node();
first.item = item;
first.next = second;
}
public String pop() {
String item = first.item;
first = first.next;
return item;
}
}