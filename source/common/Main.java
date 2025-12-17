package common;

public class Main {
  static void countdown(int n) {
    if (n == 0) {
      System.out.println("Selesai");
      return;
    }
    System.out.println(n);
    countdown(n - 1);
  }

  public static void main(String[] args) {
    countdown(5);
  }
}
