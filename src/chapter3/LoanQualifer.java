package chapter3;

import java.util.Scanner;

/**
NESTED IFS:
 If a certain situation occurs, check for the next situation

 Scenario: TO QUALIFY FOR A LOAN, A PERSON MUST MAKE AT LEAST $30,000
 AND HAVE BEEN WORKING AT THEIR CURRENT JOB FOR AT LEAST 2 YEARS.
 */
public class LoanQualifer {
    public static void main(String args[]){

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision - this is saying: 'if this is true AND if this is true.. then the condition'
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats! yOU QUALIFY FOR THE LOAN");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry, you must earn at least $"
                    + requiredSalary + " to qualify for the loan.");
        }
    }
}
