package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        ArrayList<Character> characters = new ArrayList<>();
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (!characters.contains(word.charAt(i))) {
                characters.add(word.charAt(i));
            }
        }
        for (Character character : characters) {
            System.out.print(character + " ");
        }
    }
}
