package com.ia;

import com.ia.service.*;
import com.ia.util.COMMAND;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * Hello world!
 *
 */
public class App
{
    private static final AddCommandService addCommandService = new AddCommandService();
    private static final DivideCommandService divideCommandService = new DivideCommandService();
    private static final MultiplyCommandService multiplyCommandService = new MultiplyCommandService();
    private static final SubtractCommandService subtractCommandService = new SubtractCommandService();
    private static final MenuService menuService = new MenuService();

    public static void main( String[] args )
    {
        try {

            Map<COMMAND, BiFunction<Double, Double, Double>> commandsMap = new HashMap<>();
            commandsMap.put(COMMAND.ADD, addCommandService::add);
            commandsMap.put(COMMAND.MULTIPLY, multiplyCommandService::multiply);
            commandsMap.put(COMMAND.DIVIDE, divideCommandService::divide);
            commandsMap.put(COMMAND.SUBTRACT, subtractCommandService::subtract);

            Scanner in = new Scanner(System.in);

            System.out.println("Please enter your first number:");
            Double firstNumber = in.nextDouble();

            System.out.println("Please enter your first number:");
            Double secondNumber = in.nextDouble();

            menuService.displayMenu();

            String choice = in.next();
            Double result = commandsMap.get(COMMAND.fromString(choice)).apply(firstNumber, secondNumber);

            System.out.printf("Result: %s", result);
        } catch (Exception e) {
            System.out.println("Error happened");
        }
    }
}
