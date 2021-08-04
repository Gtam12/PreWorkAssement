

import java.util.Scanner;


 

public class PreWorkAssesmnent {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {

        String textToCheckPalindrome = sc.next();
        String reversedString = "";


        for(int i=textToCheckPalindrome.length()-1; i>=0; i--)
        {
            reversedString += textToCheckPalindrome.charAt(i);
        }

        if(reversedString.equals(textToCheckPalindrome))
        {
            System.out.println(textToCheckPalindrome + " is a palindrome");
        }
        else
        {
            System.out.println(textToCheckPalindrome + " is not a palindrome");
        }

      }

 

            //function to printPattern

       public void printPattern() {
        char characterToprint = '*';

        int numberOfStarsToStartWith = sc.nextInt();
        for(int i=1; i<=numberOfStarsToStartWith; i++)
        {
        for(int j=numberOfStarsToStartWith-i; j>=0; j--)
        {
            System.out.print(characterToprint);
        }
        System.out.println("\n");
    
        }

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {

            int n = sc.nextInt();
            Boolean isPrime;

            if(n<=1)
             isPrime=false;

            for(int i=2;i<=n;i++)
            {
                if(n%2==0)
                {
                     isPrime=false;
                }
        
            }

             isPrime =  true;

            if(isPrime)
            {
                System.out.println(n + " is a prime number");;
            }
            else{
                System.out.println(n + " is not a prime number");
            }
        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {
          
            //initialize the first and second value as 0,1 respectively.

            int n = sc.nextInt();
           int first = 0, second = 1;
  
           int counter = 0;
     
           // Iterate till counter is N
           while (counter < n) {
     
               // Print the number
               System.out.print(first + " ");
     
               // Swap
               int third = second + first;
               first = second;
               second = third;
               counter = counter + 1;
           }
           System.out.println("\n");

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                PreWorkAssesmnent obj = new PreWorkAssesmnent();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}