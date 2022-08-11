package com.javaex.ch3;

public class RectangleApp {

  public static void main(String[] args) {
    Rectangle a = new Rectangle(6,4);
    Rectangle b = new Rectangle(2,12);
    Rectangle c = new Rectangle(3,4);
    Rectangle d = c;
    //Rectangle e = new Rectangle(6,2);
    
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
    System.out.println(a.equals(d));
    System.out.println(d.equals(c));
    //System.out.println(e.equals(c));
    
    System.out.println("a->" + a.hashCode());
    System.out.println("b->" + b.hashCode());
    System.out.println("c->" + c.hashCode());
    System.out.println("d->" + d.hashCode());
    //System.out.println("e->" + e.hashCode());
    
//    System.out.println("c->" +c);
//    System.out.println("d->" +d);
//    //System.out.println("e->" +e);
//    
//    System.out.println("c.getArea()->" +c.getArea());
//    System.out.println("d.getArea()->" +d.getArea());
//    //System.out.println("e.getArea()->" +e.getArea());
    
  }

}
