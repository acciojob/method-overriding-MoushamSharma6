package com.driver;

public class Main {
  public static void main(String[] args) {
    B obj = new B();
    String ans = obj.meth();
    System.out.println(ans);
  }

  public static class A {
    public static String meth() {
      return "Invoking method from class A";
    }
  }

  public static class B extends A {
    public static String meth() {
      A a = new A();
      String ans = a.meth();
      System.out.println(ans);
      return "Method is overridden in Extended class B";
    }
  }
}