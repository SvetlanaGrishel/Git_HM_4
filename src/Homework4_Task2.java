public class Homework4_Task2 {
    public static void main(String[] args) {
        //array initialization
        char[][] array = new char[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = 'W';                  //if the cell coordinates are even = 'W'
                }
                else array[i][j] = 'B';                 //if the cell coordinates aren't even = 'B'
                System.out.print(array[i][j] + " ");    //display the symbol
            }
            System.out.println();                       //start of new row
        }
    }
}

/*
Check the coordinates of the 2 first rows to understand the algorithm:
W(0,0) B(1,0) W(2,0) B(3,0) W(4,0) B(5,0) W(6,0) B(7,0)
B(0,1) W(1,1) B(2,1) W(3,1) B(4,1) W(5,1) B(6,1) W(7,1)
...
 */