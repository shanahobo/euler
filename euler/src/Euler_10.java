import java.io.*;
import java.util.Scanner;

public class Euler_10 {

    private int [][] getData(Scanner scanner) {
        final int rows = 20;
        final int cols = 20;
        int a[][] = new int[rows][cols];
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                a[row][col] = scanner.nextInt();
            }
        }
        return a;
    }
     
    private int [][] getData(String filename) throws FileNotFoundException {
        return getData(new Scanner(new File(filename)));
    }
   
    //private int [][] getData() { return getData("Numbers.txt"); }
     
    private void showData(int [][] a) {
        final int rows = a.length;
        final int cols = a[0].length;
        for(int row=0; row<rows; row++) {
            for(int col=0; col<cols; col++) {
                System.out.print("  " + a[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]) {
    //    int [][] grid = getData();
     //   showData(grid);
    }
}
