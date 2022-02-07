import java.util.Random;
import java.util.Scanner;

/*
Welcome!! You will be playing rock paper scissors.
*/

public class RockPaperScissors {

    public static void main(String[] args) {
        char computerChoice;  // computer randomly chooses (r,s or s)
        char playerChoice;  // player chooses (r,p,or s)
        String playerInput; //player selects r,p,or s
        char possibleResponses[] = {'r', 'p', 's'}; // possible responses
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        // to start the game the computer displays following...
        System.out.println();
        System.out.println("Choose rock paper or scissors. 'r' for rock, 'p' for paper or 's' for scissors");
        //player chooses r,p,or s
        playerInput = scanner.nextLine();
        scanner.close();
        if ((playerInput.length() != 1) || (!(new String(possibleResponses).contains(playerInput)))) {
            System.out.println("Invalad selection please play again."); // if players input is invalid following will display
            System.exit(1);
        }
        playerChoice = playerInput.charAt(0);
        // computer randomly chooses r,p or s
        computerChoice = possibleResponses[rand.nextInt(3)];

         //player chooses scissors. if computer choses scissors it's a tie, if paper it's a win, if rock it's a loss
        if (playerChoice == 'r') {
            if (computerChoice == 'r') {
                System.out.println("Draw!");
                System.out.print("Compute choice : rock");
            } else if (computerChoice == 'p') {
                System.out.println("You Lose!");
                System.out.print("Computer choice : paper");
            } else if (computerChoice == 's') {
                System.out.println("You Win!");
                System.out.print("Computer choice : scissors");
            }
            //player chooses rock. if computer choses rock it's a tie, if scissors it's a win, if paper it's a loss
            System.out.println("\tPlayer choice : rock");
        } else if (playerChoice == 'p') {
            if (computerChoice == 'r') {
                System.out.println("You Win!");
                System.out.print("Computer choice :  rock");
            } else if (computerChoice == 'p') {
                System.out.println("Draw!");
                System.out.print("Computer choice :  paper");
            } else if (computerChoice == 's') {
                System.out.println("You Lose!");
                System.out.print("Computer choice : scissors");
            }
            //player chooses paper. if computer choses paper it's a tie, if rock it's a win, if scissors it's a loss
            System.out.println("\tPlayer choice : paper");
        } else if (playerChoice == 's') {
            if (computerChoice == 'r') {
                System.out.println("You Lose!");
                System.out.print("Computer choice :  rock");
            } else if (computerChoice == 'p') {
                System.out.println("You Win!");
                System.out.print("Computer choice : paper");
            } else if (computerChoice == 's') {
                System.out.println("Draw!");
                System.out.print("Computer choice : scissors");
            }
            System.out.println("\tPlayer choice : scissors");
            }

        }
    }

