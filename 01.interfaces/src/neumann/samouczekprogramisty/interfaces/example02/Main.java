package neumann.samouczekprogramisty.interfaces.example02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        } else {
            computation = new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Result: " + result);

    }

    private boolean shouldMultiply() {
        Scanner scanner = new Scanner(System.in);
        String response;
        System.out.println("What you want to do? Press 1 if you want multiple or 2 if you want add.");
        response = scanner.nextLine();
        if (response.equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    private double getArgument() {
        Scanner scanner = new Scanner(System.in);
        String response;
        System.out.println("Put your number: ");
        response = scanner.nextLine();
        return Double.parseDouble(response);
    }


}

