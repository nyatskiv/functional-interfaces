package com.ia.service;

public class MenuService {
    public MenuService() {
    }

    public void displayMenu() {
        System.out.println("1\t Add");
        System.out.println("2\t Subtract");
        System.out.println("3\t Multiply");
        System.out.println("4\t Divide");

        System.out.println("Please enter your command from the list [Add, Subtract, Multiply, Divide]:");
    }
}
