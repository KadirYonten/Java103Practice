import java.io.*;
class Demo implements arayuz01, arayuz02{
	public void topla(int x, int y){
		System.out.println("x+y = " + (x+y));
	}
	public void hacim(int a, int b, int c){
		System.out.println("Hacim = " + (a*b*c));
	}
	
	public static void main(String[] args){
		Demo d = new Demo();
		d.topla(12,15);
		d.hacim(3,5,7);
	}
}