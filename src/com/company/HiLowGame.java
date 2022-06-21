package com.company;

import java.util.InputMismatchException;

public class HiLowGame {

    int userGuess;
    int computerNbr;

    public void getUserRequest(){
        System.out.print("Guess what number the computer is thinking of: ");
    }

    public void getUserGuess(){
        userGuess = MyJavaHelp.grabUserNbrInput();
    }

    public void getComputerDigit(){
        computerNbr = MyJavaHelp.grabRandomNbrOne();
    }

    public void testUserGuess(){
        getComputerDigit();
        try {
            getUserRequest();
            getUserGuess();
        }catch (InputMismatchException e){
            System.out.println("Must use an integer!");
            getUserRequest();
            getUserGuess();
        }
        while (userGuess != 0) {
            if (userGuess > computerNbr){
                System.out.println("Your guess is too high, please guess again!");
                getUserGuess();
            }else if (userGuess < computerNbr){
                System.out.println("Your guess is too low, please guess again!");
                getUserGuess();
            }else{
                System.out.println("You guessed my number! HIZZZZAH!");
                System.out.print("Play again? (Y/N) ");
                String userReply = MyJavaHelp.grabUserWordInput();
                if (userReply.equalsIgnoreCase("Y")) {
                    System.out.print("Guess the computer's new number: ");
                    getComputerDigit();
                    getUserGuess();
                }else if (userReply.equalsIgnoreCase("N"))
                    userGuess = 0;
            }
        }
    }
}
