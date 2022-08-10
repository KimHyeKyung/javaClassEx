package com.javaex.ch2;

public abstract class Phone {
  private String number;
  
  public Phone(String myNumber) {
    this.number = myNumber;
  }

  public Phone() {
    // TODO Auto-generated constructor stub
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  protected abstract void call(String number);
  
}
