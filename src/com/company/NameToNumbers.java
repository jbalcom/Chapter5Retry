package com.company;

import java.util.InputMismatchException;

public class NameToNumbers {

    String userName;
    char n;
    int value = 0;
    int index = 0;


    public void userRequest(){
        System.out.print("Enter your first name: ");
    }

    public void userResponse(){
        userName = MyJavaHelp.grabUserWordInput();
    }

    public void getSumOfName(){
        try {
            userRequest();
            userResponse();
        }catch (InputMismatchException e){
            System.out.println("Please use letters!");
            userRequest();
            userResponse();
        }
        while (index < userName.length()) {
            n = userName.toUpperCase().charAt(index);
            int i = (int)(n);
            value += (i - 64);
            index++;
        }
        System.out.println("The total value of your name is " + value + ".");
        System.out.print("Would you like to check on a different name? ");
        String answer = MyJavaHelp.grabUserWordInput();
        if (answer.equalsIgnoreCase("Y")){
            value = 0;
            index = 0;
            getSumOfName();
        }else
            System.out.println();
    }
}
