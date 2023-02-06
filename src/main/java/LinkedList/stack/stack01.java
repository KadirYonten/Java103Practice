/**
 * @(#)ara.java
 *
 *
 * @author 
 * @version 1.00 2006/10/25
 */

class stack01{

public static void main(String[] args) {
StringStack stack = new StringStack();
while(!StdIn.isEmpty()) {
String s = StdIn.readString();
stack.push(s);
}
while(!stack.isEmpty()) {
String s = stack.pop();
System.out.println(s);
}
}
}