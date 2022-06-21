package com.company;

public class SlotMachine {

    int wheelOne;
    int wheelTwo;
    int wheelThree;
    boolean playSluts = true;

    public void wheelOneNbr(){
        wheelOne = MyJavaHelp.grabRandomNbrThree();
    }

    public void wheelTwoNbr(){
        wheelTwo = MyJavaHelp.grabRandomNbrThree();
    }

    public void wheelThreeNbr(){
        wheelThree = MyJavaHelp.grabRandomNbrThree();
    }

    public void pullLever(){
        while (playSluts) {
            wheelOneNbr();
            wheelTwoNbr();
            wheelThreeNbr();

            if ((wheelOne == wheelTwo) && (wheelOne == wheelThree))
                System.out.println("JACKPOT! " + wheelOne + "|" + wheelTwo + "|" + wheelThree);
            else if ((wheelOne == wheelTwo) || (wheelOne == wheelThree) || (wheelTwo == wheelThree))
                System.out.println("So close! " + wheelOne + "|" + wheelTwo + "|" + wheelThree);
            else
                System.out.println("No where near! " + wheelOne + "|" + wheelTwo + "|" + wheelThree);

            System.out.print("Pull Lever? ");
            String player = MyJavaHelp.grabUserWordInput();
            if (player.equalsIgnoreCase("N")){
                System.out.println();
                playSluts = false;
            }
        }
    }
}
