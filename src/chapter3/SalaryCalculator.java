package chapter3;

import java.util.Scanner;

/*
Hi, I am testing this commenting

IF Statement.
If a certain situation occurs, do <something> and then go back to the main flow

Scenario:
All sales people get a payment of $1000 a week.
Sales people who exceed 10 sales get an additional bonus of $250

Note** before coding, always think through the design first
 */
public class SalaryCalculator {
    public static void main(String args[]){

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknow
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}
