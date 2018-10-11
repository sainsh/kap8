public class Eight4 {
    public static void main(String[] args) {

        int[][] employeeTime = {{2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        }; //8x7

        int [][] totalEmployeeTime=new int[employeeTime.length][2]; //array of employees total work time

        int workTime;
        for (int i = 0; i < employeeTime.length; i++) {
            workTime = 0;
            for(int j = 0; j<employeeTime[0].length; j++){
                workTime += employeeTime[i][j];     //sum worktime from matrix

            }
            totalEmployeeTime[i][0] = i;        // input employee number and total worktime
            totalEmployeeTime[i][1] = workTime;



        }


        int temp1;
        int temp2;
        for (int i = 0; i < totalEmployeeTime.length; i++) {     //sort the employees high to high
            for (int j = 0; j < totalEmployeeTime.length; j++) {

                if (totalEmployeeTime[j][1] < totalEmployeeTime[i][1]) {
                    temp1 = totalEmployeeTime[i][0];
                    temp2 = totalEmployeeTime[i][1];
                    totalEmployeeTime[i][0] = totalEmployeeTime[j][0];
                    totalEmployeeTime[i][1] = totalEmployeeTime[j][1];
                    totalEmployeeTime[j][0] = temp1;
                    totalEmployeeTime[j][1] = temp2;
                }
            }
        }
        for (int i = 0; i < totalEmployeeTime.length; i++) {
            System.out.printf("Employee %d\'s work time is %d\n", totalEmployeeTime[i][0], totalEmployeeTime[i][1]);
        }


    }
}
