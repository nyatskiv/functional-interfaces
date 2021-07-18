package com.ia;

import com.ia.service.AddCommandService;
import com.ia.service.DivideCommandService;
import com.ia.service.MultiplyCommandService;
import com.ia.service.SubtractCommandService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        AddCommandService addCommandService = new AddCommandService();
        DivideCommandService divideCommandService = new DivideCommandService();
        MultiplyCommandService multiplyCommandService = new MultiplyCommandService();
        SubtractCommandService subtractCommandService = new SubtractCommandService();

        Scanner in = new Scanner(System.in);

        Double firstNumber = 0.;
        Double secondNumber = 0.;
        Double result = 0.;

        System.out.println("Please enter your first number:");
        firstNumber = in.nextDouble();

        System.out.println("Please enter your first number:");
        secondNumber = in.nextDouble();

        System.out.println("1\t Add");
        System.out.println("2\t Subtract");
        System.out.println("3\t Multiply");
        System.out.println("4\t Divide");

        System.out.println("Please enter your command from the list [Add, Subtract, Multiply, Divide]:");

        //Get user's choice
        String choice = in.next();

        //Display the title of the chosen module
        switch (choice) {
            case "Add": {
                result = addCommandService.add(firstNumber, secondNumber);
                System.out.printf("Result: %s%n", result);
                break;
            }
            case "Subtract": {
                result = subtractCommandService.subtract(firstNumber, secondNumber);
                System.out.printf("Result: %s%n", result);
                break;
            }
            case "Multiply": {
                result = multiplyCommandService.multiply(firstNumber, secondNumber);
                System.out.printf("Result: %s%n", result);
                break;
            }
            case "Divide": {
                result = divideCommandService.divide(firstNumber, secondNumber);
                System.out.printf("Result: %s%n", result);
                break;
            }
            default: System.out.println("Invalid choice");
        }
    }
}
