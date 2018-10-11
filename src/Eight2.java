import java.util.Scanner;

public class Eight2 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter a 4-by-4 matrix row by row:");

        double[][] m = {{in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()}, //prompt user for 4x4 matrix
                {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextDouble()}};

        System.out.printf("Sum of the elements in the major diagonal is %.2f",sumMajorDiagonal(m));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;

        for(int i = 0; i<m.length;i++){     //sums the diagonal values
            sum+=m[i][i];
        }


        return sum;
    }
}
