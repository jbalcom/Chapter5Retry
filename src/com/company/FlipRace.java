package com.company;

public class FlipRace {

    Coin coin1 = new Coin();
    Coin coin2 = new Coin();

    int coin1Ctr = 0;
    int coin2Ctr = 0;
    int coin1Heads = 0;
    int coin2Heads = 0;
    boolean status = false;
    String userAnswer;

    public void askQuestion(){
        System.out.print("Want to race 2 coins? ");
        flipCoin();
    }

    public void answer(){
        userAnswer = MyJavaHelp.grabUserWordInput();
    }

    public void flipCoin() {
        while (!status) {
            coin1.flip();
            coin2.flip();
            System.out.println(coin1);
            System.out.println(coin2);
            coin1Ctr++;
            coin2Ctr++;
            printResult();
        }
        System.out.print("\nWant to race again? ");
        userAnswer = MyJavaHelp.grabUserWordInput();
        if (userAnswer.equalsIgnoreCase("Y")){
            coin1Ctr = 0;
            coin2Ctr = 0;
            coin1Heads = 0;
            coin2Heads = 0;
            status = false;
            flipCoin();
        }else {
            System.out.println();
            status = true;
        }
    }

    public void printResult(){
        if (coin1.isHeads() && coin2.isHeads()) {
            coin1Heads++;
            coin2Heads++;
        }
        else if (coin1.isHeads()){
            coin1Heads++;
            coin2Heads = 0;
        }
        else if (coin2.isHeads()) {
            coin2Heads++;
            coin1Heads = 0;
        }
        else {
            coin1Heads = 0;
            coin2Heads = 0;
        }
        if (coin1Heads == 3 && coin2Heads == 3)
        {
            System.out.println("We have a tie.  Both coins flipped 3 heads in a row.  It took coin1 " + coin1Ctr + " tries and took coin 2 " + coin2Ctr + " tries.");
            status = true;
        }
        else if (coin1Heads == 3)
        {
            System.out.println("Coin1 is the winner of the flip race.  It took " + coin1Ctr + " flips.");
            status = true;
        }
        else if (coin2Heads == 3)
        {
            System.out.println("Coin2 is the winner of the flip race.  It took " + coin2Ctr + " flips.");
            status = true;
        }
    }
}
