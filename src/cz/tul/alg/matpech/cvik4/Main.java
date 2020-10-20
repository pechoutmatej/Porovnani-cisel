package cz.tul.alg.matpech.cvik4;

import java.util.Scanner;

public class Main {
    // abc acb bac bca cab cba

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        System.out.println("Zadej první číslo");
        int firstNumber = sc.nextInt();
        System.out.println("Zadej druhé číslo");
        int secondNumber = sc.nextInt();
        System.out.println("Zadej třetí číslo");
        int thirdNumber = sc.nextInt();

        int actualBiggest;
        int actualSmallest;
        int middleNumber;


        System.out.println("Zadej požadovanou operaci, 1 pro sestupně, 2 pro vzestupně");
        int operation = sc.nextInt();

        if(firstNumber > secondNumber)
        {
            actualBiggest = firstNumber;
            actualSmallest = secondNumber;
        }
        else
        {
            actualBiggest = secondNumber;
            actualSmallest = firstNumber;
        }
        if(thirdNumber > actualBiggest)
        {
            middleNumber = actualBiggest;
            actualBiggest = thirdNumber;
        }
        else if(actualSmallest > thirdNumber)
        {
            middleNumber = actualSmallest;
            actualSmallest = thirdNumber;
        }
        else
        {
            middleNumber = thirdNumber;
        }


        if(operation == 1)
        {
            System.out.printf("Největší: " + actualBiggest + " Prostřední: " + middleNumber + " Nejmenší: " + actualSmallest );
        }

        if(operation == 2)
        {
            System.out.printf("Nejmenší: " + actualSmallest + " Prostřední: " + middleNumber + " Největší: " + actualBiggest );
        }
    }
}
