package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what type of pizza would you like: Small, Medium, Large ");
        String pizzaSize = input.next();
        double sum = 0;
        boolean pizza = true;

        while (pizza) {
            pizza = false;

            if (pizzaSize.equalsIgnoreCase("small")) {
                System.out.println("The price is £7.99 ");
                sum = sum  + 7.99;
            } else if (pizzaSize.equalsIgnoreCase("medium")) {
                System.out.println("The price is £10.99");
                sum = sum + 10.99;
            } else if (pizzaSize.equalsIgnoreCase("large")) {
                System.out.println("The price is £13.99 ");
                sum = sum + 13.99;

            }
        }
    }
}

   // ArrayList<Integer> myNumbers = new ArrayList<>();

     //   for (int i = 0; i < 10; i++) {
     //   myNumbers.add(i);

     //   }

     //   Collections.shuffle(myNumbers);
     //   myNumbers.add(5, 22);
     //   for (int i = 0; i < myNumbers.size(); i++) {
     //   System.out.println(myNumbers.get(i));