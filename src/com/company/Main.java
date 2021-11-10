package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Main {

    public static String[] toppingsList = {"extra peperoni", "extra cheese", "mushroom", "ham", "sweetcorn"};

    static void setToppingsList() {
       for (int i = 0; i < toppingsList.length; i++) {
            System.out.println((i + 1) + ":" + toppingsList[i]);

        }
    }

    static int ParseInt(String toppings) {
        return parseInt(toppings);
    }

    static double sum(int[] toppingPrice, double size) {
        double priceTopping = 0.00;
         for (int i = 0; i < toppingPrice.length; i++) {
          priceTopping += toppingPrice[i];

        }
         return((priceTopping -1) * 1.25) + size;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] topping = new int[toppingsList.length];
        double sum = 0.00;
        String toppings;
        System.out.println("what type of pizza would you like: Small, Medium, Large? ");
        String pizzaSize = input.next();
        if (pizzaSize.equalsIgnoreCase("small")) {
            System.out.println("The price is £7.99 ");
            sum = sum + 7.99;
        } else if (pizzaSize.equalsIgnoreCase("medium")) {
            System.out.println("The price is £10.99");
            sum = sum + 10.99;
        } else {
            pizzaSize.equalsIgnoreCase("large");
            System.out.println("The price is £13.99 ");
        }
        setToppingsList();
        breakpoint:
        {
            while (true) {
                try {
                    System.out.println("if you would like to add more topics please enter the number of toppings you would like");
                    System.out.println("if you wish to finish your order please type 'end'");
                    toppings = input.next();
                    if (toppings.equalsIgnoreCase("end"))
                        break breakpoint;
                    topping[parseInt(toppings) - 1] += 1;
                    System.out.println(Arrays.toString(topping));
                } catch (InputMismatchException e) {
                    setToppingsList();
                    System.out.println("ERROR! you have not typed in a number" + e);
                    input.next();
                } catch (NumberFormatException e) {
                    setToppingsList();
                    System.out.println("ERROR!,the size entered is not correct, please choose from available options" + e);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ERROR!, the number entered does not match the list, try again" + e);
                }
            }
        }
        System.out.println("you have completed your order");
        System.out.println("the size you ordered was" + pizzaSize + "toppings: ");
        for (int i = 0; i < toppingsList.length; i++) {
            System.out.println(topping[i]);
        }
        System.out.println("total = £" + sum);

    }



}

// OLD CODE:

/* Scanner input = new Scanner(System.in);
        System.out.println("what type of pizza would you like: Small, Medium, Large ");
        String pizzaSize = input.next();

        double sum = 0;
        boolean pizza = true;

        while (pizza) {
            pizza = false;

            if (pizzaSize.equalsIgnoreCase("small")) {
                System.out.println("The price is £7.99 ");
                sum = sum + 7.99;
            } else if (pizzaSize.equalsIgnoreCase("medium")) {
                System.out.println("The price is £10.99");
                sum = sum + 10.99;
            } else if (pizzaSize.equalsIgnoreCase("large")) {
                System.out.println("The price is £13.99 ");
                sum = sum + 13.99;*/



 /*System.out.println("would you like to choose another topping?");
         String anotherTopping = input.next();
         if (anotherTopping.equals("yes")) {
         System.out.println("what toppings would you like to add to your pizza?");
         } else if (anotherTopping == "no") {
         System.out.println("type in the word 'end' to finish your order");*/

 /*System.out.println("what toppings would you like");
            String Toppings = input.next();
            ArrayList<String> pizzaToppings = new ArrayList<>();
            pizzaToppings.add("Extra peperoni - £1.25");
            double price = 1.25;
            sum = sum + 1.25;
            System.out.println("The price is £" + sum);
            pizzaToppings.add("Extra cheese - £1.25");
            sum = sum + 1.25;

                     /*pizzaToppings.add("chicken - £1.25");
                    sum = sum + 1.25;
                    pizzaToppings.add("sweetcorn - £1.25");
                    sum = sum + 1.25;
                    pizzaToppings.add("Bacon - £1.25");
                    sum = sum + 1.25;
                    pizzaToppings.add("ham - £1.25");
                    sum = sum + 1.25;? */