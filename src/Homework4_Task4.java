import java.util.Arrays;
import java.util.Scanner;

public class Homework4_Task4 {
    public static void main(String[] args) {

        //enter the dimensions of the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 'm' - first dimension of the array, 'm' should be >= 3:");
        int m = scanner.nextInt();
        if (m < 3) {
            System.out.println("Entered 'm' is < 3, the program is finished");
            System.exit(0);
        }
        System.out.println("Please, enter 'n' - second dimension of the array, 'n' should be >= 3:");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Entered 'n' is < 3, the program is finished");
            System.exit(0);
        }

        int[][] arrayInt = new int[m][n];

        //fill the array by random numbers from -10 to 10
        System.out.println("Generated array is: ");
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = ((int) (Math.random() * 20) - 10);
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //sort the array - use only "i" to go only by rows
        for (int i = 0; i < arrayInt.length; i++) {
            Arrays.sort(arrayInt[i]);
        }

        //display the sorted array
        System.out.println("Sorted array is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arrayInt[i][j]+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}