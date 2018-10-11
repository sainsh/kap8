import java.util.Scanner;

public class Eight1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter a 3-by-4 matrix row by row:");

        double[][] m = {{in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()},       //input the matrix
                {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()}
        };


        for (int i = 0; i < m[0].length; i++) {     //gets the sum for each column


            System.out.printf("Sum of the elements at column %d is %.2f\n", i, sumColumn(m, i));
        }

    }


    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0.0;

        for (int i = 0; i < m.length; i++) {    // looks at every row of a column and sums the values together
            sum += m[i][columnIndex];
        }


        return sum;
    }
}
