import java.util.Scanner;

public class RecursionTasks {

    // Task 1
    // Time Complexity: O(n), the function calls itself n times until n = 1
    public static int sumSquares(int n) {
        if (n == 1) {
            return 1;
        }
        return n * n + sumSquares(n - 1);
    }
    // Task 2
    // Time Complexity: O(n), one recursive call for each array element
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return 0;
        }
        return arr[n - 1] + sumArray(arr, n - 1);
    }
    // Task 3
    // Time Complexity: O(n), recursion runs n times
    public static int sumPowers(int b, int n) {
        if (n == 0) {
            return 1;
        }
        return (int)Math.pow(b, n) + sumPowers(b, n - 1);
    }
    // Task 4
    // Time Complexity: O(n), reads each number and prints them in reverse order using recursion.
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }
}