public class Eight3 {
    public static void main(String[] args) {

        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int[][] studentGrade = new int[answers.length][2];      //array to hold student scores

        // Grade all answers
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            studentGrade[i][0]=i;           //each student is entered along with their scores
            studentGrade[i][1]=correctCount;

        }
        int temp1;
        int temp2;
        for(int i = 0; i<studentGrade.length; i++){     //sort the students low to high
            for (int j=0; j<studentGrade.length; j++){

                if(studentGrade[j][1]>studentGrade[i][1]){
                    temp1 = studentGrade[j][0];
                    temp2 = studentGrade[j][1];
                    studentGrade[j][0] = studentGrade[i][0];
                    studentGrade[j][1] = studentGrade[i][1];
                    studentGrade[i][0]=temp1;
                    studentGrade[i][1]=temp2;
                }
            }
        }
        for(int i = 0; i<studentGrade.length; i++){
            System.out.printf("Student %d\'s correct count is %d\n",studentGrade[i][0],studentGrade[i][1]);
        }

    }




}
