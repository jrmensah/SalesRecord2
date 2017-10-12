package com.company;

import java.util.Scanner;

public class Main {
      /*
    * Jerilyn Mensah
    * October 6 2017
    * This application will allow the user to enter details to produce a sales record
    * and prompt whether they would like to continue.
    * */

    public static void main (String[]args){
        int customerNum;
        double salesAmt, tax=0.00, total, subtotal;
        String name, taxCode;
        String displayDetails;
        String answer = null;


        Scanner scan = new Scanner(System.in);

        do{

            // Prompt the user to enter Customer ID

            System.out.println("Customer ID:");
            customerNum = scan.nextInt();
            scan.nextLine();

            // Prompt the user to enter a Customer name

            System.out.println("Customer Name:");
            name = scan.nextLine();

            // Prompt the user to enter Sales Amount

            System.out.println("Sales Amount:");
            salesAmt = scan.nextDouble();

            // Prompt the user to enter a Tax Code

            System.out.println("Tax Code:");
            taxCode = scan.next();
            if(!taxCode.equalsIgnoreCase("NRM") && !taxCode.equalsIgnoreCase("NPF") &&!taxCode.equalsIgnoreCase("BIZ")){
                System.out.println("Invalid Entry. Please choose 'NRM', 'NPF' or 'BIZ'");
                taxCode = scan.next();
            }
            scan.nextLine();

            // Find the Subtotal and Total Amount Due

            switch (taxCode.toUpperCase())
            {
                case "NRM": tax = 0.06;
                    break;
                case "NPF": tax = 0.00;
                    break;
                case "BIZ": tax = 0.045;
                    break;
            }

            subtotal = salesAmt * tax;
            total = subtotal + salesAmt;

            System.out.println("Customer ID:" + customerNum);
            System.out.println("Customer Name:" + name);
            System.out.println("Sales Amount: $" + salesAmt);
            System.out.println("Tax Code:" + taxCode.toUpperCase());
            System.out.println("Total Amount Due: $" + total);

            System.out.println("Do you want to enter another record?(Y/N)");
            answer=scan.nextLine();
            if(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")){
                System.out.println("Invalid Entry. Please choose Y or N.");

            }
            if(answer.equalsIgnoreCase("n")){
                System.out.println("Thank you!");
            }


            System.out.println("");
        }while(!answer.equalsIgnoreCase("n"));

        // Display details of sales record

    }public static void displayDetails(int customerNum, String name, double salesAmt, String taxCode, double total)

    {
        System.out.println("Customer ID:" + customerNum + "Customer Name:" + name + "Sales Amount: $" + salesAmt +
                "Tax Code:" + taxCode.toUpperCase() + "Total Amount Due: $" + total);
    }

}
