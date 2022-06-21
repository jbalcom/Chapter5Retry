package com.company;

import java.util.InputMismatchException;

public class Chap5Questions {

    int userSelect = -1;

    public void menuSelect(){
        while (userSelect == -1) {
            System.out.println("01 - Leap Year");
            System.out.println("02 - Leap Year Revise");
            System.out.println("03 - Digit Finder");
            System.out.println("04 - HiLow Game");
            System.out.println("05 - Name to Numbers");
            System.out.println("06 - Flip Race");
            System.out.println("07 - Rock Paper Scissor Game");
            System.out.println("08 - Slot Machine");
            System.out.println("09 - Modified Die Class");
            System.out.println("10 - Modified Account Class");
            System.out.println("11 - Pig Game");
            System.out.println("12 - Processing Golf Scores");
            System.out.println("13 - Comparing 2 Text Files");
            System.out.println("14 - Counting Integer Values");
            System.out.println("15 - Counting Punctuation Marks");

            System.out.println();
            System.out.print("Select a problem to answer: ");
            try {
                userSelect = MyJavaHelp.grabUserNbrInput();
            }catch (InputMismatchException e){
                System.out.println("Must enter in a number from the menu!");
                System.out.print("Select a problem to answer: ");
                userSelect = MyJavaHelp.grabUserNbrInput();
            }
            if (userSelect == 0){
                break;
            }else {
                goToProblem();
                userSelect = -1;
            }
        }
    }

    public void goToProblem(){
        if (userSelect == 1){
            System.out.println("PP5.1 - Leap Year");
            LeapYear leapYear = new LeapYear();
            leapYear.checkForLeapYear();
        }else if (userSelect == 2){
            System.out.println("PP5.2 - Leap Year Revise");
            LeapYearRevise leapYearRevise = new LeapYearRevise();
            leapYearRevise.checkForLeapYear();
        }else if (userSelect == 3){
            System.out.println("PP5.3 - Digit Finder");
            DigitFinder digits = new DigitFinder();
            digits.getDigitSeparates();
        }else if (userSelect == 4){
            System.out.println("PP5.4 - HiLow Game");
            HiLowGame game = new HiLowGame();
            game.testUserGuess();
        }else if (userSelect == 5){
            System.out.println("PP5.5 - Name to Numbers");
            NameToNumbers nameValue = new NameToNumbers();
            nameValue.getSumOfName();
        }else if (userSelect == 6){
            System.out.println("PP5.6 - Flip Race");
            FlipRace race = new FlipRace();
            race.askQuestion();
        }else if (userSelect == 7){
            System.out.println("PP5.7 - Rock Paper Scissor Game");
            RockPaperScissors game = new RockPaperScissors();
            game.playGame();
        }else if (userSelect == 8){
            System.out.println("PP5.8 - Slot Machine");
            SlotMachine machine = new SlotMachine();
            machine.pullLever();
        }else if (userSelect == 9){
            System.out.println("PP5.9 - Modified Die Class\n");
            DieRevised die1 = new DieRevised();
            DieRevised die2 = new DieRevised();
            die1.setFaceValue(7);
            die2.setFaceValue(21);
            System.out.println(die1);
            System.out.println(die2);
            System.out.println();
        }else if (userSelect == 10){
            System.out.println("PP5.10 - Modified Account Class\n");
            AccountRevised acct1 = new AccountRevised("Ted Murphy", 72354, 102.56);
            AccountRevised acct2 = new AccountRevised("Jane Smith", 69713, 40.00);
            AccountRevised acct3 = new AccountRevised("Edward Demsey", 93757, 759.32);

            acct1.deposit(10.52);
            double smithBalance = acct2.deposit(-500.00);
            System.out.println("Smith balance after deposit:" + smithBalance);

            System.out.println("Smith balance after withdrawal:" + acct2.withdraw(250, 1.50));

            acct1.addInterest();
            acct2.addInterest();
            acct3.addInterest();

            System.out.println();
            System.out.println(acct1);
            System.out.println(acct2);
            System.out.println(acct3);
            System.out.println();
        }else if (userSelect == 11){
            System.out.println("PP5.11 - Pig Game");
            PigGame game = new PigGame();
            game.playTheGame();
        }else if (userSelect == 12){
            System.out.println("PP5.12 - Processing Golf Scores");
        }else if (userSelect == 13){
            System.out.println("PP5.13 - Comparing 2 Text Files");
        }else if (userSelect == 14){
            System.out.println("PP5.14 - Counting Integer Values");
        }else if (userSelect == 15){
            System.out.println("PP5.15 - Counting Punctuation Marks");
        }
    }
}
