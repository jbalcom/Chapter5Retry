package com.company;

import java.util.InputMismatchException;

public class LeapYear {

    int year;
    final int startYear = 1582;
    boolean checkLeapYr = true;

    public void getUserInput(){
        System.out.print("Enter in a year or enter 0 to go back to main menu: ");
    }

    public void getLeapYear() {
        year = MyJavaHelp.grabUserNbrInput();
    }

    public void checkForLeapYear() {
        try {
            getUserInput();
            getLeapYear();
        }catch (InputMismatchException e){
            System.out.println("You must use only integers.");
            getUserInput();
            getLeapYear();
        }
        if (year == 0) {
            System.out.println("You entered 0, going back to menu.");

        }else if (year < startYear) {
            System.out.println("Year must be greater than or equal to " + startYear + ".");
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0)
                        System.out.println("Your entry of " + year + " is a Leap Year.");
                    else
                        System.out.println("Your entry of " + year + " is not a Leap Year.");
                } else
                    System.out.println("Your entry of " + year + " is a Leap Year.");
            }else
                System.out.println("Your entry of " + year + " is not a Leap Year.");
        }
    }
}
