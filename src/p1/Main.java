
package p1;

/*
 * Program for an ordering system
 * CSC 164
 * Mike Fiehl
 * 21, Jan 2016
 * Version 1.0
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
        double price = 0;
        String sandwich = " ";

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
            //String choice = input.next().toUpperCase();

            //Get first character of user input
            option = input.next().toUpperCase().charAt(0);

            switch(option)
            {
                //option = Ham
                case 'H':
                    sandwich = "Ham";
                    price = 5.50;
                    break;

                //option = Roast Beef
                case 'R':
                    sandwich = "Roast Beef";
                    price = 6.25;
                    break;

                //option = Salami
                case 'S':
                    sandwich = "Salami";
                    price = 4.50;
                    break;

                //option = Turkey
                case 'T':
                    sandwich = "Turkey";
                    price = 5.25;
                    break;

                case 'D':
                    price = 0;
                    break;

                default:
                    price = 0;
                    System.out.println("Option " + option + " not available");
            }

            //Give user order information if valid order
            if (price != 0)
            {
                System.out.printf("%s Sandwich Cost $%.2f\n", sandwich, price);
            }

        }while(option != 'D'); //End do-while

        System.out.println("Thank you for ordering at Jimmy Johns");
    }
}
