package com.company;

public class RockPaperScissors {
    int computerThrows;
    int playerThrows;
    boolean play = true;

    public void rules(){
        System.out.println("Let's play Rock, Paper, Scissors!");
        System.out.println("Please enter 1, 2, or 3 to play the game.");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.println();
    }

    public void startGame() {
        System.out.print("Rock, Paper, Scissors ... shoot    ");
    }

    public void getPlayerThrow(){
        playerThrows = MyJavaHelp.grabUserNbrInput();
    }

    public void getComputerThrow(){
        computerThrows = MyJavaHelp.grabRandomNbrTwo();
    }

    public void playGame(){
        rules();
        while (play){
            startGame();
            getPlayerThrow();
            while (playerThrows == 0 || playerThrows > 3){
                startGame();
                getPlayerThrow();
            }
            if (playerThrows == 1)
                System.out.println("Player throws rock.");
            else if (playerThrows == 2)
                System.out.println("Player throws paper.");
            else
                System.out.println("Player throws scissors.");
            getComputerThrow();
            if (computerThrows == 1)
                System.out.println("Computer throws rock.");
            else if (computerThrows == 2)
                System.out.println("Computer throws paper.");
            else
                System.out.println("Computer throws scissors.");
            System.out.println();
            if (playerThrows == 1){
                if (computerThrows == 1){
                    System.out.println("Player and computer tied.");
                }else if (computerThrows == 2){
                        System.out.println("Paper beats rock. Computer wins.");
                }else {
                    System.out.println("Rock beats scissors. Player wins.");
                }
            }else if (playerThrows == 2){
                if (computerThrows == 1){
                    System.out.println("Paper beats rock.  Player wins.");
                }else if (computerThrows == 2){
                    System.out.println("Player and computer tied.");
                }else {
                    System.out.println("Scissors beat paper. Computer wins.");
                }
            }else if (playerThrows == 3){
                if (computerThrows == 1){
                    System.out.println("Rock beats scissors.  Computer wins.");
                }else if (computerThrows == 2){
                    System.out.println("Scissors beat paper.  Player wims.");
                }else {
                    System.out.println("Player and computer tied.");
                }
            }
            boolean noPlay = true;
            while (noPlay) {
                System.out.print("\nDo you want to play again? ");
                String answer = MyJavaHelp.grabUserWordInput();
                if (answer.equalsIgnoreCase("Y")) {
                    play = true;
                    noPlay = false;
                }else if (answer.equalsIgnoreCase("N")){
                    play = false;
                    break;
                }
            }
        }
    }
}
