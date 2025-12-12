package common;

public class Recursive {

  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }

  public static int power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    return a * power(a, b - 1);
  }

  public static int sum(int[] arr) {
    return sum(arr, 0);
  }

  public static int sum(int[] arr, int index) {
    if (arr.length == 0 || index >= arr.length) {
      return 0;
    }
    return arr[index] + sum(arr, index + 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
    System.out.println(fibonacci(5));
    System.out.println(gcd(10, 5));
    System.out.println(power(2, 3));
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5 })); // Sum all elements
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5 }, 2)); // Sum from index 2 to the end
  }
}
