package com.javaex.ch2;

public class Smartphone extends Phone {
  private boolean power;
  
  public boolean isPower() {
    return power;
  }
  
  public void setPower(boolean power) {
    this.power = power;
  }
  
  public Smartphone(String myNumber, boolean power) {
    super(myNumber);
    this.power = power;
  }
  
  public void turnOn(boolean on) {
    this.power = on;
  }
  
  @Override
  protected void call(String number) {
    if(isPower()) {
      System.out.println(number + " 로 통화시작");
    }else {
      System.out.println("전원이 꺼져있습니다");
    }
  }
  
  public void searchInternet(String url) {
    if(isPower()) {
      System.out.println("브라우저에서 " + url + " 로 검색시작");
    }else {
      System.out.println("전원이 꺼져있습니다");
    }
    
  }
}
