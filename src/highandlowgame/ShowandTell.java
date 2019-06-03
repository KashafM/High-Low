/* Name: Kashaf Masood
Program Name: High and Low Game
Program Description: player tries to guess number
Start Date: Sept. 14, 2017
End Date: Sept. 14, 2017
 */
package highandlowgame;

import java.util.Scanner;
import java.lang.Math;

public class ShowandTell {

    public static int turn = 5;

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        int randomNum = (int) (Math.random() * 50 + 1);
        System.out.println("WELCOME TO THE HIGH AND LOW GAME!");
        System.out.print("I am thinking of a number between 1 and 50. Guess what it is: ");
        Scanner in = new Scanner(System.in);
        randomNum = (int) (Math.random() * 50 + 1);
        while (turn > 0) {
            int number = in.nextInt();
            check(number, randomNum);
            checkTurn(randomNum);
        }

    }

    public static void check(int number, int randomNum) {

        if (number < randomNum) {
            System.out.println("GUESS HIGHER");
            turn -= 1;
        } else if (number > randomNum) {
            System.out.println("GUESS LOWER");
            turn -= 1;
        } else {
            System.out.println("YOU WIN!");
            playAgain();

        }
    }

    public static void checkTurn(int randomNum) {
        if (turn == 0) {
            System.out.println("YOU LOSE");
            System.out.println("The number was: " + randomNum);
            playAgain();
        }
    }

    public static void playAgain() {
        Scanner in = new Scanner(System.in);
        int playAgain = 0;
        System.out.println("Do you want to play again? [1] Yes [2] No");
        playAgain = in.nextInt();
        switch (playAgain) {
            case 1:
                turn = 5;
                game();
            case 2:
                System.exit(0);
        }
    }

}
