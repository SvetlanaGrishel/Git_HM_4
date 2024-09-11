import java.util.Arrays;
import java.util.Scanner;

public class Homework4_Task1 {
    public static void main(String[] args) {
        //array initialization
        int[][][] array3 = new int[2][2][2];

        //fill the array by random numbers
        for(int i = 0 ; i < array3.length; i++ ){
            for(int j = 0 ; j < array3[i].length; j++ ){
                for(int k = 0; k < array3[j].length; k++) {
                    array3[i][j][k] = ((int) (Math.random() * 200) - 100);
                    System.out.print(array3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        //enter the number to add to array elements
        System.out.println("Enter the value to add:");
        Scanner scanner = new Scanner(System.in);
        int addValue = scanner.nextInt();

        System.out.println("");
        System.out.println("Result array after adding the " + addValue + "to elements:");

        //add the entered value to array elements
        for(int i = 0 ; i < array3.length; i++ ){
            for(int j = 0 ; j < array3[i].length; j++ ){
                for(int k = 0; k < array3[j].length; k++) {
                    array3[i][j][k] = array3[i][j][k] + addValue;
                    System.out.print(array3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}