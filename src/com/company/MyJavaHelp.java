package com.company;

import java.util.Random;
import java.util.Scanner;

public class MyJavaHelp {

    public static int grabUserNbrInput(){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        return userInput;
    }

    public static String grabUserWordInput(){
        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.next();
        return userAnswer;
    }

    public static int grabInitRandomNbr(){
        Random random = new Random();
        int randoNbr = random.nextInt();
        return randoNbr;
    }

    public static int grabRandomNbrOne(){
        Random random = new Random();
        int randoNbr = random.nextInt(100) + 1;
        return randoNbr;
    }

    public static int grabRandomNbrTwo(){
        Random random = new Random();
        int randoNbr = random.nextInt(3) + 1;
        return randoNbr;
    }

    public static int grabRandomNbrThree(){
        Random random = new Random();
        int randoNbr = random.nextInt(9);
        return randoNbr;
    }
}
