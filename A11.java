/*Keychains for Sale
Write a program that pulls up a menu with 4 options. It should look something like...

Ye Olde Keychain Shoppe

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 1

ADD KEYCHAINS

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 3

VIEW ORDER

1. Add Keychains to Order
2. Remove Keychains from Order
3. View Current Order
4. Checkout

Please enter your choice: 4

CHECKOUT
You will need to create functions for each of the 4 menu options. Entering the number will call the correct function.
This assignment does not require you to complete ANY of the functionality except for the working menu system. There is no need for you to program the ability to add keychains, remove keychains, view orders or checkout.
The functions should be named add_keychains(), remove_keychains(), view_order() and checkout().
Each function should print a message that it has been called.
The user should be able to keep putting in choices until the checkout() function is called. When checkout() is finished, the program should end.

©2013 Graham Mitchell

This assignment is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 United States License.
Creative Commons License
Author: Aaron Gadberry
Filename: Keychains1.java */

import java.util.Scanner;

public class A11 {

static void add_keychains(){
    System.out.println("ADD KEYCHAINS");
}
static void remove_keychains(){
    System.out.println("REMOVE KEYCHAINS");
}
static void VIEW_ORDER(){
    System.out.println("VIEW ORDER");
}
static void checkout(){
    System.out.println("CHECKOUT");
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE VALUE OF N:");
    int n=sc.nextInt();
    
        
  
    switch (n) {
        case 1:
            add_keychains();
            break;
    case 2:
            remove_keychains();
            break;
            case 3:
         VIEW_ORDER();
            break;
    case 4:
           checkout();
            break;
    
        default:
        System.out.println("INVALID");
            break;
    }
     sc.close();
}
   

    
}
