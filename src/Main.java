import java.util.Scanner;

public class Main {

    // Task 1: the sum of squares of n numbers is n^2 plus the sum of squares of (n-1) numbers, O(n)
    public static int sumSquares(int n) {
        if (n == 1) return 1;
        return n * n + sumSquares(n - 1);
    }

    // Task 2: the sum of the first n elements is the nth element plus the sum of first (n-1) elements, O(n)
    public static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    // Task 3: the sum of powers up to n is b^n plus the sum of powers up to (n-1), O(n)
    public static int sumPowers(int b, int n) {
        if (n == 0) return 1;
        return (int) Math.pow(b, n) + sumPowers(b, n - 1);
    }

    // Task 4: print n numbers in reverse using recursion, O(n)
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Task 1: Sum of squares 1 to 4 = " + sumSquares(4));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Task 2: Sum of array elements = " + sumArray(arr, arr.length));

        System.out.println("Task 3: Sum of powers of 4 up to 3 = " + sumPowers(4, 3));

        System.out.println("Task 4: Enter N numbers to print in reverse:");
        int n = sc.nextInt();
        reversePrint(n, sc);
        System.out.println();

        sc.close();
    }
}