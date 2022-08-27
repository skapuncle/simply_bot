package bot;

import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Jarvis(v0.1)");
        System.out.println("I was created in 2022");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }
}
