import java.util.Scanner;

public class Homework4_Task3 {
    public static void main(String[] args) {
        //fill the array dimension
        System.out.println("Enter the n, n should be from 2 to 6: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 6 || n < 2) {
            System.out.println("n should more than 2 and less than 7, the program is finished");
            System.exit(0);
        } else System.out.println("The entered value is accepted");

        //array initialization
        int[][] arrayInt = new int[n][n];

        //fill the array by random numbers from -100 to 100
        System.out.println("Generated array is: ");
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                arrayInt[i][j] = ((int) (Math.random() * 200) - 100);
                System.out.print(arrayInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //sum of main diagonal
        int sumMain = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (i == j) {
                    sumMain = sumMain + arrayInt[i][j];
                }
            }
        }

        //sum of secondary diagonal
        int sumSecond = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            for (int j = 0; j < arrayInt[i].length; j++) {
                if (i+j == n - 1) {
                    sumSecond = sumSecond + arrayInt[i][j];
                }
            }
        }

        //display the results
        System.out.println("Sum of elements of the main diagonal is: " + sumMain);
        System.out.println("Sum of elements of the secondary diagonal is: " + sumSecond);
        scanner.close();
    }
}

/*
Search of algorithm for secondary diagonal (if n = 4) ->
a(0,0) a(0,1) a(0,2) a(0,3)
a(1,0) a(1,1) a(1,2) a(1,3)
a(2,0) a(2,1) a(2,2) a(2,3)
a(3,0) a(3,1) a(3,2) a(3,3)

SUM = a(0,3) + a(1,2) + a(2,1) + a(3,0) -> elements with i+j = 3 -> n - 1
 */