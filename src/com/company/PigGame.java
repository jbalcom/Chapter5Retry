package com.company;

public class PigGame {
    PairOfDie dice = new PairOfDie();

    int turnCtr;
    int pScore, cpuScore, combined;
    String answer;

    public void start() {
        getRules();
        System.out.print("Would you like to play? ");
        answer = MyJavaHelp.grabUserWordInput();
    }

    public void getRules() {
        System.out.println("\nGame play: Roll the dice against the computer.  First one to get to 100 wins!");
        System.out.println("If one of the die rolled is a 1, you lose your points and have to start again!\n");
    }

    public void playerTurn() {
        boolean continuePlaying = true;
        answer = " ";
        while (continuePlaying) {
            int holdScore = 0;
            dice.rollDice();
            System.out.println("You rolled " + dice.getDie1() + " and " + dice.getDie2());
            holdScore += dice.getSum();
            System.out.println("Dice sum = " + holdScore);
            if (dice.getDie1() == 1 && dice.getDie2() == 1) {
                System.out.println("Unfortunately you rolled a " + dice.getDie1() + " and a " + dice.getDie2());
                System.out.println("Your score goes back to 0!\n");
                pScore = 0;
                continuePlaying = false;
            } else if ((dice.getDie1() == 1 && dice.getDie2() != 1) || (dice.getDie1() != 1 && dice.getDie2() == 1)){
                System.out.println("Unfortunately you rolled a " + dice.getDie1() + " and a " + dice.getDie2());
                System.out.println("Your score stays the same but you end your turn!\n");
                continuePlaying = false;
            } else if (holdScore >= 100){
                break;
            }else{
                pScore += holdScore;
                System.out.println("Your score now is " + pScore + ".\n");
                System.out.print("Would you like to press your luck? (Use E to exit game) ");
                answer = MyJavaHelp.grabUserWordInput();
                if (answer.equalsIgnoreCase("Y")) {
                    continuePlaying = true;
                } else {
                    continuePlaying = false;
                }
            }
        }
    }

    public void computerTurn() {
        boolean continuePlaying = true;
        answer = " ";
        while (continuePlaying) {
            int holdScore = 0;
            dice.rollDice();
            System.out.println("The computer rolled " + dice.getDie1() + " and " + dice.getDie2());
            holdScore += dice.getSum();
            System.out.println("Dice sum = " + holdScore);
            if (dice.getDie1() == 1 && dice.getDie2() == 1){
                System.out.println("The cpu rolled a " + dice.getDie1() + " and a " + dice.getDie2() + ".");
                System.out.println("Back to 0 goes the cpu...You have a chance!\n");
                cpuScore = 0;
                continuePlaying = false;
            } else if ((dice.getDie1() == 1 && dice.getDie2() != 1) || (dice.getDie1() != 1 && dice.getDie2() == 1)){
                System.out.println("The cpu rolled a " + dice.getDie1() + " and a " + dice.getDie2() + ".");
                System.out.println("The computer's turn ends!\n");
                continuePlaying = false;
            } else if (holdScore >= 100){
                break;
            } else {
                cpuScore += holdScore;
                System.out.println("Cpu score is " + cpuScore + ".");
            }
        }
    }

    public void playTheGame () {
        start();
        boolean playGame = true;
        if (answer.equalsIgnoreCase("N"))
            playGame = false;

        while (playGame) {
            turnCtr++;
            System.out.println("Turn " + turnCtr + ":");
            playerTurn();
            if (answer.equalsIgnoreCase("E"))
                playGame = false;
            if (pScore > 0 )
                System.out.println("Your turn has ended with a score of " + pScore + ".\n");
            computerTurn();
            if (pScore >= 100 && cpuScore < 100) {
                System.out.println("You WIN!!!!\n");
                break;

            } else if (pScore < 100 && cpuScore >= 100) {
                System.out.println("CPU got to 100 first.  You lose!!!\n");
                break;
            }
        }
        System.out.print("Would you like to play again? ");
        answer = MyJavaHelp.grabUserWordInput();
        if (answer.equalsIgnoreCase("Y")) {
            playTheGame();
        }
    }
}

