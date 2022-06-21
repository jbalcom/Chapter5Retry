package com.company;

import java.util.InputMismatchException;

public class DigitFinder {

    int userNbr = 0;
    int holdNbr = 0;
    int evenNbr = 0;
    int oddNbr = 0;
    int zeroNbr = 0;

    public void getUserRequest(){
        System.out.print("Enter in a large integer that doesn't start with 0: ");
    }

    public void getUserAnswer(){
        userNbr = MyJavaHelp.grabUserNbrInput();
    }

    public void getDigitSeparates(){
        try {
            getUserRequest();
            getUserAnswer();
        }catch (InputMismatchException e){
            System.out.println("Must use an integer!");
            getUserRequest();
            getUserRequest();
        }

        while (userNbr > 0) {
            holdNbr = userNbr % 10;
            if (holdNbr == 0) {
                zeroNbr++;
            } else if ((holdNbr % 2) > 0) {
                oddNbr++;
            } else {
                evenNbr++;
            }
            userNbr = userNbr / 10;
        }
        System.out.println("\nIn the number you entered, there are:");
        System.out.println(zeroNbr + " zeros");
        System.out.println(oddNbr + " odd digit(s)");
        System.out.println(evenNbr + " even digit(s)");
        System.out.print("\nWould you like to enter a new integer? ");
        String answer = MyJavaHelp.grabUserWordInput();
        if (answer.equalsIgnoreCase("Y")) {
            evenNbr = 0;
            oddNbr = 0;
            zeroNbr = 0;
            getDigitSeparates();
        }
    }
}
