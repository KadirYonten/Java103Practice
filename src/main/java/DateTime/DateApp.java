import java.lang.System;
import java.util.Date;

public class DateApp {
 public static void main(String args[]){
  Date today = new Date();
  String days[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
  System.out.println("Today's date (locale conventions): "+
   today.toLocaleString());
  System.out.println("Today's date (Unix conventions): "+today.toString());
  System.out.println("Today's date (GMT conventions): "+today.toGMTString());
  System.out.println("Year: "+today.getYear());
  System.out.println("Month: "+today.getMonth());
  System.out.println("Date: "+today.getDate());
  System.out.println("Day: "+days[today.getDay()]);
  System.out.println("Hour: "+today.getHours());
  System.out.println("Minute: "+today.getMinutes());
  System.out.println("Second: "+today.getSeconds());
  Date newYears2000 = new Date(100,0,1);
  System.out.println("New Years Day 2000: "+newYears2000.toString());
  System.out.println("New Years Day 2000 is "+days[newYears2000.getDay()]);
 }
}