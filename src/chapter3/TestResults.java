package chapter3;
/*
 * The if-else-if statement
 * If situation A occurs,
 * <do something>.
 *
 * Else if situation B occurs,
 * <do something else>.
 *
 * Else if situation C occurs,
 * <do something else>

 * Scenario:
 *  Display a letter grade for a student based on their test score.
 * */
import java.util.Scanner;

public class TestResults {
    public static void main(String args[]){
        //Get the test score
        System.out.println("Enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        //Determine the letter grade
        char grade; //here we are just declaring the grade variable here, and will assign it when using

        if(score < 60){
            grade = 'F';  //single quotation marks is for char  - dont confuse with "" for a string
            System.out.println("You suck, did you not study? Wow??!");
        }
        else if(score < 70){
            grade = 'D';
            System.out.println("Might as well fail!");
        }
        else if(score < 80){
            grade = 'C';
            System.out.println("C's get degrees!");
        }
        else if(score < 90){
            grade = 'B';
            System.out.println("So close to an A, yet so far away!");
        }
        else{
            grade ='A';
            System.out.println("Wow, you're smart?!");
        }

        System.out.println("Your grade is " + grade);
    }
}
