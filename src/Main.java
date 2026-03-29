public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Task 1
    System.out.println("Task 1: Sum of squares from 1 to 4");
    System.out.println(RecursionTasks.sumSquares(4));

    // Task 2
    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Task 2: Sum of array elements");
    System.out.println(RecursionTasks.sumArray(arr, arr.length));

    // Task 3
    System.out.println("Task 3: Sum of powers of 4 up to 3");
    System.out.println(RecursionTasks.sumPowers(4, 3));

    // Task 4
    System.out.println("Task 4: Enter N numbers to print in reverse:");
    int n = sc.nextInt();
    System.out.println("Enter numbers:");
    RecursionTasks.reversePrint(n, sc);
    System.out.println();

    sc.close();
}