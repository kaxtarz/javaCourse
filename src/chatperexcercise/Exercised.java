package chatperexcercise;

import java.util.Scanner;

public class Exercised {
    public static void main(String arg[]){
        //1. Ask the user for a season
        System.out.println("Enter your favorite season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //2. Enter whole #
        System.out.println("Enter a whole #.");
        int whole = scanner.nextInt();

        //3. Add an adjective
        System.out.println("Enter your favorite adjective.");
        String adjective = scanner.next();
        scanner.close();

        //4. Display results
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimim of " + whole + " cups of coffee");
//
//        KG's awesome way of doing things'
//        System.out.println("Adjective\nSomething\nSomething\nSomething in that order with enter:");
//        System.out.println(String.format("On a  %s %s day, I drink a  minimum of %s  cups of %s.", scanner.next(),scanner.next(),scanner.next(),scanner.next()));
    }
}
