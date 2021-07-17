import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int number = (int) (Math.random() * 100);
        int guess,counter=0;

        Scanner input = new Scanner(System.in);

        System.out.println("\nI specified a number.\nNow,can you guess it at once?\nI don't think so!\n\uD83D\uDE1C Do your best \uD83D\uDE1C ");

        System.out.println("\nRULES\n------\n1.You have 10 chances to guess my number.\n2.Actually, you have no chance!\n3.Good luck!");

        System.out.println();

        System.out.print("1.Guess : ");
        guess = input.nextInt();

        counter++;

        if (guess == number){

            System.out.println("!!! WOW !!!");
            System.out.println("You are the mastermind.");
            System.out.println("\uD83C\uDFC6 Congratulations \uD83C\uDFC6");

        }else {

            while (guess != number) {

                counter++;
                System.out.print(counter+".Guess : ");
                guess = input.nextInt();

                if (guess == number){

                    System.out.println("You tried "+counter+" times!");
                    System.out.println("\uD83C\uDFC6 Congratulations \uD83C\uDFC6");



                }else{


                    if (counter == 10){

                        System.out.println("\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21");
                        System.out.println("You tried 10 times!\nProbably, you can't even guess your own mother's name.\nTime to leave.");
                        System.out.println("!!! Goodbye !!!");
                        System.out.println("\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21\uD83E\uDD21");

                        break;

                    }


                }



            }

        }











    }
}
