package com.javaex.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

  public static void main(String[] args) {
    SimpleDateFormat fm1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat fm2 = new SimpleDateFormat("yyyy-MM-dd");
    
    Date time = new Date();
    String time1 = fm1.format(time);
    String time2 = fm2.format(time);
    
    System.out.println(time);
    System.out.println(time1);
    System.out.println(time2);
    

  }

}
