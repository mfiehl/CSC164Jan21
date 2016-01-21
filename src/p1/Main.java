
package p1;

/*
 * Program for an ordering system
 * CSC 164
 * Mike Fiehl
 * 21, Jan 2016
 * Version 0.1
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Allow user input
        Scanner input = new Scanner(System.in);

        //Declare variables
        char option;

        System.out.println("Welcome to Jimmy Johns");

        do
        {
            System.out.println("(H)am");
            System.out.println("(T)urkey");
            System.out.println("(S)alami");
            System.out.println("(R)oast Beef");
            System.out.println("(D)one");
            System.out.print("Enter your choice: ");

            //Get user input and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            //Get first character of user input
            option = choice.charAt(0);

            System.out.println("choice = " + choice + ", option = " + option);

        }while(option != 'D'); //End do-while

        System.out.println("Thank you for ordering at Jimmy Johns");
    }
}
