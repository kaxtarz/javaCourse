package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * If situation A occurs,
 * <do something>.
 * Else if situation B occurs,
 * <do something else>.
 * Else if situation C occurs,
 * <do something else>

 * Scenario:
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {

    public static void main(String args[]){

        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next(); //we only to need read in one letter (character)
        // however the scanner does not have a method to just get a character, the closets that we have is string pattern.
        //but because we are only getting one character, that we can still hold it in a variable
        scanner.close();

        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);

    }
}