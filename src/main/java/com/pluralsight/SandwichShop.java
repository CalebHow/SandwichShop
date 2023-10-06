package com.pluralsight;

import java.util.Scanner;
public class SandwichShop {
public static void main(String[]args) {
   System.out.println("1: Regular - $5.45");
   System.out.println("2: Large - $8.95");
   Scanner input = new Scanner(System.in);
   System.out.println("What size would you like?");
   String sandwich_decision = input.next();

   if (sandwich_decision.equals("Regular ")) {
      System.out.println(" That will cost $5.45 ");
   } else {
      System.out.println(" That will cost $8.95 ");
   }
   System.out.println("How old are you?");
   int customer_age = input.nextInt();


   double base_price = 0;
   if (sandwich_decision.equals ("1. Regular"))
      {base_price = 5.45;

   } else if (sandwich_decision.equals ("2. Large"))
      {base_price = 8.95;
   } else {


      //Calculate discount price
      double discount_price = 0;
      if (customer_age <= 17) {
         discount_price = (base_price - .9);
         System.out.printf("You will receive our Student Discount. That will be $" + "%.2f", discount_price);
      } else if (customer_age >= 65) {
         discount_price = (base_price * .8);
         System.out.printf("You will receive the Senior Discount. That will be $" + "%.2f", discount_price);
      } else {
         discount_price = base_price;
         System.out.printf("That will be $" + "%.2f", discount_price);
      }
   }


}}

