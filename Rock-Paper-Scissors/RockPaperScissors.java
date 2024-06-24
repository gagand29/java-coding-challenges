import java.util.Scanner;

/**
 * RockPaperScissors
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        System.out.println("Are you ready? Write 'yes' if you are");

        String response = scan.nextLine();

        if (response.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String compChoice = computerChoice();

            System.out.println("\nYour choice: " + userChoice);
            System.out.println("\nComputer's choice: " + compChoice);

            String gameResult = result(userChoice, compChoice);
            System.out.println("\nResult: " + gameResult);

        } else {
            System.out.println("some other time...");
        }

        scan.close();
    }

    public static String computerChoice() {
        int randomnumber = (int) (Math.random() * 3); 
        if (randomnumber == 0) {
            return "rock";
        } else if (randomnumber == 1){
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String result(String yourChoice, String computerChoice) {
        if (yourChoice.equals(computerChoice)) {
            return "It's a tie!";
        }

        switch (yourChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerChoice.equals("rock")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerChoice.equals("paper")) ? "You win!" : "You lose!";
            default:
                return "Invalid input!";
        }
    }
}
