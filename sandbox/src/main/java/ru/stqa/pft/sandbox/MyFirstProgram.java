package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello();

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямойгольника со сторонами " + a + " и " + b + " равна " + area(a,b));
  }

  public static void hello() {
    System.out.println("Hello, world!");
  }
  public static double area(double len) {
    return len * len;
  }
  public static double area(double a, double b) {
    return a * b;
  }
}
	