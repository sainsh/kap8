import java.util.Scanner;

public class Eight5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter matrix1: ");

        double[][] a = {{in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble()}}; // 1 2 3 4 5 6 7 8 9

        System.out.print("Enter matrix2: ");

        double[][] b = {{in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble()},
                {in.nextDouble(), in.nextDouble(), in.nextDouble()}}; // 0 2 4 1 4,5 2,2 1,1 4,3 5,2

        double[][] c = addMatrix(a, b);


        String output = "The matrices are added as follows: \n";

        for (int i = 0; i < a.length; i++) {        //row
            for (int j = 0; j < a.length; j++) {// a b or c


                for (int m = 0; m < a.length; m++) {    //column


                    if (j == 0) {

                        output += a[i][m] + " ";        //first the a's

                    } else if (j == 1) {

                        output += b[i][m] + " ";        //then the b's


                    } else {                            //then the c's

                        output += c[i][m] + " ";

                    }
                    if (j == 0 && m == 2) {
                        if(i == 1) {

                            output += " +  ";       // on the middle line between a and b add a + to output
                        }else{
                            output += "    ";
                        }

                    } else if(j==1 & m ==2){
                        if(i==1){
                            output += " =  ";   // on the middle line between b and c add a = to output
                        }else{
                            output += "    ";
                        }

                    }

                }


            }
            output += " \n";
        }

        System.out.println(output);

    }

    public static double[][] addMatrix(double[][] a, double[][] b) { // add each value of a and b together and stores it in c
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                c[i][j] = a[i][j] + b[i][j];

            }
        }


        return c;
    }
}
