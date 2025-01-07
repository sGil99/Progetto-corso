package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int key = random.nextInt(0,10);
        while (true) {
            System.out.println("Spara un numero");
            int guess = scanner.nextInt();
            if (guess == key) {
                System.out.println("CI hai preso");
                break;
            } else if (guess>key) {
                System.out.println("Troppo grande");
            } else if (guess<key) {
                System.out.println("Troppo piccolo");
            }

        }
    }
}