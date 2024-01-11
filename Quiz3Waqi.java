import java.util.Scanner;
public class Quiz3Waqi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        final int QUIZ = 2;  // number of quizzes
        final int QUES = 11; // number of questions for each quiz
        double[][] score = new double[QUIZ][QUES];
        
        // read scores from the keyboard
        readData(score, input);
        
        // display data in a tabular format. Format well for the user
        printData(score);
                
        // calculate the total score
        double tot = calcTotal(score);
        
        System.out.printf("Your total score is %.1f, Arigato. (^-^)\n", tot);        
    }
    public static void readData(double score[][], Scanner input){
        for(int i = 0; i<score.length;i++)
        {
            System.out.println("Quiz"+(i+1));
            for(int j = 0; j<score[i].length;j++)
            {
                System.out.printf("Q%d score: ",j+1);
                score[i][j] = input.nextInt();
            }
        }
        
    }
    public static void printData(double score[][]){
        
        for(int i = 0; i<score.length;i++)
        {
            System.out.printf("Quiz%d>>>>>> ",i+1);
            for(int j = 0 ;j<score[i].length;j++)
            {
                System.out.printf("Q%d = %.2f ",j+1,score[i][j]);
            }
            System.out.println();
        }
        
    }
    public static double calcTotal(double score[][]){
       double total=0;
       for(int i=0;i<score.length;i++)
       {
           for(int j=0;j<score[i].length;j++)
           {
               total+= score[i][j];
           }
       }
        return total;
    }
}
