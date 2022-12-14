package hexlet.code;

import hexlet.code.game.Prime;
import hexlet.code.game.Calculator;
import hexlet.code.game.Even;
import hexlet.code.game.GreatestCommonDivisor;
import hexlet.code.game.Progression;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        choiseGame();
    }

    private static void choiseGame() {
        Scanner scanner = new Scanner(System.in);
        showMenu();
        var numGame = scanner.nextLine();
        switch (numGame) {
            case "1":
                Cli.playGame();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calculator.startGame();
                break;
            case "4":
                GreatestCommonDivisor.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            default:
                break;
        }
    }

    private static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
