/*
 * pVectorTest.java	v0.01
 *
 * Copyright(c) 1998, Particle
 */

import java.io.*;
import java.util.*;

class pVectorTest{
	public static void main(String[] args){
		Vector v = new Vector(15);
		Integer j = null;
		int i;
		System.out.println("starting...");
		for(i=0;i<10;i++){
			j = new Integer((int)(Math.random() * 100));
			v.addElement(j);
			System.out.println("addElement: " + j);
		}
		System.out.println("size: "+v.size());
		System.out.println("capacity: "+v.capacity());
		
		Enumeration enum = v.elements();
		while(enum.hasMoreElements())
			System.out.println("enum: "+(Integer)enum.nextElement());
		
		System.out.println("Done ;-)");
	}
}
