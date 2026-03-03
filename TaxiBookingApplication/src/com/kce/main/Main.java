package com.kce.main;

import java.util.Scanner;

import com.kce.service.TaxiService;

public class Main {
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	   TaxiService taxiService = new TaxiService(4);
	   System.out.println("===================================");
	   System.out.println("    WELCOME TO CALL TAXI APP       ");
	   System.out.println("===================================");
	   while(true)
	   {
		   System.out.println("\n1.Book Taxi");
		   System.out.println("\n2.Display Taxi Details");
		   System.out.println("\n3.Exit");
		   System.out.println("\nEnter choice:");
		   int choice = sc.nextInt();
		   switch(choice)
		   {
		   case 1:
			   System.out.println("\n---------- BOOK TAXI ----------");
			   System.out.println("Customer ID:");
			   int customerId = sc.nextInt();
			   System.out.println("Pickup Point ( A to F):");
			   char from = sc.next().charAt(0);
			   System.out.println("Drop Point (A-F):");
			   char to = sc.next().charAt(0);
			   System.out.println("Pickup Time:");
			   int pickupTime = sc.nextInt();
			   taxiService.bookTaxi(customerId, from, to, pickupTime);
			   break;
			   
		   case 2:
			   System.out.println("\n---------- TAXI DETAILS ----------");
			   taxiService.displayTaxiDetails();
			   break;
		   case 3:
			   System.out.println("\nThank you for using Call Taxi Application!");
			   System.out.println("Exiting... Have a nice day");
			   System.exit(0);
		   default:
			   System.out.println("Invalid choice.Please Try Again");
		   }
	   }
   }
}
