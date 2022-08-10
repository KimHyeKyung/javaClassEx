package com.javaex.ch2;

public class Telephone extends Phone {
  private boolean power;
  
  public Telephone(String myNumber) {
    super(myNumber);
    this.power = false;
  }

  public Telephone() {
    super();
  }

  public boolean isPower() {
    return this.power;
  }

  public void setPower(boolean power) {
    this.power = power;
  }

  @Override
  protected void call(String number) {
    System.out.println(super.getNumber() + "에서 " + number + " 로 통화시작");
  }
  
  public void power(boolean on) {
    this.power = on;
  }

}
