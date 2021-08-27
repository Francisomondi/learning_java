package com.francis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("this the first line of code");

        /*
            Scanner scan = new Scanner(System.in);
        System.out.println("Kindly Input your age: ");
        int age = scan.nextInt();
        //System.out.println("your age is :" + age);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Kindly Input your first Name: ");
        String StringfirstName = scan1.nextLine();
        //System.out.println("your first name is :" + StringfirstName);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("how long do you need before we kick you out?: ");
        double timeLeft = scan2.nextDouble();

        System.out.println("your first name is : " + StringfirstName + " of age " + age +
                "  and you have " + timeLeft + " seconds to leave this place");




             int numbe1 = 34;
        int numb2 = 60;

        if ((numb2 >= 30) &&(numbe1 <= 40)) {
            System.out.println("tis condition is true");
        }else{
            System.out.println("tis condition is false");
        }

         */
        int[] myArray = {
                67,
                6676,
                696966,
                6868686,
                76
        };
        for (int index= 0; index< 5; index++){
            System.out.println(myArray[index]);

        }

    }
}
